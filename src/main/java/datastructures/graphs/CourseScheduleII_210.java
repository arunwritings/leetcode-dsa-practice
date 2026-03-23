package datastructures.graphs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CourseScheduleII_210 {

    private List<Integer>[] adj;

    public int[] findOrder(int numCourses, int[][] prerequisites) {
        adj = new ArrayList[numCourses];
        for (int i=0;i<numCourses;i++) {
            adj[i] = new ArrayList<>();
        }
        for (int[] prerequisite : prerequisites) {
            int course = prerequisite[0];
            int prereq = prerequisite[1];
            adj[prereq].add(course);
        }

        int[] state = new int[numCourses];
        List<Integer> order = new ArrayList<>();
        for (int i=0;i<numCourses;i++) {
            if (dfs(i, state, order)) {
                return new int[0]; // cycle
            }
        }
        Collections.reverse(order);
        int[] result = new int[numCourses];
        for (int i = 0; i < numCourses; i++) {
            result[i] = order.get(i);
        }
        return result;
    }

    private boolean dfs(int node, int[] state, List<Integer> order) {
        if (state[node] == 1) return true;   // cycle
        if (state[node] == 2) return false;  // already processed
        state[node] = 1;
        for (int neighbor : adj[node]) {
            if (dfs(neighbor, state, order)) return true;
        }
        state[node] = 2;
        order.add(node);
        return false;
    }

    public static void main(String[] args) {
        int[][] prerequisites = {{1,0},{2,0},{3,1},{3,2}};
        CourseScheduleII_210 courseScheduleII210 = new CourseScheduleII_210();
        System.out.println(Arrays.toString(courseScheduleII210.findOrder(4, prerequisites)));
    }
}

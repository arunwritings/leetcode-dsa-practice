package datastructures.graphs;

import java.util.ArrayList;
import java.util.List;

public class CourseSchedule_207 {

    private List<Integer>[] adj;

    public boolean canFinish(int numCourses, int[][] prerequisites) {
        adj = new ArrayList[numCourses];
        for (int i = 0; i < numCourses; i++) {
            adj[i] = new ArrayList<>();
        }
        for (int[] prerequisite : prerequisites) {
            int course = prerequisite[0];
            int prereq = prerequisite[1];
            adj[prereq].add(course);
        }

       int[] state = new int[numCourses];
        for (int i=0;i<numCourses;i++) {
            if (dfs(i, state)) {
                return false; // cycle found
            }
        }
        return true;
    }

    private boolean dfs(int node, int[] state) {
        if (state[node]==1) return true; // found cycle
        if (state[node] ==2) return false; // already processed

        state[node] = 1; // visiting
        for (int neighbour : adj[node]) {
            if (dfs(neighbour, state)) return true;
        }
        state[node] = 2; //visited
        return false;
    }

    public static void main(String[] args) {
        CourseSchedule_207 c = new CourseSchedule_207();
        int[][] prerequisites = {{1,0}};
        System.out.println(c.canFinish(2, prerequisites));
    }
}

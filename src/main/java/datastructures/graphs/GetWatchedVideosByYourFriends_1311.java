package datastructures.graphs;

import java.util.*;

public class GetWatchedVideosByYourFriends_1311 {

    public List<String> watchedVideosByFriends(List<List<String>> watchedVideos, int[][] friends, int id, int level) {
        int n = friends.length;
        Queue<Integer> queue = new LinkedList<>();
        boolean[] visited = new boolean[n];
        queue.offer(id);
        visited[id] = true;
        int currentLevel = 0;
        while (!queue.isEmpty() && currentLevel<level) {
            int size = queue.size();
            for (int i=0;i<size;i++) {
                int person = queue.poll();
                for (int friend : friends[person]) {
                    if (!visited[friend]) {
                        visited[friend] = true;
                        queue.offer(friend);
                    }
                }
            }
            currentLevel++;
        }

        Map<String, Integer> freq = new HashMap<>();
        while (!queue.isEmpty()) {
            int person = queue.poll();
            for (String video : watchedVideos.get(person)) {
                freq.put(video, freq.getOrDefault(video,0)+1);
            }
        }

        List<String> videos = new ArrayList<>(freq.keySet());
        videos.sort((a,b) -> {
            if (!freq.get(a).equals(freq.get(b))){
                return freq.get(a)-freq.get(b);
            }
            return a.compareTo(b);
        });
        return videos;
    }

    public static void main(String[] args) {
        GetWatchedVideosByYourFriends_1311 solution = new GetWatchedVideosByYourFriends_1311();
        List<List<String>> watchedVideos = new ArrayList<>();
        watchedVideos.add(List.of("A", "B"));  // Person 0
        watchedVideos.add(List.of("C"));   // Person 1
        watchedVideos.add(List.of("B", "C"));  // Person 2
        watchedVideos.add(List.of("D"));   // Person 3
        int[][] friends = {{1, 2}, {0, 3}, {0, 3}, {1, 2}};
        List<String> result = solution.watchedVideosByFriends(watchedVideos, friends, 0, 1);
        System.out.println(result);
    }
}

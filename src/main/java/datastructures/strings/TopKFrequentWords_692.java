package datastructures.strings;

import java.util.*;

public class TopKFrequentWords_692 {

    public List<String> topKFrequent(String[] words, int k) {
        int n = words.length;
        Map<String, Integer> frequency = new HashMap<>();
        for (String word : words) {
            frequency.put(word, frequency.getOrDefault(word,0)+1);
        }
        List<String>[] buckets = new List[n+1];
        for (int i=0;i< buckets.length;i++) {
            buckets[i] = new ArrayList<>();
        }
        for (Map.Entry<String, Integer> entry : frequency.entrySet()) {
            String word = entry.getKey();
            int freq = entry.getValue();
            buckets[freq].add(word);
        }
        List<String> result = new ArrayList<>();
        for (int i= buckets.length-1;i>=0;i--) {
            if (!buckets[i].isEmpty()) {
                Collections.sort(buckets[i]);
                for (String word : buckets[i]) {
                    result.add(word);
                    if (result.size()==k) return result;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String[] words = {"i","love","leetcode","i","love","coding"};
        TopKFrequentWords_692 t = new TopKFrequentWords_692();
        System.out.println(t.topKFrequent(words,2));
    }
}

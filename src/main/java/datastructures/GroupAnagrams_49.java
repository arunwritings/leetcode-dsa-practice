package datastructures;

import java.util.*;

public class GroupAnagrams_49 {

    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> anagrams = new HashMap<>();
        for (String string : strs) {
            char[] chars = string.toCharArray();
            Arrays.sort(chars);
            String sorted = Arrays.toString(chars);
            anagrams.computeIfAbsent(sorted, k -> new ArrayList<>()).add(string);
        }
        return new ArrayList<>(anagrams.values());
    }

    public static void main(String[] args) {
        GroupAnagrams_49 groupAnagrams49 = new GroupAnagrams_49();
        System.out.println(groupAnagrams49.groupAnagrams(new String[]{"eat","tea","tan","ate","nat","bat"}));
    }
}

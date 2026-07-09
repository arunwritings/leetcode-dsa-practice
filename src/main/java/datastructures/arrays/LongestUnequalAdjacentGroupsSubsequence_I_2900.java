package datastructures.arrays;

import java.util.ArrayList;
import java.util.List;

public class LongestUnequalAdjacentGroupsSubsequence_I_2900 {

    public List<String> getLongestSubsequence(String[] words, int[] groups) {
        int n= words.length;
        List<String> result = new ArrayList<>();
        result.add(words[0]);
        for (int i=1;i<=n-1;i++) {
            if (groups[i] != groups[i - 1]) {
                result.add(words[i]);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String[] words = {"a","b","c","d"};
        int[] groups = {0,0,1,2};
        LongestUnequalAdjacentGroupsSubsequence_I_2900 l = new LongestUnequalAdjacentGroupsSubsequence_I_2900();
        System.out.println(l.getLongestSubsequence(words,groups));
    }
}


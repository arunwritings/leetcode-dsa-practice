package datastructures.dp;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class WordBreak_139 {

    public boolean wordBreak(String s, List<String> wordDict) {
        Set<String> words = new HashSet<>(wordDict);
        int n = s.length();
        boolean[] dp = new boolean[n+1];
        dp[0] = true;
        for (int endIndex=1;endIndex<=n;endIndex++) {
            for (int startIndex=0;startIndex<endIndex;startIndex++) {
                if (dp[startIndex] && words.contains(s.substring(startIndex, endIndex))) {
                    dp[endIndex] = true;
                    break;
                }
            }
        }
        return dp[n];
    }

    public static void main(String[] args) {
        List<String> words = new ArrayList<>();
        words.add("leet");
        words.add("code");
        WordBreak_139 wordBreak139 = new WordBreak_139();
        System.out.println(wordBreak139.wordBreak("leetcode", words));
    }
}

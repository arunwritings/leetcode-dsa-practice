package datastructures.arrays;

public class FindTheTownJudge_997 {

    public int findJudge(int n, int[][] trust) {
        int[] score = new int[n + 1];
        for (int[] t : trust) {
            int a = t[0];
            int b = t[1];
            score[a]--; // trusts someone
            score[b]++; // trusted by someone
        }
        for (int i = 1; i <= n; i++) {
            if (score[i] == n - 1) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[][] trust = {{1,3},{2,3}};
        FindTheTownJudge_997 f = new FindTheTownJudge_997();
        System.out.println(f.findJudge(3, trust));
    }
}

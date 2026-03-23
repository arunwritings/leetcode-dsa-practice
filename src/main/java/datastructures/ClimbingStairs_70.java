package datastructures;

public class ClimbingStairs_70 {

    public int climbStairs(int n) {
        if (n<=2) return n;

        int oneStepBefore = 2;
        int twoStepBefore = 1;
        int count = 0;
        for (int i=3;i<=n;i++) {
             count = oneStepBefore+twoStepBefore;
             twoStepBefore = oneStepBefore;
             oneStepBefore = count;
        }
        return count;
    }

    public static void main(String[] args) {
        ClimbingStairs_70 climbingStairs70 = new ClimbingStairs_70();
        System.out.println(climbingStairs70.climbStairs(5));
    }

}

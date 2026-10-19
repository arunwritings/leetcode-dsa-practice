package datastructures;

public class SqrtOfX_69 {

    public int mySqrt(int x) {
        int left=1; int right=x/2;
        if (x<2)  return x;
        int answer=0;
        while (left<=right) {
            int middle = left + (right-left)/2;
            if (middle<=x/middle) {
                answer = middle;
                left = middle+1;
            } else {
                right = middle-1;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        SqrtOfX_69 sqrtOfX69 = new SqrtOfX_69();
        System.out.println(sqrtOfX69.mySqrt(20));
    }
}

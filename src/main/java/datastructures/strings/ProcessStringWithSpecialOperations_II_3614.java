package datastructures.strings;

public class ProcessStringWithSpecialOperations_II_3614 {

    public char processStr(String s, long k) {
        long len = 0;
        for (char ch : s.toCharArray()) {
            if (ch=='*') {
                len = Math.max(0, len-1);
            } else if (ch=='#') {
                len *= 2; 
            } else if (ch=='%')  continue;
              else {
                len += 1;
            }
        }
        if (k>=len) return '.';
        for (int i=s.length()-1;i>=0;i--) {
            char ch = s.charAt(i);
            if (ch=='#') {
                long half = len/2;
                k = k%half;
                len = half;
            } else if (ch=='%') {
                k = len-1-k;
            } else if (ch=='*') {
                len++;
            } else {
                if (k==len-1) {
                    return ch;
                }
                len--;
            }
        }
        return '.';
    }

    public static void main(String[] args) {
        ProcessStringWithSpecialOperations_II_3614 p = new ProcessStringWithSpecialOperations_II_3614();
        System.out.println(p.processStr("a#b%*", 1));
    }
}

package datastructures.strings;

public class IsSubsequence_392 {

    public boolean isSubsequence(String s, String t) {
        int sLen = s.length(), tLen = t.length();
        if (sLen>tLen) return false;
        int sIndex = 0, tIndex = 0;
        while (sIndex<sLen && tIndex<tLen) {
            if (s.charAt(sIndex)==t.charAt(tIndex)) sIndex++;
            tIndex++;
        }
        return sIndex == sLen;
    }

    public static void main(String[] args) {
        IsSubsequence_392 subsequence392 = new IsSubsequence_392();
        System.out.println(subsequence392.isSubsequence("abc","ahbgdc"));
    }
}

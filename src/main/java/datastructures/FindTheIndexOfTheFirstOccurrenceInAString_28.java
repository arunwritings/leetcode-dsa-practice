package datastructures;

public class FindTheIndexOfTheFirstOccurrenceInAString_28 {

    public int strStr(String haystack, String needle) {
        int m = haystack.length();
        int n = needle.length();
        if (n==0) return 0;
        for (int i=0;i<=m-n;i++){
            if (haystack.substring(i, i+n).equals(needle)) return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        String haystack = "sedbutsad"; String needle = "sad";
        FindTheIndexOfTheFirstOccurrenceInAString_28 findTheIndexOfTheFirstOccurrenceInAString28 = new FindTheIndexOfTheFirstOccurrenceInAString_28();
        System.out.println(findTheIndexOfTheFirstOccurrenceInAString28.strStr(haystack, needle));
    }
}

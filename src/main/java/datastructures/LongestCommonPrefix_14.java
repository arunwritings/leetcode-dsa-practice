package datastructures;

public class LongestCommonPrefix_14 {

    public String longestCommonPrefix(String[] strs) {
        if (strs==null || strs.length==0) return "";
        for (int i=0;i<strs[0].length();i++) {
            char currChar = strs[0].charAt(i);
            for (int j=1;j< strs.length;j++) {
                if (i>=strs[j].length() || strs[j].charAt(i)!=currChar) {
                    return strs[0].substring(0,i);
                }
            }
        }
        return strs[0];
    }

    public static void main(String[] args) {
        LongestCommonPrefix_14 longestCommonPrefix14 = new LongestCommonPrefix_14();
        String result = longestCommonPrefix14.longestCommonPrefix(new String[]{"flower","flow","flight"});
        System.out.println(result);
    }
}

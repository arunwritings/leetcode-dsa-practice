package datastructures.strings;

public class ProcessStringWithSpecialOperations_I_3612 {

    public String processStr(String s) {
        StringBuilder result = new StringBuilder();
        for (char ch : s.toCharArray()) {
            if (ch=='%') {
                result.reverse();
            } else if (ch=='*') {
                if (!result.isEmpty()) {
                    result.deleteCharAt(result.length()-1);
                }
            } else if (ch=='#') {
                result.append(result);
            } else {
                result.append(ch);
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        ProcessStringWithSpecialOperations_I_3612 p = new ProcessStringWithSpecialOperations_I_3612();
        System.out.println(p.processStr("a#b%*"));
    }
}

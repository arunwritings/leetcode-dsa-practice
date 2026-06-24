package datastructures.strings;

import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses_22 {

    private final List<String> result = new ArrayList<>();
    private int pairs;

    public List<String> generateParenthesis(int n) {
        this.pairs=n;
        backtrack(0,0,"");
        return result;
    }

    private void backtrack(int open, int close, String string) {
        if (open>pairs || close>pairs || open<close) return;
        if (open==pairs && close==pairs) {
            result.add(string);
            return;
        }
        backtrack(open+1,close,string+"(");
        backtrack(open,close+1,string+")");
    }

    public static void main(String[] args) {
        GenerateParentheses_22 g = new GenerateParentheses_22();
        System.out.println(g.generateParenthesis(3));
    }
}

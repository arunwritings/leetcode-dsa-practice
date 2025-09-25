package datastructures;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger_13 {

    public int romanToInt(String s) {
        Map<Character, Integer> charMap = new HashMap<>();
        charMap.put('I',1);
        charMap.put('V',5);
        charMap.put('X',10);
        charMap.put('L', 50);
        charMap.put('C',100);
        charMap.put('D',500);
        charMap.put('M',1000);
        int sum=charMap.get(s.charAt(s.length()-1));
        for (int i=s.length()-2;i>=0;i--) {
            int current = charMap.get(s.charAt(i));
            int next = charMap.get(s.charAt(i+1));
            if (current<next) {
                sum-=current;
            } else {
                sum+=current;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        RomanToInteger_13 romanToInteger13 = new RomanToInteger_13();
        System.out.println(romanToInteger13.romanToInt("LVIII"));
    }
}

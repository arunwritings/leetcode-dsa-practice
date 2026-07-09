package datastructures.strings;

public class MaximumRepeatingSubstring_1668 {

    public int maxRepeating(String sequence, String word) {
        StringBuilder stringBuilder = new StringBuilder();
        int repeatingCount = 0;
        while (stringBuilder.length()<=sequence.length()) {
            if (sequence.contains(stringBuilder)) {
                stringBuilder.append(word);
                repeatingCount++;
            }
        }
        return repeatingCount;
    }

    public static void main(String[] args) {
        MaximumRepeatingSubstring_1668 m = new MaximumRepeatingSubstring_1668();
        System.out.println(m.maxRepeating("ababac","ab"));
    }
}

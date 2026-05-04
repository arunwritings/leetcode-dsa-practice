package datastructures.arrays;

public class DesignAddAndSearchWordsDataStructure_211 {

    private final DesignAddAndSearchWordsDataStructure_211[] children;
    boolean isEnd;

    public DesignAddAndSearchWordsDataStructure_211() {
        children = new DesignAddAndSearchWordsDataStructure_211[26];
        isEnd = false;
    }

    public void addWord(String word) {
        DesignAddAndSearchWordsDataStructure_211 currentNode = this;
        for (char ch : word.toCharArray()) {
            int index = ch-'a';
            if (currentNode.children[index]==null) {
                currentNode.children[index] = new DesignAddAndSearchWordsDataStructure_211();
            }
            currentNode = currentNode.children[index];
        }
        currentNode.isEnd = true;
    }

    public boolean search(String word) {
        DesignAddAndSearchWordsDataStructure_211 currentNode = this;
        return dfs(0, currentNode, word);
    }

    private boolean dfs(int index, DesignAddAndSearchWordsDataStructure_211 currentNode, String word) {
        if (index==word.length()) {
            return currentNode.isEnd;
        }
        char ch = word.charAt(index);
        if (ch!='.') {
            if (currentNode.children[ch-'a']==null) return false;
            return dfs(index+1, currentNode.children[ch-'a'], word);
        } else {
            for (DesignAddAndSearchWordsDataStructure_211 child : currentNode.children) {
                if (child!=null) {
                    if (dfs(index + 1, child, word)) {
                        return true;
                    }
                }
            }
            return false;
        }
    }

    public static void main(String[] args) {
        DesignAddAndSearchWordsDataStructure_211 designAddAndSearchWordsDataStructure211 = new DesignAddAndSearchWordsDataStructure_211();
        designAddAndSearchWordsDataStructure211.addWord("bad");
        designAddAndSearchWordsDataStructure211.addWord("dad");
        designAddAndSearchWordsDataStructure211.addWord("mad");
        System.out.println(designAddAndSearchWordsDataStructure211.search("pad"));
        System.out.println(designAddAndSearchWordsDataStructure211.search("bad"));
        System.out.println(designAddAndSearchWordsDataStructure211.search(".ad"));
        System.out.println(designAddAndSearchWordsDataStructure211.search("b.."));
    }
}

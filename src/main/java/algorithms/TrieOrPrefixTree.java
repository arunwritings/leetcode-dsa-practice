package algorithms;

public class TrieOrPrefixTree {

    private final TrieOrPrefixTree[] children;
    private boolean isEnd;

    public TrieOrPrefixTree() {
        children = new TrieOrPrefixTree[26];
        isEnd = false;
    }

    public void insert(String word) {
        TrieOrPrefixTree currentNode = this;
        for (char ch : word.toCharArray()) {
            int index = ch-'a';
            if (currentNode.children[index]==null) {
                currentNode.children[index] = new TrieOrPrefixTree();
            }
            currentNode = currentNode.children[index];
        }
        currentNode.isEnd = true;
    }

    public boolean search(String word) {
        TrieOrPrefixTree prefixTree = searchPrefix(word);
        return (prefixTree!=null && prefixTree.isEnd);
    }

    public boolean startsWith(String prefix) {
        TrieOrPrefixTree prefixNode = searchPrefix(prefix);
        return prefixNode!=null;
    }

    private TrieOrPrefixTree searchPrefix(String word) {
        TrieOrPrefixTree currentNode = this;
        for (char ch : word.toCharArray()) {
            int index = ch-'a';
            if (currentNode.children[index]==null) {
                return null;
            }
            currentNode = currentNode.children[index];
        }
        return currentNode;
    }

    public static void main(String[] args) {
        TrieOrPrefixTree trieOrPrefixTree = new TrieOrPrefixTree();
        trieOrPrefixTree.insert("hello");
        trieOrPrefixTree.insert("he");
        trieOrPrefixTree.insert("hell");
        System.out.println(trieOrPrefixTree.search("he"));
        System.out.println(trieOrPrefixTree.startsWith("hi"));
    }
}

package main.medium;

/**
 * @author HJ
 * @date 2023/9/13 21:57
 * @description 208. 实现 Trie (前缀树)
 */
public class ImplementTriePrefixTree {

    private final ImplementTriePrefixTree[] children;
    private boolean isEnd;

    public ImplementTriePrefixTree() {
        children = new ImplementTriePrefixTree[26];
        isEnd = false;
    }

    public void insert(String word) {
        ImplementTriePrefixTree node = this;
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            int index = ch - 'a';
            if (node.children[index] == null) {
                node.children[index] = new ImplementTriePrefixTree();
            }
            node = node.children[index];
        }
        node.isEnd = true;
    }

    public boolean search(String word) {
        ImplementTriePrefixTree node = searchPrefix(word);
        return node != null && node.isEnd;
    }

    public boolean startsWith(String prefix) {
        return searchPrefix(prefix) != null;
    }

    private ImplementTriePrefixTree searchPrefix(String prefix) {
        ImplementTriePrefixTree node = this;
        for (int i = 0; i < prefix.length(); i++) {
            char ch = prefix.charAt(i);
            int index = ch - 'a';
            if (node.children[index] == null) {
                return null;
            }
            node = node.children[index];
        }
        return node;
    }

}

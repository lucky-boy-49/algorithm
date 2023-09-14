package main.medium;

/**
 * @author HJ
 * @date 2023/9/14 10:20
 * @description 211. 添加与搜索单词 - 数据结构设计
 */
public class WordDictionary {

    WordDictionary[] character;

    boolean isEnd = false;

    public WordDictionary() {
        character = new WordDictionary[26];
    }

    public void addWord(String word) {
        WordDictionary node = this;
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            int index = ch - 'a';
            if (node.character[index] == null) {
                node.character[index] = new WordDictionary();
            }
            node = node.character[index];
        }
        node.isEnd = true;
    }

    public boolean search(String word) {
        return dfs(this, 0, word);
    }

    private boolean dfs(WordDictionary node,int i, String word) {
        if (i == word.length()) {
            return node.isEnd;
        }
        char ch = word.charAt(i);
        if (Character.isLetter(ch)) {
            int index = ch - 'a';
            WordDictionary child = node.character[index];
            return child != null && dfs(child, i + 1, word);
        } else {
            for (int j = 0; j < 26; j++) {
                WordDictionary child = node.character[j];
                if (child != null && dfs(child, i + 1, word)) {
                    return true;
                }
            }
        }
        return false;
    }

}

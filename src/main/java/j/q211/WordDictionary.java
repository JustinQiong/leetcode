package j.q211;

import j.q208.Trie;

class WordDictionary {

    private Trie root;

    public WordDictionary() {
        root = new Trie();
    }

    public void addWord(String word) {
        root.insert(word);
    }

    public boolean search(String word) {
        return dfs(word, 0, root);
    }

    boolean dfs(String word, int idx, Trie node) {
        if (idx == word.length()) {
            return node.isEnd();
        }

        char ch = word.charAt(idx);
        if (Character.isLetter(ch)) {
            Trie child = node.getChildren()[ch - 'a'];
            return child != null && dfs(word, idx + 1, child);
        } else {
            for (int i = 0; i < 26; i++) {
                Trie child = node.getChildren()[i];
                if (child != null && dfs(word, idx + 1, child)) {
                    return true;
                }
            }
        }

        return false;
    }
}


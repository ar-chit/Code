public class Trie {
    public static class TrieNode {
        public char data;
        TrieNode children[];
        boolean isTerminal;

        TrieNode(char data) {
            this.data = data;
            this.children = new TrieNode[26];
            this.isTerminal = false;
        }
    }

    public TrieNode root = new TrieNode('\0');

    public void insertWord(String word) {
        insertWordRecursive(word, root);
    }

    private void insertWordRecursive(String word, TrieNode curr) {
        if (word.length() == 0) {
            curr.isTerminal = true;
            return;
        }

        char ch = word.charAt(0);
        int index = ch - 'a';

        if (curr.children[index] != null) {
            insertWordRecursive(word.substring(1), curr.children[index]);
        } else {
            TrieNode newNode = new TrieNode(ch);
            curr.children[index] = newNode;
            insertWordRecursive(word.substring(1), newNode);
        }
    }

    public boolean searchWord(String word) {
        return searchWordRecursive(word, root);
    }

    private boolean searchWordRecursive(String word, TrieNode curr) {
        if (word.length() == 0) {
            return curr.isTerminal;
        }

        int index = word.charAt(0) - 'a';
        if (curr.children[index] != null) {
            return searchWordRecursive(word.substring(1), curr.children[index]);
        } else {
            return false;
        }
    }

    public void deleteWord(String word) {
        deleteWordRecursive(word, root);
    }

    private void deleteWordRecursive(String word, TrieNode curr) {
        if (word.length() == 0 && !curr.isTerminal) {
            System.out.println("Word not found");
            return;
        }
        if (word.length() == 0 && curr.isTerminal) {
            curr.isTerminal = false;
            System.out.println("word deleted successfully");
            return;
        }

        int index = word.charAt(0) - 'a';
        if (curr.children[index] != null) {
            deleteWordRecursive(word.substring(1), curr.children[index]);
        } else {
            System.out.println("wrong word");
            return;
        }
    }

    public static void main(String[] args) {
        Trie trie = new Trie();
        trie.insertWord("coding");
        trie.insertWord("code");
        trie.insertWord("pop");
        trie.insertWord("coder");
        trie.insertWord("codex");

        System.out.println(trie.searchWord("codex"));

        trie.deleteWord("codex");

        System.out.println(trie.searchWord("codex"));

        trie.deleteWord("codex");

        System.out.println(trie.searchWord("codex"));


    }
}

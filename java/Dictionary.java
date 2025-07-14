import java.util.ArrayList;

class Trie {
    public static class TrieNode {
        public char data;
        TrieNode children[];
        boolean isTerminal;
        int childCount;

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

}
    

public class Dictionary {

    public static ArrayList<ArrayList<String>> getSuggestions(String input) {
        for (int i = 0; i < input.length(); i++) {
            char lastCh = input.charAt(i);
        }
    }
    public static void main(String[] args) {
        ArrayList<String> strs = new ArrayList<String>();
        strs.add("love");
        strs.add("lover");
        strs.add("loving");
        strs.add("last");
        strs.add("lost");
        strs.add("lane");
        strs.add("lord");

        String input = "lovi";

        ArrayList<ArrayList<String>> ans = new ArrayList<ArrayList<String>>();


    }    
}
import java.util.HashMap;
import java.util.Map;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> map = new HashMap<Character, Integer>();


        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), i + 1);
            if (map.containsKey(s.charAt(i))) {
                return i;
            }
        }

        return s.length();
            
    };
}

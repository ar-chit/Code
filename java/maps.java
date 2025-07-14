import java.util.HashMap;
import java.util.Map;

public class maps {

    public static Map<Character, Integer> characterFrequency(String str) {
        Map<Character, Integer> freq = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (freq.containsKey(ch)) {
                freq.put(ch, freq.get(ch) + 1);
            } else {
                freq.put(ch, 1);
            }
        }

        return freq;
    }
    
    public static void main(String[] args) {
        // Map<String, Integer> m = new HashMap<>();

        // m.put("Scorpio", 9);
        // m.put("Alto", 2);
        // m.put("Jeep", 8);


        // System.out.println(m.get("Scorpio"));
        // System.out.println(m.get("Alto"));

        // //search
        // System.out.println(m.containsKey("Innova"));

        // System.out.println(m.size());

        // System.out.println();

        // for (Map.Entry<String, Integer> entry : m.entrySet()) { 
        //     System.out.println(entry.getKey() + " -> " + entry.getValue());
        // }

        System.out.println(characterFrequency("thiruvananthapuram"));
    }
}

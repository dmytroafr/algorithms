import java.util.HashMap;

public class Solution27 {
    public boolean isAnagram(String s, String t) {
        
        HashMap<Character, Integer> anagramMap = new HashMap<>();

        for(char c : s.toCharArray()){
            anagramMap.put(c, anagramMap.getOrDefault(c, 0) + 1);
        }
        for(char c : t.toCharArray()){
            if (!anagramMap.containsKey(c)) {
                return false;
            }
            anagramMap.computeIfPresent(c, (k, v) -> v == 1 ? null : v - 1);
        }
        return anagramMap.isEmpty();
    }
}

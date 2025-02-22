import java.util.Map;
import java.util.HashMap;

class Solution9 {
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> source = new HashMap<>();

        for (char c : magazine.toCharArray()){
            source.put(c, source.getOrDefault(c, 0)+1);
        }

        for (char c : ransomNote.toCharArray()){
            if (!source.containsKey(c)) return false;
            source.computeIfPresent(c, (k, v)-> v == 1? null: v - 1);
        }
        return true;
    }
}
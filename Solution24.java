import java.util.HashMap;
import java.util.Map;

public class Solution24 {

    public boolean isIsomorphic(String s, String t) {
        if (s.length()==1) return true;
        Map<Character, Character> myMap = new HashMap<>();
        for (int i = 0; i < s.length(); i++){
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);
            if (myMap.containsKey(sChar)) {
                if (myMap.get(sChar) != tChar) {
                    return false;    
                }
            } else if (myMap.containsValue(tChar)) {    
                return false;
            }
            myMap.put(sChar, tChar);
        }
        return true;
    }
    
}

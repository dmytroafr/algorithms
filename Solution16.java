import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Solution16 {
    public String reverseWords(String s) {
        String[] split = s.trim().split("\\s+");

        StringBuilder sb = new StringBuilder();

        for(int i = split.length - 1; i >= 0 ; i--){
            sb.append(split[i]);
            if (i != 0) {
                sb.append(" ");
            }
        }

        return sb.toString();

    
        // List<String> asList = Arrays.asList(s.trim().split("\\s+"));
        // Collections.reverse(asList);
        // return String.join(" ", asList);


    }
}
class Solution {
    public static int lengthOfLastWord(String s) {
        String[] split = s.trim().split(" ");
        return split[split.length-1].length();

    }
   
    public static boolean isSubsequence(String s, String t) {
        
        if (s.isEmpty()){
            return true;
        }
        int index = 0;

        for (int i = 0; i < s.length(); i++){
            boolean check = false;
            for (int j = index; j < t.length(); j++){
                if (s.charAt(i) == t.charAt(j)) {
                    check = true;
                    index = j+1;
                    break;
                }
            }
            if (!check) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        // String s = "abc", t = "ahbgdc";
        String s = "aaaaaa", t = "bbaaaa";
        // String s = "axc", t = "ahbgdc";
        // int result = lengthOfLastWord(s);
        boolean result = isSubsequence(s, t);
        System.out.println(result);
    }
}
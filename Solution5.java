class Solution5 {
    public static boolean isPalindrome(String s) {
        String clear = s.toLowerCase().replaceAll("[^a-z0-9]", "");
        if (clear.isEmpty() || clear.length()==1) return true;
        int left = 0, right = clear.length()-1;
        while (left<right) {
            if (clear.charAt(left++) != clear.charAt(right--)) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        String s = "A man, a p!lan, a\" canal: Panama";
        System.out.println(isPalindrome(s));
    }
}
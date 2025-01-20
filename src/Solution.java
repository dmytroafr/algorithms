import java.util.Arrays;

class Solution {
    public static int[] plusOne(int[] digits) {

        for (int i = digits.length - 1; i >= 0; i--){

            if (digits[i] + 1 != 10) {
                digits[i] += 1;
                return digits;
            } 
            digits[i] = 0;

            if (i == 0) {
                int[] newArray = new int[digits.length+1];
                System.arraycopy(digits,0,newArray,1,digits.length);
                newArray[0] = 1;
                return newArray;
            }
        }
        return digits;

    }
    public static void main(String[] args) {
        int[] test1 = new int[]{9,9,9,9};

        int[] result = plusOne(test1);
        System.out.println(Arrays.toString(result));
    }
}
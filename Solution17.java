import java.util.Arrays;

class Solution17 {
    public static int[] twoSum(int[] numbers, int target) {

        // int left = 0;
        // int right = numbers.length - 1;
        // int temp = 0;
        // do {
        //     temp = numbers[left] + numbers[right];
        //     if (temp > target) right--;
        //     if (temp < target) left++;
        // } while(temp != target);
        // return new int[]{left+1,right+1};


        int left = 0;
        int right = numbers.length - 1;
    
        while (true) {
            int sum = numbers[left] + numbers[right];
    
            if (sum == target) {
                return new int[]{left + 1, right + 1};
            } 
            
            if (sum < target) {
                left++;
            } else {
                right--;
            }
        }





    }
    public static void main(String[] args) {
        int[] numbers = {2,7,11,15};
        int[] ans = twoSum(numbers, 9);
        System.out.println(Arrays.toString(ans));
    }
}
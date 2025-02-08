import java.util.ArrayList;
import java.util.List;

class Solution11 {
    public static List<String> summaryRanges(int[] nums) {

        List<String> result = new ArrayList<>();
        if (nums.length == 0) return result;

        int start = nums[0];
        for(int i = 1; i < nums.length; i++){
            
            if (nums[i] - nums[i-1] != 1){
                if (start == nums[i-1]){
                    result.add(String.valueOf(start));
                } else {
                    result.add(start + "->" + nums[i-1]);
                }
                start = nums[i];
            }
        }

        if (start == nums[nums.length - 1]){
            result.add(String.valueOf(start));
        } else {
            result.add(start + "->" + nums[nums.length-1]);
        }
        return result;
    }
    public static void main(String[] args) {
        int[] nums = {0,1,2,4,5,7};
        List<String> result = summaryRanges(nums);
        result.forEach(System.out::println);
        int[] nums2 = {0,2,3,4,6,8,9};
        List<String> result2 = summaryRanges(nums2);
        result2.forEach(System.out::println);
    }
}
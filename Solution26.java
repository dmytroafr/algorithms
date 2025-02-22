public class Solution26 {
    public static int searchInsert(int[] nums, int target) {
        return bsearch(nums, 0, nums.length-1, target);
    }   
    public static int bsearch (int[] nums, int left, int right, int target){
        if (left > right) return left;

        int center = left + (right - left) / 2;
        
        if (target == nums[center]) {
            return center;
        } else if (target < nums[center]) {
            return bsearch(nums, left, center - 1, target);
        } else {
            return bsearch(nums, center + 1, right,target);
        }
    } 
    public static void main(String[] args) {
        int[] nums = {1,3,5,6};

        System.out.println(searchInsert(nums, 7));
    }
}

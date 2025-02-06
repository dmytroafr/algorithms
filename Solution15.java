class Solution15 {
    public static boolean canJump(int[] nums) {
        
        int mustJump = 1;
        for(int i = nums.length - 2; i >= 0; i--){
            if(nums[i] >= mustJump){
                mustJump = 1;
            } else {
                mustJump++;
            }
        }

        return mustJump == 1;
    }
    public static void main(String[] args) {
        int[] nums = {3,2,1,0,4};
        
        System.out.println(canJump(nums));
    }
}
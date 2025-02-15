class Solution23 {
    public static int jump(int[] nums) {
        if (nums.length <= 1) {
            return 0;
        }
        int steps = 0;
        int theFast = 0;
        int current = 0;
        for (int i = 0; i < nums.length - 1; i++){
            theFast = Math.max(theFast, i + nums[i]);

            if(i == current){
                steps++;
                current = theFast;
                if(current >= nums.length-1) break;
            }
        }
        return steps;
    }
    public static void main(String[] args) {
        int [] nums = {1,1,1,1};
        System.out.println(jump(nums));
    }
}
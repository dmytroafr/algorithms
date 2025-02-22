import java.util.HashMap;
import java.util.Map;

public class Solution29 {
    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> hashmap = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            if (hashmap.containsKey(nums[i]) && Math.abs(hashmap.get(nums[i]) - i) <= k) {
                return true;
            }
            hashmap.put(nums[i], i);
        }
        return false;
    }

    public static void main(String[] args) {
        int [] nums = {1,2,3,1};a

        System.out.println(containsNearbyDuplicate(nums, 3));
    }
}

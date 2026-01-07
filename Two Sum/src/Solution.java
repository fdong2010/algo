import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> indices = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            // check if the pair of target - nums[i] is already in the map
            int pair = target - nums[i];
            if(indices.containsKey(pair)) 
                return new int[]{i, indices.get(pair)};

            indices.put(nums[i], i);
        }

        // no solution is found
        throw new IllegalArgumentException("No two sum solution");
    }
}

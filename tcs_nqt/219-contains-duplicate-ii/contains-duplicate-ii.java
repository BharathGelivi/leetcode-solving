class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                int prevIndex = map.get(nums[i]);
                // Check if the distance is within k
                if (i - prevIndex <= k) {
                    return true;
                }
            }
            // Always update the map with the current index 
            // so we always have the most recent occurrence
            map.put(nums[i], i);
        }
        return false;
    }
}
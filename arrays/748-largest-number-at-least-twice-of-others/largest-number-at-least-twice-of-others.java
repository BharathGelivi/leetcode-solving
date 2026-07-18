class Solution {
    public int dominantIndex(int[] nums) {

        for (int i = 0; i < nums.length; i++) {
            int temp = nums[i];
            boolean isValid = true;

            for (int j = 0; j < nums.length; j++) {
                
                if (i == j) {
                    continue;
                }

                if (temp < 2 * nums[j]) {
                    isValid = false;
                    break; 
                }
            }
            
            if (isValid) {
                return i;
            }
        }

        return -1;
    }
}
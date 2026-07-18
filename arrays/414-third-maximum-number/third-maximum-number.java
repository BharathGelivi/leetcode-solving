class Solution {
    public int thirdMax(int[] nums) {
        Long max = null;
        Long max1 = null;
        Long max2 = null;

        for (int n : nums) {
            // Skip duplicates
            if ((max != null && n == max) || 
                (max1 != null && n == max1) || 
                (max2 != null && n == max2)) {
                continue;
            }

            if (max == null || n > max) {
                max2 = max1;
                max1 = max;
                max = (long) n;
            } else if (max1 == null || n > max1) {
                max2 = max1;
                max1 = (long) n;
            } else if (max2 == null || n > max2) {
                max2 = (long) n;
            }
        }

        return max2 == null ? max.intValue() : max2.intValue();
    }
}
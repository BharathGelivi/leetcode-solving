class Solution {
    public int findNumbers(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length;i++){
            int count2=0;
            int a=nums[i];
            while(a>0){
                count2++;
                a=a/10;
            } 
            if(count2%2==0){
                count++;
            }
        }
        return count;
    }
}
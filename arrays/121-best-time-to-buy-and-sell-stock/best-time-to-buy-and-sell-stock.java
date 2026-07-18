class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit=0;
        int temp=0;
        for(int i=0;i<prices.length-1;i++){
            int dailychange=prices[i+1]-prices[i];
            
            temp=Math.max(0,temp+dailychange);
            maxProfit=Math.max(temp,maxProfit);
        }
        return maxProfit;
    }
}
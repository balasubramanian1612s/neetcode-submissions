class Solution {
    public int maxProfit(int[] prices) {
        int s=0, l=1;
        int res=0;
        while(s<=l && l<=prices.length-1){
            if(prices[l]-prices[s]>=0){
                res=Integer.max(res, prices[l]-prices[s]);
                l++;
            } else{
                s++;
            }
        }

        return res;
    }
}

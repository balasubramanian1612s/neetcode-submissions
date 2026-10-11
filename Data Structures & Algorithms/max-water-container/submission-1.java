class Solution {
    public int maxArea(int[] heights) {
        int len = heights.length;
        int res=0;
        int s=0, e=len-1;
        while(s<e){
            res=Integer.max(res, Integer.min(heights[s], heights[e]) * (e-s));
            
            if(heights[s]<heights[e]){
                s++;
            } else{
                e--;
            }
        }

        return res;
    }
}

class Solution {
    public int maxArea(int[] heights) {
        int len = heights.length;
        int[] startMax = new int[len];
        int[] endMax = new int[len];
        int res=0;
        startMax[0]=heights[0];
        endMax[len-1]=heights[len-1];

        for(int i=1; i<heights.length; i++) {
            startMax[i]=Integer.max(heights[i], startMax[i-1]);
        }

        for(int i=len-2; i>=0; i--) {
            endMax[i]=Integer.max(heights[i], endMax[i+1]);
        }

        int s=0, e=len-1;
        while(s<e){
            res=Integer.max(res, Integer.min(startMax[s], endMax[e]) * (e-s));
            
            if(startMax[s]<endMax[e]){
                s++;
            } else{
                e--;
            }
        }

        return res;
    }
}

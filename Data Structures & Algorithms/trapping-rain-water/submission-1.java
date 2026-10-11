class Solution {
    public int trap(int[] height) {
        int len = height.length;
        int[] fwd = new int[len];
        int[] bwd = new int[len];

        fwd[0] = height[0];
        bwd[len-1] = height[len-1];

        for(int i=1; i<len; i++){
            fwd[i]=Integer.max(fwd[i-1], height[i]);
        }

        for(int i=len-2; i>=0; i--){
            bwd[i]=Integer.max(bwd[i+1], height[i]);
        }

        int res=0;

        for(int i=0; i<len-1; i++){
            int fb = Integer.min(fwd[i], bwd[i]);
            if(fb-height[i]>=0) res+=(fb-height[i]);
        }

        return res;
    }
}

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int mul = 1;
        int zeroFound = 0;
        for(int num:nums){
            if(num!=0){
                mul*=num;
            } else{
                zeroFound++;
            }
        }

        int[] res=new int[nums.length];
        for(int i=0; i<nums.length; i++){
            if(zeroFound==1 && nums[i]==0){
                res[i]=mul;
            } else if(zeroFound>1){
                res[i]=0;
            } else if(zeroFound==1 && nums[i]!=0){
                res[i]=0;
            } else {
                res[i] = mul/nums[i];
            }
        }

        return res;
    }
}  

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[][] numWithI = new int[nums.length][2];
        for(int i=0; i<nums.length; i++){
            numWithI[i][0] = nums[i];
            numWithI[i][1] = i;
        }

        Arrays.sort(numWithI, (a, b) -> Integer.compare(a[0], b[0]));

        int start=0, end=nums.length-1;
        
        while(start<end){
            if(numWithI[start][0]+numWithI[end][0] == target){
                int[] res = new int[]{numWithI[start][1], numWithI[end][1]};
                Arrays.sort(res);
                return res;
            } else if(numWithI[start][0]+numWithI[end][0] > target){
                end--;
            } else{
                start++;
            }
        }

        return new int[]{-1, -1};
    }
}

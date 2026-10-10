class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);

        for(int i=0; i<nums.length-2; i++){
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            int end=nums.length-1;
            int mid=i+1;
            while(mid<end){
                if(nums[i]+nums[mid]+nums[end]==0){
                res.add(Arrays.asList(nums[i], nums[mid], nums[end]));                    

                    while(mid<end && nums[mid]==nums[mid+1]) mid++;
                    while(mid<end && nums[end]==nums[end-1]) end--;

                    mid++;
                    end--;
                }else if(nums[i]+nums[mid]+nums[end]>0){
                    end--;
                }else{
                    mid++;
                }
            }
        }

        return res;
    }
}

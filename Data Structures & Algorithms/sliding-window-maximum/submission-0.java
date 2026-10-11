class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if(nums.length<k) return new int[]{};

        int maxIndex=0, max=nums[0];
        List<Integer> resList = new ArrayList<>();

        for(int i=0; i<k; i++){
            if(nums[i]>max){
                maxIndex = i;
                max = nums[i];
            }
        }

        int s = 0, end = k-1;

        while(end<nums.length){
            if(nums[end]<max){
                resList.add(max);
            } else{
                resList.add(nums[end]);
                max = nums[end];
                maxIndex = end;
            }

            if(maxIndex==s){
                max=Integer.MIN_VALUE;
                for(int i=s+1; i<=end; i++){
                    if(nums[i]>max){
                        maxIndex = i;
                        max = nums[i];
                    }
                }
            }

            s++; end++;
        }

        return resList.stream().mapToInt(i -> i).toArray();
    }
}

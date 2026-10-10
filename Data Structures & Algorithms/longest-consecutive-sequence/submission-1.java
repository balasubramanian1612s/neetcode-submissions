class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int res = 0;

        for(int num:nums){
            set.add(num);
        }

        for(int num:nums){
            if(!set.contains(num-1)){
            int max=1;
            int temp=num;
            while(set.contains(temp+1)){
                max++;
                temp++;
            }
            res=Integer.max(max, res);
            }
        }

        return res;
    }
}

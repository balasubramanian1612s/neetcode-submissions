class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length()==0) return 0;
        if(s.length()==1) return 1;
        int st=0, e=1;
        int res=1;
        int[] count = new int[128];
        count[s.charAt(0)]=1;
        while(st<=e && e<=s.length()-1){
            if(count[s.charAt(e)]==0){
                res=Integer.max(res, e-st+1);
                count[s.charAt(e)]=1;
                e++;
            } else{
                count[s.charAt(st)]--;
                st++;
            }
        }

        return res;
    }
}

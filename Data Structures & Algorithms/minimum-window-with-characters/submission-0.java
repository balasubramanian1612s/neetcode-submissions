class Solution {
    public String minWindow(String s, String t) {
        int l1 = t.length();
        int st = 0, end = 0;
        String res="";
        int resLen=Integer.MAX_VALUE;

        if(s.length()<t.length()) return "";

        int[] count1 = new int[128];
        int[] count2 = new int[128];

        for(int i=0; i<t.length(); i++) {
            count1[t.charAt(i)]++;
        }

        while(end<s.length()){

            count2[s.charAt(end)]++;

            while(isValid(count1, count2)){
                if(resLen>(end-st+1)) {
                    res=s.substring(st, end+1);
                    resLen=end-st+1;
                }

                count2[s.charAt(st)]--;
                st++;
            }
            
            end++;
        }

        return res;
    }

    boolean isValid(int[] count1, int[] count2){
        for(int i=0; i<128; i++){
            if(count1[i]>count2[i]){
                return false;
            }
        }

        return true;
    }
}

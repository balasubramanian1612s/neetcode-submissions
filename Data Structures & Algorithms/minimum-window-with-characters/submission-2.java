class Solution {
    public String minWindow(String s, String t) {
        int l1 = t.length();
        int st = 0, end = 0;
        String res="";
        int need=0, have=0;
        int resLen=Integer.MAX_VALUE;

        if(s.length()<t.length()) return "";

        int[] count1 = new int[128];
        int[] count2 = new int[128];

        for(int i=0; i<t.length(); i++) {
            count1[t.charAt(i)]++;
            if(count1[t.charAt(i)]==1) need++;
        }

        while(end<s.length()){
            char eChar=s.charAt(end);
            count2[eChar]++;

            if(count1[eChar]>0 && count1[eChar]==count2[eChar]) have++;

            while(need==have){
                if(resLen>(end-st+1)) {
                    res=s.substring(st, end+1);
                    resLen=end-st+1;
                }

                char sChar=s.charAt(st);

                count2[sChar]--;

                if(count1[sChar]>0 && count1[sChar]>count2[sChar]) have--;

                st++;
            }
            
            end++;
        }

        return res;
    }
}

class Solution {
    public int characterReplacement(String str, int k) {
        int s = 0;
        int e = 0;
        int[] count = new int[26];
        int res=0;

        while(s<=e && e<str.length()){
            char sChar = str.charAt(s);
            char eChar = str.charAt(e);

            count[eChar - 'A']++;

            int maxFreq=0;
            for(int i=0; i<26; i++){
                maxFreq = Integer.max(maxFreq, count[i]);
            }

            if((e-s+1) - maxFreq <= k){
                res = Integer.max(res, e-s+1);
                e++;
            } else {
                count[sChar - 'A']--;
                s++;
                e++;
            }
        }

        return res;
    }
}

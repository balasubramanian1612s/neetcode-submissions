class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int l1 = s1.length();
        int st = 0, end = l1-1;

        if(s2.length()<s1.length()) return false;

        int[] count1 = new int[128];
        int[] count2 = new int[128];

        for(int i=0; i<s1.length(); i++) {
            count1[s1.charAt(i)]++;
            count2[s2.charAt(i)]++;
        }

        while(end<s2.length()){
            boolean isFound = true;
            for(int i=0; i<128; i++){
                if(count1[i]!=count2[i]){
                    isFound=false;
                }
            }

            if(isFound) return true;

            count2[s2.charAt(st)]--;
            st++; end++;
            if(end<s2.length()){
                count2[s2.charAt(end)]++;
            }
        }

        return false;
    }
}

class Solution {
    public boolean isPalindrome(String s) {
        int start=0, end=s.length()-1;
        s=s.toLowerCase();
        while(start<end){
            while(!Character.isLetterOrDigit(s.charAt(start)) && start<end){
                start++;
            }
            while(!Character.isLetterOrDigit(s.charAt(end)) && start<end){
                end--;
            }

            if(start>=end){
                break;
            }

            if(s.charAt(start)!=s.charAt(end)) return false;

            start++; end--;
        }

        return true;
    }
}

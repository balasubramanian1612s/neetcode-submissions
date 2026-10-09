class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;

        Map<Character, Integer> mapA = new HashMap<>();

        for(int i=0; i<s.length(); i++){
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);

            mapA.put(sChar, mapA.getOrDefault(sChar, 0) + 1);
            mapA.put(tChar, mapA.getOrDefault(tChar, 0) - 1);
        }

        for(int value:mapA.values()){
            if(value!=0) return false;
        }

        return true;
    }
}

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for(String str: strs){
            int[] alphas = new int[26];
            for(char c : str.toCharArray()){
                alphas[c-'a']++;
            }
            String key = Arrays.toString(alphas);
            map.putIfAbsent(key, new ArrayList<>());
            map.get(key).add(str);
        }

        return new ArrayList<>(map.values());
    }
}

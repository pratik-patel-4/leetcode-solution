class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        HashMap<String, List<String>> map = new HashMap<>();

        for(String str : strs) {

            char[] arr = str.toCharArray();

            Arrays.sort(arr);

            String strKey = new String(arr);

            map.computeIfAbsent(strKey, k -> new ArrayList<>());
            map.get(strKey).add(str);
        }

        return new ArrayList<>(map.values());

    }
}

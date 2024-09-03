class Solution {
    public boolean isAnagram(String s, String t) {
        
        /*
        a. Convert String to char Array
        b. Sort both Array
        c. compare sorted array
        */ 

        /*char[] sc = s.toCharArray();
        char[] tc = t.toCharArray();

        Arrays.sort(sc);
        Arrays.sort(tc);

        if(new String(sc).equals(new String(tc))){
            return true;
        }
        return false;*/

        if(s.length() != t.length()) return false;

        int[] freq = new int[26];
        for(int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++;
        }

        for(int i = 0; i < t.length(); i++) {
            freq[t.charAt(i) - 'a']--;
        }

        for(int i : freq) {
            if( i != 0) {
                return false;
            }
        }
        return true;
    }
}

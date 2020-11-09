class Solution {
    public boolean isAnagram(String s, String t) {
        int[] memo=new int[26];
        for (int i=0; i<s.length(); i++){
            memo[s.charAt(i)-'a']++;
        }
        for (int j=0; j<t.length(); j++){
            memo[t.charAt(j)-'a']--;
        }
        
        for(int i: memo){
            if (i != 0) return false;
        }
        return true;
    }
}
class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> freq = new HashMap<>();
        if(s.length()!=t.length())
        return false;
        else
        for(char ch: s.toCharArray())
        {
            freq.put(ch,freq.getOrDefault(ch,0)+1);
        }
        for(char ch: t.toCharArray())
        {
            freq.put(ch,freq.getOrDefault(ch,0)-1);
        }
        for(int i: freq.values())
        {
            if(i==0)
            continue;
            else 
            return false;
        }
        return true;
    }
}

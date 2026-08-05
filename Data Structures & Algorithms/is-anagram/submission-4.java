class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> freq = new HashMap<>();
        if(s.length()!=t.length())
        return false;
        char[] s1= s.toCharArray();
        char[] t1= t.toCharArray();
        for(char ch : s1)
        {
            freq.put(ch,freq.getOrDefault(ch,0)+1);
        }
        for(char ch : t1)
        {
            freq.put(ch,freq.getOrDefault(ch,0)-1);
        }
        for(int i : freq.values())
        {
            if(i!=0)
            return false;
        }
        return true;
    }
}

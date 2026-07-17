class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> freqS = new HashMap<>();
        HashMap<Character, Integer> freqT = new HashMap<>();
        if(s.length()!=t.length())
        return false;
        else
        for(char ch: s.toCharArray())
        {
            freqS.put(ch,freqS.getOrDefault(ch,0)+1);
        }
        for(char ch: t.toCharArray())
        {
            freqT.put(ch,freqT.getOrDefault(ch,0)+1);
        }
        return freqS.equals(freqT);

    }
}

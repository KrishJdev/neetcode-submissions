class Solution {
    public int characterReplacement(String s, int k) {
        HashMap<Character,Integer> map= new HashMap<>();
        int left=0;
        int right=0;
        int longest=0;
        int maxFreq=0;
        while(right<s.length())
        {
            char c = s.charAt(right);
            map.put(c,map.getOrDefault(c,0)+1);
            maxFreq=Math.max(maxFreq,map.get(c));
            if(right-left+1-maxFreq>k)
            {
                map.put(s.charAt(left),map.getOrDefault(s.charAt(left),0)-1);
                left++;
            }
            longest=Math.max(longest,right-left+1);
            right++;
        }
        return longest;
    }
}

class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        int left=0;
        int right=0;
        int longest=0;
        while(right<s.length())
        {
            if(set.contains(s.charAt(right)))
            {
                set.remove(s.charAt(left));
                left++;
            }
            else
            {
                set.add(s.charAt(right));
                right++;
                longest=Math.max(longest,right-left);
            }
        }
        return longest;
        
    }
}

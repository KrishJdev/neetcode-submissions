class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> unique = new HashSet<>();
        int count=0;
        int left=0;
        int right=0;
        int maxLength = 0;
        while(right<s.length())
        {
            if(!unique.contains(s.charAt(right)))
            {
                unique.add(s.charAt(right));
                right++;
                maxLength=Math.max(maxLength,right-left);
            }
            else
            {
                unique.remove(s.charAt(left));
                left++;
            }
        }
        return maxLength;
    }
}

class Solution {
    public int characterReplacement(String s, int k) {
        HashMap<Character, Integer> mpp = new HashMap<>();
        int left = 0;
        int right = 0;
        int maxFreq = 0;
        int maxLength=0;
        while (right < s.length()) 
        {
            char c = s.charAt(right);
            mpp.put(c, mpp.getOrDefault(c, 0) + 1);
            maxFreq = Math.max(mpp.get(c), maxFreq);

            if ((right - left + 1) - maxFreq > k) 
            {
                char leftChar = s.charAt(left);
                mpp.put(leftChar, mpp.get(leftChar) - 1);
                left++;
            }
            maxLength = Math.max(maxLength, right - left + 1);
            right++;
        }
        return maxLength;
    }
}
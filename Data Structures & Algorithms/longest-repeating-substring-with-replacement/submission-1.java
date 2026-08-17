class Solution {
    public int characterReplacement(String s, int k) {
        HashMap<Character,Integer> mpp = new HashMap<>();
        int left=0;
        int right=0;
        int maxFreq=0;
        int maxLength=0;
        while(right<s.length())
        {
            char key = s.charAt(right);
            mpp.put(key,mpp.getOrDefault(key,0)+1);
            maxFreq=Math.max(maxFreq,mpp.get(key));
            if(right-left+1-maxFreq>k)
            {   
                char l = s.charAt(left);
                mpp.put(l,mpp.getOrDefault(l,0)-1);
                left++;
            }
            maxLength=Math.max(maxLength,right-left+1);
            right++;
        }
        return maxLength;
    }
}

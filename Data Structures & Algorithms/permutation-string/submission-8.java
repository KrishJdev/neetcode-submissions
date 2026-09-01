class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int left=0;
        int right=0;
        int[] freq = new int[26];
        int[] window = new int[26];
        if(s1.length()>s2.length())
        return false;
        for(char c : s1.toCharArray())
        {
            freq[c-'a']++;
        }
        while(right<s2.length())
        {
            window[s2.charAt(right)-'a']++;
            if(right-left+1>s1.length())
            {
                window[s2.charAt(left)-'a']--;
                left++;
            }
            if(right-left+1==s1.length())
            {
                if(Arrays.equals(freq, window))
                return true;
            }
            right++;
        }
        return false;
    }
}

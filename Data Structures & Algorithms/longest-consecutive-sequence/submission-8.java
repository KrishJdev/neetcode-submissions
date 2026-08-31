class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int longest=0;
        for(int i:nums)
        {
          set.add(i);  
        }
        for(int i: set)
        {
            if(set.contains(i-1))
            continue;
            int length=1;
            int current=i;
            while(set.contains(current+length))
            {
                length++;
            }
            longest=Math.max(longest,length);
        }
        return longest;
    }
}

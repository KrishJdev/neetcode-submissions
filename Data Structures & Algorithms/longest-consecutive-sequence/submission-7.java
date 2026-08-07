class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> seq = new HashSet<>();
        int longest=0;
        for(int i : nums)
        {
            seq.add(i);
        }
        for(int i : seq)
        {
            if(seq.contains(i-1))
            continue;
            int length=1;
            int current = i;
            while(seq.contains(current+length))
            {
                length++;
            }
            longest=Math.max(longest,length);
        }
        return longest;
    }
}

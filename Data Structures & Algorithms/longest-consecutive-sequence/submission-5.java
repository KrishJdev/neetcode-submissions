class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int max=0;
        for(int num: nums)
        {
            set.add(num);
        }
        for(int num : set)
        {
            int c=1;
            if(!set.contains(num-1))
            {
            while(set.contains(num+c))
            c++;
            }
            max=Math.max(max,c);
        }
        return max;
    }
}

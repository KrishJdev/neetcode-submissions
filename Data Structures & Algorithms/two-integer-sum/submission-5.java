class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> index = new HashMap<>();
        for(int i=0;i<nums.length; i++)
        {
            int difference = target-nums[i];
            if(index.containsKey(difference))
            return new int[] {index.get(difference),i};
            index.put(nums[i],i);
        }
        throw new IllegalArgumentException("No solution found");
    }
}

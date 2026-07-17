class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> store = new HashMap<>();
        int[] ans=new int[2];
        for(int i=0;i<nums.length;i++)
        {
            int difference = target - nums[i];
            if(store.containsKey(difference))
            {
                ans[0]=store.get(difference);
                ans[1]=i;
                
                return ans;
            }
            else
            store.put(nums[i],i);
        }
        return ans;
    }
}


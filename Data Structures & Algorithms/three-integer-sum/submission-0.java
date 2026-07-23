class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        HashSet<List<Integer>> ans = new HashSet<>();
        Arrays.sort(nums);
        for(int i=0; i<nums.length-2;i++)
        {
            int target=-nums[i];
            int left=i+1;
            int right=nums.length-1;
            while(left<right)
            {
                if(nums[left]+nums[right]==target)
                {
                    Integer[] myArray = {nums[i],nums[left],nums[right]};
                    List<Integer> arrayList = Arrays.asList(myArray);
                    ans.add(arrayList);
                    left++;
                    right--;
                }
                else if(nums[left]+nums[right]>target)
                right--;
                else 
                left++;
            }
        }
        return new ArrayList<>(ans);
    }
}

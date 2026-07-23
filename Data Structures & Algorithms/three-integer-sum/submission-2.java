class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        ArrayList<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0; i<nums.length-2;i++)
        {
            if (i > 0 && nums[i] == nums[i - 1]) 
            continue;
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
                    while (left < right && nums[left] == nums[left - 1]) 
                        left++;
                    while (left < right && nums[right] == nums[right + 1]) 
                        right--;
                }
                else if(nums[left]+nums[right]>target)
                right--;
                else 
                left++;
            }
            
        }
        return ans;
    }
}

class Solution {
    public int maxArea(int[] heights) {
        int left=0;
        int right=heights.length-1;
        int maxWater=0;
        int area=0;
        while(right>left)
        {

            if(heights[left]>heights[right])
            {
                area=heights[right]*(right-left);
                right--;
            }
            else 
            {
                area=heights[left]*(right-left);
                left++;
            }
            maxWater=Math.max(maxWater,area);
        }
        return maxWater;
    }
}

class Solution {
    public int maxArea(int[] heights) {
        int left=0;
        int right=heights.length-1;
        int max=0;
        int area=0;
        while(left<right)
        {
            if(heights[left]<heights[right])
            {
                area=heights[left]*(right-left);
                left++;
            }
            else
            {
                area=heights[right]*(right-left);
                right--;
            }
            max=Math.max(max,area);
        }
        return max;
    }
}

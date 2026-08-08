class Solution {
    public int trap(int[] height) {
        int n=height.length;
        int leftMax=0;
        int rightMax=0;
        int left=0;
        int right=n-1;
        int water=0;
        while(left<right)
        {
            leftMax=Math.max(leftMax,height[left]);
            rightMax=Math.max(rightMax,height[right]);
            if(height[left]<height[right])
            {
                water+=leftMax-height[left];
                left++;
            }
            else
            {
                water+=rightMax-height[right];
                right--;
            }
        }
        return water;
    }
}

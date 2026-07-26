class Solution {
    public int trap(int[] height) {
        int n=height.length;
        int water=0;
        for(int i=0;i<n;i++)
        {
            int maxLeft=height[i];
            int maxRight=height[i];
            for(int j=0;j<=i;j++)
            {
                maxLeft=Math.max(height[j],maxLeft);
            }
            for(int j=i;j<n;j++)
            {
                maxRight=Math.max(height[j],maxRight);
            }
            water=water+Math.min(maxRight,maxLeft)-height[i];
        }
        return water;
    }
}

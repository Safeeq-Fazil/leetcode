class Solution {
    public int[] runningSum(int[] nums) {
        int n=nums.length;
        int sum=0;
        int[] resarr = new int[n];
        for(int i=0;i<n;i++)
        {
            resarr[i]=nums[i]+sum;
            sum=sum+nums[i];
        }
        return resarr;
    }
}
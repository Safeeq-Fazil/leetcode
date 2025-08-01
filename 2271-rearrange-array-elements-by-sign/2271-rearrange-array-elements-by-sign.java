class Solution {
    public int[] rearrangeArray(int[] nums) {
        int p=0;
        int n=1;
        int res[]=new int[nums.length];

        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]<0)
            {
                res[n]=nums[i];
                n+=2;
            }
            else
            {
                res[p]=nums[i];
                p=p+2;
            }
        }
        return res;

    }
}
class Solution {
    public int[] sortColors(int[] nums) {
        int zerocnt=0,onecnt=0,twocnt=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==0)
            {
                zerocnt++;
            }
            else if(nums[i]==1)
            {
                onecnt++;
            }
            else
            {
                twocnt++;
            }
        }
        int ind=0;
        for(int i=0;i<zerocnt;i++)
        {
            nums[ind]=0;
            ind++;
        }
        for(int i=0;i<onecnt;i++)
        {
            nums[ind]=1;
            ind++;
        }
        for(int i=0;i<twocnt;i++)
        {
            nums[ind]=2;
            ind++;
        }
        return nums;
    }
}
class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int n= nums.length;
        int count=0;
        int[] resarr= new int[n];
        for(int current=0;current<n;current++)
        {
            for(int next=0;next<n;next++)
            {
                if(nums[next]<nums[current])
                {
                    count++;
                }
            }
            resarr[current]=count;
            count=0;
        }
        return resarr;
    }
}
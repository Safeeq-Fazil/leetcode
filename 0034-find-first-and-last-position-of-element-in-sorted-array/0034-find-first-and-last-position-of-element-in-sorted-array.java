class Solution {
    public int[] searchRange(int[] nums, int target) {
        int start;
        int end=0;
        int[] arr={-1,-1};
        for(start=0;start<nums.length;start++,end++)
        {
            if(nums[start]==target)
            {
                arr[0]=start;
                while(end!=nums.length && nums[end]==target )
                {
                    arr[1]=end;
                    end++;
                }
                break;
            }
        }
        return arr;
    }
}
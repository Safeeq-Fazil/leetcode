class Solution {

    public void swap(int[] nums,int num1,int num2)
    {
        int temp= nums[num1];
        nums[num1]=nums[num2];
        nums[num2]=temp;
    }

    public void sortColors(int[] nums) {
        int left=0,right=nums.length-1;
        int i=0;
        while(i<=right)
        {
            if(nums[i]==0)
            {
                swap(nums,i,left);
                i++;
                left++;
            }
            else if(nums[i]==2)
            {
                swap(nums,i,right);
                right--;
            }
            else
            {
                i++;
            }
        }

    }
}
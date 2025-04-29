class Solution {
    public int firstMissingPositive(int[] nums) {

        Arrays.sort(nums);
        int missing=1;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==missing) missing++;
            else if(nums[i]>missing) break;
        }
        return missing;
    }
}
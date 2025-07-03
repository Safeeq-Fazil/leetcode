class Solution {
    public int[] getConcatenation(int[] nums) {
        int n= nums.length;
        int[] resarr= new int[n*2];
        for(int i=0;i<n;i++)
        {
            resarr[i]=nums[i];
            resarr[i+n]=nums[i];
        }
        return resarr;
    }
}
class Solution {
    public int[] sortedSquares(int[] nums) {
        int size= nums.length;
        int[] resarr=new int[size];
        for(int i=0;i<size;i++)
        {
            resarr[i]=nums[i]*nums[i];
        }
        Arrays.sort(resarr);
        return resarr;
    }
}
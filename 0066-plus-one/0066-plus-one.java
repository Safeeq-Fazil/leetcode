class Solution {
    public int[] plusOne(int[] digits) {
        int n=digits.length;
        for(int ind=n-1;ind>=0;ind--)
        {
            if(digits[ind]<9)
            {
                digits[ind]+=1;
                return digits;
            }
            digits[ind]=0;
        }

        int[] resarr=new int[n+1];
        resarr[0]=1;
        return resarr;
    }
}
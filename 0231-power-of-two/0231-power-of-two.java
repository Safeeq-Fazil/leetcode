class Solution {
    public boolean isPowerOfTwo(int n) {
        int res;
        if(n<=0)
        {
            return false;
        }
        while(n!=1)
        {
            res=n%2;
            if(res==1)
            {
                return false;
                
            }
            n/=2;
        }
        return true;
    }
}
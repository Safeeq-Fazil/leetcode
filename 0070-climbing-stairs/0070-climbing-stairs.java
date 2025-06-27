class Solution {
    public int climbStairs(int n) {
        int pos1=1,pos2=2,current;
        if(n==1) return 1;
        if(n==2) return 2;
        for(int i=3;i<=n;i++)
        {
            current=pos1+pos2;
            pos1=pos2;
            pos2=current;
        }
        return pos2;
    }
}
class Solution {
    public int maximumWealth(int[][] accounts) {
        int maxwealth=0;
        int sum=0;
        for(int[] account :accounts)
        {
            int n=account.length;
            sum=0;
            for(int i=0;i<n;i++)
            {
                sum+=account[i];
            }
            if(sum>maxwealth)
            {
                maxwealth=sum;
                
            }
        }
        return maxwealth;
    }
}
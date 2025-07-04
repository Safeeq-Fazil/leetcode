class Solution {
    public int largestAltitude(int[] gain) {
        // List<Integer> ans=new ArrayList<>();
        int n= gain.length;
        int[] arr= new int[n+1];
        arr[0]=0;
        for(int i=1;i<=n;i++)
        {
            arr[i]=arr[i-1]+gain[i-1];
        }
        int max=0;
        for(int i:arr)
        {
            max = Math.max(i,max);
        }
        return max;
        

    }
}
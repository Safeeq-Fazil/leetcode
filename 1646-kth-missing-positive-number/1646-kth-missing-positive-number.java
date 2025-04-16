class Solution {
    public int findKthPositive(int[] arr, int k) {
        int ind=0,missingcount=0,current=1;
        while(missingcount<k)
        {
            if(ind<arr.length && arr[ind]==current)
            {
                ind++;
            }
            else
            {
                missingcount++;
                if(missingcount==k)
                {
                    return current;
                }
                
            }
            current++;
           
        }
         return 0;
        
    }
}
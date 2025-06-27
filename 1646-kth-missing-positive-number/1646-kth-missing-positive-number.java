class Solution {
    public int findKthPositive(int[] arr, int k) {
        int ind=0,missingval=0,current=1;
        while(missingval<k)
        {
            if(ind<arr.length && arr[ind]==current)
            {
                ind++;
            }
            else
            {
                missingval++;
                if(missingval==k)
                {
                    return current;
                }
            }
            current++;
        }
        return 0;
    }
}
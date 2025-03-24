class Solution {
    public int longestMountain(int[] arr) {
        int i,j,max=0;
        for(i=1;i<arr.length-1;i++){
            int count =1;
            if(arr[i] > arr[i-1] && arr[i]> arr[i+1]){
                j=i;
                while(j>0 && arr[j]>arr[j-1]){
                    j--;
                    count++;
                }

                while(i<arr.length-1 && arr[i]>arr[i+1]){
                    i++;
                    count++;
                }
                max = Math.max(count,max);
            }
        }
        return max;
    }
}
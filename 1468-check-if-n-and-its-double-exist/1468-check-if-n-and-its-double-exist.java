class Solution {
    public boolean checkIfExist(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<arr.length-1;){
            map.put(arr[i]*2, null);
            if(arr[i]%2==0){
                map.put(arr[i]/2, null);
            }
            i++;
            if(map.containsKey(arr[i])){
                return true;
            }
        }
        return false;
    }
}

class Solution {
    public int largestAltitude(int[] gain) {
        int currentaltitude=0,highestaltitude=0;
        for(int g:gain)
        {
            currentaltitude+=g;
            highestaltitude=Math.max(highestaltitude,currentaltitude);
        }
        return highestaltitude;
    }
}
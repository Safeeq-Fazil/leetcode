class Solution {
    public int lengthOfLastWord(String s) {
        String[] strarr=s.split(" ");
        int lastword=strarr.length-1;
        return strarr[lastword].length();
    }
}
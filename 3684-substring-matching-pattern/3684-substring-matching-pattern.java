class Solution {
    public boolean hasMatch(String s, String p) {
        int ind=p.indexOf("*");
        String prefix =p.substring(0,ind);
        String suffix =p.substring(ind+1);

        int preind=s.indexOf(prefix);
        int sufind=s.indexOf(suffix,ind+preind);

        if(preind>-1 && sufind>-1) return true;
        else return false;
        // return preind>-1 && sufind>-1; this is also correct

    }
}
class Solution {
    int carpetlen;
    int numcar;
    String floor;
    int prefixsum[];
    int Flen;
    int memo[][];
    public int minimumWhiteTiles(String floor, int numCarpets, int carpetLen) {
        Flen=floor.length();
        carpetlen=carpetLen;
        numcar=numCarpets;
        this.floor=floor;
        memo=new int[Flen][numcar+1];
        for(int a[]:memo)
        Arrays.fill(a,-1);
        prefixsum=new int[Flen+1];
        for(int i=0;i<Flen;i++)
        prefixsum[i+1]=prefixsum[i]+(floor.charAt(i)=='1'?1:0);
        return minlen(0,numCarpets);
        
    }

    int minlen(int pos,int numcar)
    {
         if(pos>=Flen)
         return 0;
         if(numcar==0)
         return prefixsum[Flen]-prefixsum[pos];

         if(memo[pos][numcar]!=-1)
         return memo[pos][numcar];

         if(floor.charAt(pos)=='0')
         return minlen(pos+1,numcar);

         int min=Math.min(minlen(pos+carpetlen,numcar-1),1+minlen(pos+1,numcar));
         memo[pos][numcar]=min;
         return min;
    }
}
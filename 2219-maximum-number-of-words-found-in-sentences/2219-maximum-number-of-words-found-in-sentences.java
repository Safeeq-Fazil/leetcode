class Solution {
    public int mostWordsFound(String[] sentences) {
      int maxcount=0;
      for(String sentence :sentences)
      {
        int wordcount = sentence.split(" ").length;
        if(wordcount >maxcount)
        {
            maxcount=wordcount;
            wordcount=0;
        }
      }
      return maxcount;
    }
}
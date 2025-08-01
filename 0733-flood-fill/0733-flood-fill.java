class Solution {
    int row;
    int colm;
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        row=image.length;
        colm=image[0].length;
        int original=image[sr][sc];
        if(original==color)
        {
            return image;
        }
        dfs(sr,sc,original,color,image);
        return image;
    }
    void dfs(int sr,int sc,int original,int color,int[][] image)
    {
        if(sr<0 || sc<0 || sr==row ||sc==colm || image[sr][sc]!=original)
        {
            return;
        }
        if(image[sr][sc]==original)
        {
            image[sr][sc]=color;
        }
        dfs(sr-1,sc,original,color,image);
        dfs(sr+1,sc,original,color,image);
        dfs(sr,sc-1,original,color,image);
        dfs(sr,sc+1,original,color,image);
    }
}
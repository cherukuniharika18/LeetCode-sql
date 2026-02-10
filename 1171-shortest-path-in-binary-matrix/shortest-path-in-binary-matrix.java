class Solution 
{
    public int shortestPathBinaryMatrix(int[][] grid) 
    {
        int n=grid.length;
        if(grid[0][0]==1 || grid[n-1][n-1]==1)
        {
            return -1;
        }
        int dir[][]={{-1, 0}, {-1, 1}, {0, 1}, {1, 1},{1, 0}, {1, -1}, {0, -1}, {-1, -1}};
        Queue<int[]> q=new LinkedList<>();
        q.offer(new int[]{0, 0});
        int level=1;
        while(!q.isEmpty())
        {
            int size=q.size();
            for(int i=0;i<size;i++)
            {
                int cr[]=q.poll();
                int r=cr[0];
                int c=cr[1];
                if(r<0 || r>=n || c<0 || c>=n || grid[r][c]==1)
                {
                    continue;
                }
                if(r==n-1 && c==n-1)
                {
                    return level;
                }
                grid[r][c]=1;
                for(int k=0; k<8; k++)
                {
                    int x=r+dir[k][0];
                    int y=c+dir[k][1];
                    q.offer(new int[]{x, y});
                }
            }
            level++;
        }
        return -1;
    }
}
class Solution 
{
    public int numIslands(char[][] grid) 
    {
        int count=0;
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[0].length;j++)
            {
                if(grid[i][j]=='1')
                {
                    bfs(grid,i,j);
                    count++;
                }
            }
        } 
        return count;
    }
    static void bfs(char grid[][],int row, int column)
    {
        Queue<int[]>q=new LinkedList<>();
        q.offer(new int[]{row,column});
        while(!q.isEmpty())
        {
            int current[]=q.poll();
            int r=current[0];
            int c=current[1];
            if(r<0||r>=grid.length||c<0||c>=grid[0].length||grid[r][c]=='0')
            {
                continue;
            }
            grid[r][c]='0';
            q.offer(new int[]{r-1,c});
            q.offer(new int[]{r+1,c});
            q.offer(new int[]{r,c-1});
            q.offer(new int[]{r,c+1});
        }
    }
}
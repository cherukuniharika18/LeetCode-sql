class Solution 
{
    public int[][] minAbsDiff(int[][] grid, int k) 
    {
        int m=grid.length;
        int n=grid[0].length;
        int[][] result=new int[m-k+1][n-k+1];
        for(int i=0;i<=m-k;i++)
        {
            for(int j=0;j<=n-k;j++)
            {
                List<Integer> list=new ArrayList<>(k * k);
                for(int r=i;r<i+k;r++)
                {
                    for(int c=j;c<j+k;c++)
                    {
                        list.add(grid[r][c]);
                    }
                }
                Collections.sort(list);
                int minDiff=Integer.MAX_VALUE;
                for(int x=1;x<list.size();x++)
                {
                    if(list.get(x).equals(list.get(x-1)))
                    {
                        continue;
                    }
                    int diff=list.get(x)-list.get(x-1);
                    minDiff=Math.min(minDiff, diff);
                }
                if(minDiff==Integer.MAX_VALUE)
                {
                    minDiff=0;
                }
                result[i][j]=minDiff;
            }
        }
        return result;
    }
}
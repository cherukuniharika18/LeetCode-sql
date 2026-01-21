class Solution {
    public boolean isHappy(int n) {
        while(n!=1 && n!=4)
        {
            n=next(n);
        }
        return n==1;
    }
    private int next(int n)
    {
        int sum=0;
        while(n>0)
        {
            int d=n%10;
            sum+=d*d;
            n/=10;
        }
        return sum;
    }
}
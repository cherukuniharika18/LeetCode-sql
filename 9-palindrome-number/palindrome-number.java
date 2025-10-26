class Solution {
    public boolean isPalindrome(int x) {
        if(x<0)
        {
            return false;
        }    
        int n=x;
        int reversenum=0;
        while(n>0)
        {
            int d=n%10;
            reversenum=reversenum * 10 + d;
            n=n/10;
        }
        if(reversenum==x)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
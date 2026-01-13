class Solution {
    public int gcdOfOddEvenSums(int n) {
        int even=n*(n+1);
        int odd=n*n;
        while(even!=0)
        {
            int temp=even;
            even=odd%even;
            odd=temp;
        }
        return odd;
    }
}
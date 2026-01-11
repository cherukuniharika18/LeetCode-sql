class Solution 
{
    public int[] plusOne(int[] digits) 
    {
        //starts from last digit
        for(int i=digits.length-1;i>=0;i--)
        {
            //if digit is not 9
            if(digits[i] < 9)
            {
                digits[i]++;
                return digits;
            }
            //if digit is 9
            digits[i]=0;
        }
        //all digits were 9
        int result[]=new int[digits.length+1];
        result[0]=1;
        return result;
    }
}
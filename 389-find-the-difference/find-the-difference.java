class Solution {
    public char findTheDifference(String s, String t) {
        char[] a=s.toCharArray();
        char[] b=t.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        int i=0,j=0;
        while(i<a.length && j<b.length)
        {
            if(a[i]==b[j])
            {
                i++;
                j++;
            }
            else
            {
                return b[j];
            }
        }
        return b[j];
    }
}
class Solution 
{
    public double findMedianSortedArrays(int[] nums1, int[] nums2) 
    {
        int size1=nums1.length;
        int size2=nums2.length;
        int mergedArray[]=new int[size1+size2];
        int k =0;
        for(int i=0;i<size1;i++) 
        {
            mergedArray[k++]=nums1[i];
        }
        for(int i=0;i<size2;i++)
        {
            mergedArray[k++]=nums2[i];
        }
        Arrays.sort(mergedArray);
        int total=mergedArray.length;
        if(total%2==1)
        {
            return (double) mergedArray[total/2];
        }
        else
        {
            int middle1=mergedArray[total/2-1];
            int middle2=mergedArray[total/2];
            return ((double) middle1+(double)middle2)/2.0;
        }
    }
}
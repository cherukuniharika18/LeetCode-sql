
class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer>result=new ArrayList<>();
        int num[]=new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            num[nums[i]-1]=1;
        }
        for(int i=0;i<nums.length;i++)
        {
            if(num[i]==0)
            {
                result.add(i+1);
            }
        }
        return result;
    }
}
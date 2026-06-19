class Solution {
    public int[] buildArray(int[] nums) {
        return java.util.Arrays.stream(nums).map(i -> nums[i]).toArray();
    }
}
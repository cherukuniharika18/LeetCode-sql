class Solution {
    public int[] sortedSquares(int[] nums) {
        return java.util.Arrays.stream(nums).map(x -> x * x).sorted().toArray();
    }
}
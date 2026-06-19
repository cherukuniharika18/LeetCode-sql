class Solution {
    public String reverseWords(String s) {
        return java.util.Arrays.stream(s.trim().split("\\s+"))
                .reduce((a, b) -> b + " " + a)
                .orElse("");
    }
}
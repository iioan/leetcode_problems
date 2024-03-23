class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int v : nums) {
             set.add(v);
        }
        int longest = 0;
        for (Integer v : set) {
            if (!set.contains(v - 1)) {
                int length = 0;
                while (set.contains(v + length)) {
                    length++;
                }
                longest = Math.max(longest, length);
            }
        }
        return longest;
    }
}
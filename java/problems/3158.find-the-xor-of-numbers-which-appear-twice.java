// @leet start
class Solution {
    public int duplicateNumbersXOR(int[] nums) {
        int res = 0;
        boolean[] appeared = new boolean[51];
        for (int num : nums) {
            if (appeared[num]) res ^= num;
            else appeared[num] = true;
        }
        return res;
    }
}
// @leet end

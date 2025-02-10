// @leet start
class Solution {
    public int hammingWeight(int n) {
        int res = 0;
        while (n != 0) {
            res += n%2;
            n /= 2;
        }
        return res;
    }
}
// @leet end

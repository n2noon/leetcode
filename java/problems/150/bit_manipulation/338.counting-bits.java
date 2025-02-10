// @leet start
class Solution {
    public int[] countBits(int n) {
        int[] res = new int[n+1];
        res[0] = 0;
        if (n == 0) return res;
        res[1] = 1;

        int i = 1;
        while (i <= n) {
            i *= 2;
            int ub = Math.min(n+1, i*2);
            for (int j = i; j < ub; j++) {
                res[j] = res[j - i] + 1;
            }
        }
        return res;
    }
}
// @leet end

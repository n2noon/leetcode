// @leet start
class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int res = 0;
        var isjewel = new boolean[60];
        for (char ch : jewels.toCharArray()) {
            isjewel[ch - 'A'] = true;
        }
        for (char ch : stones.toCharArray()) {
            if (isjewel[ch - 'A']) res++;
        }
        return res;
    }
}
// @leet end

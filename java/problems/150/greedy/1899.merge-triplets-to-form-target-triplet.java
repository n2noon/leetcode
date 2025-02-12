// @leet start
class Solution {
    private boolean isValid(int[] triplet, int[] target) {
        return (triplet[0] <= target[0] &&
                triplet[1] <= target[1] &&
                triplet[2] <= target[2]);
    }
    public boolean mergeTriplets(int[][] triplets, int[] target) {
        int[] curr = new int[3];
        for (int[] tr : triplets) {
            if (isValid(tr, target)) {
                curr[0] = Math.max(curr[0], tr[0]);
                curr[1] = Math.max(curr[1], tr[1]);
                curr[2] = Math.max(curr[2], tr[2]);
            }
            if (Arrays.equals(curr, target)) return true;
        }
        return false;
    }
}
// @leet end

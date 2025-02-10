// @leet start
class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals, (i1, i2) -> i1[0] - i2[0]);
        int res = 0;
        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][0] < intervals[i-1][1]) {
                res++;
                if (intervals[i][1] - intervals[i][0] >= intervals[i-1][1] - intervals[i-1][0]) {
                    intervals[i][0] = intervals[i-1][0];
                    intervals[i][1] = intervals[i-1][1];
                } else {
                    intervals[i][1] = Math.min(intervals[i][1], intervals[i-1][1]);
                }
            }
        }
        return res;
    }
}
// @leet end

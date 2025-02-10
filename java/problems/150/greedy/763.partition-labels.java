// @leet start
class Solution {
    public List<Integer> partitionLabels(String s) {
        int[] lastAppear = new int[26];
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            lastAppear[s.charAt(i)-'a'] = i;
        }
        for (int i = 0; i < s.length(); i++) { 
            int j = i;
            for (int ub = lastAppear[s.charAt(i)-'a']; j < ub; j++) {
                ub = Math.max(ub, lastAppear[s.charAt(j)-'a']);
            }
            res.add(j-i+1);
            i = j;
        }
        return res;
    }
}
// @leet end

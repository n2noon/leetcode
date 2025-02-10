// @leet start
class Solution {
    List<List<Integer>> res;

    private void dfs(int i, int[] nums, List<Integer> curr) {
        if (i == nums.length) {
            this.res.add(new ArrayList<Integer>(curr));
            return;
        }
        curr.add(nums[i]);
        dfs(i+1, nums, curr);
        while (i < nums.length-1 && nums[i] == nums[i+1]) i++;
        curr.remove(curr.size() - 1);
        dfs(i+1, nums, curr);
    }

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        this.res = new ArrayList<List<Integer>>();
        dfs(0, nums, new ArrayList<Integer>());
        return this.res;
    }
}
// @leet end

// @leet start
class Solution {
    List<List<Integer>> res;
    
    private void dfs(List<Integer> curr, int i, int[] nums) {
        if (i >= nums.length) { this.res.add(new ArrayList<Integer>(curr)); return;}
        curr.add(nums[i]);
        dfs(curr, i+1, nums);
        curr.remove(curr.size() - 1);
        dfs(curr, i+1, nums);
    }

    public List<List<Integer>> subsets(int[] nums) {
        this.res = new ArrayList<List<Integer>>();
        dfs(new ArrayList<Integer>(), 0, nums);
        return this.res;
        
    }
}
// @leet end

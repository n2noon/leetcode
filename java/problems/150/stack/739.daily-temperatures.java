// @leet start
class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        List<int[]> tempStack = new ArrayList<>();
        int[] res = new int[temperatures.length];
        for (int i = 0; i < temperatures.length; i++) {
            while (!tempStack.isEmpty() && tempStack.get(tempStack.size() - 1)[1] < temperatures[i]) {
                int[] temp = tempStack.remove(tempStack.size() - 1);
                res[temp[0]] = i - temp[0];
            }
            tempStack.add(new int[]{i, temperatures[i]});
        }
        return res;
    }
}
// @leet end

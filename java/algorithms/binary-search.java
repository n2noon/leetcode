public class binarysearch {
    private static int bsearch(int[] nums, int target) {
        int l = 0, r = nums.length - 1;
        while (l <= r) {
            int m = l + (r-l)/2;
            if (nums[m] == target) return m;
            else if (nums[m] < target) l = m+1;
            else r = m-1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {2, 4, 7, 10, 12, 15, 16, 19};
        int target = 4;
        System.out.println(bsearch(nums, target));
    }
}

class Solution {
    public int minPatches(int[] nums, int n) {
        int patches = 0;
        long miss = 1;  // Start with 1 (lowest number not yet covered)
        int i = 0;

        while (miss <= n) {
            if (i < nums.length && nums[i] <= miss) {
                // nums[i] is within current coverage, extend it
                miss += nums[i];
                i++;
            } else {
                // nums[i] is too big OR no more nums left => patch 'miss'
                miss += miss;
                patches++;
            }
        }

        return patches;
    }
}

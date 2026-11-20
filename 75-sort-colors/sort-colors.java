class Solution {
    public void sortColors(int[] nums) {
        int j = 0;
        int high = nums.length - 1;

        for (int i = 0; i <= high; i++) {
            if (nums[i] == 0) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;
            }
            else if (nums[i] == 2) {
                int temp = nums[i];
                nums[i] = nums[high];
                nums[high] = temp;
                high--;
                i--;
            }
        }
    }
}
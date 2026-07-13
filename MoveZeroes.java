public class MoveZeroes {

    public static void moveZeroes(int[] nums) {
        int left = 0;

        for (int right = 0; right < nums.length; right++) {

            if (nums[right] != 0) {
                // Swap nums[left] and nums[right]
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;

                left++;
            }
        }
    }

    public static void main(String[] args) {

        int[] nums = { 0, 1, 0, 3, 12 };

        moveZeroes(nums);

        System.out.print("Output: ");
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
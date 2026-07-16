public class MaximumSumSubarray {

    public static int MaxSum(int[] arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }
        int maxsum = sum;
        for (int i = k; i < arr.length; i++) {
            sum = sum - arr[i - k] + arr[i];
            maxsum = Math.max(maxsum, sum);
        }

        return maxsum;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 1, 5, 1, 3, 2 };
        System.out.println("Maximum Sum: " + MaxSum(arr, 3));
    }
}
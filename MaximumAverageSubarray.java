public class MaximumAverageSubarray {

    public static double MaxAverage(int[] arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }
        int maxsum = sum;
        for (int i = k; i < arr.length; i++) {
            sum = sum - arr[i - k] + arr[i];
            maxsum = Math.max(maxsum, sum);
        }

        return (double) maxsum / k;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 12, -5, -6, 50, 3 };
        System.out.println("Maximum Average: " + MaxAverage(arr, 3));
    }
}
import java.util.Arrays;

public class singlenumber {
    public static void main(String[] args) {
        int[] nums = { 4, 1, 2, 1, 2 };

        int result = Arrays.stream(nums)
                .reduce(0, (a, b) -> a ^ b);

        System.out.println("Single Number: " + result);
    }
}

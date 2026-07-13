public class Solution {
    public int EvenNumbers(int[] num) {

        int sum = 0;
        int count = 0;

        for (int n : num) {
            if (n % 2 == 0 && n % 3 == 0) {
                sum += n;
                count++;
            }
        }

        if (count == 0)
            return 0;

        return sum / count;
    }
}

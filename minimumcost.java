public class minimumcost {

    public static int minCostToMoveChips(int[] position) {
        int even = 0;
        int odd = 0;

        for (int p : position) {
            if (p % 2 == 0)
                even++;
            else
                odd++;
        }

        return Math.min(even, odd);
    }

    public static void main(String[] args) {
        int[] position = { 1, 2, 3 };

        int result = minCostToMoveChips(position);

        System.out.println("Minimum Cost: " + result);
    }
}

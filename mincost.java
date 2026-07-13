import java.util.Scanner;

public class mincost {

    public static int minCostToMoveChips(int[] position) {
        int even = 0;
        int odd = 0;

        for (int p : position) {
            if (p % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }

        return Math.min(even, odd);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of chips: ");
        int n = sc.nextInt();

        int[] position = new int[n];

        System.out.println("Enter chip positions:");
        for (int i = 0; i < n; i++) {
            position[i] = sc.nextInt();
        }

        int result = minCostToMoveChips(position);

        System.out.println("Minimum Cost: " + result);

        sc.close();
    }
}

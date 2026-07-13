import java.util.Scanner;

public class StockProfitLoss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter purchase price: ");
        double buy = sc.nextDouble();

        System.out.print("Enter quantity: ");
        int qty = sc.nextInt();

        System.out.print("Enter current price: ");
        double current = sc.nextDouble();

        double diff = (current - buy) * qty;

        if (diff > 0) {
            System.out.println("Profit = " + diff);
        } else if (diff < 0) {
            System.out.println("Loss = " + (-diff));
        } else {
            System.out.println("No Profit No Loss");
        }

        sc.close();
    }
}
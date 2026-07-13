import java.util.Arrays;

public class RichestCustomerWealth {
    public static void main(String[] args) {
        int[][] accounts = {
                { 1, 2, 3 },
                { 3, 2, 1 },
                { 4, 5, 6 }
        };

        int richestWealth = Arrays.stream(accounts)
                .mapToInt(customer -> Arrays.stream(customer).sum())
                .max()
                .orElse(0);

        System.out.println("Richest Customer Wealth: " + richestWealth);
    }
}

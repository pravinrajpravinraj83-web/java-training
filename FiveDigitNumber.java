import java.util.Scanner;

public class FiveDigitNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (num >= 10000 && num <= 99999)
            System.out.println("It is a 5-digit number.");
        else
            System.out.println("It is not a 5-digit number.");

        sc.close();
    }
}

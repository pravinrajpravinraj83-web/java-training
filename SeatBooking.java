import java.util.Scanner;

public class SeatBooking {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter seat number: ");
        int seat = sc.nextInt();

        if (seat >= 1 && seat <= 15) {
            System.out.println("Occupied");
        } else {
            System.out.println("Book");
        }

        sc.close();
    }
}

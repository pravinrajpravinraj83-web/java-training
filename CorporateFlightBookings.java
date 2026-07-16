public class CorporateFlightBookings {

    public static void main(String[] args) {

        int[][] bookings = {
                { 1, 2, 10 },
                { 2, 3, 20 },
                { 2, 5, 25 }
        };
        int n = 5;
        int[] flights = new int[n];
        for (int[] booking : bookings) {
            int start = booking[0] - 1;
            int end = booking[1] - 1;
            int seats = booking[2];

            flights[start] += seats;

            if (end + 1 < n) {
                flights[end + 1] -= seats;
            }
        }
        for (int i = 1; i < n; i++) {
            flights[i] += flights[i - 1];
        }
        System.out.println("Seats booked for each flight:");

        for (int seat : flights) {
            System.out.print(seat + " ");
        }
    }
}

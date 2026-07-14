public class CarPooling {

    public static boolean carPooling(int[][] trips, int capacity) {

        int[] diff = new int[1001];

        for (int[] trip : trips) {
            int passengers = trip[0];
            int from = trip[1];
            int to = trip[2];

            diff[from] += passengers;
            diff[to] -= passengers;
        }

        int currentPassengers = 0;

        for (int i = 0; i < diff.length; i++) {
            currentPassengers += diff[i];

            if (currentPassengers > capacity) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        int[][] trips = {
                { 2, 1, 5 },
                { 3, 3, 7 }
        };

        System.out.println(carPooling(trips, 4));
    }
}

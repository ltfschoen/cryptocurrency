public class Bus {

    /* Bus example */
    public static void main(String[] args) {

        // Data Types, Casting
        int seats = 52; // int is fast
        long seatGraffitiMarks = 2147483647; // double slower than int but larger natural numbers
        double averageMaxPassengers = seats * 1.2;
        double cleaningSplitFraction = seatGraffitiMarks/averageMaxPassengers; // double slower than int
        System.out.println("Long max value: " + Long.MAX_VALUE);
        int approxCleaningSplit = (int) cleaningSplitFraction; // casting
        int daysInYear = 365;
        double countStandingPassengers = averageMaxPassengers - seats;
        double countGraffitiMarksPerSeat = (double) seatGraffitiMarks/seats; // casting accurately
        char tagPrefix = 'b';
        boolean graffitiAllowed = true;

        // Print
        String driverName;
        driverName = "Luke";
        System.out.println(driverName.length());
        System.out.println("Bus driver " + driverName.toUpperCase());
    }

}
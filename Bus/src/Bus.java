public class Bus {

    // Function definition with parameter, access modifier and return type
    public static String getFareType(int fareCode) {
        // Switch statement
        String fareType;
        switch(fareCode) {
            case 111: fareType = "Single";
                break;
            case 222: fareType = "Concession";
                break;
            default: fareType = "Free";
                break;
        }
        return fareType;
    }

    public static int getRandomAge() {
        double randomNumber = Math.random(); // random decimal value 0 to less than 1
        randomNumber = randomNumber * 100;
        int randomAge = (int) randomNumber;
        return randomAge;
    }

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
        int randomDriverAge = getRandomAge();
        System.out.println("Bus driver aged " + randomDriverAge);
        int driverSize = driverName.length();

        // Variable Scope within block braces, If statement
        if (graffitiAllowed) {
            System.out.println("Bus driver " + driverName.toUpperCase());
        } else if (!graffitiAllowed) {
            System.out.println("Bus driver " + driverName.toLowerCase());
        } else {
            System.out.println("No bus driver");
        }

        // Function Call with argument
        String fareType = getFareType(111);
        System.out.println("Fare type is: " + fareType);
    }

}
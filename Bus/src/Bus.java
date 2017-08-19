public class Bus {


    /**
     * Generate random age function definition. Javadocs comments
     * @param fareCode parameter
     * @return fare type is return type from public access modifier
     */
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

    public static double getAverageDistanceBetweenStops(double [] stops) {
        int size = stops.length;
        double totalDistance = 0;
        for (int i = 0; i < size; i++) {
            totalDistance += stops[i];
        }
        double average = totalDistance / size;
        return average;
    }

    /**
     * Search for shortest distance between bus stops
     * @param stops array of distances between bus stops
     * @return double shortest distance betwen bus stops
     */
    public static double getShortestDistanceBetweenStops(double [] stops) {
        int size = stops.length;
        double min = stops[0];
        for (int i = 1; i < size; i++) {
            if (stops[i] < min) {
                min = stops[i];
            }
        }
        return min;
    }

    public static void drive() {
        boolean stopButtonPressed = false;
        double [][] stops = new double [][] {{10.0, 5.6, 20.7, 3.9, 30.4}, {5.0, 2.6, 10.7, 2.9, 20.4}};
        int i = 0;
        while(!stopButtonPressed) {
            System.out.println("Passing stop: " + stops[0][i]);
            i++;
            if (stops[0][i] == 30.4) {
                stopButtonPressed = true;
            }
        }
        System.out.println("Stopping at bus stop: " + stops[0][i]);

        double averageDistanceBetweenStops = getAverageDistanceBetweenStops(stops[0]);
        System.out.println("Average distance between stops: " + averageDistanceBetweenStops);

        double shortestDistanceBetweenStops = getShortestDistanceBetweenStops(stops[0]);
        System.out.println("Shortest distance between stops: " + shortestDistanceBetweenStops);
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

        drive();
    }

}
package abstraction_and_interfaces.class_problems;

public class TravelBookingWithACommonFee {
    abstract static class Booking {
        static final double BOOKING_FEE = 50;
        final String mode;
        final double distance;
        Booking(String mode, double distance) { this.mode = mode; this.distance = distance; }
        abstract double baseFare();
        final double totalFare() { return baseFare() + BOOKING_FEE; }
    }

    static class Bus extends Booking {
        Bus(double distance) { super("BUS", distance); }
        double baseFare() { return distance * 2; }
    }

    static class Train extends Booking {
        Train(double distance) { super("TRAIN", distance); }
        double baseFare() { return distance * 1.5; }
    }

    static class Flight extends Booking {
        Flight(double distance) { super("FLIGHT", distance); }
        double baseFare() { return 2500 + distance * 4; }
    }

    public static void main(String[] args) {
        Booking[] bookings = {new Bus(200), new Train(300), new Flight(500)};
        for (Booking booking : bookings) {
            System.out.printf("%s: %.2f%n", booking.mode, booking.totalFare());
        }
    }
}

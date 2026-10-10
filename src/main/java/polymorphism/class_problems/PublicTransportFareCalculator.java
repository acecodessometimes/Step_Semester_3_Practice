package polymorphism.class_problems;

public class PublicTransportFareCalculator {
    abstract static class Journey {
        final String type;
        final double distance;
        Journey(String type, double distance) { this.type = type; this.distance = distance; }
        abstract double calculateFare();
    }

    static class Bus extends Journey {
        Bus(double distance) { super("BUS", distance); }
        double calculateFare() { return Math.min(10, 2 + 0.10 * distance); }
    }

    static class Train extends Journey {
        Train(double distance) { super("TRAIN", distance); }
        double calculateFare() { return 3 + 0.15 * distance; }
    }

    static class Metro extends Journey {
        final double peakHourFactor;
        Metro(double distance, double factor) { super("METRO", distance); peakHourFactor = factor; }
        double calculateFare() { return (1.50 + 0.20 * distance) * peakHourFactor; }
    }

    public static void main(String[] args) {
        Journey[] journeys = {new Bus(15), new Train(50), new Metro(10, 1.5)};
        double total = 0;
        for (Journey journey : journeys) {
            double fare = journey.calculateFare();
            total += fare;
            System.out.printf("%s: %.2f%n", journey.type, fare);
        }
        System.out.printf("Total: %.2f%n", total);
    }
}

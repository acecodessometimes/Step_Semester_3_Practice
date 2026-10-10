package polymorphism.class_problems;

public class DeliveryFeeCalculator {
    abstract static class Delivery {
        final String type;
        final double weight;
        final double distance;
        Delivery(String type, double weight, double distance) { this.type = type; this.weight = weight; this.distance = distance; }
        abstract double calculateFee();
    }

    static class Standard extends Delivery {
        Standard(double weight, double distance) { super("STANDARD", weight, distance); }
        double calculateFee() { return 5 + 0.50 * weight + 0.10 * distance; }
    }

    static class Express extends Delivery {
        Express(double weight, double distance) { super("EXPRESS", weight, distance); }
        double calculateFee() { return 20 + weight + 0.20 * distance; }
    }

    static class International extends Delivery {
        final double customsFee;
        International(double weight, double distance, double customsFee) { super("INTERNATIONAL", weight, distance); this.customsFee = customsFee; }
        double calculateFee() { return 35 + 2 * weight + 0.50 * distance + customsFee; }
    }

    public static void main(String[] args) {
        Delivery[] deliveries = {new Standard(10, 50), new Express(5, 20), new International(20, 100, 30)};
        double total = 0;
        for (Delivery delivery : deliveries) {
            double fee = delivery.calculateFee();
            total += fee;
            System.out.printf("%s: %.2f%n", delivery.type, fee);
        }
        System.out.printf("Total: %.2f%n", total);
    }
}

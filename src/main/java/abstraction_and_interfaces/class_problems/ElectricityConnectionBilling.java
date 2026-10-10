package abstraction_and_interfaces.class_problems;

public class ElectricityConnectionBilling {
    abstract static class Connection {
        final String type;
        final double units;
        Connection(String type, double units) { this.type = type; this.units = units; }
        abstract double bill();
    }

    static class Home extends Connection {
        Home(double units) { super("HOME", units); }
        double bill() { return Math.min(units, 100) * 5 + Math.max(0, units - 100) * 7; }
    }

    static class Shop extends Connection {
        Shop(double units) { super("SHOP", units); }
        double bill() { return units * 8 + 100; }
    }

    static class Factory extends Connection {
        Factory(double units) { super("FACTORY", units); }
        double bill() { return Math.max(1000, units * 6); }
    }

    public static void main(String[] args) {
        Connection[] connections = {new Home(150), new Shop(90), new Factory(120)};
        double total = 0;
        for (Connection connection : connections) {
            double bill = connection.bill();
            total += bill;
            System.out.printf("%s: %.2f%n", connection.type, bill);
        }
        System.out.printf("Total: %.2f%n", total);
    }
}

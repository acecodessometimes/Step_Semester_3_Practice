package abstraction_and_interfaces.class_problems;

public class GardenPlotAreaReport {
    abstract static class GardenPlot {
        final String owner;
        final String shape;
        GardenPlot(String owner, String shape) { this.owner = owner; this.shape = shape; }
        abstract double area();
    }

    static class CirclePlot extends GardenPlot {
        final double radius;
        CirclePlot(String owner, double radius) { super(owner, "CIRCLE"); this.radius = radius; }
        double area() { return Math.PI * radius * radius; }
    }

    static class RectanglePlot extends GardenPlot {
        final double length;
        final double width;
        RectanglePlot(String owner, double length, double width) { super(owner, "RECTANGLE"); this.length = length; this.width = width; }
        double area() { return length * width; }
    }

    static class TrianglePlot extends GardenPlot {
        final double base;
        final double height;
        TrianglePlot(String owner, double base, double height) { super(owner, "TRIANGLE"); this.base = base; this.height = height; }
        double area() { return 0.5 * base * height; }
    }

    public static void main(String[] args) {
        GardenPlot[] plots = {new CirclePlot("Asha", 5), new RectanglePlot("Ravi", 4, 6), new TrianglePlot("Neha", 10, 3)};
        double total = 0;
        for (GardenPlot plot : plots) {
            double area = plot.area();
            total += area;
            System.out.printf("%s (%s): %.2f%n", plot.owner, plot.shape, area);
        }
        System.out.printf("Total Area: %.2f%n", total);
    }
}

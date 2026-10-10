package abstraction_and_interfaces.class_problems;

public class LibraryLateFineCounter {
    abstract static class LibraryItem {
        final String title;
        final int daysLate;
        LibraryItem(String title, int daysLate) { this.title = title; this.daysLate = daysLate; }
        abstract double fine();
    }

    static class Book extends LibraryItem {
        Book(String title, int days) { super(title, days); }
        double fine() { return daysLate * 2.0; }
    }

    static class Dvd extends LibraryItem {
        Dvd(String title, int days) { super(title, days); }
        double fine() { return Math.min(50, daysLate * 5.0); }
    }

    static class Magazine extends LibraryItem {
        Magazine(String title, int days) { super(title, days); }
        double fine() { return daysLate; }
    }

    public static void main(String[] args) {
        LibraryItem[] items = {new Book("Algebra", 4), new Dvd("Inception", 12), new Magazine("Sports", 3)};
        double total = 0;
        for (LibraryItem item : items) {
            double fine = item.fine();
            total += fine;
            System.out.printf("%s: %.2f%n", item.title, fine);
        }
        System.out.printf("Total Fines: %.2f%n", total);
    }
}

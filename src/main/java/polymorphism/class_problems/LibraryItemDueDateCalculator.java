package polymorphism.class_problems;

import java.time.LocalDate;

public class LibraryItemDueDateCalculator {
    abstract static class LibraryItem {
        final String title;
        LibraryItem(String title) { this.title = title; }
        abstract int borrowingDays();
        LocalDate dueDate(LocalDate currentDate) { return currentDate.plusDays(borrowingDays()); }
    }

    static class Book extends LibraryItem {
        Book(String title) { super(title); }
        int borrowingDays() { return 14; }
    }

    static class Dvd extends LibraryItem {
        Dvd(String title) { super(title); }
        int borrowingDays() { return 7; }
    }

    static class Magazine extends LibraryItem {
        Magazine(String title) { super(title); }
        int borrowingDays() { return 3; }
    }

    public static void main(String[] args) {
        LocalDate currentDate = LocalDate.of(2023, 10, 26);
        LibraryItem[] items = {new Book("1984"), new Dvd("The Matrix"), new Magazine("Forbes Issue 500")};
        for (LibraryItem item : items) {
            System.out.println(item.title + ": " + item.dueDate(currentDate));
        }
    }
}

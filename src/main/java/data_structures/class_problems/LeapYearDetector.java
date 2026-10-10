package data_structures.class_problems;

public class LeapYearDetector {
    static boolean isLeapYear(int year) {
        return year % 400 == 0 || year % 4 == 0 && year % 100 != 0;
    }

    static void printResult(int year) {
        System.out.println(isLeapYear(year) ? "Leap year" : "Not a leap year");
    }

    public static void main(String[] args) {
        printResult(2024);
        printResult(1900);
        printResult(2000);
    }
}

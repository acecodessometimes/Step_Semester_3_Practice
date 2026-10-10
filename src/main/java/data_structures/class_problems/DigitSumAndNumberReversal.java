package data_structures.class_problems;

public class DigitSumAndNumberReversal {
    static int[] digitSumAndReverse(int number) {
        int remaining = number;
        int sum = 0;
        int reversed = 0;
        while (remaining > 0) {
            int digit = remaining % 10;
            sum += digit;
            reversed = reversed * 10 + digit;
            remaining /= 10;
        }
        return new int[]{sum, reversed};
    }

    public static void main(String[] args) {
        int[] result = digitSumAndReverse(4721);
        System.out.println("Sum of digits: " + result[0]);
        System.out.println("Reverse: " + result[1]);
    }
}

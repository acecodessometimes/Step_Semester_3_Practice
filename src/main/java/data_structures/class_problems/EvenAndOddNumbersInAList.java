package data_structures.class_problems;

public class EvenAndOddNumbersInAList {
    static int[] countEvenAndOdd(int[] numbers) {
        int even = 0;
        int odd = 0;
        for (int number : numbers) {
            if (number % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }
        return new int[]{even, odd};
    }

    public static void main(String[] args) {
        int[] counts = countEvenAndOdd(new int[]{3, 8, 12, 5, 7, 10});
        System.out.println("Even: " + counts[0]);
        System.out.println("Odd: " + counts[1]);
    }
}

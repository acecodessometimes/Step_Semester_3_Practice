package data_structures.class_problems;

public class PrimeNumberChecker {
    static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int divisor = 2; divisor <= number / divisor; divisor++) {
            if (number % divisor == 0) {
                return false;
            }
        }
        return true;
    }

    static void printResult(int number) {
        System.out.println(number + (isPrime(number) ? " is prime" : " is not prime"));
    }

    public static void main(String[] args) {
        printResult(29);
        printResult(21);
    }
}

package data_structures.class_problems;

public class FactorialCalculation {
    static long factorial(int number) {
        long result = 1;
        for (int value = 2; value <= number; value++) {
            result *= value;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(factorial(5));
        System.out.println(factorial(0));
    }
}

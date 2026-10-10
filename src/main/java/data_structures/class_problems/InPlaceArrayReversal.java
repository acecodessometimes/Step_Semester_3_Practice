package data_structures.class_problems;

import java.util.Arrays;

public class InPlaceArrayReversal {
    static void reverseInPlace(int[] numbers) {
        int left = 0;
        int right = numbers.length - 1;
        while (left < right) {
            int temporary = numbers[left];
            numbers[left] = numbers[right];
            numbers[right] = temporary;
            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        int[] numbers = {11, 22, 33, 44};
        reverseInPlace(numbers);
        System.out.println(Arrays.toString(numbers));
    }
}

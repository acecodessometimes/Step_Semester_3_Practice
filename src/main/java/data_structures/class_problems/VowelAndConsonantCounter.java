package data_structures.class_problems;

public class VowelAndConsonantCounter {
    static int[] countVowelsAndConsonants(String word) {
        int vowels = 0;
        int consonants = 0;
        for (int index = 0; index < word.length(); index++) {
            char letter = Character.toLowerCase(word.charAt(index));
            if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u') {
                vowels++;
            } else if (letter >= 'a' && letter <= 'z') {
                consonants++;
            }
        }
        return new int[]{vowels, consonants};
    }

    public static void main(String[] args) {
        int[] counts = countVowelsAndConsonants("Programming");
        System.out.println("Vowels: " + counts[0]);
        System.out.println("Consonants: " + counts[1]);
    }
}

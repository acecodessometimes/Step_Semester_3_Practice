public class FirstNonRepeatingCharacter {

    static char findFirstNonRepeatingChar(String text) {
        int[] frequency = new int[256]; // assuming extended ASCII input

        for (int i = 0; i < text.length(); i++) {
            frequency[text.charAt(i)]++;
        }

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (frequency[c] == 1) {
                return c;
            }
        }

        return '\0'; // sentinel: no non-repeating character found
    }

    static void printFirstNonRepeatingChar(String text) {
        char result = findFirstNonRepeatingChar(text);
        if (result == '\0') {
            System.out.println("No Non-Repeating Character Found");
        } else {
            System.out.println("First Non-Repeating Character: '" + result + "'");
        }
    }

    public static void main(String[] args) {
        printFirstNonRepeatingChar("swiss");
        printFirstNonRepeatingChar("aabbcc");
    }
}

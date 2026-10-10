package encapsulation.class_problems;

public class LockerCode {
    static class Locker {
        private String combination;
        private final int lockerNumber;

        Locker(int lockerNumber, String combination) {
            this.lockerNumber = lockerNumber;
            this.combination = combination;
        }

        boolean changeCode(String currentCode, String newCode) {
            if (!combination.equals(currentCode)) {
                return false;
            }
            combination = newCode;
            return true;
        }

        int getLockerNumber() {
            return lockerNumber;
        }
    }

    public static void main(String[] args) {
        Locker locker = new Locker(101, "1234");
        System.out.println(locker.changeCode("1234", "5678") ? "success" : "rejected");
        System.out.println(locker.changeCode("0000", "9999") ? "success" : "rejected, code is still 5678");
    }
}

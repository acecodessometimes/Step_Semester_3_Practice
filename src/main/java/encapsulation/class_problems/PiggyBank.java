package encapsulation.class_problems;

public class PiggyBank {
    private double savings;
    private final String id;

    public PiggyBank(String id) {
        this.id = id;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            savings += amount;
        }
    }

    public boolean withdraw(double amount) {
        if (amount <= 0 || amount > savings) {
            return false;
        }
        savings -= amount;
        return true;
    }

    public double getSavings() {
        return savings;
    }

    public String getId() {
        return id;
    }

    public static void main(String[] args) {
        PiggyBank bank = new PiggyBank("PB-1");
        bank.deposit(100);
        System.out.printf("savings = %.0f%n", bank.getSavings());
        bank.withdraw(30);
        System.out.printf("savings = %.0f%n", bank.getSavings());
        if (!bank.withdraw(500)) {
            System.out.printf("rejected, savings stays %.0f%n", bank.getSavings());
        }
    }
}

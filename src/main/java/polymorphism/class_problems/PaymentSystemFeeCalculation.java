package polymorphism.class_problems;

public class PaymentSystemFeeCalculation {
    abstract static class PaymentMethod {
        final String type;
        final double amount;
        PaymentMethod(String type, double amount) { this.type = type; this.amount = amount; }
        abstract double adjustedAmount();
    }

    static class Card extends PaymentMethod {
        Card(double amount) { super("CARD", amount); }
        double adjustedAmount() { return amount * 1.02; }
    }

    static class Wallet extends PaymentMethod {
        Wallet(double amount) { super("WALLET", amount); }
        double adjustedAmount() { return amount * 1.01; }
    }

    static class BankTransfer extends PaymentMethod {
        BankTransfer(double amount) { super("BANKTRANSFER", amount); }
        double adjustedAmount() { return amount; }
    }

    public static void main(String[] args) {
        PaymentMethod[] payments = {new Card(1000), new Wallet(500), new BankTransfer(2000)};
        double total = 0;
        for (PaymentMethod payment : payments) {
            double adjusted = payment.adjustedAmount();
            total += adjusted;
            System.out.printf("%s: %.2f%n", payment.type, adjusted);
        }
        System.out.printf("Total: %.2f%n", total);
    }
}

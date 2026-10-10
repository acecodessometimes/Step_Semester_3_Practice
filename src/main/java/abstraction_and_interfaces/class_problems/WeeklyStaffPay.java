package abstraction_and_interfaces.class_problems;

public class WeeklyStaffPay {
    abstract static class StaffMember {
        final String name;
        StaffMember(String name) { this.name = name; }
        abstract double weeklyPay();
    }

    static class FullTimeStaff extends StaffMember {
        final double salary;
        FullTimeStaff(String name, double salary) { super(name); this.salary = salary; }
        double weeklyPay() { return salary; }
    }

    static class HourlyStaff extends StaffMember {
        final double hours;
        final double rate;
        HourlyStaff(String name, double hours, double rate) { super(name); this.hours = hours; this.rate = rate; }
        double weeklyPay() { return Math.min(hours, 40) * rate + Math.max(0, hours - 40) * rate * 1.5; }
    }

    static class Intern extends StaffMember {
        final double stipend;
        Intern(String name, double stipend) { super(name); this.stipend = stipend; }
        double weeklyPay() { return stipend; }
    }

    public static void main(String[] args) {
        StaffMember[] staff = {new FullTimeStaff("Asha", 12000), new HourlyStaff("Ravi", 45, 200), new Intern("Neha", 5000)};
        double total = 0;
        for (StaffMember person : staff) {
            double pay = person.weeklyPay();
            total += pay;
            System.out.printf("%s: %.2f%n", person.name, pay);
        }
        System.out.printf("Total Payroll: %.2f%n", total);
    }
}

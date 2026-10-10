package data_structures.class_problems;

public class StudentResultCardGenerator {
    static class Student {
        String name;
        int[] marks;

        Student(String name, int[] marks) {
            this.name = name;
            this.marks = marks.clone();
        }

        double calculateAverage() {
            if (marks.length == 0) {
                return 0;
            }
            int total = 0;
            for (int mark : marks) {
                total += mark;
            }
            return (double) total / marks.length;
        }

        char assignGrade() {
            double average = calculateAverage();
            if (average >= 90) {
                return 'A';
            }
            if (average >= 75) {
                return 'B';
            }
            if (average >= 60) {
                return 'C';
            }
            if (average >= 40) {
                return 'D';
            }
            return 'F';
        }

        void printResult() {
            System.out.printf("%s: Average %.1f, Grade %c%n", name.toUpperCase(), calculateAverage(), assignGrade());
        }
    }

    public static void main(String[] args) {
        new Student("Asha", new int[]{80, 90, 70}).printResult();
        new Student("Ravi", new int[]{60, 55, 50}).printResult();
    }
}

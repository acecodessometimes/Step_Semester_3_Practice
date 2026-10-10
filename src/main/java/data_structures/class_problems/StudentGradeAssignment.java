package data_structures.class_problems;

public class StudentGradeAssignment {
    static char assignGrade(int marks) {
        if (marks >= 90) {
            return 'A';
        }
        if (marks >= 75) {
            return 'B';
        }
        if (marks >= 60) {
            return 'C';
        }
        if (marks >= 40) {
            return 'D';
        }
        return 'F';
    }

    public static void main(String[] args) {
        System.out.println("Grade " + assignGrade(72));
        System.out.println("Grade " + assignGrade(95));
        System.out.println("Grade " + assignGrade(35));
    }
}

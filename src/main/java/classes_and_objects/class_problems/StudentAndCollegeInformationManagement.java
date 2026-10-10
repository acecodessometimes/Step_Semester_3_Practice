package classes_and_objects.class_problems;

public class StudentAndCollegeInformationManagement {
    static class Student {
        String name;
        double attendance;
        static String collegeName = "SRM Institute of Science and Technology";
        static int studentCount;

        Student(String name, double attendance) {
            this.name = name;
            this.attendance = attendance;
            studentCount++;
        }

        static void printCollegeInfo() {
            System.out.println(collegeName);
            System.out.println("Students created: " + studentCount);
        }
    }

    public static void main(String[] args) {
        new Student("Ravi", 90);
        new Student("Anitha", 95);
        Student.printCollegeInfo();
    }
}

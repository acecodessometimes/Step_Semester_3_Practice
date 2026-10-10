package encapsulation.class_problems;

public class AttendanceSheet {
    private final String[] presentStudents;
    private int presentCount;

    public AttendanceSheet(int maximumClassSize) {
        presentStudents = new String[Math.max(0, maximumClassSize)];
    }

    public void markPresent(String name) {
        if (!isPresent(name) && presentCount < presentStudents.length) {
            presentStudents[presentCount++] = name;
        }
    }

    public int getPresentCount() {
        return presentCount;
    }

    public boolean isPresent(String name) {
        for (int index = 0; index < presentCount; index++) {
            if (presentStudents[index].equals(name)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        AttendanceSheet sheet = new AttendanceSheet(30);
        sheet.markPresent("Ana");
        sheet.markPresent("Ben");
        sheet.markPresent("Ana");
        System.out.println(sheet.getPresentCount());
        System.out.println(sheet.isPresent("Ben"));
    }
}

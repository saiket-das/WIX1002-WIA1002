package WIX1002.Vivas.Viva_2;

import java.util.Arrays;

public class Q5 {
    public static void main(String[] args) {
        String[] studentID = { "S0001", "S0002", "S0003", "S0004", "S0005", "S0006" };
        String[] studentName = { "John", "Cindy", "Alex", "Ali", "Rosli", "Roger" };
        int[] mark = { 59, 62, 21, 36, 85, 74 };

        String[][] studentInfo = getStudentInfo(studentID, studentName, mark);

        // System.out.println("List of Students and their Marks: ");
        // printStudentInfo(studentInfo);
        // System.out.println();

        // System.out.println("Student with highest marks: ");
        // findStudentWithHighestMarks(studentInfo);
        // System.out.println();

        // double average = findAverage(mark);
        // System.out.println("Average mark: " + average);
        // System.out.println();

        // System.out.println("Students scoring below the average:");
        // listStudentsBelowAverage(studentInfo, average);

        // System.out.println("Sort students by mark");

        printStudentInfo(studentInfo);
        System.out.println("------");

        sortStudentByMark(studentInfo);
        printStudentInfo(studentInfo);
    }

    // Save the students data into two dimensional string array (studentInfo[][])
    public static String[][] getStudentInfo(String[] studentIDs, String[] studentNames, int[] marks) {
        int len = studentIDs.length;

        // Save the students data into two dimensional string array (studentInfo[][])
        /*
         * Format
         * studentInfo[0][0] = "S0001"
         * studentInfo[0][2] = "John Smith"
         * studentInfo[0][3] = "80"
         */
        String[][] studentInfo = new String[len][3];

        for (int i = 0; i < len; i++) {
            studentInfo[i][0] = studentIDs[i];
            studentInfo[i][1] = studentNames[i];
            studentInfo[i][2] = String.format("%d", marks[i]);
        }

        return studentInfo;
    }

    // Pirnt list of students and their marks
    public static void printStudentInfo(String[][] studentInfo) {
        int len = studentInfo.length;

        // Print students info
        /*
         * Format
         * S0001 – John : 59
         * S0002 – Cindy : 62
         * S0003 – Alex : 21
         */
        for (int i = 0; i < len; i++) {
            System.out.printf("%-6s- %-10s: %d %n", studentInfo[i][0], studentInfo[i][1],
                    Integer.parseInt(studentInfo[i][2]));
        }
    }

    // Find the student with highest mark
    public static void findStudentWithHighestMarks(String[][] studentInfo) {
        int len = studentInfo.length;
        String name = "";
        int highestMark = 0;
        for (int i = 0; i < len; i++) {
            int mark = Integer.parseInt(studentInfo[i][2]);
            if (mark > highestMark) {
                name = studentInfo[i][1];
                highestMark = mark;
            }
        }
        System.out.printf("%s: %d %n", name, highestMark);
    }

    // Find the average mark
    public static double findAverage(int[] marks) {
        int len = marks.length;
        double totalMarks = 0;
        for (int i = 0; i < len; i++) {
            int mark = marks[i];
            totalMarks += mark;
        }

        return (totalMarks / len);
    }

    // Find the students scoring below the average
    public static void listStudentsBelowAverage(String[][] studentInfo, double average) {
        int len = studentInfo.length;
        for (int i = 0; i < len; i++) {
            double mark = Double.parseDouble(studentInfo[i][2]);
            if (mark < average) {
                System.out.printf("%s: %d %n", studentInfo[i][1], Integer.parseInt(studentInfo[i][2]));
            }
        }
    }

    // Sort students by marks
    public static void sortStudentByMark(String[][] studentInfo) {
        Arrays.sort(studentInfo, (a, b) -> Integer.compare(Integer.parseInt(b[2]), Integer.parseInt(a[2])));
    }

}

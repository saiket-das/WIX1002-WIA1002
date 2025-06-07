package WIA1002.Labs.Lab_4_LL.Lab_2;

import java.util.*;
import WIA1002.Labs.Lab_4_LL.Lab_2.classes.SList;

public class Q2 {
    public static void main(String[] args) {
        SList<String> studentList = new SList<String>();

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your student name list. Enter 'n' to end...");
        while (true) {
            String studentNameInput = input.nextLine();
            if (studentNameInput.equalsIgnoreCase("n")) {
                break;
            }
            studentList.appendEnd(studentNameInput);
        }

        System.out.println("\nYou have entered the following students' name: ");
        studentList.display();

        System.out.println("\nThe number of student is entered is: " + studentList.getSize());

        // -------- Rename --------
        System.out.println("\nAl the names entered are correct? Enter 'r' to rename the student name, 'n' to precced");
        String wannaRenameInput = input.nextLine();
        if (wannaRenameInput.equalsIgnoreCase("r")) {

            System.out.println("\nEnter the existing student name that you want to rename: ");
            String oldNameInput = input.nextLine();

            if (!studentList.contains(oldNameInput)) {
                System.out.println("Student not found. Cancelling rename.");
            } else {
                System.out.println("\nEnter the new name: ");
                String newNameInput = input.nextLine();

                studentList.rename(oldNameInput, newNameInput);
            }

            System.out.println("\nThe new student list is: ");
            studentList.display();

        }

        // -------- Remove --------
        System.out.println(
                "\nDo you want to remove any of your student name? Enter 'y' to rename the student name, 'n' to precced");
        String wannaRemoveInput = input.nextLine();

        if (wannaRemoveInput.equalsIgnoreCase("y")) {

            System.out.println("\nEnter a student name to remove: ");
            String removedStuentInput = input.nextLine();

            if (!studentList.contains(removedStuentInput)) {
                System.out.println("Student not found.");
            }

            studentList.remove(removedStuentInput);
            System.out.println("\nThe number of updated student is: " + studentList.getSize());
            System.out.println("\nThe updated students list is");
            studentList.display();

        }

        System.out.println("\nAll student data captured complete. Thank you.");

        input.close();
    }
}

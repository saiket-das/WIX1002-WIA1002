package WIX1002.Labs.Lab_7;

import java.io.*;
import java.util.*;

class Course {
    String courseCode;
    String courseName;

    Course(String courseCode, String courseName) {
        this.courseCode = courseCode;
        this.courseName = courseName;
    }

}

public class Q1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        File filePath = new File("src/lab/lab_7/files/coursename.dat");

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(filePath))) {

            Course[] courses = {
                    new Course("WXES1116", "Programming 1"),
                    new Course("WXES1115", "Data Structure"),
                    new Course("WXES1110", "Operating System"),
                    new Course("WXES1112", "Computing Mathematics I")
            };

            for (Course course : courses) {
                bw.write(course.courseCode + ", " + course.courseName);
                bw.newLine();
            }

        } catch (IOException error) {
            System.out.println(error.getMessage());
        }

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {

            ArrayList<Course> courses = new ArrayList<>();
            String line;
            while ((line = br.readLine()) != null) {
                String[] words = line.split(",");
                Course course = new Course(words[0], words[1].trim());
                courses.add(course);
            }

            String searchedCourseName = "";
            System.out.print("Enter course code: ");
            String searchByCourseCode = input.nextLine();
            for (Course course : courses) {
                if (course.courseCode.equals(searchByCourseCode)) {
                    searchedCourseName += course.courseName;
                    break;
                }
            }

            if (searchedCourseName != "") {
                System.out.println(searchedCourseName);
            } else {
                System.out.println("Course not found!");
            }

        } catch (IOException error) {
            System.out.println(error.getMessage());
        }

        input.close();
    }
}
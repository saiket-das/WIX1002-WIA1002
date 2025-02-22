package WIX1002.Labs.Lab_7;

import java.io.*;

public class Q5 {
    public static void main(String[] args) {

        String fileName = "src/lab/lab_7/lab_7_resources/person.dat";

        try {
            ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(fileName));
            int totalNumberRecord = inputStream.readInt();

            String[] name = new String[totalNumberRecord];
            int[] age = new int[totalNumberRecord];
            char[] gender = new char[totalNumberRecord];

            for (int i = 0; i < totalNumberRecord; i++) {
                name[i] = inputStream.readUTF();
                age[i] = inputStream.readInt();
                gender[i] = inputStream.readChar();
            }
            inputStream.close();
            for (int pass = 1; pass < totalNumberRecord; pass++) {
                for (int j = 0; j < totalNumberRecord - 1; j++) {
                    if (name[j].compareTo(name[j + 1]) > 0) {
                        String tempName = name[j];
                        name[j] = name[j + 1];
                        name[j + 1] = tempName;

                        int tempAge = age[j];
                        age[j] = age[j + 1];
                        age[j + 1] = tempAge;

                        char tempGender = gender[j];
                        gender[j] = gender[j + 1];
                        gender[j + 1] = tempGender;
                    }
                }
            }

            for (int i = 0; i < totalNumberRecord; i++) {
                System.out.printf("%d - %-15s %-5d %c %n", i + 1, name[i], age[i], gender[i]);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File was not found.");
        } catch (IOException e) {
            System.out.println("Problem with file input");
        }

    }
}

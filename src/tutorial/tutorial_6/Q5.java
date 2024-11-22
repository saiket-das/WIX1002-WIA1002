package tutorial.tutorial_6;

public class Q5 {
    public static void main(String[] args) {
        stringParameter("HelloWorld123");
    }

    public static void stringParameter(String str) {

        int letter = 0, digit = 0;
        for (int i = 0; i < str.length(); i++) {

            // System.out.printf((str.charAt(i) == 72) + " ");
            if (Character.isLetter(str.charAt(i))) {
                letter++;
            }

            if (Character.isDigit(str.charAt(i))) {
                digit++;
            }
        }

        System.out.println("Total letter(s): " + letter);
        System.out.println("Total digit(s): " + digit);
    }

}

package WIA1002.Labs.Lab_8_Recursion;

/*
  Create a recursive function that accepts a String parameter, and substitute any of the lowercase “a” 
  (no applicable for uppercase "A") found with “i” char. 
  Example: 
    substituteAI ("flabbergasted ") → "flibbergisted "
    substituteAI ("Astronaut ") → "Astroniut" 
*/

public class Q1 {
    public static void main(String[] args) {
        System.out.println(recursion("flabbergasted"));
        System.out.println(recursion("Astronaut"));
    }

    static String recursion(String str) {
        if (str.isEmpty())
            return "";

        char first = str.charAt(0);
        if (first == 'a') {
            return 'i' + recursion(str.substring(1));
        } else {
            return first + recursion(str.substring(1));
        }
    }
}
package WIA1002.Labs.Lab_8_Recursion;

/*
    Write a recursive method called permuteString() that will find and print all the possibilities to
    arrange the letters of a given word. Example:
    Input String : “ABC”
    Output Permutation :
        ABC
        ACB
        BAC
        BCA
        CAB
        CBA 
*/
public class Q2 {
    public static void main(String[] args) {
        String input = "ABC";
        System.out.println("Permutations of: " + input);
        permuteString(input);
    }

    static void permuteString(String str) {
        recursion("", str);

    }

    static void recursion(String prefix, String remainingStr) {
        // Base Case
        if (remainingStr.isEmpty())
            System.out.println(prefix);

        else {
            for (int i = 0; i < remainingStr.length(); i++) {
                char currentChar = remainingStr.charAt(i);
                String before = remainingStr.substring(0, i);
                String after = remainingStr.substring(i + 1);
                recursion(prefix + currentChar, before + after);
            }
        }
    }
}

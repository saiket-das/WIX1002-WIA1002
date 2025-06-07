package WIA1002.Labs.Lab_5_Stack;

import java.util.Stack;

/*
 * A string is a palindrome if it spells the same way forwards and backwards. Write a
 * Java program that uses a Stack to determine if a string is a palindrome or not. Let
 * your string be of maximum size 15 characters. Note however that the actual size may be 15 or less.
 */
public class Q4 {
    public static void main(String[] args) {

        String string1 = "abcdedcba";
        String string2 = "flower";
        String string3 = "aba";

        yesOrNo(isPalindrome(string1));
        yesOrNo(isPalindrome(string2));
        yesOrNo(isPalindrome(string3));
    }

    static boolean isPalindrome(String string) {
        Stack<Character> palindrome = new Stack<>();

        for (char ch : string.toCharArray()) {
            palindrome.push(ch);
        }

        for (char ch : string.toCharArray()) {
            if (!(ch == palindrome.pop())) {
                return false;
            }
        }
        return true;
    }

    static void yesOrNo(Boolean bool) {
        if (bool) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}

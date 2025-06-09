package WIA1002.Labs.Lab_6_Queue.Queue;

import WIA1002.Labs.Lab_6_Queue.Queue.Classes.MyQueue;

/* Write a Java program that uses a Queue to determine if the input string is a palindrome or not. */

public class Q2 {
    public static void main(String[] args) {
        String string1 = "abcdedcba";
        String string2 = "abcd";

        yesOrNo(isPalindrome(string1));
        yesOrNo(isPalindrome(string2));

    }

    // Using Queue
    static boolean isPalindrome(String str) {
        MyQueue<Character> charQueue = new MyQueue<Character>();

        for (char ch : str.toCharArray()) {
            charQueue.enqueue(ch);
        }

        for (int i = str.length() - 1; i >= 0; i--) {
            if (!charQueue.dequeue().equals(str.charAt(i))) {
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

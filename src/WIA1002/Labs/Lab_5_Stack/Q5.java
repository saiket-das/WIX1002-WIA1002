package WIA1002.Labs.Lab_5_Stack;

import java.util.*;

/*
    The Tower of Hanoi is a mathematical game or puzzle. It consists of three rods, and
    a number of disks of different sizes which can slide onto any rod. The puzzle starts
    with the disks in a neat stack in ascending order of size on one rod, the smallest at
    the top, thus making a conical shape. The objective of the puzzle is to move the
    entire stack to another rod, obeying the following rules:
        i) Only one disk may be moved at a time.
        
        ii) Each move consists of taking the upper disk from one of the rods and sliding it 
       onto another rod, on top of the other disks that may already be present on that rod.
       
       iii) No disk may be placed on top of a smaller disk.
    
    You are required to write the source code using Java syntax to solve Tower of Hanoi
    Problem using stacks data structure.
*/

public class Q5 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        Stack<Integer> source = new Stack<>();
        Stack<Integer> middle = new Stack<>();
        Stack<Integer> destination = new Stack<>();

        int n = input.nextInt();
        for (int i = n; i > 0; i--) {
            source.push(i);
        }

        solveHanoi(n, source, middle, destination, "Source", "Middle", "Destiantion");
        System.out.println(destination); // [3, 2, 1]

        input.close();
    }

    public static void solveHanoi(
            int n, Stack<Integer> source, Stack<Integer> middle,
            Stack<Integer> destination, String s, String m, String d) {
        if (n == 1) {
            moveDisk(source, destination, s, d);
            return;
        }

        solveHanoi(n - 1, source, destination, middle, s, d, m);
        moveDisk(source, destination, s, d);
        solveHanoi(n - 1, middle, source, destination, m, s, d);
    }

    public static void moveDisk(Stack<Integer> from, Stack<Integer> to, String fromRod, String toRod) {
        int disk = from.pop();
        to.push(disk);
        System.out.println("Move disk " + disk + " from '" + fromRod + "' to '" + toRod + "'");
    }
}

package WIA1002.Labs.Lab_5_Stack;

import java.util.Stack;

/*  --------- ❌ Wrong Answer ❌ --------- */
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
    public static void main(String[] args) {
        int numOfDisks = 3;

        Stack<Integer> sourceRod = new Stack<>();
        Stack<Integer> supportRod = new Stack<>();
        Stack<Integer> targetRod = new Stack<>();

        for (int i = numOfDisks; i > 0; i--) {
            sourceRod.push(i);
        }

        System.out.println("Target rod (C) before moving all disks: " + sourceRod);

        moveDisk(sourceRod, supportRod, targetRod);

        System.out.println("Target rod (C) after moving all disks: " + targetRod);
    }

    static void moveDisk(Stack<Integer> sourceRod, Stack<Integer> supportRod, Stack<Integer> targetRod) {

        moveOneDisk(sourceRod, supportRod, 'A', 'B');
        moveOneDisk(sourceRod, supportRod, 'A', 'B');

        moveOneDisk(sourceRod, targetRod, 'A', 'C');
        moveOneDisk(supportRod, targetRod, 'B', 'C');
        moveOneDisk(supportRod, targetRod, 'B', 'C');
    }

    static void moveOneDisk(Stack<Integer> fromRod, Stack<Integer> toRod, char from, char to) {
        int disk = fromRod.pop();
        toRod.push(disk);
        System.out.println("Move disk " + disk + " from rod " + from + " to rod " + to);
    }
}

package WIA1002.Tutorials.Tutorial_4_LL;

/*
    -------- Questions --------
    a) Based on the above figure, what is the name of the method for above operation?
    b) Write codes to represent the above figure. (Kindly use the variables stated in the figure)  
    
    
    -------- Answers --------
    a) removeLast()
    b) 
    public void removeLast() {
        if (head == null) {
            System.out.print("List is empty");
            return;
        }
        // Case 1 
        if (head == tail) {
            head = tail = null;
            return;
        } 

        // Case 2
        Node<E> current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = null;
        tail = null;
        
    }
*/
public class Q3 {

}

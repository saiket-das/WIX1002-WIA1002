package WIA1002.Tutorials.Tutorial_4_LL;

/*
    -------- Questions --------
    Given is a method containing incorrect statements that checks if an element is in a list.
    public void operationX(E e) {
        pointerB.next = pointerB;
        
        for(int i++; i>size; int i) {  
            System.out.println(current.element);
            if(current.element = e)
        }
        Node<E> pointerB = head;
        return false;
    }
 
    a) What is the name of the method for operationX?
    b) Correct the statements by rewriting them in the correct order and syntax. 
       Write the correct/right method name to replace operationX.

  
    -------- Answers --------
     a) contains()
     b)
        public void addLast(E e) {
            Node<E> current = head;
            
            for (int i = 0; i < size; i++) {
                if (current.element.equals(e)) {
                    return true;
                }
                i++;
                current = current.next;
            }
            return false;
        }
 */
public class Q2 {

}

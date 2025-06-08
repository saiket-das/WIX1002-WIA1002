## Tutorial 6 - Queue

### Question 1

Name four everyday examples of a queue other than those discussed during lecture.

- Airport security line
- Drive through at a fast food resturant
- Customer service caall center
- Ticket booking app

---

### Question 2

What is the difference between a queue and stack?

- Stack: FILO (First In Last Out)
- Queue: FIFO (First In First Out)

---

### Question 3

```
    Queue<Integer> q = new Queue<Integer>();
    Scanner keyIn = new Scanner(System.in);
    for (int i = 1; i <= 5; i++) {
        if (keyIn.nextBoolean())
            System.out.print(i + " ");
        else
            q.enqueue(i);
    }
    while (!q.isEmpty())
        System.out.print(q.dequeue() + " ");
    System.out.println();
```

**(a)** What is the output for the following input sequence?
true false false true true

**Answer**
1 4 5 2 3

**(a)** Is it possible to have output: 1 3 5 4 2? If yes, give an input sequence that produces the
output; or else, provide justification to your answer.

**Answer**
NO

**(a)** Give at least three input sequences that produce the output: 1 2 3 4 5
**Answer**

- true true true true true
- false false false false false
- true true false false false

---

### Question 4

Hand trace a queue X through the following operations:

```
    X.enqueue(new Integer(14));
    X.enqueue(new Integer(3));
    X.enqueue(new Integer(5));
    Object Y = X.dequeue();
    X.enqueue(new Integer(7));
    X.enqueue(new Integer(9));
    Y = X.dequeue();
    X.enqueue(new Integer(2));
    X.enqueue(new Integer(4));
```

Given the resulting queue X above, what would be the result of each of the following?

**(a)**
`X.front();`

**Answer** 5

**(b)**

```
    Y = X.dequeue();               // Remove 5
    X.enqueue(new Integer(10));    // Add 10
    X.front();                     // What's in the front
```

**Answer** 7

**(c)**
`Y = X.dequeue();`

**Answer** Y = 7

**(d)**
`X.front();`

**Answer** X = 9

### Question 5

Write the following expressions in infix form:

- **(a)**

---

### Question 6

Provide and explain three operations / functions of Linked List based Queue that you can add
to the GenericQueue class, other than those discussed in the lecture (i.e., enqueue, dequeue
and getSize – from Slide 10 in the lecture slide).

- enqueue = Adds a new element at the end (tail) of the Queue.
- dequeue = Remove and return the element from front (head) in the Queue.
- getSize = Return the total number of elements currently in the Queue.

## Tutorial 9 - Sorting and Searching

### Question 1

Compare between linear search and binary search algorithms by searching for the numbers 45 and
54 in the following list :
`3  8  12  34  54  85  61  110`

**Answer:**
Linear Search: `54` - TC: O(n)
Binary Search: Can't do binary as the list is not sorted

---

### Question 2

Describe the technique for each sort algorithm below. Given the following list:
`90  8  7  56  125  237  9  1  653`

**Show a trace of execution for:**
a. Selection sort

```
1st: Find min [90, 8, 7, 56, 125, 237, 9, 1, 653] → 1 → Swap with 90
Result: [1, 8, 7, 56, 125, 237, 9, 90, 653]

2nd: Find min [8, 7, 56, 125, 237, 9, 1, 653] → 7 → Swap with 8
Result: [1, 7, 8, 56, 125, 237, 9, 90, 653]

3rd: Find min [8, 56, 125, 237, 9, 90, 653] → 8 → Already in place
Result: [1, 7, 8, 56, 125, 237, 9, 90, 653]

4th: Find min [56, 125, 237, 9, 90, 653] → 9 → Swap with 56
Result: [1, 7, 8, 9, 125, 237, 56, 90, 653]

....

Last: Find min [237, 653] → 237 → Already in place
Result: [1, 7, 8, 9, 56, 90, 125, 237, 653]  // Answer
```

b. Insertion sort
` `

c. Bubble sort
` `

d. Merge sort

```
                [90, 8, 7, 56, 125, 237, 9, 1, 653]
                     /                       \
            [90, 8, 7, 56]           [125, 237, 9, 1, 653]
              /          \                /          \

          /    \        \  /            \ /         \ /

           \ /           \ /               \          /

            \           /                \           /

                 \                            /

```

---

### Question 3

Describe the technique for each sort algorithm below. Given the following list:
`90  8  7  56  125  237  9  1  653`

**Answer:** Merge sort

---

### Question 4

Which type of search algorithm is this?

**Answer:** Binary search

---

### Question 5

Which type of search algorithm is this?

**Answer:** Linear search

---

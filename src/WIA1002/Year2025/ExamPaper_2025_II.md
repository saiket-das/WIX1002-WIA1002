# WIA1002 - Data Structure

#### Exam Paper - Semester 2, 2025

---

## Question 1: Linked List Operations

#### 🔹 Part A: Merge Two Sorted Linked Lists

- Merge two sorted singly linked lists `L1` and `L2`
- Create one sorted linked list `L3` in increasing order
- **Time Complexity**: `O(n)` where `n` = total nodes in both lists
- **Space Complexity**: `O(1)` (no additional nodes created)
- Must modify existing lists by rearranging pointers only

#### ✅ Example

```text
Input:
L1: 1 -> 10 -> 20 -> null
L2: 15 -> 25 -> 55 -> null

Output:
1 -> 10 -> 15 -> 20 -> 25 -> 55 -> null
```

---

#### 🔹 Part B: Palindrome Check for Doubly Linked List

- Check if a doubly linked list is a palindrome
- **Space Complexity**: `O(1)`
- No additional data structures allowed
- Use two pointers (head and tail) moving towards center
- Return `TRUE` if palindrome, `FALSE` otherwise

#### ✅ Examples

```text
Input: "rotator" -> TRUE
Input: "racecar" -> TRUE
Input: "robot"   -> FALSE
```

---

## Question 2: Circular Generic Queue Implementation

#### 🔹 Part A: Basic Queue Operations

- Use Array to implement:
  1. Default constructor
  2. `enqueue` (max capacity `8`, replace oldest when full)
  3. `dequeue`
  4. `toString` to display elements

---

#### 🔹 Part B: Matrix Number Generator

- Generate 10 random matrix numbers in the format `SNNNNNNNN` (1 letter + 9 digits)
- Insert into queue and print elements

---

#### 🔹 Part C: Priority Queue Version

- Sort by:
  - First character ascending
  - Then by remaining digits descending
- Replace oldest high-priority elements when full

---

**Sample Output:**

```
Random matric number: P74901557
Random matric number: 216435641
Random matric number: F45975507
Random matric number: W49879487
Random matric number: J37378713
Random matric number: L96353582
Random matric number: L80558031
Random matric number: H67746522
Random matric number: C90133794
Queue is full! Replaced P74901557
PriorityQueue is full! Replaced F45975507
Random matric number: B35454922
Queue is full! Replaced 216435641
PriorityQueue is full! Replaced C90133794
Queue: F45975507 W49879487 J37378713 L96353582 L80558031 H67746522 C90133794 B35454922
PriorityQueue: B35454922 H67746522 J37378713 L96353582 L80558031 P74901557 W49879487 Z1643564
```

## Question 3: Student Records System

#### 📥 Requirements

1. Read from file `students.txt`:

   ```text
   103_Carol_91.2
   118_Robert_85.6
   102_Bob_76.0
   ```

2. Create `Student` objects and store in `ArrayList`

3. Sort by ID using **Insertion Sort**

4. Implement **Binary Search** by ID

5. Run Test Cases:
   - Display sorted list
   - Search for ID `119`
   - Search for ID `197`
   - Return `-1` if not found

---

## Question 4: OiCity Routing System

#### Graph Requirements

- Include:
  - Residential Areas
  - Commercial Centers
  - School Areas
- Each edge includes:
  - Driving speed
  - Distance

#### Speed Limits (`x = 1.5`)

- Residential: `x km/h`
- Commercial: `1.5x km/h`
- School: between `1.2x` and `2.5x km/h`

### Required Graph Methods

1. Show all vertices
2. Get vertex count
3. Check edge existence
4. Get adjacent vertices
5. Print all edges with speed and distance

#### ✅ Example Calculation

```text
From: Residential -> Commercial (2km)
Speed = 1.5 x 2 = 3 km/h
Duration = 18.6 minutes
```

---

> 💡 **Note:** Follow proper coding conventions and ensure space/time complexity constraints are met.

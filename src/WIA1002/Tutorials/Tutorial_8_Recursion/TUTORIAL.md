## Tutorial 8 - Recursion

### Question 1

Explain the problem that occurs when executing the recursive method f(0).

```
public static int f(int n) {
    if (n == 1)
        return n;
    else
        return n * f(n-1);
}
```

**Answer:** Stack Overflow Error

---

### Question 2

Explain the problem that occurs when executing the recursive method f().

```
public static int f(int n) {
    if (n == 0)
        return n;
    else
        return f(n+1) + n;
}
```

**Answer:** Stack Overflow Error

---

### Question 3

Write a recursive method to reverse a string.
`String → gnirts`

**Answer:**

```
public static String Q3(String str) {
    if (str.isEmpty())
        return str;
    else
        return Q3(str.substring(1)) + str.charAt(0);
}
```

### Question 5

Write a recursive method to calculate the following :
`5 + 4 + 3 + 2 + 1`
State the base case and recursive case. Trace your solution using number, N of 5.

**Answer:**

```
public static int Q4(int n) {
    if (n == 1)
        return 1;
    else
        return Q4(n - 1) + n;
}
```

### Question 5

Write a recursive method printDigit that prints an integer argument as its constituent digits,
with a blank space separates each digit with the next. For example, if the argument is 4567,
this method will print 4 5 6 7 on the screen.

**Answer:**

```
public static void Q5(int n) {
    if (n == 0)
        return;

    Q5(n / 10);
    System.out.print(n % 10 + " ");
}
```

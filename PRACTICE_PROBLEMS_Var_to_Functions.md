# Practice Problems - Variables to Functions

## 📋 **Practice Problems for Revision**

---

## **Section 1: Variables & Data Types**

### **Problem 1.1: Temperature Converter**
Write a program to convert Celsius to Fahrenheit.
- Formula: `F = (C * 9/5) + 32`
- Input: Temperature in Celsius
- Output: Temperature in Fahrenheit

### **Problem 1.2: Simple Interest Calculator**
Calculate simple interest.
- Formula: `SI = (P * R * T) / 100`
- Input: Principal (P), Rate (R), Time (T)
- Output: Simple Interest

### **Problem 1.3: Type Conversion**
Demonstrate type conversion:
- Convert `int` to `float`
- Convert `float` to `int` (explicit casting)
- Show what happens in each case

---

## **Section 2: Operators**

### **Problem 2.1: Expression Evaluation**
What will be the output?
```java
int a = 5, b = 3, c = 2;
int result = a + b * c / a - c;
System.out.println(result);
```

### **Problem 2.2: Logical Operations**
Write a program that checks:
- If a number is between 10 and 100 (inclusive)
- If a number is divisible by both 3 and 5
- If a year is a leap year (divisible by 4, but not by 100, unless divisible by 400)

### **Problem 2.3: Increment/Decrement**
Predict the output:
```java
int x = 5;
System.out.println(x++);  // ?
System.out.println(++x);  // ?
System.out.println(x--);  // ?
System.out.println(--x);  // ?
```

---

## **Section 3: Conditionals**

### **Problem 3.1: Grade Calculator**
Write a program to assign grades:
- 90-100: A
- 80-89: B
- 70-79: C
- 60-69: D
- Below 60: F

### **Problem 3.2: Largest of Three**
Find the largest of three numbers using:
- If-else statements
- Ternary operator

### **Problem 3.3: Calculator using Switch**
Create a calculator using switch:
- Input: Two numbers and an operator (+, -, *, /, %)
- Output: Result of operation

### **Problem 3.4: Day of Week**
Using switch, print day name:
- 1 → Monday
- 2 → Tuesday
- ... up to 7 → Sunday

---

## **Section 4: Loops**

### **Problem 4.1: Sum of Digits**
Write a program to find sum of digits of a number.
- Example: 1234 → 1+2+3+4 = 10

### **Problem 4.2: Factorial**
Calculate factorial of a number.
- Example: 5! = 5 × 4 × 3 × 2 × 1 = 120

### **Problem 4.3: Perfect Number**
Check if a number is perfect.
- Perfect number: Sum of its divisors equals the number
- Example: 6 = 1 + 2 + 3 (perfect)

### **Problem 4.4: Palindrome Number**
Check if a number is palindrome.
- Example: 121, 1331 are palindromes

### **Problem 4.5: Table of a Number**
Print multiplication table of a number.
- Example: Table of 5 → 5×1=5, 5×2=10, ..., 5×10=50

### **Problem 4.6: Sum of Series**
Calculate: 1 + 2 + 3 + ... + n

### **Problem 4.7: Count Digits**
Count number of digits in a number.
- Example: 12345 has 5 digits

---

## **Section 5: Patterns**

### **Problem 5.1: Inverted Right Triangle**
```
*****
****
***
**
*
```

### **Problem 5.2: Number Triangle**
```
1
12
123
1234
12345
```

### **Problem 5.3: Hollow Rectangle**
```
*****
*   *
*   *
*****
```

### **Problem 5.4: Diamond Pattern**
```
    *
   ***
  *****
 *******
  *****
   ***
    *
```

### **Problem 5.5: Number Pyramid**
```
    1
   123
  12345
 1234567
123456789
```

### **Problem 5.6: Binary Pattern**
```
1
01
101
0101
10101
```

---

## **Section 6: Functions/Methods**

### **Problem 6.1: Basic Functions**
Create functions for:
- `isPrime(int n)`: Check if number is prime
- `factorial(int n)`: Calculate factorial
- `fibonacci(int n)`: Print first n Fibonacci numbers

### **Problem 6.2: Math Functions**
Create functions:
- `power(int base, int exp)`: Calculate base^exp
- `gcd(int a, int b)`: Find Greatest Common Divisor
- `lcm(int a, int b)`: Find Least Common Multiple

### **Problem 6.3: String Functions**
Create functions:
- `reverseString(String str)`: Reverse a string
- `isPalindrome(String str)`: Check if string is palindrome
- `countVowels(String str)`: Count vowels in string

### **Problem 6.4: Function Overloading**
Create overloaded functions:
- `add(int a, int b)`: Add two integers
- `add(double a, double b)`: Add two doubles
- `add(int a, int b, int c)`: Add three integers

### **Problem 6.5: Area Functions**
Create functions to calculate area:
- `areaCircle(double radius)`: Area of circle
- `areaRectangle(double length, double width)`: Area of rectangle
- `areaTriangle(double base, double height)`: Area of triangle

### **Problem 6.6: Number Functions**
Create functions:
- `isArmstrong(int n)`: Check Armstrong number
- `sumOfDigits(int n)`: Sum of digits
- `reverseNumber(int n)`: Reverse a number

---

## **Mixed Problems (Combining Multiple Concepts)**

### **Problem M.1: Number System Converter**
Convert decimal to binary using loops and functions.

### **Problem M.2: Menu-Driven Calculator**
Create a menu-driven calculator:
1. Add
2. Subtract
3. Multiply
4. Divide
5. Exit

Use switch for menu, functions for operations.

### **Problem M.3: Prime Numbers in Range**
Print all prime numbers between two given numbers.
- Use loops to iterate
- Use function to check prime

### **Problem M.4: Perfect Numbers in Range**
Find all perfect numbers between 1 and 1000.

### **Problem M.5: Number Patterns with Functions**
Create patterns using functions:
- Function to print a line of stars
- Function to print spaces
- Combine to create complex patterns

---

## **Challenge Problems**

### **Challenge 1: Number Guessing Game**
- Generate random number
- User guesses
- Give hints (too high/too low)
- Count attempts

### **Challenge 2: Calculator with History**
- Perform calculations
- Store last 5 operations
- Display history

### **Challenge 3: Pattern Generator**
- User inputs pattern type
- Generate different patterns based on choice
- Use functions for each pattern type

---

## **Self-Assessment Questions**

1. What is the difference between `++i` and `i++`?
2. Why doesn't swapping work with primitive types in Java?
3. When would you use `do-while` instead of `while`?
4. What is function overloading? Give an example.
5. Explain pass by value in Java.
6. What happens if you forget `break` in a switch statement?
7. How do you prevent infinite loops?
8. What's the difference between `System.out.print()` and `System.out.println()`?
9. When should you use `float` vs `double`?
10. How do you handle division by zero?

---

## **Tips for Practice**

1. **Start Simple:** Begin with basic problems, then move to complex ones
2. **Test Edge Cases:** Test with 0, negative numbers, large numbers
3. **Code Review:** After solving, review and optimize your code
4. **Multiple Solutions:** Try solving same problem in different ways
5. **Debug:** Practice debugging by intentionally introducing errors
6. **Time Yourself:** Practice solving problems within time limits
7. **Document:** Add comments explaining your logic

---

**Good Luck with Your Revision! 💪**


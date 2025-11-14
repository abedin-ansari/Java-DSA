# Java DSA Revision Guide
## Topics: Variables & Data Types → Functions/Methods

---

## 📚 **1. Variables & Data Types (2_Var_and_Datatypes)**

### **Key Concepts:**

#### **Java Basics**
- **Main Method Structure:**
  ```java
  public class ClassName {
      public static void main(String args[]) {
          // Code here
      }
  }
  ```
- **Output:** `System.out.print()` or `System.out.println()`

#### **Data Types**
- **Primitive Data Types:**
  - `byte`: -128 to 127 (1 byte)
  - `short`: -32,768 to 32,767 (2 bytes)
  - `int`: -2³¹ to 2³¹-1 (4 bytes)
  - `long`: -2⁶³ to 2⁶³-1 (8 bytes)
  - `float`: Decimal numbers (4 bytes) - use `f` suffix
  - `double`: Decimal numbers (8 bytes)
  - `char`: Single character (2 bytes)
  - `boolean`: true/false (1 bit)

#### **Important Practice Questions:**
1. **Average of 3 numbers:** Calculate average using integer division
2. **Area of Square:** `area = side * side`
3. **Bill Calculation:** Use `float` for prices, calculate total and GST (18%)

#### **Key Points:**
- Use `Scanner` class for input: `Scanner sc = new Scanner(System.in);`
- Always close scanner: `sc.close();`
- For decimal calculations, use `float` or `double`
- Integer division truncates (no rounding)

---

## 🔢 **2. Operators (3_Operators)**

### **Types of Operators:**

#### **1. Arithmetic Operators**
- `+` (addition)
- `-` (subtraction)
- `*` (multiplication)
- `/` (division) - **Note:** Integer division truncates
- `%` (modulo/remainder)

**Precedence:** Multiplication/Division/Modulo → Addition/Subtraction

**Example:**
```java
int x = 2, y = 5;
int exp1 = (x * y / x);  // Result: 5 (left to right)
int exp2 = (x * (y / x)); // Result: 4 (parentheses first)
```

#### **2. Relational Operators**
- `==` (equal to)
- `!=` (not equal to)
- `>` (greater than)
- `<` (less than)
- `>=` (greater than or equal)
- `<=` (less than or equal)

**Return:** `boolean` (true/false)

#### **3. Logical Operators**
- `&&` (AND): Returns `true` only if both conditions are true
- `||` (OR): Returns `true` if at least one condition is true
- `!` (NOT): Inverts the boolean value

**Example:**
```java
if(x > y && y > z)  // Both must be true
if(z > y || z < x)  // At least one must be true
```

#### **4. Unary Operators**
- `++` (increment)
  - `++num`: Pre-increment (increment first, then use)
  - `num++`: Post-increment (use first, then increment)
- `--` (decrement)
  - `--num`: Pre-decrement
  - `num--`: Post-decrement

**Example:**
```java
int num = 5;
System.out.println(++num); // Prints 6
int a = 12;
int res = ++a;  // a becomes 13, res = 13
```

#### **5. Assignment Operators**
- `=` (assignment)
- `+=` (add and assign): `x += y` is same as `x = x + y`
- `-=` (subtract and assign)
- `*=` (multiply and assign)
- `/=` (divide and assign)
- `%=` (modulo and assign)

**Example:**
```java
x += y;  // x = x + y
y -= z;  // y = y - z
```

---

## 🔀 **3. Conditionals (4_Conditionals)**

### **1. If-Else Statement**

**Syntax:**
```java
if (condition) {
    // code if true
} else {
    // code if false
}
```

**Example - Age Check:**
```java
if(age >= 18) {
    System.out.println("Can Drive");
} else {
    System.out.println("Cannot Drive");
}
```

**Practice Questions:**
- Check if number is even or odd: `number % 2 == 0`
- Check if number is prime (using for loop with `Math.sqrt(n)`)
- Multiple conditional checks

### **2. Switch Statement**

**Syntax:**
```java
switch (variable) {
    case value1:
        // code
        break;
    case value2:
        // code
        break;
    default:
        // code if no match
        break;
}
```

**Example - Size Selection:**
```java
switch (number) {
    case 30: 
        size = "Small";
        break;
    case 34:
        size = "medium";
        break;
    case 38:
        size = "large";
        break;
    default: 
        size = "Unknown";
        break;
}
```

**Key Points:**
- Use `break` to exit switch (otherwise falls through)
- `default` case handles unmatched values
- Can use with `int`, `char`, `String` (Java 7+)

### **3. Ternary Operator**

**Syntax:**
```java
variable = (condition) ? value_if_true : value_if_false;
```

**Example:**
```java
String result = (marks > 33) ? "Pass" : "Failed";
```

---

## 🔁 **4. Loops (5_Loops)**

### **1. While Loop**

**Syntax:**
```java
while (condition) {
    // code
    // update condition
}
```

**Example - Reverse a Number:**
```java
while(n > 0) {
    int rem = n % 10;
    ans = ans * 10 + rem;
    n /= 10;
}
```

**Key Points:**
- Checks condition before execution
- Must update condition inside loop to avoid infinite loop

### **2. Do-While Loop**

**Syntax:**
```java
do {
    // code
} while (condition);
```

**Key Points:**
- Executes at least once (checks condition after first execution)
- Useful when you need to execute code before checking condition

**Example:**
```java
do {
    System.out.println("Hello");
    m++;
} while(m <= 9);
```

### **3. For Loop**

**Syntax:**
```java
for (initialization; condition; update) {
    // code
}
```

**Example:**
```java
for(int i = 1; i <= n; i++) {
    System.out.println(i);
}
```

**Common Patterns:**
- Counting: `for(int i = 0; i < n; i++)`
- Reverse counting: `for(int i = n; i >= 1; i--)`
- Prime checking: `for(int i = 2; i <= Math.sqrt(n); i++)`

### **4. Continue Statement**

**Purpose:** Skips current iteration and continues to next iteration

**Example:**
```java
while(j <= 3) {
    if(j == 2) {
        j++;
        continue; // Skip printing when j == 2
    }
    System.out.println("Inner Loop:" + j);
    j++;
}
```

### **5. Practice Problems:**
- **Fibonacci Series:** Using while loop with two variables
- **Prime Number Check:** Using for loop up to `Math.sqrt(n)`
- **Number Reversal:** Using while loop with modulo

---

## ⭐ **5. Patterns (6_Patterns)**

### **Pattern Basics:**

#### **Pattern 1: Right Triangle (Stars)**
```java
for(int row = 0; row <= trows; row++) {
    for(int cst = 1; cst <= row; cst++) {
        System.out.print("*");
    }
    System.out.println();
}
```

#### **Pattern 2: Pyramid (Centered Stars)**
```java
int spaces = n-1;
int stars = 1;

for(int row = 1; row <= trows; row++) {
    // Print spaces
    for(int csp = 1; csp <= spaces; csp++) {
        System.out.print(" ");
    }
    // Print stars
    for(int cst = 1; cst <= stars; cst++) {
        System.out.print("*");
    }
    System.out.println();
    spaces--;        // Decrease spaces
    stars = stars + 2; // Increase stars
}
```

### **Pattern Strategy:**
1. **Identify:**
   - Total rows (`trows`)
   - Stars per row (pattern)
   - Spaces per row (for centered patterns)

2. **Nested Loops:**
   - Outer loop: Controls rows
   - Inner loop(s): Controls columns (spaces, stars, numbers)

3. **Common Patterns:**
   - Right triangle
   - Inverted triangle
   - Pyramid
   - Number patterns
   - Hollow patterns

---

## 🔧 **6. Functions/Methods (7_FunctionsOrMethods)**

### **1. Function Syntax**

**Basic Structure:**
```java
access_modifier static return_type function_name(parameters) {
    // code
    return value; // if return_type is not void
}
```

**Example:**
```java
public static int demoCode() {
    System.out.println("Hello World");
    return 2;
}
```

### **2. Parameters vs Arguments**

- **Parameters:** Variables in function definition
- **Arguments:** Actual values passed when calling function

**Example:**
```java
// Function definition
public static int calc(int num1, int num2) {  // num1, num2 are parameters
    int sum = num1 + num2;
    return sum;
}

// Function call
int sum = calc(a, b);  // a, b are arguments
```

### **3. Return Types**

- **void:** Function doesn't return anything
- **Primitive types:** `int`, `double`, `boolean`, etc.
- **Objects:** `String`, arrays, etc.

**Example:**
```java
public static void printMessage() {
    System.out.println("Hello");
}

public static int add(int a, int b) {
    return a + b;
}

public static boolean isEven(int n) {
    return n % 2 == 0;
}
```

### **4. Function Overloading**

**Definition:** Multiple functions with same name but different parameters

**Rules:**
- Same function name
- Different number of parameters OR different parameter types
- Return type can be same or different

**Example:**
```java
// Overloaded functions
public static void calc(int a, int b) {
    System.out.println("Adding integers: " + (a + b));
}

public static double calc(double a, double b) {
    return a + b;
}
```

### **5. Pass by Value**

**Important Concept:**
- Java always passes **by value** (not by reference)
- Primitive types: Copy of value is passed
- Changes inside function don't affect original variables

**Example - Swapping (Won't Work):**
```java
public static void swap(int one, int two) {
    int temp = one;
    one = two;
    two = temp;
    // Changes only affect local copies
}

// In main:
int a = 10, b = 20;
swap(a, b);  // a and b remain unchanged!
```

**Why it doesn't work:**
- Function receives copies of `a` and `b`
- Swapping happens only on copies
- Original variables remain unchanged

### **6. Practice Problems:**
- **Armstrong Number:** Check if number equals sum of its digits raised to power of number of digits
- **Function overloading:** Same function for different data types
- **Calculator functions:** Add, subtract, multiply, divide

---

## 📝 **Quick Reference Summary**

### **Data Types Priority:**
1. Choose appropriate type based on value range
2. Use `float` for decimals (add `f` suffix)
3. Use `double` for more precision

### **Operator Precedence:**
1. Parentheses `()`
2. Unary operators `++`, `--`
3. Multiplicative `*`, `/`, `%`
4. Additive `+`, `-`
5. Relational `<`, `>`, `<=`, `>=`
6. Equality `==`, `!=`
7. Logical AND `&&`
8. Logical OR `||`
9. Assignment `=`, `+=`, `-=`, etc.

### **Loop Selection Guide:**
- **For loop:** When you know exact number of iterations
- **While loop:** When condition depends on user input or dynamic values
- **Do-while:** When you need to execute at least once

### **Function Best Practices:**
1. Use descriptive function names
2. Keep functions focused (single responsibility)
3. Use parameters instead of global variables
4. Return meaningful values
5. Document complex functions

---

## 🎯 **Common Mistakes to Avoid**

1. **Integer Division:** `5/2 = 2` (not 2.5) - use `float` or `double`
2. **Missing Break in Switch:** Causes fall-through behavior
3. **Infinite Loops:** Forgetting to update loop condition
4. **Pass by Value Confusion:** Expecting swap to work on primitives
5. **Scanner Not Closed:** Memory leak - always use `sc.close()`
6. **Array Index Out of Bounds:** Check bounds before accessing
7. **Uninitialized Variables:** Always initialize before use

---

## ✅ **Revision Checklist**

- [ ] Understand all primitive data types and their ranges
- [ ] Master all operator types and precedence
- [ ] Comfortable with if-else and switch statements
- [ ] Can write while, do-while, and for loops
- [ ] Understand continue and break statements
- [ ] Can create basic patterns using nested loops
- [ ] Know function syntax and return types
- [ ] Understand parameters vs arguments
- [ ] Can implement function overloading
- [ ] Understand pass by value concept
- [ ] Can solve practice problems independently

---

**Happy Coding! 🚀**


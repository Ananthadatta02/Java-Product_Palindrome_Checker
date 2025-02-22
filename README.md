# Product of Array & Palindrome Check

## Overview
This Java program calculates the product of all elements in an array and checks if the resulting product is a palindrome. It takes user input for the array size and elements, then performs multiplication and palindrome verification.

## How the Program Works
1. **User Input**: The program prompts the user to enter the array size and elements.
2. **Multiplication of Elements**: It calculates the product of all elements in the array.
3. **Palindrome Check**: The program determines whether the product is a palindrome.
4. **Output Results**: It displays the multiplication result and whether it is a palindrome.

## Code Explanation

### **1. Variable `mul`**
- The variable `mul` is initialized to `1` and is used to store the product of all elements in the array.
- In each iteration of the `for` loop, it is multiplied by the current element of the array.

```java
int mul = 1;
for(int i = 0; i <= arr.length - 1; i++) {
    mul *= arr[i];
}
```

### **2. `for` Loops**
- The first `for` loop is used to take input from the user and store it in the array.
- The second `for` loop calculates the product of all elements in the array.

### **3. `isPalindrome` Method**
- This method checks whether a given number is a palindrome.
- It reverses the number and compares it with the original value.

```java
public static boolean isPalindrome(int num) {
    int temp = num;
    int res = 0;
    while(temp > 0) {
        int ld = temp % 10;
        res = res * 10 + ld;
        temp /= 10;
    }
    return num == res;
}
```

### **4. `return` Statement**
- The `return` statement in `isPalindrome` returns `true` if the reversed number matches the original, otherwise `false`.
- The `main` method uses this return value to decide whether to print a palindrome message.

```java
if(isPalindrome(mul))
    System.out.println("Multiplication of array Elements is Palindrome");
else
    System.out.println("Multiplication of array Elements is Not Palindrome");
```

## Example Run
```
Enter the Size
3
Enter the Elements
2 3 4
Multiplication of array Elements 24
Multiplication of array Elements is Not Palindrome
```

## Clone
```
git clone https://github.com/Ananthadatta02/Java-Product_Palindrome_Checker.git
```

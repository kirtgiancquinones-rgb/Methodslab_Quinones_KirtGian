/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package methodslab2.java;

import java.util.Scanner;

/**
 *
 * @author QUINONES_CPE113
 */
public class MethodsLab2Java {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);

        greetUser();

        System.out.print("Enter two numbers: ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();

        System.out.println("Addition: " + add(num1, num2));
        System.out.println("Subtraction: " + subtract(num1, num2));
        System.out.println("Multiplication: " + multiply(num1, num2));
        System.out.println("Division: " + divide(num1, num2));

        System.out.print("Enter a number for factorial: ");
        int factNum = input.nextInt();
        System.out.println("Factorial: " + factorial(factNum));

        int[] numbers = {10, 15, 20, 25, 5};
        System.out.println("Sum of array elements: " + sumArray(numbers));

        System.out.print("Enter a number to check prime: ");
        int primeNum = input.nextInt();
        if (isPrime(primeNum)) {
            System.out.println(primeNum + " is prime.");
        } else {
            System.out.println(primeNum + " is not prime.");
        }

        System.out.println("Max element in array: " + maxInArray(numbers));

        System.out.println("GCD of " + num1 + " and " + num2 + ": " + gcd(num1, num2));
        System.out.println("LCM of " + num1 + " and " + num2 + ": " + lcm(num1, num2));

        System.out.println("Fibonacci at position " + factNum + ": " + fib(factNum));

        input.nextLine();
        System.out.print("Enter a string to check if palindrome: ");
        String text = input.nextLine();
        System.out.println("\"" + text + "\" is palindrome? " + isPalindrome(text));

        input.close();
    }

    public static void greetUser() {
        System.out.println("HAII WELCOME!! 676767676");
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Warning: Division by zero.");
            return 0.0;
        }
        return a / b;
    }

    public static long factorial(int n) {
        if (n < 0) {
            return -1;
        }
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    public static int sumArray(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int maxInArray(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static int gcd(int a, int b) {
        while (b != 0) {
            int t = b;
            b = a % b;
            a = t;
        }
        return a;
    }

    public static int lcm(int a, int b) {
        if (a == 0 && b == 0) {
            return 0;
        }
        return (a / gcd(a, b)) * b;
    }

    public static int fib(int n) {
        if (n <= 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return fib(n - 1) + fib(n - 2);
    }

    public static boolean isPalindrome(String str) {
        String cleaned = str.replaceAll("\\s+", "").toLowerCase();
        int left = 0;
        int right = cleaned.length() - 1;

        while (left < right) {
            if (cleaned.charAt(left) != cleaned.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}

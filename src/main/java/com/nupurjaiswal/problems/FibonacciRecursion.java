package com.nupurjaiswal.problems;

public class FibonacciRecursion {

    /*
    Why is Recursion slower?
    When you call your function again itself (as recursion) the compiler allocates new Activation Record
    (Just think as an ordinary Stack) for that new function. That stack is used to keep your states, variables and addresses.
    Compiler creates a stack for each function and this creation process continues until the base case is reached.
    So, when you data size become large, compiler needs large stack segment to calculate the whole process.
    Calculating and managing those Records is also counted during this process.
    Also, in recursion the stack segment is being raised during runtime.
    Compiler does not know how many memory will be occupied during compile time.
    That is why if you cannot properly handle your Base case you will undergo famous error named StackOverflow
     */

    static int n1 = 0, n2 = 1, n3 = 0;

    static void printFibonacci(int count) {
        if (count > 0) {
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
            System.out.print(" " + n3);
            printFibonacci(count - 1);
        }
    }

    public static void main(String args[]) {
        int count = 10;
        System.out.print(n1 + " " + n2);
        printFibonacci(count - 2);
    }
}

/*
how do you improve your Fibonacci function both iterative and recursive one?

A technique called memoization can be used to drastically improve performance of method which calculates Fibonacci number.
 if you look at the method it repetitive creates same Fibonacci number e.g.
 In order to calculate 10th Fibonacci number function first create first 9 Fibonacci number, this could be very time consuming if you just increase the upper limit from 10 to 10K.
In memoization programming technique, result of earlier calculation is cached and reused. So you don't need to create same Fibonacci number if you already have calculated it.


 */
/*
 Common digits in two numbers
easy
asked in interviews by 1 company
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
There are two number a and b are given as input. Print common digits with common index in these numbers seperated by space.
Input
There are two number a and b are given as input.

Constraints
1 <= a, b <= 106
Output
Print common digits with common index in these numbers seperated by space.
 */

 import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();

        int n = a.length();
        int m = b.length();
        int len = Math.min(n, m);
            for(int i = 0; i < len; i++) {
                if(a.charAt(i) == b.charAt(i)) {
                    System.out.print(a.charAt(i) + " ");
                }
            }
    }
}
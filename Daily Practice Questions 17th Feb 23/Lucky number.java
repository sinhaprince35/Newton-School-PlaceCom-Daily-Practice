/*
Lucky number
easy
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
A 2n digits number is said to be lucky if sum of n most significant digits is equal to sum of n least significant digits.

Given a number find out if the number is lucky or not?
Input
First line contains n.
Next line contains a number of 2n digits.

Constraints
1 ≤ n ≤ 105
Number contains digits only.
Output
Print "LUCKY" if the number is lucky otherwise print "UNLUCKY".
*/

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main(String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        String num = sc.next();

        int sum1 = 0;

        for (int i = 0; i < n; i++) {

            sum1 += num.charAt(i) - '0';

        }

        int sum2 = 0;

        for (int i = n; i < 2 * n; i++) {

            sum2 += num.charAt(i) - '0';

        }

        if (sum1 == sum2) {

            System.out.println("LUCKY");

        } else {

            System.out.println("UNLUCKY");

        }

    }
}
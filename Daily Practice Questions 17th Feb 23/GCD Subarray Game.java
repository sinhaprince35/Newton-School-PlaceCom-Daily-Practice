/*
GCD Subarray Game
easy
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
You are given an array A of size N. Find if there is any subarray in the array whose GCD is equal to 1.
Input
The first line of the input contains a single integer N.
The second line contains N space seperated integers.

Constraints:
1 <= N <= 105
1 <= Ai <= 109
Output
Print "YES" if there is any subarray in the array whose GCD is equal to 1, else print "NO", without the quotes.
*/


import java.io.*; // for handling input/output

import java.util.*; // contains Collections framework

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] == 1) {
                System.out.println("YES");
                return;
            }
        }
        boolean flag = true;
        for (int i = 0; i < n - 1; i++) {
            int gcd = arr[i];
            gcd = gcd(gcd, arr[i + 1]);
            if (gcd == 1) {
                flag = true;
                System.out.println("YES");
                return;
            }
        }
        System.out.println("NO");
    }

    public static int gcd(int a, int b) {
        if (a == 0) {
            return b;
        }
        return gcd(b % a, a);
    }
}

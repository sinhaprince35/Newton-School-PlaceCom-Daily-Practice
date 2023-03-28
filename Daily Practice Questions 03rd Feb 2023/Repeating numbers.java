/*Repeating numbers
medium
asked in interviews by 1 company
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
There are two arrays nums1 and nums2 are given as input having n and m elements respectively. print all distinct common elements in arrays in sorted order.
Input
There are two integers n and m are given in first line as input.
In Second line n space separated integers of array nums1 are given.
In Third line m space separated integers of array nums2 are given.

Constraints
1 <= n, m <= 103
0 <= nums1[i], nums2[i] <= 109
Output
Print all distinct common elements in arrays. */

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int a[] = new int[n];
        int b[] = new int[m];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < m; i++) {
            b[i] = sc.nextInt();
        }

        HashSet<Integer> set = new HashSet<>();
        for (int i : a) {
            set.add(i);
        }

        ArrayList<Integer> list = new ArrayList<>();

        for (int i : b) {
            if (set.contains(i) && !list.contains(i)) {
                list.add(i);
            }

        }

        Collections.sort(list);
        for (int i : list) {
            System.out.print(i + " ");
        }

    }
}
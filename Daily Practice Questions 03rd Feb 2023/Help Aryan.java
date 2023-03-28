/*Help Aryan
easy
asked in interviews by 1 company
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Aryan was given a string, He was asked to print the first and last repeated character in a string.
Input
The first line of the input contains a string str.

Constraints
1 ≤ |str| ≤ 105
Output
Print the first and last repeated character of a string. */

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        HashMap<Character, Integer> set = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (set.containsKey(ch)) {
                int nf = set.get(ch) + 1;
                set.put(ch, nf);
            } else
                set.put(ch, 1);
        }
        for (int i = 0; i <= s.length(); i++) {
            char ch = s.charAt(i);
            if (set.get(ch) > 1) {
                System.out.print(ch + " ");
                break;
            }
        }

        for (int i = s.length() - 1; i >= 0; i--) {
            char ch = s.charAt(i);
            if (set.get(ch) > 1) {
                System.out.print(ch);
                break;
            }
        }
    }
}
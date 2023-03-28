/*
Next vowel
easy
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Given a string of length n consisting of lowercase English letters. Find the vowels in the string and replace each vowel with it's next vowel in the alphabetic order.

Next vowel of a vowel is another vowel that comes after it in alphabet. Next vowel of { 'a', 'e', 'i', 'o', 'u'} are { 'e', 'i', 'o', 'u', 'a' } respectively.
Input
First line contains n.
Next line contains a string.

Constraints
1 <= n <= 105
Output
print the string after replacing each vowel with it's next vowel.
*/

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        StringBuffer sb = new StringBuffer();
        sb.append(sc.next());
        for(int i=0; i<n; i++){
            char ch = sb.charAt(i);
            if(ch=='a'){
                sb.delete(i, i+1);
                sb.insert(i,'e');
            }
             if(ch=='e'){
                sb.delete(i, i+1);
                sb.insert(i,'i');
            }
             if(ch=='i'){
                sb.delete(i, i+1);
                sb.insert(i,'o');
            }
             if(ch=='o'){
                sb.delete(i, i+1);
                sb.insert(i,'u');
            }
             if(ch=='u'){
                sb.delete(i, i+1);
                sb.insert(i,'a');
            }
        }
        System.out.print(sb);
       
    }
}
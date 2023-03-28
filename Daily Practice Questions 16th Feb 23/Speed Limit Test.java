/*
Speed Limit Test
easy
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Alice is driving from her home to her office which is A kilometers away and will take her X hours to reach. Bob is driving from his home to his office which is B kilometers away and will take him Y hours to reach. Determine who is driving faster, else, if they are both driving at the same speed print EQUAL.
Input
The first line will contain T, the number of test cases. Then the test cases follow. Each test case consists of a single line of input, containing four integers A, X, B, and Y, the distances and and the times taken by Alice and Bob respectively.

Constraints
1 ≤ T ≤ 1000
1 ≤ A, X, B, Y ≤ 1000
Output
For each test case, if Alice is faster, print ALICE. Else if Bob is faster, print BOB. If both are equal, print EQUAL.
starsASK AI
BETA
Simpler Explanation
Concepts Used
Example
Sample Input :
3
20 6 20 5
10 3 20 6
9 1 1 1
Sample Output :
Bob
Equal
Alice
Explanation :
Since Bob travels the distance between his office and house in 5 hours, whereas Alice travels the same distance of 20 kms in 6 hours, BOB is faster.
Since Alice travels the distance of 10 km between her office and house in 3 hours and Bob travels a distance of 20 km in 6 hours, they have equal speeds.
Since Alice travels the distance of 9 km between her office and house in 1 hour and Bob travels only a distance of 1 km in the same time, ALICE is faster.
*/


import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc= new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0){
            float a = sc.nextInt();
            float x = sc.nextInt();
            float b = sc.nextInt();
            float y = sc.nextInt();
            
            float ares = Math.abs(a/x);
            float bres = Math.abs(b/y);
            // System.out.print(ares+" "+bres);
            if(ares>bres){
                System.out.print("ALICE");
            }
            else if(ares<bres){
                System.out.print("BOB");
            }
            else{
                System.out.print("EQUAL");
            }
            System.out.println();
            t--;
        }
    }
}
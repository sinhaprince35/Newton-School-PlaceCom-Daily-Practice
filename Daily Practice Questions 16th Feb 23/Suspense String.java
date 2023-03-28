/*
Suspense String
medium
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Alice and Bob are playing a game with a binary string S of length N and an empty string T. They both take turns and Alice plays first. In Alice's turn, she picks the first character of string S, appends the character to either the front or back of string T and deletes the chosen character from string S. In Bob's turn, he picks the last character of string S, appends the character to either the front or back of string T and deletes the chosen character from string S. The game stops when S becomes empty. Alice wants the resultant string T to be lexicographically smallest, while Bob wants the resultant string T to be lexicographically largest possible. Find the resultant string T, if both of them play optimally.
Input
The first line of input will contain a single integer T, denoting the number of test cases. Each test case consists of multiple lines of input. The first line of each test case contains a single integer N - the length of the string S. The next line is the binary string S.

Constraints
1 ≤ T ≤ 100
1 ≤ N ≤ 1000
S can only contain the characters 0 or 1.
Output
For each test case, print the the resultant string T, if both of them play optimally.
*/


import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
     Scanner sc = new Scanner(System.in) ;
		int tc = sc.nextInt() ;
        while(tc-->0){
            int n = sc.nextInt() ;
		    sc.nextLine();
		    String str = sc.nextLine() ;
		    String newstr = "", ans = "", n1 = '1' + "" ,n0 = '0' + "" ;
		    for(int i=0; i<n+1/2; i++){
		    newstr = newstr + str.charAt(i) ;
		    newstr = newstr + str.charAt(n-1-i) ;
		    }
		    for(int i = 0; i<n; i++){
		        if(i%2 == 0){
		            if(newstr.charAt(i) == '0')
		            ans = n0+ans ;
		            else
		            ans = ans+n1 ; 
		        }
		        else{
		            if(newstr.charAt(i) == '0')
		            ans = ans+n0 ;
		            else
		            ans = n1+ans ;
		        }
		    }
		    System.out.println(ans);
        }	
	}
}
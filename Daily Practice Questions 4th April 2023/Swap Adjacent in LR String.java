/*Swap Adjacent in LR String
medium
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
In a string composed of 'L', 'R', and 'X' characters, like "RXXLRXRXL", a move consists of either replacing one occurrence of "XL" with "LX", or replacing one occurrence of "RX" with "XR". Given the starting string start and the ending string end, return True if and only if there exists a sequence of moves to transform one string to the other.
Input
User Task:
Since this will be a functional problem, you don't have to take input. You just have to complete the function canTransform() that takes strings "start" and "end" as parameters.

Constraints:
1 ≤ start. length ≤ 104
start. length == end. length
Both start and end will only consist of characters in 'L', 'R', and 'X'.
Output
Return true if and only if there exists a sequence of moves to transform one string to the other otherwise, return false.
*/

class Solution {
    public boolean canTransform(String start, String end) {
      if (start.length() != end.length()) {
            return false;
        }
        int n = start.length();
        int i = 0, j = 0;
        while (i < n && j < n) {
            while (i < n && start.charAt(i) == 'X') {
                i++;
            }
            while (j < n && end.charAt(j) == 'X') {
                j++;
            }
            if (i == n && j == n) {
                return true;
            } else if (i == n || j == n) {
                return false;
            } else if (start.charAt(i) != end.charAt(j)) {
                return false;
            } else if (start.charAt(i) == 'L' && i < j) {
                return false;
            } else if (start.charAt(i) == 'R' && i > j) {
                return false;
            }
            i++;
            j++;
        }
        return true;
    }
}
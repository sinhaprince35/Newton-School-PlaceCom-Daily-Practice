/*Kth Largest XOR Coordinate Value
medium
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
You are given a 2D matrix of size m x n, consisting of non- negative integers. You are also given an integer k. The value of coordinate (a, b) of the matrix is the XOR of all matrix[i][j] where 0 ≤ i ≤ a < m and 0 ≤ j ≤ b < n (0- indexed).
Find the kth largest value (1- indexed) of all the coordinates of matrix.
Input
User Task:
Since this will be a functional problem, you don't have to take input. You just have to complete the function kthLargestValue() that takes the 2D array matrix and integer k as a parameter.

Constraints
m == matrix.length
n == matrix[i].length
1 ≤ m, n ≤ 10
0 ≤ matrix[i][j] ≤ 100
1 ≤ k ≤ m * n
Output
Return the kth largest value (1- indexed) of all the coordinates of the matrix.
*/

class Solution {
    public int kthLargestValue(int[][] matrix, int k) {
        int m = matrix.length;
        int n = matrix[0].length;
        PriorityQueue<Integer> pq = new PriorityQueue<>(k);
        int[][] xorMatrix = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 && j == 0) {
                    xorMatrix[i][j] = matrix[i][j];
                } else if (i == 0) {
                    xorMatrix[i][j] = xorMatrix[i][j-1] ^ matrix[i][j];
                } else if (j == 0) {
                    xorMatrix[i][j] = xorMatrix[i-1][j] ^ matrix[i][j];
                } else {
                    xorMatrix[i][j] = xorMatrix[i-1][j] ^ xorMatrix[i][j-1] ^ xorMatrix[i-1][j-1] ^ matrix[i][j];
                }
                if (pq.size() < k) {
                    pq.offer(xorMatrix[i][j]);
                } else if (xorMatrix[i][j] > pq.peek()) {
                    pq.poll();
                    pq.offer(xorMatrix[i][j]);
                }
            }
        }
        return pq.peek();
    }
}
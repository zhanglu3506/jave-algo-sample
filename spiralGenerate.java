// Generate an N N 2D array in spiral order clock-wise starting from the top left corner, using the numbers of 1, 2, 3, …, N N in increasing order.
//
// Assumptions
//
// N >= 0
// Examples
//
// N = 3, the generated matrix is
//
// { {1,  2,  3}
//
//   {8,  9,  4},
//
//   {7,  6,  5} }
public class Solution {
  public int[][] spiralGenerate(int n) {
    // Write your solution here.
    return new int[n][n];
  }
  private int[][] drawSquare(int n) {
     int[][] square = new int[n][n];
     if(n == 0) {
       return null;
     }
     if(n == 1) {
       return int[][]{{1}};
     }

     int i = 0;
     while(i <= (n * n - 5)) {
       if(i <= n-1) {
         square[0][i] = i+1;
       } else if(i < = 2n-2) {
         square[i + 1 - n][n-1] = i + 1;
       } else if(){

       } else{

       }

     }
  }
  private void mergeSquare(int[][] a, int[][], b) {

  }
}

/*
867. Transpose Matrix
Given a 2D integer array matrix, return the transpose of matrix.
The transpose of a matrix is the matrix flipped over its main diagonal,
switching the matrix's row and column indices.

Example 1:
Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
Output: [[1,4,7],[2,5,8],[3,6,9]]

Example 2:
Input: matrix = [[1,2,3],[4,5,6]]
Output: [[1,4],[2,5],[3,6]]
*/
public class Problem9_RemoveElement_using2Darray {
    public static void main(String[] args) {
        int[][] a = new int[][] { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        int row = a[0].length;// 3
        int coloum = a.length;// 3
        int[][] b = new int[row][coloum];

        for (int i = 0; i < a.length; i++)
            for (int j = 0; j < a[i].length; j++)
                b[j][i] = a[i][j];

        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[i].length; j++)
                System.out.print(b[i][j] + "\t");
            System.out.println();
        }
    }
}


public class MinimumCostPath {

  public static void main(String[] args) {
    int[][] m = { {1, 2, 3}, 
                {4, 8, 2}, 
                {1, 5, 3} };  
    System.out.print(minCostPath(m, 2, 2));
  }

  public static int minCostPath(int[][] mat, int i, int j) {
    if (i <  0 || j < 0 ) return Integer.MAX_VALUE;
    else  if (i == 0 && j == 0 ) return mat[i][j];
    else return mat[i][j] + Math.min( minCostPath(mat, i , j - 1), Math.min( minCostPath(mat, i - 1, j - 1), minCostPath(mat, i - 1, j)))  ;
  }

}


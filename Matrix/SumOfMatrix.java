 
public class SumOfMatrix {

 public static void main(String[] args) {
   int[][] mat = {{3, 4, 5},
                  {6, 1, 3},
                  {5, 1, 2}};
   System.out.println(sumOfMatrix(mat));
  }
  
  public static int sumOfMatrix(int[][] mat) {
    int sum = 0;
    for(int i = 0 ; i < mat.length; i++){
      for(int j = 0 ; j < mat[0].length; j++){
         sum += mat[i][j];
      }
    }
    return sum;
    }
} 

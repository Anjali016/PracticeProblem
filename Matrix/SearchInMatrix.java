
public class SearchInMatrix {

  public static void main(String[] args) {
    int[][] mat = {{2, 4, 5},{45, 8, 7},{9, 0, 10}};
    int item = 7;
    findElement(mat, item);
  }

  public static void findElement(int[][] mat, int key) { 
    for(int i = 0 ; i < mat.length; i++){
      for(int j = 0 ; j < mat[0].length; j++){
        if(mat[i][j] == key) System.out.print("Element found at index :" + i +", " +j);
      }
    } 
  } 
}

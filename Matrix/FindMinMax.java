import java.util.*;

public class FindMinMax {

  public static void main(String[] args) {
    int[][] mat = {{3, 5, 6},
                   {4, 12, 5},
                   {1, 9 , 23}};
    
    List<Integer> res = getMinMax(mat);
    System.out.println("Max : " + res.get(0));
    System.out.println("Min : " + res.get(1));
  }

  public static List<Integer> getMinMax(int[][] mat) {
    int min = Integer.MAX_VALUE;
    int max = Integer.MIN_VALUE;
    List<Integer> minMax = new ArrayList<Integer>();
    for(int i = 0 ; i < mat.length ; i++) {
      for(int j = 0 ; j < mat[0].length; j++){
        min = Math.min(min, mat[i][j]);
        max = Math.max(max, mat[i][j]);
      } 
    }
    minMax.add(max);
    minMax.add(min);
  return minMax;
  }
}

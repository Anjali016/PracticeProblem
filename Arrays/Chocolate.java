import java.lang.*;
import java.util.*;
public class Chocolate {
 
  public static void main(String[] args) {
    int[] array = {3, 4, 1, 9, 56, 7, 9, 12};
    System.out.println(findMinDiff(array, 5));
  }

  public static int findMinDiff(int[] arr, int m) {
    Arrays.sort(arr);
    int windowL = 0;
    int windowR = m - 1;
    int minDiff = Integer.MAX_VALUE;
    while (windowR < arr.length) {
      minDiff = Math.min(minDiff, arr[windowR] - arr[windowL]);
      windowL++;
      windowR++;
    }
   return minDiff;
  }
}

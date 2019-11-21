
public class MaximumDifference {
  
  public static int maxDiff(int[] arr) {
    int max = Integer.MIN_VALUE;
    int minSoFar = arr[0];
    for(int i = 0 ; i < arr.length; i++){
      max = Math.max(max, arr[i] - minSoFar);
      minSoFar = Math.min(minSoFar, arr[i]);
    }
    return max;
  }
 
  public static void main(String[] args) {
   int[] arr = {2, 3, 10, 6, 4, 8, 1};
   int[] arr2 = {7, 9, 5, 6, 3, 2};
   System.out.println(maxDiff(arr));
   System.out.println(maxDiff(arr2));
 }
}

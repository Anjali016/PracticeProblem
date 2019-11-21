
public class RecursiveSum {
  
  public static void main(String[] args) {
    int[] array = {3, 5, 6, 8, 1};
    int res = getSum(array, 0, array.length - 1);
    System.out.println(res);
  }

  public static int getSum(int[] arr, int start, int end) {
    if(start > end) return 0;
    else{
     int sum = getSum(arr, start + 1, end);
     return sum + arr[start]; 
  } 
     
  }
 }

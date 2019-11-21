

public class PrintSumSubArray {

  public static void main(String[] args) {
    int[] array = {1, 4, 20, 3, 10, 5};
    int sum = 33; 
    getSubArray(array, sum);
   }

  public static void getSubArray(int[] arr, int sum) {
    int left = 0; 
    int right = 0;
    int currSum = 0;
    while(right < arr.length) {
      if (currSum < sum ) {
        currSum += arr[right];
        right++;
      }
      else {
        if (currSum > sum) {
          currSum -= arr[left];
          left++;
        }
     else {
        printSubArray(arr, left, right);
         return;
      }
    }
  }
}
  private static void printSubArray(int[] arr, int i, int j) {
    for(int k = i ; k < j ; k++) System.out.println(arr[k]);
  }
 }
    

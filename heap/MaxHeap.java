
public class MaxHeap {

  public static void main(String[] args) {
    //int[] arr = {16, 14, 10, 8, 7, 9, 3, 2, 4, 1};
    int[] arr = {1, 3, 5, 4, 6, 13, 10, 9, 8, 15, 17 }; 
    buildMaxHeap(arr);
    for(int i : arr) System.out.print(i + ", ");

  }

  public static void buildMaxHeap(int[] arr) {
    int heapSize = arr.length;
    for (int i = heapSize/2 - 1; i >= 0; i--) heapify(arr, i);
  }
 
  private static void heapify(int[] arr, int i) {
    int left = 2 * i + 1;
    int right = 2 * i + 2;
    int max = i;
    if (arr.length > left && arr[left] > arr[max]) max = left; 
    if (arr.length > right && arr[right] > arr[max]) max = right;
    if (max != i) {
      swap(arr, i, max);
      heapify(arr, max);
    } 
  }

  private static void swap (int[] arr, int x, int y){
    if (x != y) {
      int temp = arr[x];
      arr[x] = arr[y];
      arr[y] = temp;
    }
  }
}

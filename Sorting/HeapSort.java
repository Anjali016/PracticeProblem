
public class HeapSort {

  public static void main(String[] args) {
    int[] arr = {12, 11, 13, 5, 6, 7};
    heapSort(arr);
    for(int i : arr) System.out.print(i + ", ");
  }

  public static void heapSort(int[] arr) {
    int heapSize = arr.length;
    buildMaxHeap(arr, heapSize);
    for (int i = 0; i < arr.length; i++) {
      extractMax(arr,  heapSize);
      heapSize--;
      heapify(arr, 0, heapSize);
    }
  }
 
  private static void buildMaxHeap(int[] arr, int heapSize) {
    for (int i = heapSize/2 - 1; i >= 0; i--) heapify(arr, i, heapSize);
  }

  private static void extractMax(int[] arr, int heapSize) {
    swap(arr, 0, heapSize - 1); 
  }

  private static void swap(int[] arr, int x, int y){
    int temp = arr[x];
    arr[x] = arr[y];
    arr[y] = temp;
  }

  private static void heapify(int[] arr, int i, int heapSize) {
    int left = 2*i + 1;
    int right = 2*i + 2;
    int max = i;
    if (heapSize > left && arr[left] > arr[max]) max  = left;
    if (heapSize > right && arr[right] > arr[max])  max = right;
    if (arr[max] > arr[i]) {
      swap(arr, max, i);
      heapify(arr, max, heapSize);
    }
  }
}


public class SelectionSort {

  public static void main(String[] args) {
    int[] array = {20, 12, 10, 15, 2};
    int[] res = selectionSort(array);
    for (int i : res) System.out.print(i+" ,");
  }

  public static int[] selectionSort(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      int minIndex = getMinIndex(arr, i, arr.length - 1);
      swapElements(arr, i, minIndex); 
    }
    return arr;
  }

  private static int getMinIndex(int[] arr, int start, int end) {
    int min = start;
    for (int i = start; i < arr.length; i++) {
      if (arr[i] < arr[min]) min = i; 
    }
    return min;
  }

  private static void swapElements(int[] a, int start, int end) {
    if (start != end) {
      a[start] = a[start] ^ a[end];
      a[end] =  a[start] ^ a[end];
      a[start] = a[start] ^ a[end];
    }
  }
}

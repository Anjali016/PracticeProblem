
public class InsertionSort {
 
  public static void main(String[] args) {
    int[] array = {2, 1, 6, 5, 4};
    int[] res = insertionSort(array);
    for (int i : res) System.out.print(i + ",");
  }

  public static int[] insertionSort(int[] arr) {
    for (int i = 1; i < arr.length; i++) {
      int key = arr[i];
      int j = i - 1;
      while (j >= 0 && arr[j] > key) {
        arr[j+1] = arr[j];
        j--;	
      }
      arr[j+1] = key; 
    }
    return arr;
  }
}

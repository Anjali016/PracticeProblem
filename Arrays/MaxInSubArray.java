import java.util.*;

public class MaxInSubArray {

  public static void main(String[] args) {
    int[] arr = {1, 2, 3, 1, 4, 5, 2, 3, 6};
    int k = 3;
    List<Integer> r = maxInSubArray(arr, k);
    for(int i : r)
      System.out.print(i + ", ");
  }

  public static List<Integer> maxInSubArray(int[] arr, int k) {
    int windowL = 0;
    int windowR = windowL + k - 1;
    List<Integer> res = new ArrayList<>();
    while (windowL <= arr.length - k && windowR < arr.length) {
      int max = getMax(arr, windowL, windowR + 1, k);
      res.add(max);
      windowL++;
      windowR++;
    }
    return res;
  }

  private static int getMax(int[] arr, int start, int end, int k) {
    int[] newArray = Arrays.copyOfRange(arr, start, end);
    for (int i =  newArray.length/2-1; i >=0; i--) {
      heapify(newArray, i, newArray.length);
    }
    return newArray[0];
  }

  private static void heapify(int[] arr, int i, int end) {
    int left = 2 * i + 1;
    int right = 2 * i + 2;
    int max = i;
    if (left < arr.length && arr[left] > arr[max]) max = left;
    if (right < arr.length && arr[right] > arr[max]) max = right;
    if (max != i) {
      swap(arr, max, i);
      heapify(arr, max, arr.length);
    }
  }

  private static void swap (int[] arr, int x, int y) {
    int temp = arr[x];
    arr[x] = arr[y];
    arr[y] = temp;
  }
}


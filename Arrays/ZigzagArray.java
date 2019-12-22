
public class ZigzagArray {
 
  public static void main(String[] args) {
    int[] arr = {4, 3, 7, 8, 6, 2, 1};
    zigzag(arr);
  }

  public static void zigzag(int[] arr) {
   for (int i = 0; i <= arr.length - 2; i++) {
     if (i % 2 == 0 && arr[i] >  arr[i + 1]) swap (arr, i, i + 1);
     else if (i % 2 != 0 && arr[i] < arr[i + 1]) swap (arr, i, i + 1);
   }
   for (int x : arr) System.out.print(x + ", "); 
  }

  public static void swap(int[] arr, int x, int y) {
    int temp = arr[x];
    arr[x] = arr[y];
    arr[y] = temp;
  }
}

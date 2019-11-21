
public class Sort012 {
  
  public static int[] sort012(int[] arr) {
    int start = 0; int end = arr.length - 1;
    int mid = 0;
    while(mid <= end) {
      if(arr[mid] == 0) { 
        swap(arr, mid, start);
        start++;
        mid++;
      }
      else if (arr[mid] == 2) {
        swap(arr, mid, end);
        end--;
      }
      else mid++;   
     }
   return arr;
  }

  private static void swap (int[] arr, int x, int y) {
   int temp = arr[x];
   arr[x] = arr[y];
   arr[y] = temp;
  }

  public static void main(String[] args) {
    int[] array = {0, 1, 0, 1, 2, 1, 0, 2, 1};
    int[] res = sort012(array);
    for(int i : res) System.out.print(i + ", ");
  }
}

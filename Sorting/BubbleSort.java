public class BubbleSort {

  public static void main(String[] args) {
    int[] array = {3, 2, 5, 1, 4, 0};
    int[] res = bubbleSort(array);
    for(int i : res) System.out.print(i + ",");
  }

  private static int[] bubbleSort(int[] arr) {
    for (int size = arr.length - 1; size >= 0; size--) {
      for (int i = 0; i < size; i++) {
      	if (arr[i] > arr[i+1]) swap(arr, i , i+1); 
      }
    }
  return arr;
  }

  private static void swap(int[] arr, int x, int y){
    if(x != y){
      arr[x] = arr[x]^arr[y];
      arr[y] = arr[x]^arr[y];
      arr[x] = arr[x]^arr[y];
    }
  }  
}

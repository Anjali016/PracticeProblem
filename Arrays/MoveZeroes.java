public class MoveZeroes {

  public static void main(String[] args) {
    int[] array = {1, 2, 0, 4, 3, 0, 5, 0};
    int[] res = moveZero(array);
    for (int i : res) System.out.print(i + ",");
   
  }

  public static int[] moveZero(int[] arr) {
    int i = 0;
    int j = 0;
    while (i < arr.length - 1 && j < arr.length) {
      while (arr[j] == 0) {
       i = getNonZero(arr, j + 1);
       swap (arr, i, j);
       i++;
       j = i;
      }
       j++;
    } 
    return arr;
  }

  private static int getNonZero(int[] arr, int start) {
    int index = 0;
    while (start < arr.length) {
      if (arr[start] != 0) {
        index = start;
        break;
    }
   else start++;
  return index;
  }

  private static void swap (int[] arr, int i , int j) {
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }  
}

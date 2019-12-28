
public class IncExc {
  
  public static int nonAdjacentSum(int[] arr) {
    int incl = arr[0];
    int excl = 0;
    for (int i = 1; i < arr.length; i++) {
      int prevIncl = incl;
      incl = excl + arr[i];
      excl = Math.max(prevIncl, excl);
    }
    return Math.max(incl,excl);
  }

  public static void main(String[] args) {
    int[] arr = {5, 5, 10, 100, 10, 5};
    int[] array = {5, 4, 1, 3};
    System.out.println(nonAdjacentSum(arr));
    System.out.println(nonAdjacentSum(array));
  } 
}

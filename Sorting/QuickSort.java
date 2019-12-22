public class QuickSort {

  public static void main(String[] args){
    int[] array = {2, 5, 1, 7, 4, 9};
    quickSort(array, 0, array.length);
    for(int i = 0 ; i < array.length; i++ ) System.out.print(array[i] + ",");
  }

  private static void quickSort(int[] arr, int start, int end){
    if (start < end){
      int pivot = getPartition(arr, start, end);
      quickSort(arr, start, pivot);
      quickSort(arr, pivot+1 , end);	
    }
  }

  private static int getPartition(int[] arr, int start, int end){
    int pivot = arr[end- 1];
    int itr = start - 1;
    for(int i = start ; i < end - 1; i++){
      if (arr[i] <= pivot ){ 
         itr++;
	 swap (arr, itr , i);
      }
    }
    swap(arr, itr + 1, end - 1);
  return itr + 1;
 }

  private static void swap(int[] a, int start, int end){
     if(start != end){
      a[start] = a[start] ^ a[end];
      a[end] =  a[start] ^ a[end];
      a[start] = a[start] ^ a[end];
    }
  }
}


public class BinarySearch{

	public static void main(String[] args){
	int[] array = {3, 5, 8, 9, 10, 15};
	int index = binarySearch(array, 10, 0, array.length-1);
	System.out.print("element found at :" + index);
	}
	

	public static int binarySearch(int[] arr, int item, int start, int end){
	int mid = (start+end)/2;
	if(arr[mid] < item) return binarySearch(arr, item, mid+1, end);
	else if(arr[mid] > item) return binarySearch(arr, item , start, mid-1);
	else return mid;
	}
}


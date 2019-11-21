import java.util.Arrays;

class Solutions{
 
 	public static int getMin(int[] arr){	
	int min = Integer.MAX_VALUE;
	for(int i = 0 ; i < arr.length; i++) if(arr[i] < min) min = arr[i];
	return min;
         }

	public static void main(String[] args){
	  int[] arr = {8,2,1};
	  System.out.print(getMin(arr));
	}
}


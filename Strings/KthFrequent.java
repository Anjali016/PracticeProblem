import java.util.*;
import javafx.util.*;

public class KthFrequent {
 
  public static void main(String[] args) {
    int[] arr = {3, 1, 4, 4, 5, 2, 6, 1};
    kthFrequent(arr, 2);    
  }

  public static Comparator<Pair<Integer, Integer>> pairComparator = new Comparator<Pair<Integer, Integer>>() {
    @Override
				public int compare(Pair<Integer, Integer> p1, Pair<Integer, Integer> p2) {
						int result = p2.getValue() - p1.getValue();
						return result == 0 ? p2.getKey()-p1.getKey() : result ;}
		};
		public static void kthFrequent(int[] arr, int k){
				Map<Integer, Integer>  freq = new HashMap<>();
				Queue<Pair<Integer, Integer>> pq = new PriorityQueue<>(pairComparator);
				for(int i = 0 ; i < arr.length ; i++){
						int frequency = freq.getOrDefault(arr[i], 0) + 1;
						freq.put(arr[i], frequency);
				}
				for(Map.Entry e : freq.entrySet()) pq.add(new Pair<>((int)e.getKey(),(int)e.getValue()));
				for(int i = 1 ; i <= k ; i++){
						Pair<Integer, Integer> current = pq.remove();
						System.out.println(current.getKey() + ":" + current .getValue()); 
				}

		}
}

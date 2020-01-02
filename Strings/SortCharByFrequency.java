import java.util.*;

public class SortCharByFrequency {

  public static void main(String[] args) {
    int[] arr = {2, 3, 2, 4, 5, 3, 5, 1};
     sortByFreq(arr);
  }

  public static void sortByFreq(int[] arr) {
    Map<Integer, Integer> freq = new HashMap<>();
    for (int i = 0 ; i < arr.length ; i++) {
      int current = arr[i];
      freq.put(current, freq.getOrDefault(current, 0) + 1);
    }
    TreeMap<Integer, Integer> sortedMap = new TreeMap<>(new freqComparator(freq));
    sortedMap.putAll(freq);
    for (Integer key : sortedMap.keySet()) {
      for(int i = 1; i <= sortedMap.get(key); i++) {
        System.out.print(key + " ");
      }
    }
  }

  public static class freqComparator implements Comparator<Integer> {
    Map<Integer, Integer> map;
    
   freqComparator(Map<Integer, Integer> map) {
      this.map = map;
   }
     
    @Override
    public int compare(Integer key1, Integer key2) {
      Integer freq1 = map.get(key1);
      Integer freq2  = map.get(key2);
      int result = freq1.compareTo(freq2);
      return result == 0 ? key1.compareTo(key2) : result;
    }
  } 
}

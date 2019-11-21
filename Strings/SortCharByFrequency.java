
public class SortCharByFrequency {

  public static void main(String[] args){
    int[] arr = {'g', 'a', 'b', 'a', 'g'};
    int[] res = sortByFreq(arr);
    for(int c : res) System.out.print(c); 
 
  }

  public static int[] sortByFreq(int[] arr){
    Map<Integer, Integer> freq = new HashMap<>();
    for(int i = 0 ; i < arr.length ; i++) {
      int current = arr[i];
      freq.put(current, freq.getOrDefault(arr[i], 0) + 1);
    }
    TreeMap<Integer, Integer> sortedMap = new TreeMap<>(new freqComparator(freq));
    for(Map.Entry e : sortedMap) System.out.print(e.getKey() + ":" + e.getValue())
   

}

  public static class Comparator<Integer> freqComparator implements Comparator<Integer>{
    Map<Integer, Integer> map;
    
   freqComparator(Map<Integer, Integer> map){
      this.map = map;

   }
     
    @Override
    public int compare(int x, int y) {
    int
    return res = 0 ? x.getKey
    
    }
  }; 


}

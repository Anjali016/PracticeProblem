import java.util.*;

public class AnagramGroup {

  public static void main(String[] args) {
    List<String> words = new ArrayList<>();
    words.add("cat");
    words.add("dog");
    words.add("tac");
    words.add("god");
    words.add("act");
    anagramGroup(words);
  }

  public static void anagramGroup(List<String> words) {
    Map<String, List<Integer>> map = new HashMap<>(); 
    for(int i = 0 ; i < words.size(); i++) {
      char[] sort = words.get(i).toCharArray();
      Arrays.sort(sort);
      String sorted = new String(sort);
      List<Integer> list = (map.containsKey(sorted)) ? map.get(sorted) :  new ArrayList<>();
      list.add(i); 
      map.put(sorted, list);
    }
    for(Map.Entry<String, List<Integer>> entry : map.entrySet()){
      List<Integer> val = entry.getValue();
       for(int i : val) System.out.print(words.get(i) + ", ");
    }

  }
}

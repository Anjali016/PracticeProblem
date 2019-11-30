import java.util.*;

public class LargestNumber {

  public static void main(String[] args) {
    String[] arr = {"3", "30", "34", "5", "9"};
    largestNumber(arr);
  }

  public static void largestNumber(String[] arr) {
    List<String> list = Arrays.asList(arr);
    Collections.sort(list, listComparator);
    for(String i : list) System.out.print(i);
  }

  public static Comparator<String> listComparator = new Comparator<String>() {
    @Override
    public int compare(String x, String y) {
     String s1 = x+y;
     String s2 = y+x;
     return s2.compareTo(s1);
    }
  };
}

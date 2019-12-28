
import java.util.*;
public class NonRepeatingSubstring {

  public static int nonRepeatSubstring(String str) {
    Map<Character, Integer> lastIndex = new HashMap<>();
    int windowL = 0;
    int windowR = 0;
    int maxLen = Integer.MIN_VALUE;
    while (windowR < str.length()) {
      char current = str.charAt(windowR);
      if (!lastIndex.containsKey(current) || lastIndex.get(current) < windowL) 
        maxLen = Math.max(maxLen, windowR - windowL +1);
      else {
        windowL = windowR + 1;
      }
      lastIndex.put(current, windowR++);
    }  
    return maxLen;
  }

  public static void main(String[] args) {
    String s = "geeksforgeeks";
    System.out.println(nonRepeatSubstring(s));
  }
}

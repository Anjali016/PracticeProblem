
public class AnagramSubstring {


  public static List<Integer> anagramSubstring(String text, String pattern) {
    Map<Character,Integer> patFreq = new HashMap<>();
    for (char c : pattern) {
      int index = patFreq.getOrDefault(c, 0);
      patFreq.put(c, index + 1);
    }
    int window = pattern.length();
    int j = 0;
    while (j < text.length() - window) {
      String substring = text.substring(j, j + window);
    }
        
  
  }


}

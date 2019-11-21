
import java.util.*;
public class MaxFreqChar{

  public static void main(String[] args){
  String input = "Hi How are you ";
  char res = getMaxFreqChar(input);
  System.out.println(res);	
  }
	
  public static char getMaxFreqChar(String str){
  Map<Character, Integer> freq = new HashMap<>();  
  char maxChar = str.charAt(0);
  int max = 1;
  freq.put(maxChar, max);
  for(int i = 1 ; i < str.length(); i++){
   char current = str.charAt(i);
   int frequency = freq.getOrDefault(current , 0)+1;
   freq.put(current, frequency);
    if(frequency > max){
     max = frequency;
     maxChar = current ;
    }
  }
   return maxChar;
  }
}

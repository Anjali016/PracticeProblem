import java.lang.*;;

public class ReverseWord {

  public static void main(String[] args) {
    String input = "How are you";
    System.out.print(reverseWord(input));
  }

  public static String reverseWord(String str) {
    String[] string = str.split(" ");
    StringBuilder res = new StringBuilder();
    for(int i = string.length - 1; i >= 0 ; i--) {  	
      res = res.append(string[i]);
    }
    return res.toString();	
  }
}

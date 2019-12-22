import java.lang.*;

public class RemoveDups {

  public static void main(String[] args) {
    String input = "tree loko";
    String result = removeDups(input);
    System.out.print(result); 
  }

  public static String removeDups(String str) {
    StringBuilder res = new StringBuilder();
    for(int i = 0 ; i < str.length(); i++){
      if (res.toString().indexOf(str.charAt(i)) == -1) res.append(str.charAt(i));
    }
    return res.toString();
  }

}

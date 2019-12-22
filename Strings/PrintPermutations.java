import java.lang.*;

public class PrintPermutations {

  public static void main(String[] args) {
    String input = "ABC";
    permutation("", input);
  }

  public static void permutation(String soFar, String rem) {
    if (rem.isEmpty()) System.out.println(soFar);
    for (int i = 0 ; i < rem.length(); i++) permutation(soFar + rem.charAt(i), rem.substring(0, i) + rem.substring(i+1));
  }
}

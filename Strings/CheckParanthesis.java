
import java.util.*;
public class CheckParanthesis {

  public static boolean checkParanthesis(String str) {
    Stack<Character> stack = new Stack<>();
    int windowR = 0;
    while (windowR < str.length()) {
     char current = str.charAt(windowR);
     if (current == '(' || current == '{' || current == '[') stack.push(current);
     else {
       if (stack.isEmpty()) return false;
       else {
         char top = stack.pop();
         if(isMatching(current, top)) return true;
     }
    } 
    windowR++;
    }
    return stack.isEmpty();
  }

  private static boolean isMatching(char first, char second) {
    return (first == '{' && second == '}' || first == '(' && second == ')' || first == '[' && second == ']');
  }

  public static void main (String[] args) {
    String s = "()()";
    String str = "{()}[]]";
    System.out.println(checkParanthesis(s));
    System.out.println(checkParanthesis(str));
  } 
}



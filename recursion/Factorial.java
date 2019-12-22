import java.util.*;

public class Factorial {

  public static void main(String[] args) {
    System.out.println(factorial(10));
    System.out.println(factDP(10));
  }

  public static int factorial(int num) {
    if(num == 0 || num == 1) return 1;
    else return num * factorial(num - 1);
  }

 static  Map<Integer, Integer> map = new HashMap<>();
  public static int factDP(int num) {
   if (num == 0) return 1;
   else{
     if (map.containsKey(num)) return map.get(num);
     else {
        int res = num * factDP(num - 1);
        map.put(num, res);
        return res;
      }  
    } 
  }
}

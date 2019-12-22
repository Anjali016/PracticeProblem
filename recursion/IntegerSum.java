
public class IntegerSum {

  public static int getSum(int n) {
    if (n == 0) return 0;
    else return n + getSum(n-1);
  }

  public static void main(String[] args) {
    int n = 4;
    System.out.println(getSum(n));
  }
}

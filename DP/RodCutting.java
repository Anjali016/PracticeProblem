import java.lang.*;
public class RodCutting {
  
  public static void main (String[] args) {
    int arr[] = {1, 5, 8, 9, 10, 17, 17, 20};
    System.out.println(rodCutting(8, arr));  
  }

  public static int rodCutting(int rodLength, int[] price) {
    int[] dp = new int[rodLength+1];
    for (int i = 1; i <= rodLength; i++) {
      int maxProfit = Integer.MIN_VALUE;
      for (int j = 0; j < i; j++ ) maxProfit = Math.max(maxProfit, price[j] + dp[i - j - 1]);
        dp[i] = maxProfit;
    }
    return dp[rodLength];
  }
}

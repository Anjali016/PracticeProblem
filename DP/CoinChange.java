
public class CoinChange {

  public static void main(String[] args) {
    int[] coins = {2, 3, 5};
    int sum = 10;
    System.out.println(coinChange(coins, sum));
  }

  public static int coinChange(int[] coins, int sum) {
    int[] dp = new int[sum + 1];
    dp[0] = 0;
    for(int i = 1 ; i < dp.length; i++) {
      dp[i] = Integer.MAX_VALUE;
    }
    for(int j = 1 ; j < dp.length; j++) {
      for(int coin : coins)
        if (j - coin >= 0 && dp[j - coin] != Integer.MAX_VALUE) {
          dp[j] = Math.min(1 + dp[j-coin], dp[j]);
        }
    }
    return dp[sum];
  }

}

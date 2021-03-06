import java.lang.*;

public class EditDistance {

  public static int editDistance(String s1, String s2, int m, int n) {
    if (m == 0) return n ;
    else if (n == 0) return m;
    else if (s1.charAt(m - 1) == s2.charAt(n-1)) return editDistance(s1, s2, m-1, n-1);
    else return 1 + Math.min(editDistance(s1, s2, m , n - 1), Math.min(editDistance(s1, s2, m - 1, n ),(editDistance(s1, s2, m - 1, n - 1))));
  }

  public static int editDp(String s1, String s2, int m, int n) {
    int[][] dp = new int[m+1][n+1];
    for (int i = 0; i <= m; i++) {
      for (int j = 0; j <= n; j++) {
        if (i == 0) dp[i][j] = j;
        else if (j == 0) dp[i][j] = i;
        else if (s1.charAt(i-1) == s2.charAt(j-1)) dp[i][j] = dp[i-1][j-1];
        else dp[i][j] = 1 + Math.min(dp[i-1][j-1], Math.min(dp[i][j-1], dp[i-1][j]));
      }
    }
    return dp[m][n];
  } 

  public static void main(String[] args) {
    String s1 = "horse";
    String s2 = "ros";
    System.out.println(editDistance(s1, s2, 5, 3));
    System.out.println(editDp(s1, s2, 5, 3));
  }
}

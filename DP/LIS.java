import java.lang.*;

public class LIS {
 
  public static void main(String[] args) {
    int[] arr  = {3, 10, 2, 1, 20};
    int res = longestIncreasing(arr);
    System.out.print(res);
   
  }

  public static int longestIncreasing(int[] arr) {
    int[] dp = new int[arr.length];
    int max = 0;
    for (int i = 0; i < dp.length; i++) {
      dp[i] = 1;
    }
    for (int i = 1 ; i < dp.length ; i++) {
      for (int j = 0; j < i; j++) if (arr[i] > arr[j]) dp[i] = Math.max(dp[i], 1 +  dp[j]);
    }
    max = getMax(dp);
   return max;
  }
 
  private static int getMax(int[] dp) {
    int max = Integer.MIN_VALUE;
    for(int i : dp) max = Math.max(max, i);
    return max;
  } 

  

  }

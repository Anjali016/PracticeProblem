import java.lang.*;

public class MinJump {
 
  public static void main(String[] args) {
    int[] arr = {1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9};
    System.out.println(minJump(arr));
  }
  
  public static int minJump(int[] arr) {
    int[] dp = new int[arr.length];
    for (int i = 0 ; i < dp.length; i++) {
      dp[i] = Integer.MAX_VALUE;
    }
    dp[0] = 0;
    for (int i = 0 ; i < dp.length ; i++) {
      for(int j = 1 ; j <= arr[i] ; j++) if (i + j  < arr.length) dp[i + j] = Math.min(dp[i] + 1, dp[i+j]);
    }
    return dp[dp.length - 1];
    
  }

 }

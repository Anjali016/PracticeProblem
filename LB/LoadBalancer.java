public class LoadBalancer {
  
  public static void main(String[] args) {
    int servers = 10;
    int requests = 100;
    serveRequest(servers, requests);
  }

  private static void serveRequest(int servers, int req) {
    int currentServer = 0;
    while (currentServer < req) {
      int index = currentServer  % servers;   
      System.out.println("Request :" + currentServer  + " on server " + index );
      currentServer++;
    }
  }  
}

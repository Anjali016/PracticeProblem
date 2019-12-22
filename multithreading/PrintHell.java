

public class PrintHell {

  public static Runnable printHello = () -> {
   System.out.println("Hello World !");
  };

  public static void main(String[] args) {
    Thread thread1 = new Thread(printHello);
    thread1.start();
  }

}

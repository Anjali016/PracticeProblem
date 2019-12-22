
public class PrintEvenOdd {
  
  private static final Object lock = new Object();

  public static Runnable printEven = () -> {
    synchronized(lock) {
      for(int i = 0 ; i <= 10 ; i = i + 2) {
        System.out.println(Thread.currentThread().getName() +  i);
        lock.notify();
        try {
          lock.wait();
        }
        catch(InterruptedException e){
         e.printStackTrace();
        } 
        finally {
         lock.notify();
        }
      }
    }
  };

  public static Runnable printOdd = () -> {
    synchronized(lock) {
      for(int i = 1 ; i <= 10 ; i = i + 2){
        System.out.println(Thread.currentThread().getName() + i);
        lock.notify();
        try {
          lock.wait();
        }
        catch(InterruptedException e) {
          e.printStackTrace();
        }
        finally {
         lock.notify();
         }
      }
    }
  };

  public static void main(String[] args) {
    Thread even = new Thread(printEven, "EvenThread");
    Thread odd = new Thread(printOdd, "OddThread");
     
    even.start();
    odd.start();


  }

}

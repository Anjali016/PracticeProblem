import java.util.*;

public class PriorityQueueImpl {

  private static class Customer {
    int id;
    String name;

    Customer(int id, String name){
      this.id = id;
      this.name = name;
    }
  }

  public static void main(String[] args) {
    Queue<Customer> pq = new PriorityQueue<>(idComparator);
    pq.add(new Customer(234, "John"));
    pq.add(new Customer(171, "Alex"));
    pq.add(new Customer(124, "Bob"));
    pq.add(new Customer(204, "Aaron"));
    while (!pq.isEmpty()) {
      Customer current = pq.remove();
      System.out.println(current.id + " :" + current.name);
    }
  }

  public static Comparator<Customer> idComparator = new Comparator<Customer>() {
    @Override
    public int compare(Customer c1, Customer c2) { return c1.id -c2.id ;}
  }; 

}

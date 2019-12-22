
public class LinkedList {

  private static class ListNode {
    int data;
    ListNode next;
    ListNode(int data) {
      this.data = data;
    }
  }

  public static int size(ListNode head) {
    if(head == null) return 0;
    else return 1 + size(head.next);
  }

  public static int sumOfNodes(ListNode head) {
    if(head == null) return 0;
    else return head.data + sumOfNodes(head.next);
  }

  public static ListNode insertAtFront(ListNode head, int item){
    ListNode newNode = new ListNode(item); 
    if (head == null) return newNode;
    else {
      newNode.next = head;
      head = newNode;
      return head ;
    }
  }

  public static ListNode insertAtEnd(ListNode head, int item) {
    ListNode newNode = new ListNode(item); 
    if (head == null) return newNode;
    else if (head.next == null) { 
      head.next = newNode;
      newNode.next =  null;
      return head;
    }
    else return insertAtEnd(head.next, item);
  }

  public static void printList(ListNode head) {
    if(head == null) return;
    else {
      System.out.print(head.data + ", " );
      printList(head.next);
    }
  }

  public static void main(String[] args) {
    ListNode head = new ListNode(1);
    head.next = new ListNode(2);
    head.next.next = new ListNode(3);
    head.next.next.next  = new ListNode(4);
    head.next.next.next.next  = new ListNode(5);
    System.out.println("Original LinkedList :");
    printList(head);
    System.out.println("size of List :" + size(head));
    insertAtFront(head, 10);
    System.out.println("LinkedList after inserting at fron :");
    printList(head);
    System.out.println();
    insertAtEnd(head, 12);
    System.out.println("LinkedList after inserting at End:");
    printList(head);
    System.out.println("Sum of Nodes :" + sumOfNodes(head));

  }  



}

import java.util.*;
public class CloneLinkedList {
 
  private static class LinkNode {
    LinkNode next;
    LinkNode random;
    int data;

    public LinkNode(int data) {
      this.data = data;
    }
  }

  public static void main(String[] args) {
    LinkNode head = new LinkNode(2);
    head.next = new LinkNode(3);
    head.next.next = new LinkNode(15);
    head.next.next.random = head;
    head.next.next.next = new LinkNode(17);
    LinkNode cloneHead = cloneList(head);
    System.out.print(cloneHead.data);
   
  }
 
  public static LinkNode cloneList(LinkNode head) {
    Map<Integer, Integer> links = new HashMap<>();
    LinkNode head2 = getSingleLinkedList(head);
    LinkNode temp = head;
    while (temp.next != null) {
      LinkNode randomNode = temp.random;
      int tempIndex = getIndex(head, temp);
      int randomIndex = getIndex(head, randomNode);
      if (randomNode != null) links.put(tempIndex, randomIndex);
      temp = temp.next;
    }
    LinkNode curr = head2;
    int count = 1;
    while (curr.next != null) {
      if (links.containsKey(count)) {
        LinkNode rand = getNthNode(head2, links.get(count));
        curr.random = rand;
    }
    curr = curr.next;
    count++;
    }
   return head2;
  }

  private static LinkNode getSingleLinkedList(LinkNode head) {
    LinkNode temp = new LinkNode(head.data);
    LinkNode curr = temp;
    while (curr.next != null) {
      LinkNode newNode = new LinkNode(curr.next.data);
      temp.next = newNode;
      temp = temp.next;
      curr = curr.next;
    }
  return temp;
  }
  
  private static int getIndex(LinkNode head, LinkNode target) {
    if (head == target) return 1;
    else return 1 + getIndex(head.next, target);
  }

  private static LinkNode getNthNode(LinkNode head2, int n) {
    if (n == 0) return head2;
    else return getNthNode(head2.next, n - 1);
  }


     

}

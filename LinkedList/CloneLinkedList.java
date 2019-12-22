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
    LinkNode newHead = copySingleLinkedList(head);
    links = fillLinksMap(head);
    linkRandomPtr(newHead, links);
   return newHead;
  }

  private static Map<Integer, Integer> fillLinksMap(LinkNode head) {
    Map<Integer, Integer> links = new HashMap<>();
    LinkNode itr = head;
    while (itr.next != null) {
      LinkNode randomNode = itr.random;
      int itrIndex = getIndex(head, itr);
      int randomIndex = getIndex(head, randomNode);
      if (randomNode != null) links.put(itrIndex, randomIndex);
      itr = itr.next;
   }
   return links;
  }

  private static void linkRandomPtr(LinkNode head, Map<Integer, Integer> links) {
    LinkNode itr = head;
    int count = 1;
    while (itr.next != null) {
      if (links.containsKey(count)) {
        LinkNode rand = getNthNode(head, links.get(count));
        itr.random = rand;
    }
    itr = itr.next;
    count++;
    }
  }

  private static LinkNode copySingleLinkedList(LinkNode head) {
    LinkNode newListHead  = new LinkNode(head.data);
    LinkNode curr = head;
    while (curr.next != null) {
      LinkNode newNode = new LinkNode(curr.next.data);
      newListHead.next = newNode;
      newListHead = newListHead.next;
      curr = curr.next;
    }
    return newListHead;
  }

  private static int getIndex(LinkNode head, LinkNode target) {
    if (head == target) return 1;
    else return 1 + getIndex(head.next, target);
  }

  private static LinkNode getNthNode(LinkNode newHead, int n) {
    if (n == 0) return newHead;
    else return getNthNode(newHead.next, n - 1);
  }
}

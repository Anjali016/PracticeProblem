import java.util.*;

public class InterSectionOfList {
  
  private static class LinkNode {
    int data;
    LinkNode next;
 
    public LinkNode(int data){
      this.data = data;
    }
  }

  public static LinkNode findIntersection(LinkNode head1, LinkNode head2) {
    if(head1 == null && head2 == null) return new LinkNode(0);
    else if(head1 == null || head2 == null) return new LinkNode(0);   
    else {
      Set<Integer> set = fillSet(head1);
      LinkNode temp = head2;
      while(temp != null && !set.contains(temp.data)){
         temp = temp.next;
      } 
     return temp;
    }
 } 
  

  private static Set<Integer> fillSet(LinkNode head) {
    Set<Integer> set = new HashSet<>();
    LinkNode curr = head;
      while(curr != null){
        set.add(curr.data);
        curr = curr.next;
      }
     return set;
  }

  public static void main(String[] args) {
    LinkNode head1 = new LinkNode(15);
    head1.next = new LinkNode(9);
    head1.next.next  = new LinkNode(10);
    head1.next.next.next = new LinkNode(56);
    head1.next.next.next.next = new LinkNode(78);
    LinkNode head2 = new LinkNode(20); 
    head2.next = new LinkNode(21);
    head2.next.next = new LinkNode(22);
    head2.next.next.next = new LinkNode(10);
    System.out.println(findIntersection(head1, head2).data);

  }

} 
 





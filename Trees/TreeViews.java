import java.util.*;
import javafx.util.*;
import java.lang.*;

public class TreeViews {

  private static class TreeNode {
    TreeNode left, right ;
    int data ;

    TreeNode (int data) {
      this.data = data;
    }
  }
 
  public static void main(String[] args) {
    TreeNode root = new TreeNode(1);
    root.left  = new TreeNode(2);
    root.left.left   = new TreeNode(4);
    root.left.right  = new TreeNode(5);
    root.right  = new TreeNode(3);
    root.right.left  = new TreeNode(6);
    root.right.left.right  = new TreeNode(8);
    root.right.right  = new TreeNode(7);
    root.right.right.right  = new TreeNode(9);
    TreeNode root1 = new TreeNode(1);
    root1.left = new TreeNode(2);
    root1.right = new TreeNode(3);
    root1.left.right = new TreeNode(4);
    root1.left.right.right = new TreeNode(5);
    root1.left.right.right.right = new TreeNode(6);
    System.out.println("Vertical View");
    verticalPrint(root);
    System.out.println("Top View");
    topView(root);
    System.out.println("Another top view");
    topView(root1);
//    System.out.println("Bottom  View");
  //  bottomView(root);
    
  }

  public static void verticalPrint(TreeNode root) {
    Map<Integer, List<Integer>> map = new TreeMap<>();
    int hd = 0;
    verticalPrintUtil(root, map, hd);
    for (Integer key : map.keySet()){
      List<Integer> nodes = map.get(key);
          for (int i : nodes) System.out.print(i + ", ");
            System.out.println();
    }
  }
  
  private static void verticalPrintUtil(TreeNode root, Map<Integer, List<Integer>> map, int hd) {
   if(root == null) return ;
   else {
     List<Integer> list  = map.getOrDefault(hd, new ArrayList<Integer>());
     list.add(root.data);
     map.put(hd, list);
     verticalPrintUtil(root.left, map, hd - 1);
     verticalPrintUtil(root.right, map, hd + 1);
   } 
  }

  // TopView
  public static void topView(TreeNode root) {
    Map<Integer, Pair<Integer, Integer>> map = new TreeMap<>();
    int hd = 0;
    int currDepth = 0;
    topViewUtil(root, map, hd, currDepth);
    for (Integer key : map.keySet()){
      System.out.print(map.get(key).getKey() + ", ");
    }
  }

  private static void topViewUtil(TreeNode root, Map<Integer, Pair<Integer, Integer>> map, int hd, int currDepth) {
   if (root == null) return ;
   else {
     if (map.get(hd) == null) map.put(hd, new Pair<>(root.data, currDepth));
     else if (map.get(hd).getValue() >= currDepth) map.put(hd, new Pair<>(root.data, currDepth));
     topViewUtil(root.left, map, hd - 1, currDepth + 1); 
     topViewUtil(root.right, map, hd + 1, currDepth + 1); 
   }
  } 
 
  // Bottom View 
  public static  void bottomView (TreeNode root) {
    Map<Integer, Pair<Integer, Integer>> map = new TreeMap<>();
    int hd = 0;
    bottomViewUtil(root, map, 0, hd);
    for (Integer key : map.keySet()) System.out.print(map.get(key).getKey() + ", ");
  }

  private static void bottomViewUtil(TreeNode root, Map<Integer, Pair<Integer, Integer>> map, int currDepth,  int hd){
    if (root == null) return ;
    else {
      if (map.get(hd) == null) map.put(hd, new Pair<>(root.data, currDepth));
      else if (currDepth >= map.get(hd).getValue()) map.put(hd, new Pair<>(root.data, currDepth));
      bottomViewUtil(root.left, map, currDepth + 1, hd - 1);
      bottomViewUtil(root.right, map, currDepth + 1, hd + 1);
    }
  }
}

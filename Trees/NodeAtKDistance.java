
public class NodeAtKDistance {

  private static class TreeNode {
    TreeNode left, right ;
    int data ;

    TreeNode (int data) {
      this.data = data;
    }
  }

  public static void main (String[] args) {
    TreeNode root = new TreeNode(1);
    root.left  = new TreeNode(2);
    root.left.left   = new TreeNode(4);
    root.left.right  = new TreeNode(5);
    root.right  = new TreeNode(3);
    root.right.left  = new TreeNode(6);
    root.right.left.right  = new TreeNode(8);
    root.right.right  = new TreeNode(7);
    root.right.right.right  = new TreeNode(9); 
    printKNodes(root, 4);
  }

  public static void printKNodes(TreeNode root, int k) {
   if (root == null) return ;
   else if (k == 1) System.out.print(root.data + ", ");
   else {
       printKNodes(root.left, k - 1 );
       printKNodes(root.right, k - 1 );
   }
  }
}

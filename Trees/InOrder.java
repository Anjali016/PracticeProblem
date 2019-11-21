
public class InOrder {

  private static class TreeNode {
    TreeNode left, right ;
    int data ;

 TreeNode (int data) {
  this.data = data;
  }
}

  public static void main(String[] args){
    TreeNode root = new TreeNode(2);
    root.left  = new TreeNode(1);
    root.left.left   = new TreeNode(5);
    root.left.right  = new TreeNode(6);
    root.right  = new TreeNode(3);
    inOrder(root);
  }

  public static void inOrder(TreeNode root){
    if(root != null){
      inOrder(root.left);
      System.out.print(root.data);
      inOrder(root.right);
    }
  }

 

}

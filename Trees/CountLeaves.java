
public class CountLeaves {

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
    System.out.print(countLeaves(root));
  }

  public static int countLeaves(TreeNode root){
    if(root == null) return 0;
    else {
      int lCount = countLeaves(root.left);
      int rCount = countLeaves(root.right);
     return 1 + lCount + rCount; 
    }
  }

}

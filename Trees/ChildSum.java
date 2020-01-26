
public class ChildSum {
  

  private static class TreeNode {
    TreeNode left, right ;
    int data ;

    TreeNode (int data) {
    this.data = data;
    }
  }

public static void main(String[] args){
    TreeNode root = new TreeNode(7);
    root.left  = new TreeNode(6);
    root.left.left   = new TreeNode(2);
    root.left.right  = new TreeNode(1);
    root.right  = new TreeNode(5);
    int sum  = childSum(root);
    System.out.println(sum);
  }

  public static int childSum(TreeNode root) {
    if (root == null) return 0;
    else {
      int left = childSum(root.left);
      int right = childSum(root.right);
      root.data  =  root.data + left + right;
      return root.data;
    }
  }  

}

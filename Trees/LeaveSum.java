
public class LeaveSum {

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
    int sum  = sumOfLeaves(root);
    System.out.println(sum);  
  }

  public static int sumOfLeaves(TreeNode root){
    if(root == null) return 0;
    else {
     int leftSum = sumOfLeaves(root.left);
     int rightSum = sumOfLeaves(root.right);
     return leftSum + rightSum + root.data;
    }
  }


} 

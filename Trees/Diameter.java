
public class Diameter {

  private static class TreeNode {
    TreeNode left, right ;
    int data ;

    TreeNode (int data) {
      this.data = data;
    }
  }  
 
  public static void main(String[] args) {
     TreeNode root = new TreeNode(2);
     root.left  = new TreeNode(1);
     root.left.left   = new TreeNode(5);
     root.left.right  = new TreeNode(6);
     root.right  = new TreeNode(3);
     System.out.print(diameter(root));
   }
   
   public static int diameter(TreeNode root) {
     if (root == null) return 0;
     else {
       int leftDiameter = diameter(root.left);
       int rightDiameter = diameter(root.right);
       return Math.max(1 + height(root.left) + height(root.right), Math.max(leftDiameter, rightDiameter));
     }
   }

   private static int height(TreeNode root) {
     if(root == null) return 0; 
     else {
       int leftHeight = height(root.left);
       int rightHeight = height(root.right);
       return 1 + Math.max(leftHeight, rightHeight);
     }
   }
}

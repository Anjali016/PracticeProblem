public class PrintEvenLeaves {
 
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
    root.right  = new TreeNode(0);
    printEven(root); 
}

  public static void printEven (TreeNode root) {
   if(root != null){
     if(root.data % 2 == 0){
      System.out.print(root.data);
      printEven(root.left);
      printEven(root.right);
   }
   else {
      printEven(root.left);
      printEven(root.right);
    }
   }
  }
}	

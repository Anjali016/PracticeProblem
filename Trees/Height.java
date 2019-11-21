
public class Height {

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
    root.left.left = new TreeNode(9);
    root.left.left.left  = new TreeNode(5);
    root.left.right  = new TreeNode(6);
    root.right  = new TreeNode(3);
    System.out.println(getHeight(root));
  }

  public static int getHeight(TreeNode root) {
    if(root == null) return 0;
    else return 1 + Math.max(getHeight(root.left),getHeight(root.right));

}
}

import java.lang.*;

public class MirrorNode {
 
  public static void main() {

  } 
  
  private static int mirrorNode(TreeNode root, int target, TreeNode mirrorNode) {
    if (root == null || target == null) return Integer.MIN_VALUE;
    else if (root.data  == target ) return mirrorNode.data;
         else return Math.max(
        mirrorNodeUtil(root.left, target, mirrorNode.right),
         mirrorNodeUtil(root.right, target, mirrorNode.left));
  }
 }




}

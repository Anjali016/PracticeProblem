

public class ConstructTree {

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

  public static TreeNode constructTree(int[] preOrder, int[] inOrder, int start, int end){
    if(start > end) return null;
    else {
      TreeNode root = new TreeNode(preOrder[rootIndex]);
      int inIndex = getIndex(preOrder[rootIndex++]);
      TreeNode left = constructTree(preOrder, inOrder, start, index - 1);
      TreeNode right = constructTree(preOrder, inOrder,index + 1 ,endi)
      System.out.print(inOrder[inIndex] + " ");
    return root;
  }

    private int getIndex(int[] inOrder, int key) {
        for (int i = 0; i < inOrder.length; i++) if (inOrder[i] == key) return i;
        return -1;
    };
     }
    
  }





}

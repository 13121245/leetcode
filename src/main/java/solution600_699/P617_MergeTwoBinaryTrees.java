package solution600_699;

/**
 * Created by zjw on 2018/04/18 22:01
 * Description:
 */
public class P617_MergeTwoBinaryTrees {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    private TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        if(t1 == null)  return t2;
        if(t2 == null)  return t1;

        TreeNode node = new TreeNode(t1.val + t2.val);
        node.left = mergeTrees(t1.left, t2.left);
        node.right = mergeTrees(t1.right, t2.right);
        return node;
    }

}

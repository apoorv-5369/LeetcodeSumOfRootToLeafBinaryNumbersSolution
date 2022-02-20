/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int leaf=0;
    public void preOrder(TreeNode root, int current){
        if(root!=null){
            current=(current<<1)|root.val;
            if(root.left==null&&root.right==null) leaf+=current;
            preOrder(root.left, current);
            preOrder(root.right, current);
        }
    }
    public int sumRootToLeaf(TreeNode root) {
        preOrder(root, 0);
        return leaf;
    }
}

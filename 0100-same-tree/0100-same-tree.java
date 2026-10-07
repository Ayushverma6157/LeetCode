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
    public boolean st(TreeNode p,TreeNode q){
        if((p==null && q==null) || (p!=null && q!=null)){
            if((p==null && q==null)) return true;
            return (p.val==q.val)&&(st(p.left,q.left) && st(p.right,q.right));
        }
        else return false;
    }
    public boolean isSameTree(TreeNode p, TreeNode q) {
        return st(p,q);
    }
}
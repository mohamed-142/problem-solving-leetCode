/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public TreeNode result;
    public void helper (final TreeNode original, final TreeNode cloned, final TreeNode target) {
        
        if (original.val == target.val) {
            result = cloned;
        }
        if (original.left != null) {
            getTargetCopy(original.left, cloned.left, target);
        } 
        if (original.right != null) {
            getTargetCopy(original.right, cloned.right, target);
        }
        
        return;
    }
    
    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        helper(original, cloned, target);
        return result;
    }
}
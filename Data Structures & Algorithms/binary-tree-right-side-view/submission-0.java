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
    void helper(TreeNode node , int level, List<Integer> ls){
        if(node == null){
            return;
        }
        if(ls.size() == level){
            ls.add(node.val);
        }
        helper(node.right, level+1, ls);
        helper(node.left, level+1, ls);
    }
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        helper(root, 0, ans);

        return ans;
    }
}

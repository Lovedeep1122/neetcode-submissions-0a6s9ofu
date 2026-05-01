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
     void helper(TreeNode node , List<Integer> ls){
        if(node == null){
            return;
        }

        ls.add(node.val);

        helper(node.left, ls);
        helper(node.right, ls);
    }
    public List<Integer> preorderTraversal(TreeNode root) {
         List<Integer> ans = new ArrayList<>();

        helper(root,ans);
        return ans;
    }
}
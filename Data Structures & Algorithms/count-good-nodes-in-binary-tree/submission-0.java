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
    int helper(TreeNode node, int x){
        
        if(node == null){
            return 0;
        }
int cnt = 0;
        if(node.val >= x){
            cnt = 1;
            x = node.val;
        }

        cnt += helper(node.left, x);
        cnt += helper(node.right, x);

        return cnt;
    }
    public int goodNodes(TreeNode root) {
        
       if(root == null){
        return 0;
       }
       

        return  helper(root, root.val);
    }
}

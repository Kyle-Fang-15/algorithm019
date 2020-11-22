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
    private Map<Integer, Integer> memo;
    
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        memo = new HashMap<>();
        for(int i=0; i<inorder.length; i++){
            memo.put(inorder[i], i);
        }
        return recursion(0, 0, inorder.length-1, preorder, inorder);
    }
    
    private TreeNode recursion(int root, int start, int end, int[] preorder, int[] inorder){
        // return condtion
        if (end<start || root>=preorder.length){
            return null;
        }
        int index = memo.get(preorder[root]);
        if (index<start || index >end){
            return null;
        }
        
        TreeNode node = new TreeNode(preorder[root]);
        TreeNode left = recursion(root +1, start, index -1, preorder, inorder);
        TreeNode right = recursion(root+ index-start+1, index+1, end, preorder, inorder);
        node.left =left;
        node.right = right;
        return node;
    }
}
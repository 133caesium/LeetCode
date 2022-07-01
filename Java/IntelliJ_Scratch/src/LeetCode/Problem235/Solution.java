package LeetCode.Problem235;

import LeetCode.TreeNode;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

public class Solution {
    TreeNode lowestCommonAncestor;

    public void checkIfNodeSplit(TreeNode node, TreeNode p, TreeNode q) {
        if (p.val < node.val && q.val < node.val) {
            checkIfNodeSplit(node.left, p, q);
        }
        else if (p.val > node.val && q.val > node.val) {
            checkIfNodeSplit(node.right, p, q);
        }
        else {lowestCommonAncestor = node;}
    }

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (p.val==root.val || q.val == root.val) { return root;}
        checkIfNodeSplit(root, p, q);
        return lowestCommonAncestor;
    }
}
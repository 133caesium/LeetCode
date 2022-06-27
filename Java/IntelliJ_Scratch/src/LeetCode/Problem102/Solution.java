package LeetCode.Problem102;

import LeetCode.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    List<List<Integer>> output = new ArrayList<List<Integer>>();

    public boolean addChildrenToLevel(TreeNode parent, int level) {
        if (parent.left==null && parent.right==null) {
            return false;
        } else {
            if (output.size()<level+1) {
                output.add(new ArrayList<Integer>());
            }
            if (parent.left!=null) {
                output.get(level).add(parent.left.val);
                addChildrenToLevel(parent.left,level+1);
            }
            if (parent.right!=null) {
                output.get(level).add(parent.right.val);
                addChildrenToLevel(parent.right,level+1);
            }
            return true;
        }
    }

    public List<List<Integer>> levelOrder(TreeNode root) {
        if (root==null) {return output;}
        List<Integer> topLevel = new ArrayList<Integer>();
        topLevel.add(root.val);
        output.add(topLevel);
        addChildrenToLevel(root,1);
        return output;
    }
}

package LeetCode.Problem98;

import LeetCode.TreeNode;

import java.util.ArrayList;

public class Solution {
    ArrayList<Integer> listOfValues = new ArrayList<Integer>();

    public void addChild(TreeNode node) {
        if (node.left!=null) {addChild(node.left);}
        listOfValues.add(node.val);
        if (node.right!=null) {addChild(node.right);}
    }

    public boolean isValidBST(TreeNode root) {
        addChild(root);
        if (listOfValues.size()<=1) {return true;}
        for (int i = 1; i < listOfValues.size(); i++) {
            if(listOfValues.get(i)<=listOfValues.get(i-1)) {
                return false;
            }
        }
        return true;
    }


    public boolean isValidBST_firstDraft(TreeNode root) {
        boolean valid = true;
        if (root.left!=null) {
            if (root.left.val>=root.val) {return false;}
            valid = isValidBST(root.left);
        }
        if (root.right!=null) {
            if (root.right.val<=root.val) {return false;}
            valid = isValidBST(root.right);}
        return valid;
    }
}

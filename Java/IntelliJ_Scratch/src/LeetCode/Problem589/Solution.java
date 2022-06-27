package LeetCode.Problem589;

import LeetCode.Node;

import java.util.ArrayList;
import java.util.List;

//Still took 5 attempts to get the "trivial" recursive case.
//A challenge is to do this with an iterative solution.

public class Solution {

    List<Integer> output = new ArrayList<Integer>();

    public void addChildrenToOutput(Node parent){
        for (Node child:parent.children) {
            output.add(child.val);
            if (child.children!=null) {
                addChildrenToOutput(child);
            }
        }
    }

    public List<Integer> preorder(Node root) {
        if (root!=null) {
            this.output.add(root.val);
            addChildrenToOutput(root);
        }
        return output;
    }
}

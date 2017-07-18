package com.practice;

import sun.reflect.generics.tree.Tree;

/**
 * Created by IK on 2017-07-16.
 */
public class BinaryTreeTraversal {

    public static void main(String[] args) {
        TreeNode a = new TreeNode("+");
        TreeNode b = new TreeNode("*");
        TreeNode c = new TreeNode("E");
        TreeNode d = new TreeNode("*");
        TreeNode e = new TreeNode("D");
        TreeNode f = new TreeNode("/");
        TreeNode g = new TreeNode("C");
        TreeNode h = new TreeNode("A");
        TreeNode i = new TreeNode("B");
        a.setLeft(b);
        a.setRight(c);
        b.setLeft(d);
        b.setRight(e);
        d.setLeft(f);
        d.setRight(g);
        f.setLeft(h);
        f.setRight(i);

        a.infixTraversal();
        System.out.println();
        a.prefixTraversal();
        System.out.println();
        a.suffixTraversal();
    }


}

class TreeNode {
    String value;
    TreeNode left;
    TreeNode right;

    public TreeNode(String v) {
        this.value = v;
    }

    public TreeNode(TreeNode left, String v, TreeNode right) {
        this.value = v;
        this.left = left;
        this.right = right;

    }

    public void setLeft(TreeNode left) {
        this.left = left;
    }

    public void setRight(TreeNode right) {
        this.right = right;
    }

    public void infixTraversal() {
        if (left != null) {
            left.infixTraversal();
        }
        System.out.print(value);
        if (right != null) {
            right.infixTraversal();
        }
    }

    public void prefixTraversal() {
        System.out.print(value);
        if (left != null) {
            left.prefixTraversal();
        }
        if (right != null) {
            right.prefixTraversal();
        }
    }

    public void suffixTraversal() {
        if (left != null) {
            left.suffixTraversal();
        }
        if (right != null) {
            right.suffixTraversal();
        }
        System.out.print(value);
    }
}



package com.mylinkedlist.app;

class TreeNode<T> {
    T data;
    TreeNode<T> left;
    TreeNode<T> right;

    TreeNode(T data) {
        this.data = data;
        left = null;
        right = null;
    }
}

public class getdiameter {

    public static int getDiameter(TreeNode<Integer> root, int[] height) {
        if (root == null) {
            height[0] = 0;
            return 0;
        }

        int[] leftHeight = { 0 };
        int[] rightHeight = { 0 };

        int leftDiameter = getDiameter(root.left, leftHeight);
        int rightDiameter = getDiameter(root.right, rightHeight);

        height[0] = Math.max(leftHeight[0], rightHeight[0]) + 1;

        return Math.max(leftDiameter, Math.max(rightDiameter, leftHeight[0] + rightHeight[0]));
    }

    public static TreeNode<Integer> createTreeFromArray(int[] array) {
        int[] index = { 0 };
        return createTreeFromArrayHelper(array, index);
    }

    private static TreeNode<Integer> createTreeFromArrayHelper(int[] array, int[] index) {
        if (index[0] >= array.length || array[index[0]] == -1) {
            index[0]++;
            return null;
        }

        TreeNode<Integer> root = new TreeNode<>(array[index[0]++]);
        root.left = createTreeFromArrayHelper(array, index);
        root.right = createTreeFromArrayHelper(array, index);

        return root;
    }

    public static int getnumber(int[] array) {
        int[] height = { 0 };
        TreeNode<Integer> root = createTreeFromArray(array);
        return getDiameter(root, height);
    }
}

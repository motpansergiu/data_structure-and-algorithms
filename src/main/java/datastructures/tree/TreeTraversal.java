package datastructures.tree;


import datastructures.queue.Queue;
import datastructures.queue.impl.LinkedListQueue;

public class TreeTraversal {

    private Queue<TreeNode> queue;

    public TreeTraversal() {
        this.queue = new LinkedListQueue<>();
    }

    public void inorder(final TreeNode root) {
        if (root != null) {
            inorder(root.left);
            visit(root);
            inorder(root.right);
        }
    }

    public void preorder(final TreeNode root) {
        if (root != null) {
            visit(root);
            preorder(root.left);
            preorder(root.right);
        }

    }

    public void postorder(final TreeNode root) {
        if (root != null) {
            postorder(root.left);
            postorder(root.right);
            visit(root);
        }
    }

    public void bfs(TreeNode root) {

        if (root == null) {
            return;
        }

        queue.enqueue(root);

        while (!queue.isEmpty()) {
            TreeNode node = queue.dequeue();

            visit(node);

            if (node.left != null) {
                queue.enqueue(node.left);
            }

            if (node.left != null) {
                queue.enqueue(node.right);
            }
        }
    }

    private void visit(final TreeNode node) {
        System.out.print(node.value + " ");
    }
}

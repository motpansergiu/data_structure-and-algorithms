package datastructures.tree;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TreeTraversalTest {

    private TreeNode root;
    private TreeTraversal treeTraversal;

    @BeforeEach
    public void init() {
        root = new TreeNode(10);
        root.left = new TreeNode(5);
        root.right = new TreeNode(15);

        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(7);

        root.right.left = new TreeNode(13);
        root.right.right = new TreeNode(40);

        treeTraversal = new TreeTraversal();
    }

    @Test
    void inorder() {
        System.out.print("\nInOrder: ");
        treeTraversal.inorder(root);
    }

    @Test
    void preorder() {
        System.out.print("\nPreOrder: ");
        treeTraversal.preorder(root);
    }

    @Test
    void postorder() {
        System.out.print("\nPostOrder: ");
        treeTraversal.postorder(root);
    }

    @Test
    void bfs() {
        System.out.print("\nBFS: ");
        treeTraversal.bfs(root);
    }
}
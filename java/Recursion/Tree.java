import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class Tree {

    public static class Node {

        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            left = null;
            right = null;
        }
    }

    public static class BinaryTree {

        public Node buildTree() {
            int data;
            System.out.println("Enter the data: ");
            Scanner sc = new Scanner(System.in);
            data = sc.nextInt();

            if (data == -1) {
                return null;
            }

            Node root = new Node(data);

            System.out.println("Enter the data for left part of " + data);
            root.left = buildTree();

            System.out.println("Enter the data for right part of " + data);
            root.right = buildTree();
            return root;
        }

        public void levelOrderTraversal(Node root) {
            Queue<Node> q = new LinkedList<Node>();
            q.add(root);
            q.add(null);
            while (!q.isEmpty()) {
                Node temp = q.peek();
                q.remove();

                if (temp == null) {
                    System.out.println();
                    if (!q.isEmpty()) {
                        q.add(null);
                    }
                } else {
                    System.out.print(temp.data + " ");
                    if (temp.left != null) {
                        q.add(temp.left);
                    }

                    if (temp.right != null) {
                        q.add(temp.right);
                    }
                }
            }
            System.out.println();
        }

        public void inorderTraversal(Node root) {
            if (root == null) {
                return;
            }

            // LNR
            inorderTraversal(root.left);
            System.out.println(root.data);
            inorderTraversal(root.right);
        }

        public void preorderTraversal(Node root) {
            if (root == null) {
                return;
            }

            // NLR
            System.out.println(root.data);
            preorderTraversal(root.left);
            preorderTraversal(root.right);
        }

        public void postorderTraversal(Node root) {
            if (root == null) {
                return;
            }

            // LRN
            postorderTraversal(root.left);
            postorderTraversal(root.right);
            System.out.println(root.data);
        }

        public int height(Node root) {
            if (root == null) {
                return 0;
            }

            int left = height(root.left);
            int right = height(root.right);

            return Math.max(left, right) + 1;
        }

        public void solve(Node root) {
            if (root == null) {
                return;
            }
            solve(root.right);
            System.out.print(root.data + " ");
            solve(root.right);
            System.out.print(root.data + " ");
        }

    }

    

    public static void main(String[] args) {
        BinaryTree t1 = new BinaryTree();
        Node root = t1.buildTree();
        t1.solve(root);

    }
}

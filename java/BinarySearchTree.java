import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;

public class BinarySearchTree {
    public static class Node {
        public int data;
        public Node left;
        public Node right;

        Node(int data) {
            this.data = data;
            left = null;
            right = null;
        }
    }

    public static Node root;

    public void takeInput() {
        Scanner sc = new Scanner(System.in);
        int data = sc.nextInt();
        while (data != -1) {
            root = insertIntoBST(root, data);
            data = sc.nextInt();
        }
    }

    public Node insertIntoBST(Node root, int data) {
        if (root == null) {
            root = new Node(data);
            return root;
        }

        if (root.data > data) {
            root.left = insertIntoBST(root.left, data);
        } else {
            root.right = insertIntoBST(root.right, data);
        }

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

    public void preOrderTraversal(Node root) {
        if (root == null) {
            return;
        }

        System.out.println(root.data);
        preOrderTraversal(root.left);
        preOrderTraversal(root.right);
    }

    public void inorderTraversal(Node root) {
        if (root == null) {
            return;
        }

        inorderTraversal(root.left);
        System.out.println(root.data);
        inorderTraversal(root.right);
    }

    public void postorderTraversal(Node root) {
        if (root == null) {
            return;
        }

        postorderTraversal(root.left);
        postorderTraversal(root.right);
        System.out.println(root.data);
    }

    public boolean checkNodeInBST(Node root, int target) {
        if (root == null) {
            return false;
        }

        if (root.data == target) {
            return true;
        }

        if (root.data > target) {
            return checkNodeInBST(root.left, target);
        } else {
            return checkNodeInBST(root.right, target);
        }
    }

    public Node findNodeInBST(Node root, int target) {
        if (root == null) {
            return null;
        }

        if (root.data == target) {
            return root;
        }

        if (root.data > target) {
            return findNodeInBST(root.left, target);
        } else {
            return findNodeInBST(root.right, target);
        }
    }

    public int mindata(Node root) {
        Node temp = root;

        if (temp == null) {
            return -1;
        }

        while (temp.left != null) {
            temp = temp.left;
        }

        return temp.data;
    }

    public int maxdata(Node root) {
        Node temp = root;

        if (temp == null) {
            return -1;
        }

        while (temp.right != null) {
            temp = temp.right;
        }

        return temp.data;
    }

    public Node inorderPre(Node root) {
        while (root.left != null) {
            root = root.left;
        }

        return root;
    }

    public Node deleteNode(Node root, int key) {
        if (root == null) {
            return null;
        }

        if (key < root.data) {
            root.left = deleteNode(root.left, key);
        } else if (key > root.data) {
            root.right = deleteNode(root.right, key);
        } else {
            if (root.left == null && root.right == null) {
                return null;
            } else if (root.left != null && root.right == null) {
                return root.left;
            } else if (root.left == null && root.right != null) {
                return root.right;
            } else {
                Node inorderPre = inorderPre(root.right);
                root.data = inorderPre.data;
                root.right = deleteNode(root.right, inorderPre.data);
            }
        }

        return root;
    }

    public Node BSTusingInorder(int[] inorder, int start, int end) {
        if (start > end) {
            return null;
        }

        int mid = start + (end - start) / 2;
        int element = inorder[mid];

        Node root = new Node(element);

        root.left = BSTusingInorder(inorder, start, mid - 1);
        root.right = BSTusingInorder(inorder, mid + 1, end);

        return root;
    }

    public void in(Node root, Node prev) {
        if (root == null) {
            return;
        }

        in(root.left, prev);
        prev.left = null;
        prev.right = root;
        prev = root;
        in(root.right, prev);
    }

    public Node flatten(Node root) {
        Node dummy = new Node(-1);
        Node prev = dummy;
        in(root, prev);
        root.left = null;
        prev.right = null;
        root = dummy.right;
        return root;
    }
    public static void main(String[] args) {
        BinarySearchTree t1 = new BinarySearchTree();
        System.out.println("Enter the data: ");
        t1.takeInput();
        // t1.levelOrderTraversal(root);
        // System.out.println(t1.findNodeInBST(root, 69));
        // System.out.println(t1.mindata(root));
        // System.out.println(t1.maxdata(root));
        // t1.deleteNode(root, 150);
        // int a = Integer.MIN_VALUE;
        // t1.flatten(root);
        // t1.levelOrderTraversal(root);
        t1.postorderTraversal(root);
    }
}

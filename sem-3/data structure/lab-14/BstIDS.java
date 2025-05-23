class BinarySearchTree {
    class Node {
        int key;
        Node left;
        Node right;

        public Node(int data) {
            this.key = data;
            this.left = null;
            this.right = null;
        }
    }

    Node root;

    public BinarySearchTree() {
        root = null;
    }

    void preOrder(Node root) {
        if (root == null) {
            System.out.println("empty");
            return;
        }
        System.out.print(root.key + " ");
        if (root.left != null) {
            preOrder(root.left);
        }
        if (root.right != null) {
            preOrder(root.right);
        }
        return;
    }

    void inOrder(Node root) {
        if (root == null) {
            System.out.println("empty");
            return;
        }
        if (root.left != null) {
            inOrder(root.left);
        }
        System.out.print(root.key + " ");
        if (root.right != null) {
            inOrder(root.right);
        }
        return;
    }

    void postOrder(Node root) {
        if (root == null) {
            System.out.println("empty");
            return;
        }
        if (root.left != null) {
            postOrder(root.left);
        }
        if (root.right != null) {
            postOrder(root.right);
        }
        System.out.print(root.key + " ");
        return;
    }


    void insertInBTS(int x) {
        Node newNode = new Node(x);
        if (root == null) {
            root = newNode;
        } else {
            Node temp = root;
            Node parent = null;

            while (temp != null) {
                parent = temp;
                if (x < temp.key) {
                    temp = temp.left;
                } else {
                    temp = temp.right;
                }
            }

            if (x < parent.key) {
                parent.left = newNode;
            } else {
                parent.right = newNode;
            }
        }
    }

    // Node insertRecord(Node root, int data) {
        // if (root == null) {
        //     root = new Node(data);
        //     return root;
        // }
        // if (data < root.key) {
        //     root.left = insertRecord(root.left, data);
        // } else {
        //     root.right = insertRecord(root.right, data);
        // }
        // return root;
    // }

    Node deleteNode(Node root, int data) {
        if (root == null)
            return root;

        if (data < root.key)
            root.left = deleteNode(root.left, data);
        else if (data > root.key)
            root.right = deleteNode(root.right, data);

        else {
            if (root.left == null)
                return root.right;
            else if (root.right == null)
                return root.left;

            root.key = minValue(root.right);

            root.right = deleteNode(root.right, root.key);
        }

        return root;
    }
    int minValue(Node root) {
        int minv = root.key;
        while (root.left != null) {
            minv = root.left.key;
            root = root.left;
        }
        return minv;
    }

    boolean searchRec(int x) {
        Node temp = root;
        while (temp != null) {
            if (x == temp.key) {
                return true;
            } else if (x < temp.key) {
                temp = temp.left;
            } else {
                temp = temp.right;
            }
        }
        return false;
    }

    boolean searchRec(Node root, int data) {
        if (root == null)
            return false;
        else if (data == root.key)
            return true;
        else if (data > root.key)
            return searchRec(root.right, data);
        else
            return searchRec(root.left, data);
    }

    void inO() {
        inOrder(root);
    }

    void preO() {
        preOrder(root);
    }

    void postO() {
        postOrder(root);
    }
}

public class BstIDS {
    public static void main(String[] args) {
        BinarySearchTree b = new BinarySearchTree();
        b.insertInBTS(50);
        b.insertInBTS(30);
        b.insertInBTS(20);
        b.insertInBTS(40);
        b.insertInBTS(70);
        b.insertInBTS(60);
        b.insertInBTS(80);
        b.insertInBTS(35);
        b.insertInBTS(45);
        b.insertInBTS(31);
        b.preO();
        System.out.println("");
        b.inO();
        System.out.println("");
        b.postO();
        b.deleteNode(b.root, 30);
        System.out.println("");
        b.preO();
        System.out.println("");
        b.inO();
        System.out.println("");
        b.postO();
        System.out.println("");
        System.out.println(b.searchRec(60));
    }
}

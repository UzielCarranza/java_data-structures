package DataStructures.LinkedList_Trees;

public class Assign3PartB {
    public static void main(String[] args) {
        PartB part2 = new PartB();
        part2.partB();
        part2.section2();

        System.out.println("\n");
        Assign3PartB OuterObj = new Assign3PartB();
        Assign3PartB.BinaryTree tree = OuterObj.new BinaryTree();
        tree.CreatePartB();
    }


    //***Node is a nested class for the purposes of keeping the code to one .java file
    public class NodePartB {
        public NodePartB left;
        public NodePartB right;
        public int value;

        public NodePartB(int value) {
            this.value = value;
        }
    }

    //***BinaryTree is a nested class for the purposes of keeping the code to one .java file
    public class BinaryTree {
        public void CreatePartB() {
            NodePartB rootnode = new NodePartB(50);
            insert(rootnode, 30);
            insert(rootnode, 45);
            insert(rootnode, 12);
            insert(rootnode, 29);
            System.out.printf("The contents of the binary tree are: \n");
            traverse(rootnode);
        }

        public void traverse(NodePartB rootnode) {
            System.out.println("in preorder");
            printPreOrder(rootnode);
            System.out.println("\n");
            System.out.println(" in order");
            printInOrder(rootnode);
            System.out.println("\n");
            System.out.println(" in post order");
            printPostOrder(rootnode);
        }

        public void insert(NodePartB node, int value) {
            if (value < node.value) {
                if (node.left != null) {
                    insert(node.left, value);
                } else {
                    //Console.WriteLine(" Inserted " + value + " to left of node " + node.value);
                    node.left = new NodePartB(value);
                }
            } else if (value > node.value) {
                if (node.right != null) {
                    insert(node.right, value);
                } else {
                    //Console.WriteLine(" Inserted " + value + " to right of node " + node.value);
                    node.right = new NodePartB(value);
                }
            }
        }


        public void printPreOrder(NodePartB node) {
            if (node != null) {
                printPreOrder(node.left);
                System.out.printf(" Traversed " + node.value + "\n");
                printPreOrder(node.right);
            }
        }

        public void printInOrder(NodePartB node) {
            if (node != null) {

                printInOrder(node.left);
                System.out.printf(" Traversed " + node.value + "\n");
                printInOrder(node.right);

            }

        }

        public void printPostOrder(NodePartB node) {
            if (node != null) {

                printPostOrder(node.right);
                printPostOrder(node.left);
                System.out.printf(" Traversed " + node.value + "\n");
            }
        }

    }
}

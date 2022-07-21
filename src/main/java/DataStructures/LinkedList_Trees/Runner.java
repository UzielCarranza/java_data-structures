package DataStructures.LinkedList_Trees;

public class Runner {
    public static void main(String[] args) {
        PartB part2 = new PartB();
        part2.partB();
        part2.section2();

//        Assign3 OuterObj = new Assign3();
//        Assign3.BinaryTree myTree = OuterObj.new BinaryTree();
//        myTree.Create();


        Runner OuterObj = new Runner();
        Runner.BinaryTree tree = OuterObj.new BinaryTree();
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
            NodePartB rootnode = new NodePartB(1);
            insert(rootnode, 2);
            insert(rootnode, 3);
//            insert(rootnode, 12);
//            insert(rootnode, 29);
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


                System.out.printf(" Traversed " + node.value + "\n");
                printPostOrder(node.right);
                printPostOrder(node.left);

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

package DataStructures.LinkedList_Trees;


import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.Iterator;
import java.util.SortedSet;
import java.util.LinkedList;


class Assign3
{


    public static void main(String[] args)
    {
        //*********************************************************
        //****Assignment 3, Part A, Section 1
        //*********************************************************
        System.out.printf("\n");
        System.out.printf("**********Section 1 **********\n");
        System.out.printf("\n");
        System.out.printf("\n");

        String[] professions = new String[] { "Software Engineer", "Programmer", "Database Admin", "Network Admin", "Web Developer", "Program Manager" };

        HashSet<String> setprofessions = new HashSet<String>();
        try
        {
            for (int i = 0; i < professions.length; i++)
            {
                setprofessions.add(professions[i]);
            }
            System.out.printf("Original List: ");
            System.out.printf("[");
            for (int i = 0; i < professions.length; i++)
            {
                System.out.printf(professions[i]);
                if (i == professions.length - 1)
                {
                    System.out.printf("] \n");
                }
                else
                {
                    System.out.printf(", ");
                }
            }
            System.out.printf("\n");
            System.out.printf("\n");
            System.out.printf("Sorted List: ");

            SortedSet<String> sortedProfessions = new TreeSet<String>(setprofessions);
            System.out.printf("[");

            Iterator<String> jobs = sortedProfessions.iterator();
            while (jobs.hasNext())
            {
                System.out.printf(jobs.next());
                if (jobs.hasNext())
                    System.out.printf(", ");
            }
            System.out.printf("]");
        }
        catch (Exception ex)
        {
            System.out.printf("Error: " + ex);
        }


        //*********************************************************
        //****Assignment 3, Part A, Section 2
        //*********************************************************
        System.out.printf("\n");
        System.out.printf("\n");
        System.out.printf("**********Section 2 **********");
        System.out.printf("\n");
        System.out.printf("\n");

        LinkedList<String> lstbooks = new LinkedList<String>();
        lstbooks.add("To Kill a Mockingbird");
        lstbooks.add("Huckleberry Finn");
        lstbooks.add("Pride and Prejudice");
        lstbooks.add("Brave New World");
        lstbooks.add("Lord of the Flies");
        lstbooks.add("Alice in Wonderland");
        lstbooks.add("The Old Man and the Sea");
        lstbooks.add("Atlas Shrugged");

        System.out.printf("Original Book List: ");
        DisplayList(lstbooks);
        System.out.printf("\n");

        Collections.sort(lstbooks); //sort the list

        System.out.printf("Sorted Book List: ");
        DisplayList(lstbooks);
        System.out.printf("\n");

        lstbooks.remove(1);//remove second item from list
        lstbooks.remove(0); //remove first item from list
        lstbooks.remove(lstbooks.size() - 1);//remove last item from list

        System.out.printf("Book List After Deletions: ");
        DisplayList(lstbooks);
        System.out.printf("\n");

        System.out.printf("The number of items in my book list is: " + lstbooks.size() + "\n");
        System.out.printf("\n");

        int index = lstbooks.indexOf("Brave New World"); //look for this title

        if (index != -1)
        {
            System.out.printf("Brave New World is in the list.");
        }
        else
        {
            System.out.printf("Brave New World is not in the list.");
        }

        //*********************************************************
        //****Assignment 3, Part A, Section 3
        //*********************************************************
        System.out.printf("\n");
        System.out.printf("\n");
        System.out.printf("**********Section 3 **********");
        System.out.printf("\n");
        System.out.printf("\n");

        //creates a new binary tree object
        //the .Create() method will initialize the tree and print its contents
        //the create() method for this example contains the values that will be added to the tree.
        //BinaryTree and Node are nested classes for the sake of keeping this code in one .java file.
        //See the following resource on Nested Classes and how to instantiate them
        //https://docs.oracle.com/javase/tutorial/java/javaOO/nested.html

        Assign3 OuterObj = new Assign3();
        BinaryTree myTree = OuterObj.new BinaryTree();
        myTree.Create();

    }

    static void DisplayList(LinkedList<String> lst)
    {
        System.out.printf("[");
        for (int i = 0; i < lst.size(); i++)
        {
            System.out.printf(lst.get(i));
            if (i != lst.size() - 1)
                System.out.printf(", ");
        }
        System.out.printf("]");
        System.out.printf("\n");
    }

    //***Node is a nested class for the purposes of keeping the code to one .java file
    public class Node
    {
        public Node left;
        public Node right;
        public int value;
        public Node(int value)
        { this.value = value; }
    }

    //***BinaryTree is a nested class for the purposes of keeping the code to one .java file
    public class BinaryTree
    {
        public void Create()
        {
            Node rootnode = new Node(50);
            insert(rootnode, 30);
            insert(rootnode, 45);
            insert(rootnode, 12);
            insert(rootnode, 29);
            System.out.printf("The contents of the binary tree are: \n");
            traverse(rootnode);
        }

        public void traverse(Node rootnode)
        {
            printInOrder(rootnode); // printInOrder uses recursion to traverse the tree
        }

        public void insert(Node node, int value)
        {
            if (value < node.value)
            {
                if (node.left != null)
                {
                    insert(node.left, value);
                }
                else
                {
                    //Console.WriteLine(" Inserted " + value + " to left of node " + node.value);
                    node.left = new Node(value);
                }
            }
            else if (value > node.value)
            {
                if (node.right != null) { insert(node.right, value); }
                else
                {
                    //Console.WriteLine(" Inserted " + value + " to right of node " + node.value);
                    node.right = new Node(value);
                }
            }
        }

        public void printInOrder(Node node)
        {
            if (node != null)
            {
                printInOrder(node.left);
                System.out.printf(" Traversed " + node.value + "\n");
                printInOrder(node.right);
            }
        }

    }

}


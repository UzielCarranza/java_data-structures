package DataStructures.LinkedList_Trees;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.SortedSet;
import java.util.TreeSet;


public class PartB {

    public PartB() {
    }


    public void partB() {
        System.out.println("--------PART B-----");

//        Define an array called mammals that contains 6 strings
        String[] mammals = new String[]{"Bear", "Gorilla", "Tiger", "Polar Bear", "Lion", "Monkey"};


//        Implement a Set called setMammals and populate the set from the array called mammals.
        HashSet<String> setMammals = new HashSet<String>();
        System.out.println("\n");
        System.out.println("*********** Section: 1 ***********");
        System.out.println("\n");
        System.out.println("Contents of the sorted set are:");
        try {
            for (String mammal : mammals) {
                setMammals.add(mammal);
            }


//            print a list of every element in the set.
            for (String mammal : setMammals) {
                System.out.print(mammal + ", ");
            }


            System.out.println("\n");

//            Create a new set called sortedMammals derived from the setMammals set
            SortedSet<String> sortedMammals = new TreeSet<String>(setMammals);


            System.out.println("Contents of the sorted set are");


//            On a new line, print a list of every element in the sorted set.
            for (String mammal : sortedMammals) {
                System.out.print(mammal + ", ");
            }
            System.out.println("\n");
            System.out.println("he first item in the set is: ");
            System.out.println(sortedMammals.first());
            System.out.println("\n");
            System.out.println("The last item in the set is:");
            System.out.println(sortedMammals.last());

        } catch (Exception ex) {

            System.out.println(ex);
        }
    }

    public void section2() {
        LinkedList<String> myFriends = new LinkedList<String>();
        try {
//            "Add the following friends’ names and phone numbers to myFriends"
            myFriends.add("Fred 602-299-3300");
            myFriends.add("Ann 602 - 555 - 4949");
            myFriends.add("Grace 520-544-9898");
            myFriends.add("Sam 602-343-8723");
            myFriends.add("Dorothy 520-689-9745");
            myFriends.add("Susan 520-981-8745");
            myFriends.add("Bill 520-456-9823");
            myFriends.add("Mary 520-788-3457");

            System.out.println("\n");
            System.out.println("********* Section: 2 **********");
            System.out.println("\n");
            System.out.println("The contents of my friends list:");
            System.out.println("\n");
            for (String friend : myFriends) {
//                Print the list of items from the linked list with each friend on a new line.
                System.out.println(friend + ", ");
            }

//            Remove Bill from the list.
            myFriends.remove(myFriends.size() - 2);

//             Sort the list then remove the first and last elements from the list.

//            Sort the list then remove the first and last elements from the list.
            System.out.println("\n");
            System.out.println("sorted list: " + "\n");
            SortedSet<String> sortedFriend = new TreeSet<String>(myFriends);
            for (String friend : sortedFriend) {
                System.out.println(friend + ", ");
            }
//            myFriends.remove(0);
//            myFriends.remove(myFriends.size() - 1);
            System.out.println("\n");
            System.out.println("removing first and last index");
            System.out.println("\n");
            sortedFriend.remove("Ann 602 - 555 - 4949");
            sortedFriend.remove("Susan 520-981-8745");
            for (String friend : sortedFriend) {
                System.out.println(friend);
            }

            sortedFriend.remove("Mary 520-788-3457");
            sortedFriend.add("Mary 520-897-4567");
            System.out.println("\n");
            System.out.println("updating Mary's phone number");
            for (String friend : sortedFriend) {
                System.out.println(friend);
            }


        } catch (Exception ex) {
            System.out.println(ex);
        }
    }


}
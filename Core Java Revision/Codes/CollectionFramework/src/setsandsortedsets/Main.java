package setsandsortedsets;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

// Set and SortedSet
public class Main {
    public static void main(String[] args) {
        // Recommended
        Set<String> mySet = new HashSet<>();

        // Not Recommended
        HashSet<String> mySet2 = new HashSet<>();

        mySet.add("Anurag");
        mySet.add("Sachin");
        mySet.add("Vikas");
        mySet.add("Sachin");

        System.out.println(mySet);

        mySet.remove("Vikas");
        mySet.add("Abhishek");

        System.out.println(mySet);

        SortedSet<String> mySortedSet = new TreeSet<>();

        mySortedSet.add("Anurag");
        mySortedSet.add("Sachin");
        mySortedSet.add("Vikas");
        mySortedSet.add("Abhishek");

        System.out.println(mySortedSet);

        mySortedSet.remove("Abhishek");
        mySortedSet.add("Ashish");

        mySortedSet.add("Zoya");

        System.out.println(mySortedSet);
    }
}

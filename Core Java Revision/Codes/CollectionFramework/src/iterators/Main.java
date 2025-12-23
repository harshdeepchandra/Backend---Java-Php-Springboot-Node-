package iterators;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> myList = new ArrayList<>();

        myList.add("Anurag");
        myList.add("Sachin");
        myList.add("Abhishek");
        myList.add("Aditya");
        myList.add("Amar");
        myList.add("Rihan");
        myList.add("Sakshi");
        myList.add("Vatsala");

        System.out.println(myList);

        System.out.println("====Using For Loop====");

        for(int i = 0; i < myList.size(); i++) {
            System.out.println(myList.get(i));
        }

        System.out.println("====Using Foreach Loop====");

        // for-each loop
        for(String student : myList) {
            System.out.println(student);
        }

        System.out.println("====Using Iterator====");

        Iterator<String> itr = myList.iterator();
        while(itr.hasNext()) {
            System.out.println(itr.next());
        }

        System.out.println(itr.hasNext());
        System.out.println(itr.next());

    }
}

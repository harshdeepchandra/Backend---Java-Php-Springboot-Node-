package lists;

import java.util.LinkedList;
import java.util.List;

// LinkedList
public class Main2 {
    public static void main(String[] args) {
        List<Integer> myList = new LinkedList<>();

        myList.add(5);
        myList.add(5);
        myList.add(7);

        System.out.println(myList);
        System.out.println(myList.size());

        System.out.println(myList.get(0));

        myList.set(1, 6);
        System.out.println(myList);

        myList.remove(2);
        System.out.println(myList);

        System.out.println(myList.getFirst());
        System.out.println(myList.getLast());

    }
}

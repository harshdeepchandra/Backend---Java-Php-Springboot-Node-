package lists;

import java.util.ArrayList;
import java.util.List;

// ArrayList
public class Main {
    public static void main(String[] args) {
        List<Long> myList = new ArrayList<>();

        ArrayList<Long> myList2 = new ArrayList<>();

        System.out.println(myList);
        myList.add(5L);
        myList.add(7L);
        myList.add(11L);
        myList.add(7L);

        System.out.println(myList);

        System.out.println(myList.get(3));

        myList.remove(0);
        myList.add(0, 23L);

        myList.add(3, 16L);
        System.out.println(myList);

        myList.set(3, 15L);

        System.out.println(myList);

//        myList.remove(Long.valueOf(11));

        System.out.println(myList.indexOf(11L));

        myList.remove(11L);

        // It treats number as Index value (you have to pass it as an object)
//        myList.remove(11);
        System.out.println(myList);

    }
}

package maps;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<Long, String> studentMap = new HashMap<>();

        studentMap.put(1L, "Abhishek");
        studentMap.put(2L, "Vikas");
        studentMap.put(3L, "Anurag");

        System.out.println(studentMap);

        studentMap.put(3L, "Sachin");

        System.out.println(studentMap.get(3L));

        studentMap.remove(3L);

        System.out.println(studentMap);

        studentMap.put(10L, "Vikas");

        System.out.println(studentMap);

        List<String> studentList = new LinkedList<>(studentMap.values());

        System.out.println(studentList);

        Set<String> studentSet = new HashSet<>(studentMap.values());

        System.out.println(studentSet);

        SortedSet<String> studentSortedSet = new TreeSet<>(studentMap.values());

        System.out.println(studentSortedSet);

        SortedSet<Long> studentRollNoSortedSet = new TreeSet<>(studentMap.keySet());

        System.out.println(studentRollNoSortedSet);
    }
}

package MapExamplesclass;

import java.util.TreeMap;
import java.util.Map;

public class TreeMapExample {
    public static void main(String[] args) {
        Map<Integer, String> map1 = new TreeMap<>();
        map1.put(59, "HARSHINI");
        map1.put(57, "HARINI");
        map1.put(94, "Monisha");
        map1.put(110, "Pavithra");
        map1.put(58, "HARSHINI");
        map1.put(59, "HARINI");
        System.out.println("map1 contains: " + map1);
        map1.remove(58);
        System.out.println("After 58 is removed, map1 contains: " + map1);
        System.out.println("Traversing using forEach loop");
        for(Map.Entry m1 : map1.entrySet()) {
            System.out.println(m1.getKey() + ": " + m1.getValue());
        }
    }
}

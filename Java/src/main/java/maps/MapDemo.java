package maps;

import java.util.*;

public class MapDemo {

    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();

        map.put("Two", 2);
        map.put("One", 1);
        System.out.println("Contains the key \"Two\": " + map.containsKey("Two"));
        map.remove("Two");
        System.out.println("Contains the key \"Two\": " + map.containsKey("Two"));
        System.out.println(map.getOrDefault("Two", -1));
        System.out.println(map.getOrDefault("One", -1));
        map.replace("Four", 4);
        map.put("Three", 3);
        map.replace("One", 287);
        System.out.println("Contains value 287:\t" + map.containsValue(287));
        System.out.println(map.entrySet());
        //how can we print just the values?
        List<Integer> sortedValues = new ArrayList<Integer>(map.values());
        Collections.sort(sortedValues);
        System.out.println("Values from map:\t" + map.values());
        System.out.println("Sorted values:\t" + sortedValues);
    }
}

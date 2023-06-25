package activities;

import java.util.HashMap;
import java.util.Map;

public class Activity11 {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Red");
        map.put(2, "Green");
        map.put(3, "Blue");
        map.put(4, "Yellow");
        map.put(5, "Pink");
        map.put(6, "Violet");
        System.out.println("Original HashMap Value:" + map);
        map.remove(4);
        System.out.println("After removing the map value" + map);
        if (map.containsValue("Green")) {
            System.out.println("Green color is present in the map:" + map.containsValue("Green"));
        } else {
            System.out.println("Green color is not present in the map");
        }

        System.out.println("Size of the map:" + map.size());
    }
}

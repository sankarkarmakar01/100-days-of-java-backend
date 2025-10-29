package four;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
        Map<Integer, String> userMap = new HashMap<>();
        userMap.put(1,"Alice");
        userMap.put(2,"Bob");
        userMap.put(3,"Chi");
        System.out.println("User with id 1: " + userMap.get(2));

        System.out.println("All Users: ");
        for (Map.Entry<Integer, String> entry: userMap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}

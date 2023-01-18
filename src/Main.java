import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<String, Integer>();
            map.put("A", 1);
            map.put("B", 2);
            map.put("C", 3);
            map.put("A", 3);

        System.out.println("Key 출력 " + map.keySet());
        System.out.println("A의 value 값 : " + map.get("A"));

            for(String key : map.keySet())
                System.out.println(key + ":" +map.get(key));


    }
}
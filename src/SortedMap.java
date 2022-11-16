import java.util.*;

public class SortedMap {
    public static Map<Integer, String> map = new TreeMap<>();
    public static Random random = new Random();

    public static void main(String[] args) {
        for (int i =0 ; i< 10; i++){
            map.put(i, String.format("%d", random.nextInt()));
        }
        System.out.println(map);
    }
}

import java.util.HashMap;
import java.util.Random;

public class SortedMap {
    public static HashMap<Integer, String> map= new HashMap<>(10);
    public static Random random = new Random();

    public static void main(String[] args) {
        for (int i =0 ; i< 10; i++){
            map.put(i, intToString(random.nextInt()));
        }
        System.out.println(map);
    }

    public static String intToString(int i){
        return String.format("%d", i);
    }
}

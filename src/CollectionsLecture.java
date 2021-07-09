
import java.util.HashMap;

public class CollectionsLecture {
    public static void main(String[] args) {
        HashMap<Integer, String> myHashMap = new HashMap<>();

        for (int i = 0; i < 11; i += 2) {
            myHashMap.put(i, "This is value " + i);
        }
        System.out.println(myHashMap);
    }

}

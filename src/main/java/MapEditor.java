import java.util.Map;
import java.util.Set;

public class MapEditor<K> {

    public void cleanMap(Map<K, ?> map, Set<String> fieldsToCleanup, Set<String> fieldsToOutput) {
        boolean bol = false;
        for (String field : fieldsToCleanup) {
            if (map.containsKey(field)) {
            } else {
                bol = true;
            }
        }
        if (bol == true){
            throw new IllegalArgumentException("В мапе " + map.getClass().getName() + " нет нужных ключей");
        } else {
            for (String field : fieldsToCleanup) {
                if (map.containsKey(field)) {
                    System.out.println(map.containsKey(field));
                    map.remove(field);
                }
            }
        }
    }
}

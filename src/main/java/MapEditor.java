import java.util.Map;
import java.util.Set;

/**
 * Класс выполняет сравнение ключами Map
 */

public class MapEditor {

    public void cleanMap(Map<String, ?> map, Set<String> fieldsToCleanup, Set<String> fieldsToOutput) {

        for (String field : fieldsToCleanup) {
            if (!map.containsKey(field)) {
                throw new IllegalArgumentException("В мапе отсутствют нужные ключи");
            }
        }

        for (String field : fieldsToOutput) {
            if (!map.containsKey(field)) {
                throw new IllegalArgumentException("В мапе отсутствют нужные ключи");
            }
        }


        for (String field : fieldsToCleanup) {
            map.remove(field);

        }
        for (String field : fieldsToOutput) {
            System.out.println(map.get(field));
        }
    }

}


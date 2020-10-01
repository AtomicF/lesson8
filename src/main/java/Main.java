import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Если args[0] = 0, то программа читает с
 */
public class Main {
    public static void main(String[] args) throws IllegalAccessException {

        Person person = new Person();
        CleanerAndConverter cleanerAndConverter = new CleanerAndConverter();

        Map<String, Integer> mapa = new HashMap<>();
        mapa.put("age", 33);
        mapa.put("name", 12);
        mapa.put("sex", 23);

        Set<String> fieldsToCleanup = new HashSet<>();
        fieldsToCleanup.add("age");
        fieldsToCleanup.add("name");
        fieldsToCleanup.add("sex");

        Set<String> fieldsToOutput = new HashSet<>();
        fieldsToOutput.add("age");
        fieldsToOutput.add("name");
        fieldsToOutput.add("sex");

        if (args[0].equals("0")) {
            cleanerAndConverter.cleanup(mapa, fieldsToCleanup, fieldsToOutput);
        } else {
            cleanerAndConverter.cleanup(person, fieldsToCleanup, fieldsToOutput);
        }
    }
}
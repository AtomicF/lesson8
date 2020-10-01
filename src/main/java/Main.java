import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws IllegalAccessException {
        Person person = new Person();

        Map<String, Integer> mapa = new HashMap<>();
        mapa.put("Bob", 33);
        mapa.put("Venera", 12);
        mapa.put("Richard", 23);
        mapa.put("Bill", 24);
        mapa.put("Jess", 21);


        Set<String> fieldsToCleanup = new HashSet<>();
        fieldsToCleanup.add("age");
        fieldsToCleanup.add("name");
        fieldsToCleanup.add("sex");

        Set<String> fieldsToOutput = new HashSet<>();
        fieldsToOutput.add("age");
        fieldsToOutput.add("sex");
        fieldsToOutput.add("weight");

        CleanerAndConverter cleanerAndConverter = new CleanerAndConverter();
        cleanerAndConverter.cleanup(person, fieldsToCleanup, fieldsToOutput);
    }
}
package parameters;

import java.util.HashSet;
import java.util.Set;

public class SecondParameter {
    Set<String> fieldsToCleanup = new HashSet<>();

    private Set<String> replenish() {
        fieldsToCleanup.add("age");
        fieldsToCleanup.add("name");
        fieldsToCleanup.add("sex");
        return fieldsToCleanup;
    }
}

package parameters;

import java.util.HashSet;
import java.util.Set;

public class ThirdParameter {
    Set<String> fieldsToOutput = new HashSet<>();
    private Set<String> print() {
        fieldsToOutput.add("age");
        fieldsToOutput.add("sex");
        fieldsToOutput.add("weight");
        return fieldsToOutput;
    }
}
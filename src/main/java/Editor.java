import java.util.Set;

public interface Editor {

    void cleanup(Object object, Set<String> fieldsToCleanup, Set<String> fieldsToOutput);
}

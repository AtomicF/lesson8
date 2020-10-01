import java.util.Map;
import java.util.Set;

public class CleanerAndConverter implements Editor {

    MapEditor mapEditor = new MapEditor();
    ObjectEditor objectEditor = new ObjectEditor();

    @Override
    public void cleanup(Object firstParameter, Set<String> fieldsToCleanup, Set<String> fieldsToOutput) {
        if (firstParameter instanceof Map) {
            mapEditor.cleanMap((Map) firstParameter, fieldsToCleanup, fieldsToOutput);
        } else {
            objectEditor.cleanObject(firstParameter, fieldsToCleanup, fieldsToOutput);
        }
    }
}

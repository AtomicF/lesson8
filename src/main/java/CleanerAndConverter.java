import java.util.Map;
import java.util.Set;

public class CleanerAndConverter implements Editor {

    @Override
    public void cleanup(Object firstParameter, Set<String> fieldsToCleanup, Set<String> fieldsToOutput) {
        if (firstParameter instanceof Map) {
            MapEditor mapEditor = new MapEditor();
            mapEditor.cleanMap((Map) firstParameter, fieldsToCleanup, fieldsToOutput);
        } else {
            ObjectEditor objectEditor = new ObjectEditor();
            objectEditor.cleanMap(firstParameter, fieldsToCleanup, fieldsToOutput);
        }
    }
}

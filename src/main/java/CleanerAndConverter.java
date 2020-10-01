import java.util.Map;
import java.util.Set;

public class CleanerAndConverter implements Editor {

    MapEditor mapEditor = new MapEditor();
    ObjectEditor objectEditor = new ObjectEditor();

    /**
     *
     * @param firstParameter - объект поля которого сравнивается с каждым каждым значением множеств fieldsToCleanup и fieldsToOutput,
     *                       если передаваемый объект имеет тип Map, то каждый ключ сравнивается с каждым каждым
     *                       значением множеств fieldsToCleanup и fieldsToOutput
     * @param fieldsToCleanup - при работе с объектом "не map" поля перечисленные в этом Set при наличии совпадений устанавливаются в значения по умолчанию
     *                        при работе с map ключи перечисленные в этом Set при наличии совпадений удаляются
     * @param fieldsToOutput - при совпадении со значениями этого Set поля/ключи выводятся на консоль
     */
    @Override
    public void cleanup(Object firstParameter, Set<String> fieldsToCleanup, Set<String> fieldsToOutput) {
        if (firstParameter instanceof Map) {
            mapEditor.cleanMap((Map) firstParameter, fieldsToCleanup, fieldsToOutput);
        } else {
            objectEditor.cleanObject(firstParameter, fieldsToCleanup, fieldsToOutput);
        }
    }
}

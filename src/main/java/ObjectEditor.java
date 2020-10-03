import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * Класс выполняет сравнение с полями объекта
 */
public class ObjectEditor {

    public void cleanObject(Object object, Set<String> fieldsToCleanup, Set<String> fieldsToOutput) {
        Field[] fields = object.getClass().getDeclaredFields();

        List<String> names = new ArrayList<>();
        Arrays.stream(fields).sequential().map(Field::getName).collect(Collectors.toCollection(() -> names));
        for (String field : fieldsToCleanup) {
            if (!names.contains(field)) {
                throw new IllegalArgumentException("В объекте отсутствуют нужные поля");
            }
        }

        for (String field : fieldsToOutput) {
            if (!names.contains(field)) {
                throw new IllegalArgumentException("В объекте отсутствуют нужные поля");
            }
        }

        for (Field field : fields) {
            field.setAccessible(true);
            if (fieldsToCleanup.contains(field.getName())) {
                defaultValue(object, field);
            }
            if (fieldsToOutput.contains(field.getName())) {
                try {
                    System.out.println(field.getName() +" = " + valueToString(object, field));
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /**
     * Метод определяет тип поля и выставляет его дефолтное значение
     * @param object - объект, поля которого проверяются
     * @param field - поле в которое устанавливается значение по умолчанию
     */
    private void defaultValue(Object object, Field field) {
        try {
            switch (field.getType().toString()) {
                case "int":
                    field.setInt(object, 0);
                    break;
                case "short":
                    field.setShort(object, (short) 0);
                    break;
                case "byte":
                    field.setByte(object, (byte) 0);
                    break;
                case "long":
                    field.setLong(object, 0);
                    break;
                case "float":
                    field.setFloat(object, 0);
                    break;
                case "double":
                    field.setDouble(object, 0);
                    break;
                case "char":
                    field.setChar(object, (char) 0);
                    break;
                case "boolean":
                    field.setBoolean(object, false);
                    break;
                default:
                    field.set(object, null);
                    break;
            }
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }

    /**
     * Метод определяет тип переменной строки и преобразует его в строковый тип
     * @param object - объект, поля которого проверяются
     * @param field - поле которое преобразуется в строку
     * @return - возвращает строку в зависимости от типа поля
     * @throws IllegalAccessException
     */
    private String valueToString(Object object, Field field) throws IllegalAccessException {
        switch (field.getClass().getTypeName()) {
            case "int":
                return String.valueOf(field.getInt(object));
            case "short":
                return String.valueOf(field.getShort(object));
            case "byte":
                return String.valueOf(field.getByte(object));
            case "long":
                return String.valueOf(field.getLong(object));
            case "float":
                return String.valueOf(field.getFloat(object));
            case "double":
                return String.valueOf(field.getDouble(object));
            case "char":
                return String.valueOf(field.getChar(object));
            case "boolean":
                return String.valueOf(field.getBoolean(object));
            default:
                Object val = field.get(object);
                if (val != null) {
                    return val.toString();
                } else {
                    return "null";
                }
        }
    }
}
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.Set;

public class ObjectEditor {

    public void cleanMap(Object object, Set<String> fieldsToCleanup, Set<String> fieldsToOutput) {
        Field[] fields = object.getClass().getDeclaredFields();
        for (Field field : fields) {
            Class type = field.getType();
            defaultValue(object, field, type);

        }
        

    }

    private void defaultValue(Object object, Field field, Type type) {
        try {
            switch (field.getClass().getTypeName()) {
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


}

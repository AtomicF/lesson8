import parameters.SecondParameter;
import parameters.ThirdParameter;

import java.lang.reflect.Field;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IllegalAccessException {
        Person person = new Person();
        SecondParameter secondParameter = new SecondParameter();
        ThirdParameter thirdParameter = new ThirdParameter();


        CleanerAndConverter cleanerAndConverter = new CleanerAndConverter();
        cleanerAndConverter.cleanup(person, secondParameter, thirdParameter);


//        SecondParameter secondParameter = new SecondParameter();
//        ThirdParameter thirdParameter = new ThirdParameter();

    }
}
class Person {
    private int age = 34;
}

package parameters;

import java.util.HashMap;
import java.util.Map;

public class Mapa {
    Map<String, Integer> mapa = new HashMap<>();
    Map<String, Integer> addToMap() {
        mapa.put("Bob",33);
        mapa.put("Venera", 12);
        mapa.put("Richard", 23);
        mapa.put("Bill", 24);
        mapa.put("Jess", 21);
        return mapa;
    }
}

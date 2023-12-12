package lesson7;

import java.util.HashMap;
import java.util.Map;

public class MultiSet {

    Map<String, Integer> counts = new HashMap<>();


    void add(String key) {
        Integer count = counts.get(key);
        if (count == null) {
            count = 0;
        }
        counts.put(key, count + 1);
    }

    void add2(String key){
        counts.merge(key,1,(a,b)->a+b);
    }

}


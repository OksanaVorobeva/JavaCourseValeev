package lesson7;

import java.util.*;

public class MapL {
    private static final List<String> UNWANTED_VALUE= Arrays.asList("ffff");
    public static void main(String[] args) {


        Map<String,Integer> map= new HashMap<>();
        map.put("H",1);
        map.put("G",2);

        System.out.println(map);
        System.out.println();

       /* iterateOverMap(map);
        System.out.println();*/

        iteratorOverValues(map);
        System.out.println();

        iteratorOverMap2(map);
        System.out.println();

        Map<String,String> map1 =new HashMap<>();
        map1.put("1"," foo");
        map1.put("2","ffff ");
        map1.put("3"," bar");
        map1.put("4"," baz");

        System.out.println(map1);
        System.out.println();

       /* trimAllValues(map1);
        System.out.println(map1);
        System.out.println();*/

        trimAllValues2(map1);
        System.out.println(map1);
        System.out.println();

       /* removeUnwantedValues(map1);
        System.out.println(map1);
        System.out.println();*/

       /* removeUnwantedValues2(map1);
        System.out.println(map1);
        System.out.println();*/

        removeUnwantedValues3(map1);
        System.out.println(map1);
        System.out.println();

        removeUnwantedValues4(map1);
        System.out.println(map1);

    }

    static void iterateOverMap(java.util.Map<String, Integer> map) {
        for (java.util.Map.Entry<String, Integer> entry : map.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key + " -> " + value);
        }
    }

    static  void  iteratorOverValues(Map<String,Integer> map){
        for (Integer value: map.values()) {
            System.out.println("Value: " + value);
        }
    }

    static void iteratorOverMap2(Map<String,Integer> map){
        map.forEach((key,value)-> System.out.println(key+" -> "+value));
    }

    static void trimAllValues(Map<String,String> map){
        for (Map.Entry<String,String> entry: map.entrySet()) {
            entry.setValue(entry.getValue().trim());
        }
    }
    static void trimAllValues2(Map<String,String> map){
        map.replaceAll((key,value)->value.trim());
    }

    static void  removeUnwantedValues(Map<String,String> map){
        Iterator<Map.Entry<String,String>> iterator=map.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<String,String> entry =iterator.next();
            if (entry.getValue().equals("foo") || entry.getValue().equals("bar") ||  entry.getValue().equals("baz")){
                iterator.remove();
            }
        }
    }

    static void  removeUnwantedValues2(Map<String,String> map){
        map.entrySet().removeIf(entry->
                entry.getValue().equals("foo")||
                entry.getValue().equals("bar"));
    }

    static void  removeUnwantedValues3(Map<String,String> map){
        map.values().removeIf(value->value.equals("foo")||value.equals("bar"));
    }

    static void  removeUnwantedValues4(Map<String,String> map){
        map.values().removeAll(UNWANTED_VALUE);
    }


}


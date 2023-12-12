package lesson7;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public  class  MultiMap {

    Map<String,List<String>> multimap =new HashMap<>();

     void add(String key, String value){
        List<String> list= multimap.get(key);
        if (list==null){
            list=new ArrayList<>();
            multimap.put(key,list);
        }
        list.add(value);
    }

    void add2(String key, String value){
         multimap.computeIfAbsent(key,k->new ArrayList<>()).add(value);
    }

}

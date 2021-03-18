package com.example.demo;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class Cache {
    Map<Integer, String> map = new HashMap<Integer, String>();

    public String get(int key){
        return map.get(key);
    }

    public String set(int key, String value){
        return map.put(key, value);
    }

    public Boolean has(int key){
       return map.containsKey(key);
    }

    public void delete(int key){
        map.remove(key);
    }

    public void setTTL(int key, long time) {
        TimeUnit timeUnit = null;
        timeUnit.toMinutes(time);
        map.remove(key);
    }



}

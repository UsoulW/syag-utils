package cn.syag.utils;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/**
 * @Author : syag
 * @Date 2022/6/2
 * @note :
 */
public class Maps {

    public static <K, V> HashMap<K, V> newHashMap(){
        return new HashMap<>();
    }

    public static <K, V> LinkedHashMap<K, V> newLinkedHashMap(){
        return new LinkedHashMap<>();
    }

    public static <K extends Comparable, V> TreeMap<K, V> newTreeMap() {
        return new TreeMap<>();
    }

    public static <K, V> ConcurrentMap<K, V> newConcurrentMap() {
        return new ConcurrentHashMap<>();
    }


    public static <K, V> HashMap<K, V> newHashMap(K k,V v){
        HashMap<K, V> map = newHashMap();
        map.put(k,v);
        return map;
    }

    public static <K, V> LinkedHashMap<K, V> newLinkedHashMap(K k,V v){
        LinkedHashMap<K, V> map = newLinkedHashMap();
        map.put(k,v);
        return map;
    }

    public static <K extends Comparable, V> TreeMap<K, V> newTreeMap(K k,V v) {
        TreeMap<K, V> map = newTreeMap();
        map.put(k,v);
        return map;
    }

    public static <K, V> ConcurrentMap<K, V> newConcurrentMap(K k,V v) {
        ConcurrentMap<K, V> map = newConcurrentMap();
        map.put(k,v);
        return map;
    }
}

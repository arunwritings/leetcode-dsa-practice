package datastructures.strings;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class TimeBasedKeyValueStore_981 {

    Map<String, TreeMap<Integer, String>> timeBasedKeyValueStore;

    public TimeBasedKeyValueStore_981 () {
        timeBasedKeyValueStore = new HashMap<>();
    }

    public void set(String key, String value, int timestamp) {
        timeBasedKeyValueStore.computeIfAbsent(key, k-> new TreeMap<>()).put(timestamp, value);
    }

    public String get(String key, int timestamp) {
        if (!timeBasedKeyValueStore.containsKey(key)) return "";
        TreeMap<Integer, String> treeMap= timeBasedKeyValueStore.get(key);
        Integer floorTime = treeMap.floorKey(timestamp);
        return floorTime==null ? "" : treeMap.get(floorTime);
    }

    public static void main(String[] args) {

    }

}

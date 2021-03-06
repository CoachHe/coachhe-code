//package 第8节_理解Map.A_性能;
//
//import java.util.*;
//import java.util.concurrent.ConcurrentHashMap;
//
//public class Maps {
//    public static void printKeys(Map<Integer, String> map) {
//        printnb("Size = " + map.size() + ", ");
//        printnb("Keys: ");
//        print(map.keySet()); // Produce a Set of the keys
//    }
//
//    private static void printnb(String s) {
//        System.out.println(s);
//    }
//
//    public static void test(Map<Integer, String> map) {
//        print(map.getClass().getSimpleName());
//        map.putAll(new CountingMapData(25));
//// Map has ‘Set’ behavior for keys:
//        map.putAll(new CountingMapData(25));
//        printKeys(map);
//// Producing a Collection of the values:
//        printnb("Values: ");
//        print(map.values());
//        print(map);
//        print("map.containsKey(11): " + map.containsKey(11));
//        print("map.get(11): " + map.get(11));
//        print("map.containsValue(\"F0\"): "
//                + map.containsValue("F0"));
//        Integer key = map.keySet().iterator().next();
//        print("First key in map: " + key);
//        map.remove(key);
//        printKeys(map);
//        map.clear();
//        print("map.isEmpty(): " + map.isEmpty());
//        map.putAll(new CountingMapData(25));
//// Operations on the Set change the Map:
//        map.keySet().removeAll(map.keySet());
//        print("map.isEmpty(): " + map.isEmpty());
//    }
//
//    public static void main(String[] args) {
//        test(new HashMap<Integer, String>());
//        test(new TreeMap<Integer, String>());
//        test(new LinkedHashMap<Integer, String>());
//        test(new IdentityHashMap<Integer, String>());
//        test(new ConcurrentHashMap<Integer, String>());
//        test(new WeakHashMap<Integer, String>());
//    }
//
//    public static void print(Object object) {
//        System.out.println(object);
//    }
//}
//
//class CountingMapData{
//    Map map = new LinkedHashMap();
//    public CountingMapData(int i) {
//
//    }
//}
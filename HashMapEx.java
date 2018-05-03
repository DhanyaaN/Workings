import java.util.*;

public class HashMapEx {
    public static void main(String args[]) {
        // create and populate hash map  
        HashMap<Integer, String> map = new HashMap<Integer, String>();
        TreeMap
        //cp.put(104, "programming");
        map.put(102, "Let us C");
        map.put(101, "Operating System");
        map.put(103, "Data Communication and Networking");
        map.putIfAbsent(104, "pds");
        map.putIfAbsent(103, "adc");
        map.put(100,"programming");
        //System.out.println("Values before remove: " + map);
        // Remove value for key 102  
        //map.remove(102);
        //map.remove(103);
        //System.out.println("Values after remove: " + map);
        //System.out.println("SIZE OF MAP1: " + map.size());
        //System.out.println("SIZE OF MAP2: " + cp.size());
        //HashMap<Integer, String> map1 = new HashMap<Integer, String>(map);
        System.out.println("before sorting");
        for (Map.Entry m : map.entrySet()) {
            System.out.println(m.getKey() + ": " + m.getValue());
        }
        /*
        System.out.println("after sorting");
        Map<Integer, String> map1 = new TreeMap<Integer, String>(map);
        for (Map.Entry m1 : map.entrySet()) {
            System.out.println(m1.getKey() + ": " + m1.getValue());
        }
        */
        HashMap<String, Integer> map2 = new HashMap<String, Integer>();
        map2.put("subha", 64);
        if (map.containsKey(101)) {
            Object value = map.get(101);
            System.out.println(" value :" + value);
        }
        Set<Integer> key = map.keySet();
        for (Integer keyset : key) {
            System.out.println(keyset);
        }
        Collection<String> value = map.values();
        for (String valueset : value) {
            System.out.println(valueset);
        }
        
    }
}
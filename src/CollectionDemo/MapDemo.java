/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CollectionDemo;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author student
 */
public class MapDemo {
    
    public static void doTest(Map<Integer,String> map)
    {
        map.put(1,"one");
        map.put(9, "nine");
        map.put(3,"three");
        map.put(2,"two");
        map.put(5,"five");
        map.put(4,"four");
        map.put(3,"Three");//Rewrites old data
        map.put(33,"three");
        //for(Map.Entry<Integer,String> ent : map.entrySet())
        //    System.out.println(ent.getKey() + ent.getValue());
        
        map.entrySet().stream().forEach((ent) -> {
            System.out.println(ent.hashCode());
            System.out.println(ent.getKey()+ ent.getValue());
        });
        System.out.println("");
    }
    public static void main(String[] args) {
        // <key,value> pair
        //unordered
        HashMap<Integer,String> hmap = new HashMap<>();
        //ordered
        LinkedHashMap<Integer,String> lhmap = new LinkedHashMap<>();
        //sorted order    
        TreeMap<Integer,String> tmap = new TreeMap<>();
        
        doTest(hmap);
        doTest(lhmap);
        doTest(tmap);
        
    }
}

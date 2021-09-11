package day50_maps;

import java.util.TreeMap;

public class TreeMap01 {
    public static void main(String[] args) {
        TreeMap<Integer,String>tm= new TreeMap<>();
        tm.put(101,"alaattin");
        tm.put(102,"salih");
        tm.put(103,"berk");
        tm.put(104,"suleyman");
        tm.put(108,"ebikgabik");
        System.out.println(tm);

        //System.out.println(tm.put(null, "topla"));
        //System.out.println(tm);
tm.put(106,null);
        System.out.println(tm);
        System.out.println(tm.ceilingEntry(101));
        System.out.println(tm.ceilingEntry(107));
        System.out.println(tm.ceilingKey(107));

        System.out.println(tm.floorKey(107));
        System.out.println(tm.descendingKeySet());
        System.out.println(tm.keySet());

        System.out.println(tm.headMap(108));
        System.out.println(tm.headMap(104));
        System.out.println(tm.headMap(104,true));
        System.out.println(tm.tailMap(108));


    }
}

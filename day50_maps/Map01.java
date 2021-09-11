package day50_maps;

import java.util.Arrays;
import java.util.HashMap;

public class Map01 {
    public static void main(String[] args) {
        HashMap<Integer,String> mp1=new HashMap<>();
        mp1.put(101,"Levent");
        mp1.put(102,"Said");
        mp1.put(103,"Hasan");
        mp1.put(104,"Canan");
        mp1.put(105,"Ayse");
        System.out.println(mp1);

        mp1.remove(101);
        System.out.println(mp1);
        mp1.remove(102,"said");//key values eslesmesi olursa siler.ama eslesme olmazsa silmez.Said!=said
        System.out.println(mp1);

        System.out.println(mp1.remove(111, "salih"));
        System.out.println(mp1);
        System.out.println(mp1.size());

        HashMap<Integer,String>m2=new HashMap();
    m2.put(1,"guzel");
    m2.put(2,"insan");
    m2.put(3,"javacan");

        System.out.println(m2);
        mp1.putAll(m2);
        System.out.println(mp1);

        mp1.compute(103,(key,value)->"haluk");
        System.out.println(mp1);
        System.out.println(mp1.compute(109, (key, value) -> "merve"));
        System.out.println(mp1);

        mp1.computeIfAbsent(109,  value->"ipek");
        System.out.println(mp1);

        mp1.computeIfPresent(109,(key,value)->"rabia");
        System.out.println(mp1);

        System.out.println(mp1.computeIfPresent(115, (key, value) -> "rabia"));
        System.out.println(mp1);

    }
}

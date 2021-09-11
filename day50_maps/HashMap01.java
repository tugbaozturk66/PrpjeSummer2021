package day50_maps;

import java.util.HashMap;

public class HashMap01 {
    public static void main(String[] args) {
        HashMap<Integer,String> mp1=new HashMap<>();
        mp1.put(101,"Levent");
        mp1.put(102,"Said");
        mp1.put(103,"Hasan");
        mp1.put(104,"Canan");
        mp1.put(105,"Ayse");
        System.out.println(mp1);
        mp1.put(101,"harun");//key values update edilir.
        System.out.println(mp1);
        mp1.put(106,"Canan");//ayni value farkli key e atanabilir
        System.out.println(mp1);

        mp1.put(null,"haluk");//key degeri null olabilir.
        System.out.println(mp1);

        mp1.put(null,"hakan");// mevcut null olani update eder.
        System.out.println(mp1);
        mp1.put(107,null);// key e value atanirsa update olur
        mp1.put(108,null);
        mp1.put(109,null);

        System.out.println(mp1);
        System.out.println(mp1.get(103));//hasan
        System.out.println(mp1.values());
        System.out.println(mp1.keySet());
        System.out.println(mp1.getOrDefault(106, "boyle bir eleman yoktur"));// key varsa value getirir
        System.out.println(mp1.getOrDefault(111,"boyle bir eleman yoktur."));//yoksa atayip value getirir
        mp1.putIfAbsent(110, "ahmet");//belirtilen key de value yoksa verilen value yi ekler
        System.out.println(mp1);//null
        mp1.putIfAbsent(105,"salih");
        System.out.println(mp1.putIfAbsent(105,"salih"));
        System.out.println(mp1);

        System.out.println(mp1.putIfAbsent(null, "ipek"));
        System.out.println(mp1);

        System.out.println(mp1.putIfAbsent(107, "oguz"));
        System.out.println(mp1);// key de value null oldugu icin atama yapti.

    }
}

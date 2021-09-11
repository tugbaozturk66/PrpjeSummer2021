package day50_maps;

import java.util.Hashtable;

public class HashTable01 {
    public static void main(String[] args) {
        Hashtable <Integer,String> ht=new Hashtable<>();
        ht.put(101,"feridun");
        ht.put(102,"samet");
        ht.put(103,"ipek");
        ht.put(104,"IPEK");
        ht.put(105,"harun");
        System.out.println(ht);
       // ht.put(104,null);
        System.out.println(ht);
        System.out.println(ht.size());



    }
}

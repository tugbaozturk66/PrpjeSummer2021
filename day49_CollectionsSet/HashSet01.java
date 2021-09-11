package day49_CollectionsSet;

import java.util.Set;
import java.util.TreeSet;

public class HashSet01 {
    public static void main(String[] args) {
        int arr[]={2,5,3,4,2,1,5,4,6,3,2,1,5,4};
        Set<Integer> hs1=new java.util.HashSet<>();
        for (Integer i:arr) {
            hs1.add(i);
        }
        System.out.println(hs1);
        Set<String> lhs1 =new TreeSet<>();
        lhs1.add("Ali");
        lhs1.add("Canan");
        lhs1.add("Veli");
        lhs1.add("Remziye");
        System.out.println(lhs1);

        Set<String> lhs2 =new TreeSet<>();
        lhs2.add("Ali");
        lhs2.add("Canan");
        System.out.println(lhs1.retainAll(lhs2));
        System.out.println(lhs1);




    }
}

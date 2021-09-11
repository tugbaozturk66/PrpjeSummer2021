package day49_CollectionsSet;

import java.util.Arrays;
import java.util.HashSet;

public class HashSet02 {
    public static void main(String[] args) {
        HashSet<String>hs1=new HashSet<>(Arrays.asList("erdem","furkan","samet","hakan"));
        hs1.add("halil");
        System.out.println(hs1);
        HashSet<String>hs2=new HashSet<>(Arrays.asList("basarili","azimli","nasipli"));
        hs1.addAll(hs2);
        System.out.println(hs1);

        hs1.remove("basarili");
        System.out.println(hs1);
        System.out.println(hs1.size());
        System.out.println(hs1.isEmpty());

        System.out.println(hs1.contains("erdem"));

    }
}

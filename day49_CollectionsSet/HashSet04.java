package day49_CollectionsSet;

import java.util.Arrays;
import java.util.HashSet;
import java.util.TreeSet;

public class HashSet04 {
    /*Elemanlari Alfabetik sirada dizen ve tekrarsiz bir
    collection elde etmek isterseniz ne kullanirsiniz
	 	Cevap: TreeSet
	 	Soru: Ama TreeSet cok yavastir. Nasil bir cozum bulabilirsin?
	 	Cevap: HashSet olustururum, elemanlari HashSet’e eklerim.
	 	Sonra HashSet’i TreeSet’e ceviririm
	 	boylece tekrarsiz ve alfabetik sirada
	 	bir collection’a sahip olmus olurum.*/
    public static void main(String[] args) {
        long start1=System.currentTimeMillis();
        TreeSet<String>ts1=new TreeSet<>(Arrays.asList("reha","oguz","levent","oner","sedef"));
        long stop1=System.currentTimeMillis();
        System.out.println("treeset hizi "+(stop1-start1));

        long start=System.currentTimeMillis();
        HashSet hs=new HashSet<>(Arrays.asList("reha","oguz","levent","oner","sedef"));
        System.out.println(hs);

        TreeSet<String>ts=new TreeSet<>(hs);
        System.out.println(ts);
        long stop=System.currentTimeMillis();
        System.out.println("hashset "+(stop-start));


    }
}

package day51_Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class lambda03 {
    public static void main(String[] args) {
        List<Integer>l=new ArrayList<>(Arrays.asList(7,12,14,4,9,2,4,12,16));
    ilkDortElemaniSirala(l);
        System.out.println();
        ilkDortElemanGec(l);
        System.out.println();
        ucElemanYazdir(l);

    }



    //1) kucukten buyuge sirala sonra ilk 4 elemani yazdir
    private static void ilkDortElemaniSirala(List<Integer>l) {
    l.stream().sorted().limit(4).forEach(metodLambda2::bosluklaYazdir);
    }
    //2)kucukten buyuge sirala ilk dort elemani atla
    private static void ilkDortElemanGec(List<Integer> l) {
    l.stream().sorted().skip(4).forEach(metodLambda2::bosluklaYazdir);
    }
    //sirala sonra 4.5.6. elemanlarini yazdir.
    private static void ucElemanYazdir(List<Integer> l) {
    l.stream().sorted().skip(3).limit(3).forEach(metodLambda2::bosluklaYazdir);
        System.out.println();
    l.stream().sorted().limit(6).skip(3).forEach(metodLambda2::bosluklaYazdir);
    }
}

package day51_Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class lambda01 {
    public static void main(String[] args) {

      List<Integer> l=new ArrayList<>(Arrays.asList(14,9,13,4,9,2,4,14,15));
      yazdirJava(l);
        System.out.println();
      yazdirLambda(l);
        System.out.println();
        ciftSayiJava(l);
        System.out.println();
        ciftSayiLambda(l);
        System.out.println();
        tekSayiKare(l);
        System.out.println();
        farkliTekKup(l);
        System.out.println();
        farkliCiftKare(l);
        System.out.println();
        farkliCiftKupCarpim(l);
        System.out.println();
        tersDuzSira(l);

    }




    public static void yazdirJava(List<Integer> l) {
        for (Integer w:l) {
            System.out.print(w+" ");
        }
    }
// lambda(functional)
    public static void yazdirLambda(List<Integer>l){
       l.stream().forEach(t-> System.out.print(t+" "));
    }
    public static void ciftSayiJava(List<Integer> l) {
        for (Integer w:l) {
            if(w%2==0){
                System.out.print(w+ " ");
            }
        }
    }
    public static void ciftSayiLambda(List<Integer> l) {
        // Lambda expression(->arrow function)
l.stream().filter(t->t%2==0).forEach(t-> System.out.print(t+" "));
    }
    public static void tekSayiKare(List<Integer>l) {
     l.stream().filter(t->t%2==1).map(t->t*t).forEach(t-> System.out.print(t+" "));
    }
    public static void farkliTekKup(List<Integer> l) {
    l.stream().distinct().filter(t->t%2==1).map(t->t*t*t).forEach(t-> System.out.print(t+" "));

    }
    public static void farkliCiftKare(List<Integer>l) {
        System.out.println(l.stream().distinct().filter(t -> t % 2 == 0).map(t -> t * t).reduce(0, (x, y) -> x + y));
    }
    private static void farkliCiftKupCarpim(List<Integer>l) {
        System.out.println(l.stream().distinct().filter(t -> t % 2 == 0).map(t -> t * t * t).reduce(1, (x, y) -> x * y));
    }
    private static void tersDuzSira(List<Integer>l) {
    l.stream().sorted().forEach(t-> System.out.print(t+" "));
        System.out.println();
        l.stream().sorted(Comparator.reverseOrder()).forEach(t-> System.out.print(t+" "));
    }

}

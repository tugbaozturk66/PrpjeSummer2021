package day51_Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class lambda02 {
    public static void main(String[] args) {
        List<Integer> l=new ArrayList<>(Arrays.asList(15,14,9,13,4,9,2,4,14,6));
        elemanYazdir(l);
        System.out.println();
        ciftSayiYazdir(l);
        System.out.println();
        tekSayiKare(l);
        System.out.println();
        tekSayiKupTekrarsiz(l);
        System.out.println();
        farkliCiftSayiKareToplam(l);
        System.out.println();
        farkliCiftSayiKupCarpim(l);
        System.out.println();
        System.out.println(farkliTersSirala(l));
        System.out.println();
        maxDeger(l);
    }




    public static void elemanYazdir(List<Integer>l) {
    l.stream().forEach(metodLambda2::bosluklaYazdir);
    //l.stream().forEach(System.out::print);
    }
    //2) List in elemanlarini cift olanlari aralarinda bosluk birakarak yanyana yazdir.
    public static void ciftSayiYazdir(List<Integer>l) {
    l.stream().filter(metodLambda2::ciftMi).forEach(metodLambda2::bosluklaYazdir);

    }
    //3)List teki tek sayıların karelerini alıp aralarında boşluk bırakarak yanyana yazdır
    private static void tekSayiKare(List<Integer> l) {
        l.stream().filter(metodLambda2::tektMi).map(metodLambda2::kareAl).forEach(metodLambda2::bosluklaYazdir);
    }
    //4)List teki tekrarlı olanları silip tek sayıların küplerini alıp aralarında boşluk bırakarak yanyana yazdır.
    private static void tekSayiKupTekrarsiz(List<Integer> l) {
        l.stream().distinct().filter(metodLambda2::tektMi).map(metodLambda2::kupAl).forEach(metodLambda2::bosluklaYazdir);
    }
    //5)Farklı çift sayıların karelerinin toplamını yazdır (Use Method Reference)
    private static void farkliCiftSayiKareToplam(List<Integer> l) {
     int num= l.stream().distinct().filter(metodLambda2::ciftMi).map(metodLambda2::kareAl).reduce(0,Math::addExact);
        System.out.println(num);
    }
    //6)Farklı çift sayıların küplerinin çarpımını yazdır .(Use Method Reference)
    private static void farkliCiftSayiKupCarpim(List<Integer> l) {
   int num=l.stream().distinct().filter(metodLambda2::ciftMi).map(metodLambda2::kupAl).reduce(1,Math::multiplyExact);
        System.out.println(num);
    }
    //7)List teki farklı ve 5 ten büyük ve cift elemanlarının yarısını alıp ters sıralayarak list olarak yazdır.(Use Me
    private static List farkliTersSirala(List<Integer> l) {
   return l.stream().distinct().filter(t->t>5&&t%2==0).map(t->t/2).sorted(Comparator.reverseOrder()).collect(Collectors.toList());
    }
    //listteki en buyuk elemani bul.
    private static void maxDeger(List<Integer> l) {
        System.out.println(l.stream().reduce(Integer.MAX_VALUE, Math::min));
        System.out.println(l.stream().reduce(Integer.MIN_VALUE, Math::max));
        l.stream().sorted(Comparator.reverseOrder()).limit(1).forEach(metodLambda2::bosluklaYazdir);//max verir ilk eleman ters siralayinca
        System.out.println();
        l.stream().sorted().limit(1).forEach(metodLambda2::bosluklaYazdir);//siralayinca ilk eleman min verir
    }
}

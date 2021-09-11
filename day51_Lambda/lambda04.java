package day51_Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class lambda04 {
    public static void main(String[] args) {
        List<String> l = new ArrayList<>(Arrays.asList("Ali","Ali","Aysima","Abdurrahman","Ata","Mehmet","Mustafa","Bedirhan","Yüksel","Süleyman"));
        yazdirBuyuk1(l);
        System.out.println();
        uzunlukSirala(l);
        System.out.println();
        farkliSonHarfSirala(l);
        System.out.println();
        uzunlukSiralaIlkEleman(l);
        System.out.println();
        yazdirAIleBaslayan(l);
        System.out.println();
        AbasIileBit(l);
        System.out.println();
        siralaBuyut(l);
        System.out.println();
        UzunlukKacTane(l);
        System.out.println();
        karesiniAlSiralaSil(l);
        System.out.println();
        ebikGabik(l);
        System.out.println();
        sondanIkınciSiralaIlk(l);
        System.out.println();
        terstenSiralaIlkYazdir(l);

    }
    //1 listin elemanlarini buyuk harfle yazdir.
    private static void yazdirBuyuk1(List<String> l) {
    l.stream().map(t->t.toUpperCase()).forEach(metodLambda2::bosluklaYazdir);
        System.out.println();
    l.stream().map(String::toUpperCase).forEach(metodLambda2::bosluklaYazdir);
    }
//2.elemanlari uzunluklarina gore sirala ve yazdir.
    //note: java, elemanlari varsayilan olarak artan siraya koyar.
private static void uzunlukSirala(List<String> l) {
l.stream().sorted(Comparator.comparing(String::length)).forEach(metodLambda2::bosluklaYazdir);
    System.out.println();
    l.stream().sorted(Comparator.comparing(String::length).reversed()).forEach(metodLambda2::bosluklaYazdir);// en uzundan en kisaya
    }
    //3) farkli elemanlarini son harfe gore sirala
    private static void farkliSonHarfSirala(List<String> l) {
   l.stream().distinct().sorted(Comparator.comparing(t->t.substring(t.length()-1))).forEach(metodLambda2::bosluklaYazdir);

    }
    //4. elemanlari uzunluklarina ve ardindan ayni uzunlukta olanlari ilk karakterlerine gore siralamak icin yontem olusturun.
    private static void uzunlukSiralaIlkEleman(List<String> l) {
    l.stream().sorted(Comparator.comparing(String::length).thenComparing(t->t.substring(0,1))).forEach(metodLambda2::bosluklaYazdir);
        System.out.println();
        l.stream().sorted(Comparator.comparing(String::length).thenComparing(t->t.substring(0,1)).thenComparing(t->t.substring(1,2))).forEach(metodLambda2::bosluklaYazdir);
    }
    //5)buyuk harflerle "a" ile baslayan ogelerini yazdirmak icin method.
    private static void yazdirAIleBaslayan(List<String> l) {
    l.stream().filter(t->t.startsWith("A")).map(t->t.toUpperCase()).forEach(metodLambda2::bosluklaYazdir);
                                          //map(String::toUpperCase)
    }
    // kucuk harflerle a ile baslayan i ele biten
    private static void AbasIileBit(List<String> l) {
    l.stream().filter(t->t.startsWith("A")||t.endsWith("i")).map(String::toLowerCase).forEach(metodLambda2::bosluklaYazdir);
    }
    //7) ogeleri uzunluklrina gore sirala sonra buyuk harflerle yazdirmak
    private static void siralaBuyut(List<String> l) {
   l.stream().map(String::toUpperCase).sorted(Comparator.comparing(String::length)).forEach(metodLambda2::bosluklaYazdir);
    }
    // elemanlari uzunluklarina gore siralayin once elemani sonra uzunlugu yazdirin
    private static void UzunlukKacTane(List<String> l) {
    l.stream().sorted(Comparator.comparing(String::length)).forEach(t-> System.out.print(t+":"+t.length()+" "));
        System.out.println();
    l.stream().sorted(Comparator.comparing(String::length)).map(t->t+":"+t.length()).forEach(metodLambda2::bosluklaYazdir);
        System.out.println();
        System.out.println(l.stream().distinct().collect(Collectors.toMap(t -> t, t -> t.length())));
    }
    private static void karesiniAlSiralaSil(List<String> l) {
    //9) her elemanin uzunlugunun karesini alip 20 den buyuk olanlari buyukten kucuge sirala yazdir.
        l.stream().map(t->t.length()*t.length()).distinct().filter(t->t>20).sorted(Comparator.reverseOrder()).forEach(metodLambda2::bosluklaYazdir);
    }
    //10) //Tüm elemanların uzunluklarının 12'den az olup olmadığını kontrol etmek için bir metod oluşturun
//bütün elemanların "x" ile başlamadığını kontrol etmek için bir yöntem oluşturun
//en az 1 tane "R" ile biten eleman olup olmadığını kontrol etmek için bir metod oluşturun.
private static void ebikGabik(List<String> l) {
boolean result=l.stream().allMatch(t->t.length()<12);
    System.out.println("elemanlarin uzunluklari 12 den kucuk mu? "+ result);
    System.out.println();
    boolean result2=l.stream().noneMatch(t->t.startsWith("x"));
    System.out.println("x ile baslayan eleman yok "+result2);
    System.out.println();
    boolean result3=l.stream().anyMatch(t->t.endsWith("R"));
    System.out.println("elemanlardan harhangibiri R ile bitiyor mu "+result3);

}
//elemanları sondan 2. elemanlarına göre sıralayıp ilk elemanı yazdır
private static void sondanIkınciSiralaIlk(List<String> l) {
    System.out.println(l.stream().sorted(Comparator.comparing(t -> t.charAt(t.length() - 2))).findFirst());
l.stream().sorted(Comparator.comparing(t -> t.charAt(t.length() - 2))).limit(1).forEach(metodLambda2::bosluklaYazdir);
}
    private static void terstenSiralaIlkYazdir(List<String> l) {
        System.out.println(l.stream().sorted(Comparator.comparing(String::length).reversed()).findFirst());
        //9) Eleman 'A', 'a' ile başlıyor veya 'N', 'n' ile bitiyorsa o elemanı silin
        l.removeIf(t->t.toUpperCase().startsWith("A")||t.toUpperCase().endsWith("N"));
        System.out.println(l);
    }

}

package day51_Lambda;

import java.util.stream.IntStream;

public class Lambda05 {
    public static void main(String[] args) {
        //1) den 20 ye kadar olan sayilari yazdir.
        IntStream.rangeClosed(1,20).forEach(metodLambda2::bosluklaYazdir);// iki sayi da dahil yazdiriyor ranceClosed de
        System.out.println();
        IntStream.range(1,20).forEach(metodLambda2::bosluklaYazdir);// ilk dahil ikinci dahil degil seklinde range de
        //3 den 98 e kadar yazdir
        System.out.println();
        //1. yol
        System.out.println(IntStream.rangeClosed(3, 98).filter(t -> t % 2 == 0).sum());
        System.out.println();
        //2. yol
        System.out.println(IntStream.rangeClosed(3, 98).filter(t -> t % 2 == 0).reduce(0, Math::addExact));
   //3)functional programing kullanarak 9! i bul

        System.out.println(IntStream.rangeClosed(1, 9).reduce(1, Math::multiplyExact));

// 4) İlk 7 çift sayma sayısının çarpımını bulun (2,4,6,8,10,12,14)

        System.out.println(IntStream.rangeClosed(2, 14).filter(t -> t % 2 == 0).reduce(1, Math::multiplyExact));
        //5) 6 dan buyuk ilk 150 tek sayma sayisinin toplamini bulun

        System.out.println(IntStream.iterate(7, t -> t + 2).limit(150).sum());

//6) ilk 23 tek sayma sayisinin toplamini bulun
        System.out.println(IntStream.iterate(2, t -> t + 2).limit(23).sum());
        //7)  (11,33) arasındaki her tam sayının rakamlarının toplamını hesaplamak için bir metod oluşturun

        IntStream.rangeClosed(11,33).map(metodLambda2::rakamlarToplami).forEach(metodLambda2::bosluklaYazdir);


    }


}

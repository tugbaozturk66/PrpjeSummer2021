package day50_maps;

import java.util.HashMap;
import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        /*Count the words in a String one by one
    Bir Stringdeki kelimeleri tek tek sayın ve konsolda yazdirin.
    String Str = "Ali came to school and Ayse came to school"
    Ali=            1
    came=   2
    to=         2
    school= 2
    and=    1
    Ayse=   1 */

        Scanner scan=new Scanner(System.in);
        System.out.println("bir metin giriniz");
    String metin=scan.nextLine();
        kelimeSay(metin);


    }

    public static void kelimeSay(String metin) {
        HashMap<String,Integer> map=new HashMap<>();
        String kelimeler[]=metin.split(" ");
        for (int i = 0; i < kelimeler.length; i++) {
            if (map.containsKey(kelimeler[i])){
                map.put(kelimeler[i],map.get(kelimeler[i])+1);
            }else{
                map.put(kelimeler[i],1);
            }
        }

        System.out.println(map);
    }
}

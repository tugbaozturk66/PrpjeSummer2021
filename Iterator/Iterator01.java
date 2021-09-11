package Iterator;

import java.util.*;

public class Iterator01 {
    public static void main(String[] args) {
        List<String> l1=new ArrayList<>(Arrays.asList("z","e","h","r","a"));
       System.out.println("listin ilk hali: "+l1);
       //listin elemanlarini yazdirma for ile
        for (int i = 0; i < l1.size(); i++) {
           System.out.print(l1.get(i)+ " ");

        }
        System.out.println("***********");
        for (String w:l1) {
            System.out.print(w+" ");
        }
        System.out.println();
        List<String> l2=new ArrayList<>(Arrays.asList("z","e","h","r","a"));
        ListIterator it1= l2.listIterator();
        while (it1.hasNext()){
            String depo=it1.next().toString();
           if(!(it1.hasNext())){
               it1.set(":-) "+depo);
           }
                   }
        System.out.println("l2nin son hali "+ l2);
        while(it1.hasPrevious()){
            String depo=(String) it1.previous();
            System.out.print(depo+" ");
            //System.out.println(depo+" ");
        }
System.out.println(l2);
    }
}

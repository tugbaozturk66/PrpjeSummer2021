package day49_CollectionsSet;



import java.util.*;

public class HashSet03 {
    /*İcinde degerleri olan bir array i arraylist e cevirecek
  return tipi arrayList olacak bir metod yaziniz.
  {“reha”, “hakan”, “haluk”, “ipek”, “ahsen”}
  main metod altinda metod ile gelen listeyi kullanarak
  HashSet, TreeSet ve linkedHashSet leri doldurun.*/
    public static void main(String[] args) {
     String arr[]= {"reha","hakan","haluk","ipek","ahsen"};
        ArrayList <String> list =new ArrayList<>();
        list=cevir(arr);
        System.out.println(list);

        HashSet<String>hs=new HashSet<>(list);
        System.out.println(hs);
        LinkedHashSet<String> lhs=new LinkedHashSet<>(list);
        TreeSet<String> ts=new TreeSet<>(list);
        System.out.println(lhs);
        System.out.println(ts);
    }
    public static ArrayList<String> cevir(String []arr){
        ArrayList <String> ArrList =new ArrayList<>();
        for (String w: arr ) {
            ArrList.add(w);
        }
        return ArrList;
    }
}

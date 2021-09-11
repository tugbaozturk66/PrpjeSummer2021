package Iterator;

import java.util.*;

public class Iterator02 {
    public static void main(String[] args) {
        List<String> list1=new ArrayList<>(Arrays.asList("m","e","l","i","h","a",":-)"));
        ListIterator lt2=list1.listIterator();
    while(lt2.hasPrevious()){
        String depo=(String) lt2.previous();
        System.out.println(depo+" ");
    }


    }

}

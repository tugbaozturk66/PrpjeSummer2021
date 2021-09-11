package day50_queue_deque;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

public class Deque1 {
    public static void main(String[] args) {
        Deque<String> dq1=new LinkedList<>(Arrays.asList("SUNA","onur","Suleyman","harun"));
        System.out.println(dq1);
        System.out.println(dq1.peekFirst());//ilk elemanini verir
        System.out.println(dq1.pollFirst());//ilk elemanini silerek verir
        System.out.println(dq1);

        System.out.println(dq1.peekLast());
        System.out.println(dq1);
        System.out.println(dq1.pollLast());
        System.out.println(dq1);

        dq1.add("yunus");
        dq1.add("yusuf");
        System.out.println(dq1.getFirst());//getirir sadece istenen elemani yani ilk elemani
        System.out.println(dq1.getLast());// son elemani getirir.
        System.out.println(dq1);
        //dq1.clear();
        System.out.println(dq1.peekFirst());// bos olursa null getirir hata vermez.
        System.out.println(dq1.peekLast());
        //System.out.println(dq1.getFirst());//hata verir bos bir sıradan getiremez
    }
}

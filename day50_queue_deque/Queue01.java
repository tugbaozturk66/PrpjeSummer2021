package day50_queue_deque;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Queue01 {
    public static void main(String[] args) {
        /*Fifo :  First in first out --> Elemanlar ilk eklenen ilk silinir eczane yemekhane vs sektorlerde zmana kaydı olam elemanlarin tutullmasinda kullanilir.
        Queue intreface'nin iki subClass constructoru ile obj creat edileblir.
        LinkedList constructoru ile obj creat edilirse elemanlar Queue icinde isertion order'e gore siralanir
        PriorityQueue constructoru ile obj creat edilirse elemanlar Queue icindejava'nin kendine ozel algoritmasina gore siralanir.*/
        Queue<String> q1=new LinkedList<>();
        q1.add("basri");
        q1.add("hakan");
        q1.add("sedef");
        q1.add("ahmet");
        System.out.println(q1);
        Queue<String> q2 =new PriorityQueue<>();
        q2.add("rabia");
        q2.add("oguz");
        q2.add("yagmur");
        q2.add("mehmet");
        System.out.println(q2);

        System.out.println(q1.peek());//ilk elemani silmeden return eder.
        System.out.println(q1);

        System.out.println(q1.poll());
        System.out.println(q1);// ilk elemani silerek return eder.

        //q1.remove();
        //System.out.println(q1);

        //q1.clear();
        //System.out.println(q1.poll());
        //System.out.println(q1.remove());
        System.out.println(q1.offer("merve"));
        System.out.println(q1);


    }
}

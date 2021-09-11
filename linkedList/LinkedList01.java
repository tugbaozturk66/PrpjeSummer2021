package linkedList;

import java.util.Arrays;
import java.util.LinkedList;

public class LinkedList01 {

    public static void main(String[] args) {
        LinkedList<String> ll1=new LinkedList<>(Arrays.asList("erdem","mehmet","samet","said","yagmur"));
    ll1.add("merve");
    System.out.println(ll1);

    ll1.add(2,"faruk eczanesi");
    System.out.println(ll1);

    LinkedList<String> ll2=new LinkedList<>(Arrays.asList(":-)",":-("));
    ll1.addAll(ll2);
    System.out.println(ll1);

    ll1.addFirst("gayet");
    System.out.println(ll1);

    ll1.addLast("basarili");
    System.out.println(ll1);

    ll1.addAll(3,ll2);
    System.out.println(ll1);

    ll1.remove();
    System.out.println(ll1);

    ll1.removeFirst();
    System.out.println(ll1);

    ll1.remove("faruk eczanesi");
    System.out.println(ll1);

    ll1.remove(2);
    System.out.println(ll1);

    ll1.removeFirstOccurrence(":-)");
    System.out.println(ll1);

    ll1.add(3,"basarili");
    ll1.removeLastOccurrence("basarili");
    System.out.println(ll1);

    LinkedList<Integer>ll3=new LinkedList<>(Arrays.asList(1,2,3,4,5,6));
    ll3.remove(2);
    System.out.println(ll3);
   // ll3.remove(33);
     //   System.out.println(ll3);
        ll3.remove(ll3.indexOf(6));
        System.out.println(ll3);
     ll2.add(":-(");
     ll1.removeAll(ll2);
        System.out.println(ll1);
        System.out.println(ll1.get(4));


    }
}

package shujujiegou;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListTest {
    public static void main(String[] args) {
        var a = new LinkedList<>();
        a.add("Amy");
        a.add("Carl");
        a.add("Erica");

        var b = new LinkedList<>();
        b.add("Bob");
        b.add("Dog");
        b.add("France");
        b.add("Gloria");

        ListIterator<Object> aIter = a.listIterator();
        Iterator<Object> bIter = b.iterator();

        while (bIter.hasNext()){
            if (aIter.hasNext())
                aIter.next();
            aIter.add(bIter.next());
        }
        System.out.println(a);

        bIter = b.iterator();
        while (bIter.hasNext()){
            bIter.next();
            if (bIter.hasNext()){
                bIter.next();
                bIter.remove();
            }
        }
        System.out.println(b);

        a.removeAll(b);
        System.out.println(a);
    }
}

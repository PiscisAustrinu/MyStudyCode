import java.util.LinkedList;
import java.util.ListIterator;

public class AddTowSum {
   public void addTwoNum(LinkedList a,LinkedList b){
       int carry = 0;
       var num = new LinkedList<Integer>();
       ListIterator<Object> aIter =  a.listIterator();
       ListIterator<Object> bIter = b.listIterator();
       while (aIter.hasNext()||bIter.hasNext()){
           int n1 = aIter.hasNext()? (int) aIter.next() :0;
           int n2 = bIter.hasNext()? (int) bIter.next() :0;
           int sum = n1+n2+carry;
           carry = sum%10;
           num.add(carry);
           if (sum>10){
               carry = 1;
           }else
               carry=0;
       }
       if ((aIter.hasNext()==false&&bIter.hasNext()==false)&&carry==1)
           num.add(1);
       System.out.println(num);
   }

    public static void main(String[] args) {
        var a = new LinkedList<Integer>();
        a.add(1);
        a.add(2);
        a.add(7);
        a.add(8);
        var b = new LinkedList<Integer>();
        b.add(4);
        b.add(5);
        b.add(6);
        b.add(8);
        AddTowSum addTowSum = new AddTowSum();
        addTowSum.addTwoNum(a,b);

    }
}

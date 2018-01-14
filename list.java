import java.util.*;

class linklist{
public static void main(String[] args)
{
LinkedList<Integer> al = new LinkedList<Integer>();

al.add(10);
al.add(20);
al.add(30);
al.add(40);
al.add(50);
al.add(60);


al.addFirst(30);

System.out.println(al);

al.addLast(60);

System.out.println(al);

System.out.println(al.getFirst());
System.out.println(al.getLast());

al.removeFirst();

System.out.println(al);

al.removeLast();

System.out.println(al);









}
}



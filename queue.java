import java.util.*;


class queue{

public static void main(String[] args)
{
PriorityQueue<Integer> q = new PriorityQueue<Integer>();

q.add(50);
q.add(35);
q.add(6);
q.add(96);
q.add(20);

System.out.println(q);

q.poll();

System.out.println(q);


System.out.println(q.peek());

q.remove();
System.out.println(q);

System.out.println(q.element());


}
}
import java.util.*;

public class Linkedlist {
    public static void main(String[] args) {
        //LinkedList<String> al=new LinkedList<String>();
        ArrayList<String> al = new ArrayList<String>();
        al.add("venky");
        al.add("shanthi");
        al.add("kirthiha");
        al.add("surya");

        Iterator<String> itr = al.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        //System.out.println(al);
    }
}
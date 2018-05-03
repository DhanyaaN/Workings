import java.util.*;

class ListtoSet {
    public static void main(String args[]) {
        List<String> list = new ArrayList<String>();//Creating arraylist  
        list.add("Ravi");//Adding object in arraylist  
        list.add("Vijay");
        list.add("Ravi");
        list.add("Ajay");
        list.remove(2);
        Set<String> set = new HashSet<String>(list);
        System.out.println(set);
        //Traversing list through Iterator  
        /*
        ListIterator<String> itr = list.listIterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
        while (itr.hasPrevious()) {
            System.out.println(itr.previous());
        }
        */
    }
}
import java.util.Iterator;

public class LinkedList {
    public static void main(String[] args) {
        java.util.LinkedList<String> ll=new java.util.LinkedList<String>();
        ll.add("Aviral");
        ll.add("Gunjan");
        ll.add("Dot");
        ll.add("Solanki");
        ll.add("Vaishali");
        ll.add("Priya");
        ll.add("Abhinav");
        Iterator it= ll.iterator();
        while (it.hasNext())
            System.out.println(it.next());
    }
}

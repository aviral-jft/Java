import java.util.*;
public class ArrayList {
    public static void main(String[] args) {
        java.util.ArrayList<String> list=new java.util.ArrayList<String>();
        list.add("Aviral");
        list.add("Gunjan");
        list.add("Dot");
        list.add("Solanki");
        list.add("Vaishali");
        list.add("Priya");
        list.add("Abhinav");
        Iterator itr= list.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}

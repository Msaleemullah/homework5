package DataStructure;


import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class UseLinkedList {
    public static void main(String[] args) {
        List<String> list = new LinkedList<String>();
        list.add("New York");
        list.add("New Jersey");
        list.add("California");
        list.add("Washington");
        list.add("Florida");



       /* Iterator it = list.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());*/

            System.out.println(((LinkedList<String>) list).getLast());


      /*  for(String st: list ) {
            System.out.println(st);*/
        }
    }


import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

//        StringLinkedList list = new StringLinkedList();
//
//        list.add("jakiś tekst");
//        list.add("mama");
//        list.add("tata");
//        list.add("brat");
//        list.add("siostra");
//        list.add("babcia");
//
//        System.out.println(list.get(2));
//        System.out.println(list.size());
//        System.out.println(list.next());
//        System.out.println(list.hasNext());
//
//
        GenericLinkedList<Integer> list2 = new GenericLinkedList<>();

        list2.add(123);
        list2.add(456);
        list2.add(567);
        list2.add(22222);
        list2.add(999999);
        list2.add(987654321);
        list2.add(98765432);

        for (int i = 0; i < 3; i++){
            System.out.println(list2.next());
        }
        for (int i = 0; i < 4; i++){
            System.out.println(list2.previous());
        }
        System.out.println("============================================");
        for (int i = 0; i < 6; i++){
            System.out.println(list2.next());
        }

//        GenericLinkedList<String> list = new GenericLinkedList();
//        list.add("hello");
//        list.add("world");
//        list.add("1");
//
//        System.out.println(list.next()); //"hello"
//        System.out.println(list.whereYouAre);
//        list.next(); //"world"
//        list.previous(); //"hello"
//        list.next(); //"world"
//        System.out.println(list.next()); //"1"
//        System.out.println(list.previous()); //world
//        list.previous();//hello


    }
}

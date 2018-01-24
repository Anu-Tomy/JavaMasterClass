import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Demo {
    public static void main(String[] args) {
        LinkedList<String> placeToVisit = new LinkedList<String>();

        addInOrder(placeToVisit,"New York");
        addInOrder(placeToVisit,"Florida");
        addInOrder(placeToVisit,"Boston");
        addInOrder(placeToVisit,"New Jersey");
        addInOrder(placeToVisit,"Florida");
        addInOrder(placeToVisit,"Miami");

        addInOrder(placeToVisit,"Florida");


        printList(placeToVisit);
    }

    private static void printList(LinkedList<String> linkedList){
        Iterator<String> i = linkedList.iterator();
        while (i.hasNext()){
            System.out.println("Now Visiting " + i.next());
        }
        System.out.println("=======================");
    }

    private static boolean addInOrder(LinkedList<String> linkedList, String newCity){
        ListIterator<String>stringListIterator = linkedList.listIterator();

        while (stringListIterator.hasNext()) {
            int comparison = stringListIterator.next().compareTo(newCity);
            if(comparison == 0){
                //equal, do not add
                System.out.println(newCity + " is already included as a destination");
                return false;
            }else if(comparison > 0){
                //newCity should appear before this one
                //Boston --> Atlanta
                stringListIterator.previous();
                stringListIterator.add(newCity);
                return true;
            }else if(comparison < 0){
                //move on next city
            }
        }
        stringListIterator.add(newCity);
        return true;
    }
}

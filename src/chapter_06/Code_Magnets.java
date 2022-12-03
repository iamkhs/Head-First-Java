package chapter_06;

import java.util.ArrayList;

public class Code_Magnets {
    public static void main(String[] args) {
        ArrayList<String> a = new ArrayList<>();
        a.add(0,"zero");
        a.add(1,"one");
        a.add(2,"two");
        a.add(3,"three");
        printList(a);

        if (a.contains("three")){
            a.add("four");
        }
        a.remove(2);
        printList(a);

        if (a.indexOf("four") != 4){
            a.add(4,"4.2");
        }
        printList(a);

        if (a.contains("two")){
            a.add("2.2");
        }
        printList(a);

    }

    private static void printList(ArrayList<String> arrayList) {
        for (String element: arrayList){
            System.out.print(element+" ");
        }
        System.out.println();
    }
}

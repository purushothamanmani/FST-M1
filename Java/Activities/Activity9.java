package activities;

import java.util.ArrayList;

public class Activity9 {
    public static void main(String[] args) {
        ArrayList<String> myList = new ArrayList<>();
        myList.add("Henry");
        myList.add("Smith");
        myList.add(2, "Vasu");
        myList.add("Devan");
        myList.add(3, "Valluvan");
        System.out.print("Array values: ");
        for (String names : myList) {
            System.out.print(names + " ");
        }

        System.out.println("3rd element in the list:" + myList.get(2));
        System.out.println("Is array value present in the list:" + myList.contains("Devan"));
        System.out.println("Size of array list before remove element:" + myList.size());
        myList.remove(2);
        System.out.println("Size of array list after remove element:" + myList.size());

    }
}

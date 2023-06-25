package activities;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Activity13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> arrayList = new ArrayList<>();
        Random indexGen = new Random();
        System.out.println("Enter integer value:");
        System.out.println("(EOF or non-integer to terminate): ");
        while (scan.hasNextInt()) {
            arrayList.add(scan.nextInt());
        }
        Integer num[] = arrayList.toArray(new Integer[0]);
        int index = indexGen.nextInt(num.length);
        System.out.println("Index value generated:" + index);
        System.out.println("Value in array at generated index: " + num[index]);
        scan.close();
    }
}

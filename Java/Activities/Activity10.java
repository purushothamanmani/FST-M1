package activities;

import java.util.HashSet;

public class Activity10 {
    static HashSet<String> hashSet = new HashSet<>();

    public static void main(String[] args) {

        hashSet.add("Chennai");
        hashSet.add("Coimbatore");
        hashSet.add("Tanjur");
        hashSet.add("Tiruchi");
        hashSet.add("Tiruvallur");
        hashSet.add("Tutricon");
        hashSet.add("Namakkal");
        hashSet.add("Ooty");
        hashSet.add("Vellore");
        System.out.println("Hashset value:" + hashSet);
        System.out.println("Before removing hashset size:" + hashSet.size());
        System.out.println("Tiruchi value Removed from hashset:" + hashSet.remove("Tiruchi"));
        removeElementContains("Ranipet");
        System.out.println("Coimbatore is present in the hashset:" + hashSet.contains("Coimbatore"));
        System.out.println("After removing hashset size:" + hashSet.size());
    }

    private static void removeElementContains(String value) {
        if (hashSet.contains(value)) {
            System.out.println("The given value is " + value + " removed" + hashSet.remove(value));
        } else {
            System.out.println(value + " Value is not present in the hashset");
        }
    }
}

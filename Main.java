import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Array example: fixed size
        int[] scores = new int[3];

        scores[0] = 85;
        scores[1] = 90;
        scores[2] = 95;

        System.out.println("Array example:");
        for (int i = 0; i < scores.length; i++) {
            System.out.println("Score " + (i + 1) + ": " + scores[i]);
        }

        // ArrayList example: resizable
        ArrayList<String> names = new ArrayList<>();

        names.add("Eric");
        names.add("John");
        names.add("Sarah");

        System.out.println("\nArrayList before removing:");
        System.out.println(names);

        // ArrayLists can easily remove items
        names.remove("John");

        // ArrayLists can easily add more items
        names.add("Mike");

        System.out.println("\nArrayList after changes:");
        System.out.println(names);
    }
}
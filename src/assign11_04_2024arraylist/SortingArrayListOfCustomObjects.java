package assign11_04_2024arraylist;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

// Custom object representing an item
class Item {
    private String name;
    private int quantity;

    public Item(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    @Override
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", quantity=" + quantity +
                '}';
    }
}

// Custom comparator class to sort items based on quantity
class QuantityComparator implements Comparator<Item> {
    @Override
    public int compare(Item item1, Item item2) {
        return Integer.compare(item1.getQuantity(), item2.getQuantity());
    }
}

public class SortingArrayListOfCustomObjects {
    public static void main(String[] args) {
        // Create an ArrayList of custom objects
        ArrayList<Item> items = new ArrayList<>();
        items.add(new Item("Item 1", 5));
        items.add(new Item("Item 2", 10));
        items.add(new Item("Item 3", 3));

        // Print unsorted list
        System.out.println("Unsorted List:");
        for (Item item : items) {
            System.out.println(item);
        }

        // Sort the ArrayList based on quantity using the custom comparator
        Collections.sort(items, new QuantityComparator());

        // Print sorted list
        System.out.println("\nSorted List (based on quantity):");
        for (Item item : items) {
            System.out.println(item);
        }
    }
}

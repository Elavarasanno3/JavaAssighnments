package assign11_04_2024arraylist;

import java.util.ArrayList;

public class CircularBuffer {
    private ArrayList<String> buffer;
    private int size;
    private int nextIndex;

    // Constructor
    public CircularBuffer(int size) {
        this.size = size;
        this.buffer = new ArrayList<>(size);
        for (int i = 0; i < size; i++) {
            buffer.add(null); // Initialize buffer with null values
        }
        this.nextIndex = 0;
    }

    // Method to add a message to the buffer
    public void addMessage(String message) {
        buffer.set(nextIndex, message);
        nextIndex = (nextIndex + 1) % size; // Circular increment of index
    }

    // Method to retrieve all messages from the buffer
    public ArrayList<String> getAllMessages() {
        ArrayList<String> messages = new ArrayList<>();
        int startIndex = nextIndex >= size ? nextIndex % size : 0;
        for (int i = 0; i < size; i++) {
            String message = buffer.get((startIndex + i) % size);
            if (message != null) {
                messages.add(message);
            }
        }
        return messages;
    }

    // Method to print all messages in the buffer
    public void printAllMessages() {
        ArrayList<String> messages = getAllMessages();
        for (String message : messages) {
            System.out.println(message);
        }
    }

    // Test main method
    public static void main(String[] args) {
        CircularBuffer buffer = new CircularBuffer(5); // Buffer with size 5

        // Add messages to the buffer
        buffer.addMessage("oii");
        buffer.addMessage("Good morning");
        buffer.addMessage("How its going");
        buffer.addMessage("Do you ate");
        buffer.addMessage("Tell me");
        buffer.addMessage("That was boring"); // This should overwrite the oldest message ("Message 1")

        // Print all messages in the buffer
        System.out.println("All Messages in Buffer:");
        buffer.printAllMessages();
    }
}

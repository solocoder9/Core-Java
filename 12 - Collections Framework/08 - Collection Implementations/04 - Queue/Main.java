package queue;

public class Main {
    public static void main(String[] args) throws Exception {
        Queue queue = new Queue();

        // Enqueue elements into the queue
        queue.enqueue("Charlie");
        queue.enqueue(99.99);
        queue.enqueue('S');
        queue.enqueue("Justin");

        // Peek the front element
        System.out.println("Front element: " + queue.peek());  // Charlie

        // Dequeue elements from the queue
        System.out.println("Dequeued element: " + queue.dequeue());  // Charlie
        System.out.println("Dequeued element: " + queue.dequeue());  // 99.99

        // Check the size of the queue
        System.out.println("Size of queue: " + queue.size());  // 2

        // Check if the queue is empty
        System.out.println("Is queue empty? " + queue.isEmpty());  // false

        // Peek the front element after some dequeues
        System.out.println("Front element after dequeue: " + queue.peek());  // S

    }
}

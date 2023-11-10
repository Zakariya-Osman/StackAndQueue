package drivers;

/**
 * Represents an interface for the Stack Abstract Data Type
 * @author Garry Jr
 * @author Kevin Wong
 * @author Zackaria Osman
 * @param <T>
 */
public interface QueueADT<T>{

    /**
     * Adds an element to the end of the queue
     * @param element The element to be added to the queue
     * @pre-condition The queue is not full
     * @post-condition The element is added to the end of the queue
     */
    public void enqueue(T element);

    /**
     * Removes and returns the first element from the queue
     * @return The element that is removed from the queue
     * @pre-condition The queue is not empty
     * @post-condition The first element is removed from the queue
     */
    public T dequeue();

    /**
     * Returns the first element from the queue without removing it
     * @return The first element from the queue
     * @pre-condition The queue is not empty
     * @post-condition The queue remains unchanged
     */
    public T first();
    
    /**
     * Checks if the queue is empty
     * @return True is the queue is empty, otherwise false
     * @post-condition The queue remains unchanged
     */
    public boolean isEmpty();
    
    /**
     * Gets the overall size of the queue
     * @return The number of elements in the queue
     * @post-condition The queue remains unchanged
     */
    public int size();
}

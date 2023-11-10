package drivers;

/**
 * Represents an interface for the Stack Abstract Data Type
 * @author Garry Jr
 * @author Kevin Wong
 * @author Zackaria Osman
 * @param <T> The type of elements in the stack
 */
public interface StackADT<T> {

    /**
     * Adds an element to the top of the stack
     * @param element The element to be added to the stack
     * @pre-condition The stack is not full
     * @post-condition The element is added to the top of the stack
     */
    public void push(T element);

    /**
     * Removes and returns the topmost element from the stack
     * @return The element that is removed from the top
     * @pre-condition The stack is not empty
     * @post-condition The topmost element is removed from the stack
     */
    public T pop();

    /**
     * Returns the topmost element from the stack, the stack remains unchanged
     * @return The topmost element from the stack
     * @pre-condition The stack is not empty
     * @post-condition The stack remains unchanged
     */
    public T peek();

    /**
     * Checks if the stack is empty
     * @return True is the stack is empty, otherwise false
     * @post-condition The stack remains unchanged
     */
    public boolean isEmpty();

    /**
     * Gets the overall size of the stack
     * @return The number of elements in the stack
     * @post-condition The stack remains unchanged
     */
    public int size();
}

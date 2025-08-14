
package project;

public interface StackInterface {

    /**
     * push an object into the stack
     * @param x as the object
     */
    public void push(Object x);

    /**
     * remove the last element from the stack and returns it
     * @return Object as the last element from the stack
     */
    public Object pop();

    /**
     * returns the last element without removing it
     * @return Object 
     */
    public Object peek();

    /**
     * remove every element from the stack
     */
    public void clear();

    /**
     * checks wether the stack is empty or not
     * @return true if the stack is empty false otherwise
     */
    public boolean isEmpty();
}



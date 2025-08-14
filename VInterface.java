
package project;

public interface VInterface {


    public void sort(Vlist myList);
 
    /**
     * add an object at the end of the list
     * @param newEntry as an object
     * @return true if the process is complete
     */
    public boolean add(Object newEntry);

    /**
     * add an object at a specified location on the list
     * @param newEntry as an Object
     * @param givenPosition as the location on the list
     * @return true if the process was successful
     */
    public boolean add(int givenPosition,Object newEntry);

    /**
     * remove an object from the list
     * @param givenPosition the position of the object to be removed
     * @return the removed object
     */
    public Object  remove(int givenPosition);

    /**
     * display all the elements in the list
     */
    public void display();

    /**
     * search for an Object in the list
     * @param anEntry the object to be searched
     * @return true if the object was found
     */
    public boolean contains(Object anEntry);

    /**
     * checks wether the list is full
     * @return true if the list is full
     */
    public boolean isFull();

    /**
     * checks wether the list is empty
     * @return true if the list is empty
     */
    public boolean isEmpty();

    /**
     * return the size of the list
     * @return the size of the list
     */
    public int getLength();

    /**
     * remove every elements in the list
     */
    public void clear();

    /**
     * replace an existing element in the list with another
     * @param newEntry the new Object 
     * @param givenPosition the position of the Object to be replaced
     * @return true if the process was successful
     */
    public boolean replace(int givenPosition,Object newEntry);

    
    /**
     * returns the element at the specified position
     * @param givenPosition as the position between 0 and length 
     * @return Object as the element at the specified position
     */
    public Object getElementAt(int givenPosition);
    
    /**
     * return the last element
     * @return Object as the last element
     */
    public Object getLastElement();

    /**
     * return the first element
     * @return the first element
     */
    public Object getFirstElement();
}


package project;

public interface QInterface {
    
   //add object
    public void enqueue(Object newEntry);
    
    //remove object and return the Front
    public Object dequeue();
    
    //return the Front
    public Object getFront();
    
    //is the queue empty?
    public boolean isEmpty();
    
    //removes all the queue
    public void clear();
}
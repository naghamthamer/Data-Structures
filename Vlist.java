
package project;
import java.util.Vector;

public class Vlist implements VInterface{
    private Vector entry;
    
    Vlist(){
        entry=new Vector();
    }
    
    Vlist(int vSize){
        entry=new Vector(vSize);
    }
    
    @Override
    public boolean isFull(){
        return false;
    }
    
    @Override
    public boolean isEmpty(){
        return entry.isEmpty();
    }
    
    @Override
    public void clear(){
        entry.removeAllElements();
    }
    
    @Override
    public void display(){
        display_recursion(0);
    }
    
    private void display_recursion(int start){
        System.out.println(entry.elementAt(start));
        if(start<entry.size()){
            display_recursion(start+1);
        }
    }
    
    @Override
    public int getLength(){
        return entry.size();
    }
    
    @Override
    public boolean add(Object newEntry){
        entry.addElement(newEntry);
        return true;
    }
    
    @Override
    public boolean add(int givenPosition,Object newEntry){
        boolean R=true;
        givenPosition=givenPosition-1;
        if(givenPosition>=0 && givenPosition<=entry.size())
        entry.insertElementAt(newEntry, givenPosition);
    return R;    
    }
    
    @Override
    public Object remove (int givenPosition){
        Object R=null;
        givenPosition=givenPosition-1;
        if(!isEmpty() && givenPosition>=0 && givenPosition<entry.size()){
            R=entry.elementAt(givenPosition);
            entry.removeElementAt(givenPosition);
        }
    return R;    
    }
    
    @Override
     public boolean replace(int givenPosition,Object newEntry){
         boolean R=true;
         givenPosition=givenPosition-1;
         if(!isEmpty() && givenPosition>=0 && givenPosition<entry.size()){
             entry.setElementAt(newEntry, givenPosition);
         }
    return R;     
     }
     
    @Override
     public boolean contains(Object anEntry){
         return entry.contains(anEntry);
     }
     
    @Override
     public Object getElementAt(int givenPosition){
         Object R=null;
         givenPosition=givenPosition-1;
         if(!isEmpty() && givenPosition>=0 && givenPosition<entry.size()){
             R=entry.elementAt(givenPosition);
         }
    return R;     
     }
     
    @Override
     public Object getLastElement(){
         try{
             return entry.lastElement();
         }
         catch(java.util.NoSuchElementException e){
             return null;
         }
     }
     
    @Override
     public Object getFirstElement(){
         try{
             return entry.firstElement();
         }
         catch(java.util.NoSuchElementException e){
             return null;
         }
     }

    @Override
     public void sort(Vlist myList) {
     Vlist amman=new Vlist();
        Vlist zarqa=new Vlist();
        Vlist madaba=new Vlist();
        for (int i = 1; i <= myList.getLength(); i++) {
            customer c1= (customer) myList.getElementAt(i);
             if (c1.City.equalsIgnoreCase("Amman")) {
                    amman.add(c1);
                } else if (c1.City.equalsIgnoreCase("irbid")) {
                    zarqa.add(c1);
                }
                else if (c1.City.equalsIgnoreCase("zarqa")) {
                    madaba.add(c1);
        }

     
 }
}
}

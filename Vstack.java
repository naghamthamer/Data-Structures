
package project;
import java.util.Vector;

public class Vstack implements StackInterface{
    private Vector vstk;
    
        Vstack(){
        vstk=new Vector();
    }
      
    Vstack(int v_size){
        vstk=new Vector(v_size);
    }
    
    @Override
    public boolean isEmpty(){
        return vstk.isEmpty();
    }
    
    @Override
    public void clear(){
        vstk.removeAllElements();
    }
    
    @Override
    public void push(Object x){
        vstk.addElement(x);
    }
    
    @Override
    public Object pop(){
        Object R=null;
        if(!isEmpty()){
            R=vstk.elementAt(vstk.size()-1);
            vstk.removeElement(vstk.size()-1);
        }
    return R;    
    }
    
    @Override
    public Object peek(){
        Object R=null;
        if(!isEmpty()){
            R=vstk.elementAt(vstk.size()-1);
        }
        return R;
    }
}

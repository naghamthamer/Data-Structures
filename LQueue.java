
package project;

public class LQueue implements QInterface{
    private Node FrontNode;
    private Node BackNode;
    
    LQueue(){
        clear();
    }
    
    @Override
    public void clear(){
        FrontNode=null;
        BackNode=null;
    }
    
    @Override
    public void enqueue(Object newEntry){
        Node nn=new Node();
        nn.data=newEntry;
        if(isEmpty()){
            FrontNode=BackNode=nn;
        }
        else{
            BackNode.next=nn;
            BackNode=nn;
        }
    }
    
    @Override
    public Object dequeue(){
        Object R=null;
        if(!isEmpty()){
            R=FrontNode.data;
            FrontNode=FrontNode.next;
        }
        if(FrontNode==null){
            BackNode=null;
        }
        return R;
    }
    
        @Override
    public Object getFront(){
        Object R=null;
        if(!isEmpty()){
            R=FrontNode.data;
        }
        return R;
    }
    
    @Override
    public boolean isEmpty(){
        return FrontNode==null;
    }
    
    private class Node{
        Object data;
        Node next;
        
        Node(){
            data=null;
            next=null;
        }
        
        Node(Object d){
            data=d;
            next=null;
        }
        
        Node(Object d,Node n){
            data=d;
            next=n;
        }
    }
}

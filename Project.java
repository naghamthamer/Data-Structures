
package project;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Project {

    public static void main(String[] args) throws FileNotFoundException{
        int money =0;
        
        Vlist myList=new Vlist();
        Vstack underAge=new Vstack();
        
        File text=new File("C:/Users/Nagham/Downloads/pro_DS/project/src/project/data.txt");//reading the file
        Scanner lines=new Scanner(text);
        while(lines.hasNextLine()) { 
            String line = lines.nextLine();
            System.out.println(line);
            LQueue nn = new LQueue(); 
            String[] s1 = line.split(",");
            for(int i=0; i < s1.length; i++) { 
                try { 
                    nn.enqueue(Integer.parseInt(s1[i]));
                }//end try
                catch(NumberFormatException e){
                    nn.enqueue(s1[i]);
                }//end catch
            }
            customer customer = new customer((String) nn.dequeue(), (String) nn.dequeue(), (int) nn.dequeue(), (int) nn.dequeue(), (int) nn.dequeue(), (String) nn.dequeue(), (int) nn.dequeue());
            myList.add(customer);
        }//end while
        
        // to save the object in the list then arranging them using Queue for the lowest Date of Birth will be served first
        Vlist Amman=new Vlist();
        LQueue AmmanQ=new LQueue();
        Vlist irbid=new Vlist();
        LQueue irbidQ=new LQueue();
        Vlist zarqa=new Vlist();
        LQueue zarqaQ=new LQueue();
        
        myList.sort(Amman);
        myList.sort(irbid);
        myList.sort(zarqa);
        
        for(int i=1;i<=myList.getLength();i++){
            customer c=(customer)myList.getElementAt(i);
            if(c.City.equals("Amman")){
                AmmanQ.enqueue(c);
            }
            else if(c.City.equals("irbid")){
                irbidQ.enqueue(c);
            }
            else if(c.City.equals("zarqa")){
                zarqaQ.enqueue(c);
            }
        }
        //Vlist
        /* for(int i=0;i<myList.getLength();i++){
            customer c=(customer)myList.getElementAt(i);
            if(c.City.equals("Amman")){
                Amman.add(c);
            }
            else if(c.City.equals("irbid")){
                irbid.add(c);
            }
            else if(c.City.equals("zarqa")){
                zarqa.add(c);
            }
        }*/
        
        myList.clear();
        
        // this method will sorted by id
        AmmanQ=sortQ(Amman);
        irbidQ=sortQ(irbid);
        zarqaQ=sortQ(zarqa);
        
        // this method will service the customer by there age
        MasterCardFirst(AmmanQ, Amman, myList, underAge);
        MasterCardFirst(irbidQ, irbid, myList, underAge);
        MasterCardFirst(zarqaQ, zarqa, myList, underAge);
        
        myList.display();
        
        // the total cost for all citys
        money=22*(Amman.getLength()+irbid.getLength()+zarqa.getLength());
        System.out.println("the total money is "+ money);
    }            
       
        public static void MasterCardFirst(LQueue L,Vlist v1,Vlist v2,Vstack stk){//They are arranged according to who will receive the service first, according to age
            while(!L.isEmpty()){
                customer c1=(customer)L.dequeue();
                if(c1.DateOfBirth<=2003){
                    c1.setservedFlag(true);
                    v1.add(c1);
                    v2.add(c1);
                }
                else
                    stk.push(c1);//Those older than 2003 will wait for their turn with a stack
            }
        }
        
         public static LQueue sortQ(Vlist source){//I arrange them according to the ID, and the less the ID, they will provide the service first
            LQueue des = new LQueue();
            int pos = 0;
            while (!source.isEmpty()) {
                for (int i = 0; i < source.getLength(); i++) {
                    customer temp = ((customer) source.getElementAt(i));
                    customer min = ((customer) source.getFirstElement());
                    if (temp.Id <= min.Id) {
                        min = temp;
                        pos = i;
                    }
                }
                des.enqueue((customer) source.remove(pos));// remove them after the service is done
            }
            return des;
        }
}

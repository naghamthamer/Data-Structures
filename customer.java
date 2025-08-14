
package project;

public class customer {
    String Fname;
    String Lastname;
    int Id;
    int Salary;
    int Tel;
    String City;
    int DateOfBirth;
    private boolean servedFlag;
    
    customer(){
        
    }
    
    customer(String Fname,String Lastname,int Id,int Salary,int Tel,String City,int DateOfBirth){
        this.Fname=Fname;
        this.Lastname=Lastname;
        this.Id=Id;
        this.Salary=Salary;
        this.Tel=Tel;
        this.City=City;
        this.DateOfBirth=DateOfBirth;
    }
    
    public boolean servedFlag() {
        return false;
    }

    public void setservedFlag(boolean servedFlag) {
        this.servedFlag = servedFlag;
    }
    
    public String toSring(){
        return "customer:"+"Fname:"+Fname+"Lastname:"+Lastname+"Id:"+Id+"Salary:"+Salary+"Tel:"+Tel+"City:"+City+"DateOfBirth:"+DateOfBirth+"servedFlag:"+servedFlag;
    }
    
}

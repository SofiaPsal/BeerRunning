import java.util.ArrayList;
import java.util.List;

public class User{
    private int id,phone,afm;
    private String name,email,address;
    private ArrayList<Reply> receivedMessList = new ArrayList<Reply>();
    public User(int id, String name, String email, int phone, String address,int afm){
        this.setID();
        this.name=name;
        this.email=email;
        this.phone=phone;
        this.address=address;
        this.afm=afm;    
    }   
    public void setID(int ID){
      this.id = ID;
      
      System.out.println("User's ID set to: " + this.id);
    }
    
    public void setID(){
      int minNumber = 1;
      int maxNumber = 1000000;
      
      this.id = minNumber + (int)(Math.random() * ((maxNumber - minNumber) + 1));
      
      System.out.println("User's ID set to: " + this.id);
    }
    public void SendReply(Reply r){ 
        receivedMessList.add(r);
}
    public String getName(){
        return name;
    }
     public int getId(){ return id;}
     
    public void setName(String name){
      this.name = name;
    }
    
    public String getEmail(){
      return email;
    }
    
    public void setEmail(String email){
      this.email = email;
    }
    
    public int getPhone(){
      return phone;
    }
    
    public void setPhone(int phone){
      this.phone = phone;
    }
    
     public String getAddress(){
      return address;
    }
    
    public void setAddress(String address){
      this.address = address;
    }
    
    public int getAfm(){
      return afm;
    }
    
    public void setAfm(int AFM){
      this.afm = afm;
    }
}

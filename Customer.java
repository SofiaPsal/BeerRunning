import java.util.Scanner;  
import java.util.Date;
import java.util.*;
  
    
public class Customer extends User{
    
    private int businessId;
    private String businessName;
    private String category;
    private int priority;
    private String info;
    private enum Action {
        EVALUATION,
        ORDER};
    static Action action;   
        
    //composition has-a relationship
    private Order order;
    //composition has-a relationship
    private Evaluation evaluation;
    
    //class Constructor
  public Customer(int id, String name, String email, int phone, String address,int afm,int bid,int pri, String bname,String cat,String info){
        super(id,name,email,phone,address,afm);
        this.businessId=bid;
        this.priority=pri;
        this.info=info;
        this.businessName=bname;
        this.category=cat;
}
    
    //Getters and Setters
    public int getBusinessID() {
        return businessId;
    }
    public void setBusinessID(int businessId) {
        this.businessId = businessId;
    }
    public String getBusinessName(){
        return businessName;
    }
    public void setBusinessName(String businessName){
        this.businessName = businessName;
    }
    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }
    public int getPriority() {
        return priority;
    }
    public void setPriority(int priority) {
        this.priority = priority;
    }
    public String getInfo(){
        return info;
    }
    public void setInfo(String info){
        this.info = info;
    }
           
        
    //customer's functions
    public static void selectEvaluation(){
        switch(action){
            case EVALUATION:
                fillOutEval();
                break;
                
            case ORDER:
                createOrder();
                break;
            }
    }
    
    public static void fillOutEval(){
        Evaluation evalObj = new Evaluation();
    }
    
    public static void createOrder(){
        
        Scanner s = new Scanner(System.in);
        System.out.print("Enter city: ");
        String ordCity = s.nextLine();
        System.out.print("Enter address: ");
        String ordAddress = s.nextLine();
        System.out.print("Enter receiver: ");
        String ordReceiver = s.nextLine();
        System.out.print("Enter prodCategory: ");
        String ordProdCat = s.nextLine();
        System.out.print("Enter orderStatus: ");
        String ordStatus = s.nextLine();
        System.out.print("Enter quantity: ");
        int ordQuantity = s.nextInt();
        System.out.print("Enter orderId: ");
        int ordId = s.nextInt();
        Date ordDate = new Date();
        Distributor ordDriver = new Distributor(0, "0", "0", 0, "0", 0, null, "0", false);
           
        Order orderObj = new Order(ordCity, ordAddress, ordReceiver, ordProdCat, ordStatus, ordQuantity, ordId, ordDate);
    }
    
    public boolean isthereInfo(Customer c){
        if(c.businessId!=0 && c.businessName!=null && c.info!=null)
        return false;
        else 
        return true;
    }
    
    public void getInfo(Customer c){
        System.out.println(c.getId() + c.getName() + c.businessName+ c.getEmail()+ c.getPhone()+c.getAddress()+c.getAfm()+this.businessId+this.priority+this.info+this.category);
    }
    
}
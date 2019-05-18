import java.util.Scanner;
public class DistributionManager extends User{
    public DistributionManager(int id, String name, String email, int phone, String address,int afm){
        super(id,name,email,phone,address,afm);
    }
    Scanner scan= new Scanner(System.in);
    String text= scan.nextLine();    
    public boolean selectCustomerList(String s){
        if(s=="Customer List"){
        return true;}
        else{return false;}
    }
    public boolean selectShipmentAssignment(String s){
        if(s=="Shipment Assignment"){
        return true;}
        else{return false;}
    }
    public void selectCategory(){
        
    }
    public Customer selectCustomer(Category c,int a){
        return c.customerList[a];
    }
}
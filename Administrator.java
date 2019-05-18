import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Administrator extends User{

private float validates;
private ArrayList<Reply> replyList = new ArrayList<Reply>();
enum Profiles{
    ChiefExecutive, SalesManager, ProductManager, DistributionManager, WarehouseManager, Customer, Distributor
}

    public Administrator(int id, String name, String email, int phone, String address, int AFM){
    super(id, name, email, phone, address, AFM);
    this.validates = validates;
   }
public void Communication(){}
public Message SelectMessage(Message[] emailList, int k){
  return(emailList[k]);
}
public boolean ValidateReply(){
    System.out.println("Eiste sigouroi oti thelete na steilete mhnuma xwris paralhpth? Y/N");
    Scanner scan= new Scanner(System.in);
    String confirmation = scan.nextLine();
    if(confirmation=="Y"){
        return true;
    }else{
        return false;
    }

}

public void WriteReply(String rec, String sub, String txt){
    Reply replyObject = new Reply(rec, sub, txt);
    replyList.add(replyObject);
}  


public void show(){

}


public void SelectProfile(Profiles prof){
    Profiles epilogh=prof;
}
public boolean DamageAssessment(){
if(validates>15){
    return(true);
}else{
    return(false);
}
}

public boolean SendSystemStatus(String rec){

    if(DamageAssessment()==true){
        return false;
    }else{
        return true;
    }
}
public void Method(User u){
    String rec=u.getName();
    if(DamageAssessment()==false){
       Reply messObjectF = new Reply(rec , "System status", "Closed system due to serious damage");
       replyList.add(messObjectF);
}else{
    Reply messObjectT = new Reply("rec", "System status", "Fixed System");
    replyList.add(messObjectT);
}
}
}
import java.util.ArrayList;
import java.util.List;


public class Manager extends User{
 
    private String department;
    private int employeeNum, employeeId;
    private boolean available;
    private ArrayList<Message> managerList = new ArrayList<Message>();
  
    
public Manager(int id, String name, String email, int phone, String address, int AFM, String department, int employeeNum, int employeeId){
    super(id, name, email, phone, address, AFM);
    this.department = department;
    this.employeeNum = employeeNum;
    this.employeeId = employeeId;
    this.available = available;
}
public String getName(User u){
    return(u.getName());
}
public void setAvailable(boolean av){
    this.available = av;
}

public void setDepartment(String department){
    this.department = department;
}
public boolean getAvailable(){
    return available;
}
public void Send(User u, Departments dep){
    
    Dep department;
    department = dep.getDepartName();
    String rec = u.getName();
    String sen = "Chief Executive";
    if(this.available==true){
        Message messAssign = new Message(sen, rec, "Department Assignment", "Eiste o neos manager tou tmhmatos:" + dep);  
        managerList.add(messAssign);
    }else{
        System.out.println("O upallhlos pou epile3ate einai upeu8unos allou tmhmatos.Parakalw epile3te kapoion allon");
    }
        


}
}
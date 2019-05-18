import java.util.ArrayList;
import java.util.List;

public class ChiefExecutive extends User{
    enum Dep{
       SalesManager, DistrManager, ProdManager, WareManager
    }
    private ArrayList<Departments> departList = new ArrayList<Departments>();
    private int j=0, count;
    public ChiefExecutive(int id, String name, String email, int phone, String address, int AFM){
       super(id, name, email, phone, address, AFM); 
    }
    public void SelectDepartment(Dep d){
      Dep choice = d;
    }
    public Report SelectReports(Report[] reportList, int k){
        return(reportList[k]);
    }
    
    public void SelectManager(EmployeePerformance[] perList, EmployeePerformance perObj, int i ){
        
        for(EmployeePerformance j : perList){
            if(perObj.getEmpId()==i){
                System.out.println(perList[count]);
            }
            count++;
        }
    }
        
    public void setDepManager(Manager m, String department){
        m.setAvailable(false);
        m.setDepartment(department);
        String d = department;
    }
    
    
}
      
     



   


    
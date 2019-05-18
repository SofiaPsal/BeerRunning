import java.util.ArrayList;
import java.util.List;

public class EmployeePerformance{
    private int empId,rating;
    private float statistics;
    EmployeePerformance[] perList = new EmployeePerformance[100];
    public EmployeePerformance(int empId, int rating, float statistics){
         this.empId = empId;
         this.rating = rating;
         this.statistics = statistics;
    }
    
    public void SelectPerformance(){}
    
    public int getEmpId(){
         return empId;    
    }
    
    public int getRating(){
         return rating;    
    }
    
    public float getStatistics(){
         return statistics; 
    }
    
    public void getPerInfo(EmployeePerformance empPer){
         System.out.println("empPer.getEmpId() + empPer.getRating() + empPer.getStatistics()");
    }
    
    
    
    
}
        
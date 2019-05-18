import java.util.ArrayList;
import java.util.List;

public class Report{
    private String departState;
    private int ManageId;
    private int id;
    private Report[] reportList = new Report[100];
    
    public Report(String departState, int ManageId, int id){
        this.departState = departState;
        this.ManageId = ManageId;
        this.id = id;
    }
    public String getDepartState(){
       return departState;
    }
     public int getManageId(){
       return ManageId;
    }
    
     public int getId(){
       return id;
    }
    
     public void getRepInfo(Report r){
       System.out.println("r.getDepartState() + r.getManageId() + r.getId()");
    }
    
    public boolean ReportReady(Report r){
        for(int i=0; i<=99; i++){
            
            if(reportList[i]==r){
                return true;
            }
        }
        return false;
    }
    
}   
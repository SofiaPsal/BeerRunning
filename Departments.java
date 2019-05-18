import java.util.ArrayList;
import java.util.List;
enum Dep{
       SalesManager, DistrManager, ProdManager, WareManager
    }
public class Departments{
   
    private int departNum;
    public Dep departName;
    public Departments(int departNum, Dep departName ){
        this.departNum = departNum;
        this.departName = departName; 
        }   
        
        public int getDepartNum(){
        return(departNum);
    }
    
    public Dep getDepartName(){
        return(departName);
    }
       
    public void GetDepInfo(Departments d){
        System.out.println("d.getDepartNum()" + "d.getDepartName()");
    }
}
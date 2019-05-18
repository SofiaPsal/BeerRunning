    import java.util.*;
    import java.util.Scanner;
    
    public class ProductionManager extends Manager{
        
        //composition has-a relationship
        private Request request;
        private ProductionPlan productionPlan;
        
        private enum Action {
            PRODUCTIONPLAN,
            STORAGEREQUEST};
        static Action action;   
                             
        
        //ProductionManager's functions
        public ProductionManager(int id, String name, String email, int phone, String address, int AFM, String department, int employeeNum, int employeeId){
            super(id, name, email, phone, address, AFM, department, employeeNum, employeeId);
            
            this.request = new Request();
            this.productionPlan = new ProductionPlan();
            this.action = action;
        }
    
    public static void selectProdPlan(){
           switch(action){
                case PRODUCTIONPLAN:
                    fillOutProdPlan();
                    break;
                    
                case STORAGEREQUEST:
                    selectStorageRequest();
                    break;
           }
    }
        
    public static void fillOutProdPlan(){
        ProductionPlan planObj = new ProductionPlan();
    }
    
    public static void confirmProdPlan(){
        Scanner s = new Scanner(System.in);
        System.out.print("If you want to confirm the product plan, type 1.");
        int type = s.nextInt();
        
        if (type == 1)
        {
            System.out.println("Proceed to next action.");
            selectProdPlan();
        }
        else
        {
            fillOutProdPlan();
        }
    
    }
    
    public static void selectStorageRequest(){
        fillOutRequest();
    }
    
    public static void fillOutRequest(){
        ProductStorage storageObj = new ProductStorage();
    }
    
    public static void addComments(){
        System.out.println("Add your comments here: ");
        Scanner scanner = new Scanner(System.in);
        String commentSection = scanner.nextLine();
    }
    
    public static void confirmRequest(){
        Scanner s = new Scanner(System.in);
        System.out.print("If you want to confirm your storage request, type 1.");
        int type = s.nextInt();
        
        if (type == 1)
        {
            System.out.println("Proceed to next action.");
            selectProdPlan();
        }
        else
        {
            fillOutRequest();
        }
    }



}

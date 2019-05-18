import java.util.Date;

public class ProductionPlan
{
    private int prodPlanId;
    private Date startDate;
    private Date endDate;
    private String productCat;
    private int productQuant;
    private boolean iscorrect;
    
    //class constructor
    public ProductionPlan()
    {
        // initialise instance variables
        prodPlanId = 0;
        startDate = new Date(2020,01,01);
        endDate = new Date(2020,01,02);
        productCat = "0";
        productQuant = 0;
        iscorrect = false;
    }

    //getters and setters
    public int getProdPlanId() {
        return prodPlanId;
    }
    public void setProdPlanId(int prodPlanId) {
        this.prodPlanId = prodPlanId;
    }
    public Date getStartDate() {
        return startDate;
    }
    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }
    public Date getEndDate() {
        return endDate;
    }
    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }
    public String getProductCat(){
        return productCat;
    }
    public void setProductCat(String productCat){
        this.productCat = productCat;
    }
    public int getProductQuant(){
        return productQuant;
    }
    public void setProductQuant(int productQuant){
        this.productQuant = productQuant;
    }
    
    //ProductionPlan's other functions
    public boolean dataCorrect(boolean iscorrect)
    {
        if (iscorrect = true)
        {
          return true;
        }
        else
        {
          return false;
        }
    }
    
    public void clearData(int prodPlanId, String productCat, int productQuant){
        prodPlanId = 0;
        productCat = " ";
        productQuant = 0;
        
        System.out.println("Your data have been cleared.");
    }
}


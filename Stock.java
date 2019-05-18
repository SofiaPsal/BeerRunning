
public class Stock extends Request
{
    private String stockType;
    private int stockNum;
   

    //class constructor
    public Stock()
    {
        // initialise instance variables
        stockType = "0";
        stockNum = 0;
        
    }

    //getters and setters
    public String getStockType() {
        return stockType;
    }
    public void setStockType(String stockType) {
        this.stockType = stockType;
    }
    public int getStockNum() {
        return stockNum;
    }
    public void setStockNum(int stockNum) {
        this.stockNum = stockNum;
    }
    
    //Stock's other functions
    public boolean isStockAvailable(int stockNum){
        if(stockNum > 0){
            return true;
        }
        else
        {
            return false;
        }
    }
}

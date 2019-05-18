import java.util.Scanner;  
import java.util.Date;
import java.util.*;

public class ProductStorage extends Request
{

    private String prodCat;
    private int prodQuant;
    private int lot;
    private String packaging;
    private boolean spaceAvailable;
    
    //class constructor
    public ProductStorage()
    {
        // initialise instance variables
        prodCat = "0";
        prodQuant = 0;
        lot = 0;
        packaging = "0";
    }

    //getters and setters
    public String getProdCat() {
        return prodCat;
    }
    public void setProdCat(String prodCat) {
        this.prodCat = prodCat;
    }
    public int getProdQuant() {
        return prodQuant;
    }
    public void setProdQuant(int prodQuant) {
        this.prodQuant = prodQuant;
    }
    public int getLot() {
        return lot;
    }
    public void setLot(int lot) {
        this.lot = lot;
    }
    public String getPackaging(){
        return packaging;
    }
    public void setPackaging(String packaging){
        this.packaging = packaging;
    }
    public boolean getSpaceAvailable(){
        return spaceAvailable;
    }
    public void setSpaceAvailable(){
        this.spaceAvailable = spaceAvailable;
    }
    
    //ProductStorage's other functions
    public int validateProdLot(){
        Scanner s = new Scanner(System.in);
        System.out.print("Please enter the lot number: ");
        int lotNum = s.nextInt();
        return lotNum;
    }
    
    public boolean freeSpace(boolean spaceAvailable)
    {
       if (spaceAvailable == true)
        {
          return true;
        }
        else
        {
          return false;
        }
    }
    
    
}

public class Shipment{
    private String city,address,receiver;
    private Distributor driver;
    private int paletes;
    public Shipment(Order o,Distributor d){
        this.city=o.getCity();
        this.address=o.getAddress();
        this.receiver=o.getReceiver();
        this.driver=d;   
    
    
    }
    public boolean paletesOk(){
        if(this.paletes>0 && this.paletes<=50){
        return true;}
        else{return false;}              
    }
    public boolean validateInfo(Shipment s){
        boolean av=driver.getAvailable();
        if(av=true && receiver!="" && s.paletesOk()==true)
            return true;
            else{
                System.out.println("la8os stoixeia paraggelias");
                return false;
            }               
      }  
}
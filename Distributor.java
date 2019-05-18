public class Distributor extends User{
    private DistributionManager DistManager;
    private String vehicle;
    private boolean available;
    public Distributor(int id, String name, String email, int phone, String address,int afm,DistributionManager Dist,String vehicle, boolean available){
        super(id,name,email,phone,address,afm);
        this.DistManager=Dist;
        this.vehicle=vehicle;
        this.available=available;
    }
    
    public boolean selectDestinationList(String s){
        if(s=="Destination List"){
        return true;}
        else{return false;}
    }
    public boolean getAvailable(){return available;}
    public void waitforSignature(){
        System.out.println("Parakalw upograpste mesa sto plaisio gia na oloklhrw8ei h paraggelia");
    }
    public void validateSignature(){System.out.println("");}
}
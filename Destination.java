import java.util.ArrayList;
import java.util.List;
public class Destination{
    private String city,address;
    public Destination(Order o){
        this.city=o.getCity();
        this.address=o.getAddress();
    }
}
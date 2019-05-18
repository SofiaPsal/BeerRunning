import java.util.ArrayList;
import java.util.List;
public class DestinationList{
    private ArrayList<Destination> dl=new ArrayList<Destination>();
    public DestinationList(){}
    public void updateDestinationList(Destination d){
        dl.add(d);       
    }
    public boolean DestinationListEmpty(){
        if(dl.size()==0)
            return true;
        else
            return false;
    }
}
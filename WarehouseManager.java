
/**
 * @author Maria
 */

import java.util.*; 
import java.util.Scanner;

public class WarehouseManager extends User
{
    // instance variables 
    private int id;
    private boolean exist;
    private int selectUp;
    public int message;
    protected static int capacity;
    public String rMessage; //minima apo dieuth paragwgis
    
    List<Integer> place = new ArrayList<Integer>(); 
    List<String> sMessage = new ArrayList<String>();
    
    /**
     * Constructor for objects of class WarahouseManager
     */
    public WarehouseManager(int id, String name, String email, int phone, String address, int AFM)
    {
        // initialise instance variables
        super(id, name, email, phone, address, AFM);
        id = 0;
        exist = false; 
        selectUp = 0;
        message = 0;
    }

    public void selectUpdate()
    {
        if (selectUp == 1)
        {
          show();
          fillID();
        }
        else if(message > 0)
        {
          receiveMessage();
        }
        return;
    }
    public boolean IDExists(int id)
    {
        if (this.id == id)
        {
          show();
          return exist;
        }
        else
        {
          System.out.print("Wrong ID. Try again, please. ");
          fillID();
        }
        return false;
    }
    public int fillID()
    {
        if(IDExists(this.id) == true)
        {
        System.out.print("Fill the ID, please. ");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        this.id = num;
       }
       return this.id;
    }
    public void receiveMessage()
    {
        sMessage.add(new String(rMessage));
        placeProduct();
        return;
    }
    public void placeProduct()
    { 
        for (int i = 1; i < capacity; i++)
        {
          place.add(i);   
          System.out.println(place);
          show();
        }
        return ;
    }
    public void show()
    {
    
        return;
    }
}

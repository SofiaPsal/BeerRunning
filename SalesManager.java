
/**
 * @author Maria
 */

import java.util.*; 
import java.util.Scanner;

public class SalesManager
{
    // instance variables 
    private int addCust;
    private String action;
    private String form;
     
    List<String> customers = new ArrayList<String>();
  
     /**
     * Constructor for objects of class SalesManager
     */
    public SalesManager()
    {
        // initialise instance variables
        addCust = 0;
        action = "selectCust";
        form = "nothing";
    }

    public void selectEditCustomer()
    {
        System.out.print("Choose energy , please. ");
        if (action == "selectCust")
        {
          selectList();
        }
        else if (action == "selectAdd")
        {
          selectAdd();
        }
        else
        {
          ProductStatistics.selectStatistics();
        }
        return;
    }
    public void selectList()
    {
        show();
        return;
    }
    public void selectCustomer()
    {
        System.out.print("Choose a customer, please. ");
        System.out.println(customers);
        Scanner input = new Scanner(System.in);
        String inputString = input.nextLine();
        return;
    }
    public void selectAdd()
    {
        while (addCust == 1)
        {
          Scanner input = new Scanner(System.in);
          System.out.print("Enter new customer, please. ");
          String inputString = input.nextLine();
          List<String> customers = Arrays.asList(inputString);
          System.out.println(customers);
          formCompletion();
          return;
        }
    }
    public void formCompletion()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Form the list, please. ");
        String inputString = input.nextLine();
        form = inputString;
        System.out.println(form);
        return;
    }
    public static void show()
    {
         
        return;  
    }
    public static void edit()
    {
        
        return;
    }
    public static void save()
    {
        
       return;
    }
}

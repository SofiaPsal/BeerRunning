public class Category{
    int i=0;
    private String name;
    public Customer[] customerList=new Customer[100];
    public Category(String n){this.name=n;}
    public void addtoCategory(Customer c){
        this.customerList[i]=c;
        i++;
    }
}
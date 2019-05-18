import java.util.Date;
public class Order{
    private String city,address,receiver,prodCategory,orderStatus;
    private int quantity,orderId;
    private Date orderDate;
    
    public Order(String city,String address,String receiver,String prodCategory,String orderSatus,int quantity, int orderId,Date od){
        this.city=city;
        this.address=address;
        this.receiver=receiver;
        this.prodCategory=prodCategory;
        this.orderStatus=orderStatus;
        this.quantity=quantity;
        this.orderId=orderId;
        this.orderDate=od;
        
    }
    public String getReceiver(){return receiver;}
    
    public String getCity(){return city;}
    public String getAddress(){return address;}
    public String getProdCategory() {
        return prodCategory;
    }
    public void setProdCategory(String prodCategory) {
        this.prodCategory = prodCategory;
    }
    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public int getOrderID() {
        return orderId;
    }
    public void setOrderID(int orderId) {
        this.orderId = orderId;
    }
    public Date getOrderDate(){
        return orderDate;
    }
    public void setOrderDate(Date orderDate){
        this.orderDate = orderDate;
    }
    public String getOrderStatus(){
        return orderStatus;
    }
    public void setOrderStatus(String orderStatus){
        this.orderStatus = orderStatus;
    }
    public void updateOrder(String status){
        this.orderStatus=status;
    }  
    
}
import java.util.Date;

public class Request {
   
    private int requestId;
    private int sender;
    private int receiver;
    private Date requestDate;
    private String comments;
    
    //class constructor
    public Request()
    {
        // initialise instance variables
        requestId = 0;
        sender = 0;
        receiver = 0;
        requestDate = new Date();
        comments = "0";
    }
    
    //getters and setters
    public int getRequestId() {
        return requestId;
    }
    public void setRequestId(int requestId) {
        this.requestId = requestId;
    }
    public int getSender() {
        return sender;
    }
    public void setSender(int sender) {
        this.sender = sender;
    }
    public int getReceiver() {
        return receiver;
    }
    public void setReceiver(int receiver) {
        this.receiver = receiver;
    }
    public Date getRequestDate(){
        return requestDate;
    }
    public void setRequestDate(Date requestDate){
        this.requestDate = requestDate;
    }
    public String getComments(){
        return comments;
    }
    public void setComments(String comments){
        this.comments = comments;
    }
    
    //Request's functions
    public void finalRequest() {
        if (requestId != 0 && sender != 0 && receiver != 0)
        {
            System.out.println("The request is ready to be sent.");
        }
        else
        {
            System.out.println("The request is missing data.");           
        }
        
    }
    

}
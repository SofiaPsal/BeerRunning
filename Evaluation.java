import java.util.Date;

public class Evaluation {
    
    private Date evDate;
    private String comments;
    private enum evalValue {UNSATISFACTORY,
                            SATISFACTORY,
                            GOOD,
                            AMAZING}
        
    //getters and setters
    public Date getEvDate() {
        return evDate;
    }
    public void setEvDate(Date evDate) {
        this.evDate = evDate;
    }
    public String getComments() {
        return comments;
    }
    public void setComments(String Comments) {
        this.comments = comments;
    }
    
    
}
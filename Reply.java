import java.util.ArrayList;
import java.util.List;

public class Reply{
    private String receiver, sender, subject, text;
    
    public Reply(String receiver, String subject, String text){
        this.receiver = receiver;
        this.subject = subject;
        this.text = text;
        this.sender = "Administrator";
    }
    public boolean FilledReceiver(){
        if(receiver==" "){
            return(false);
        }else{
            return(true);
        }
    }
    public boolean FilledSubject(){
        if(subject!=" " && FilledReceiver()==true){
            return(true);
        }else{
            return(false);
        }

    }
}
    
        
        
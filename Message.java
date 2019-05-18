import java.util.ArrayList;
import java.util.List;

public class Message{
     public int i=0;
   private String sender, receiver, subject, text = " ";
  public Message[] emailList = new Message[100];
   public Message(String sender, String receiver, String subject, String text){
       this.sender = sender;
       this.receiver = receiver;
       this.subject = subject;
       this.text = text;
    }
   public void addMessage(Message m){
      
       emailList[i]=m;
       i++;
         
        }
        public String getSender(){
            return(sender);
        }     
        
        public String getReceiver(){
            return(receiver);
        }
        public String getSubject(){
            return(subject);
        }
        public String getText(){
            return(text);
        }
        public void getMessInfo(Message m){
            System.out.println("m.getSender() + m.getReceiver() + m.getSubject() + m.getText()");
        }
         public String toString(){
             return("Sender:" + sender+ "Subject:" + subject); 
            
            } 
  public boolean MessageCount(Message[] emailList){
    if(emailList[0]==null){
        return false;
    }else{
    return true;
}
}

}


 
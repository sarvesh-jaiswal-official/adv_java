import java.awt.*;

public class Inst_Frame {
   Inst_Frame(){
        Frame fr=new Frame();       
		fr.setSize(500, 300);
		fr.setLayout(new FlowLayout());
		fr.setVisible(true);
		Label lb = new Label("UserId: "); 
		fr.add(lb);           
        TextField t = new TextField();
        fr.add(t);
   }
   public static void main(String args[]){
       Inst_Frame ex = new Inst_Frame(); 
   }   
}
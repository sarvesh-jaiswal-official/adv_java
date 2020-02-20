import java.awt.*;

public class Ext_Frame extends Frame{
    Ext_Frame(){  
        setSize(500,300); 
        setTitle("Extending Frame AWT example"); 
        setLayout(new FlowLayout());
        setVisible(true); 
		Button b=new Button("OK"); 
        add(b);		
    }  
    public static void main(String args[]){  
        Ext_Frame fr=new Ext_Frame();  
    }
}
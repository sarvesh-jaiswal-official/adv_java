import java.awt.*;

public class Panel_Demo {
		private static Frame f1;
		private  static Label l1;
		private static Label l2;   
		private static Panel p1;
   
    public static void main(String[] args){
		
      f1 = new Frame("Panel_Demo");
      f1.setSize(400,400);
      f1.setLayout(new FlowLayout());
         
      l1 = new Label("he");
	  l2 = new Label("hi");
            
      p1 = new Panel();
      p1.setLayout(new FlowLayout());
	  p1.setBackground(Color.green);

      f1.add(l1);
      f1.add(p1);
      f1.setVisible(true);

	  Panel p2 = new Panel();
      p2.setBackground(Color.magenta);
      p2.setLayout(new FlowLayout());        
      p2.add(l2);
f1.add(p2);
      //p1.add(p2);
   }
}
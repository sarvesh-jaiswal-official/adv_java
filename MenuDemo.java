import java.awt.*;  
class MenuDemo
{  
    MenuDemo(){  
        Frame f= new Frame("Menu Example");  
         MenuBar mb=new MenuBar();  
         Menu m1=new Menu("First Menu");  
         
		 MenuItem i1=new MenuItem("Menu Item 1");  
         MenuItem i2=new MenuItem("Menu Item 2");  
		 
		 Menu submenu=new Menu("Sub Menu 1");  
         CheckboxMenuItem si1=new CheckboxMenuItem("Sub Menu Item 1");  
         MenuItem si2=new MenuItem("Sub Menu Item 2");  
         submenu.add(si1);  
         submenu.add(si2);  
		 
         m1.add(i1);  
         m1.add(i2);  
         m1.add(submenu);  
         
		 mb.add(m1);  
         f.setMenuBar(mb);  
         f.setSize(400,400);  
         f.setLayout(null);  
         f.setVisible(true);  
}  
public static void main(String args[])  
{  
MenuDemo z = new MenuDemo();  
}  
}  
import java.awt.*;
import javax.swing.*;
/*
<applet code="JButtonDemo" width=250 height=300>
</applet>
*/
public class JButtonDemo extends JApplet {
public void init() {
Container contentPane = getContentPane();
contentPane.setLayout(new FlowLayout());

ImageIcon france = new ImageIcon("france.gif");
ImageIcon f1 = new ImageIcon("Picture1.png");
ImageIcon f2 = new ImageIcon("Picture2.png");

JButton jb = new JButton(france);
contentPane.add(jb);

jb.setPressedIcon(f1);
jb.setRolloverIcon(f2);
}
}
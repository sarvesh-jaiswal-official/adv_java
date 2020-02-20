import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/*
<applet code="JRadioButtonDemo" width=300 height=50>
</applet>
*/
public class JRadioButtonDemo extends JApplet {
JTextField tf;
public void init() {

Container contentPane = getContentPane();
contentPane.setLayout(new FlowLayout());

JRadioButton b1 = new JRadioButton("A");
contentPane.add(b1);

JRadioButton b2 = new JRadioButton("B");
contentPane.add(b2);

JRadioButton b3 = new JRadioButton("C");
contentPane.add(b3);

ButtonGroup bg = new ButtonGroup();
bg.add(b1);
bg.add(b2);
bg.add(b3);

tf = new JTextField(5);
contentPane.add(tf);
}
}
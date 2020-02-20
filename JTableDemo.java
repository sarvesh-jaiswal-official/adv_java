import java.awt.*;
import javax.swing.*;
/*
<applet code="JTableDemo" width=400 height=200>
</applet>
*/
public class JTableDemo extends JApplet {
public void init() {

Container contentPane = getContentPane();

contentPane.setLayout(new FlowLayout());

final String[] colHeads = { "Name", "Phone", "Fax" };

final Object[][] data = {
{ "Gail", "4567", "8675" },
{ "Ken", "7566", "5555" },
{ "Viviane", "5634", "5887" },
{ "Melanie", "7345", "9222" },
{ "Helen", "6751", "1415" }
};

JTable table = new JTable(data, colHeads);

int v = ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED;
int h = ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED;
JScrollPane jsp = new JScrollPane(table, v, h);

contentPane.add(jsp);
}
}
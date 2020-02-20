import java.awt.*;
import java.awt.event.*;
/*
<applet code="Event_Demo" width=300 height=100>
</applet>
*/
public class Event_Demo extends java.applet.Applet
implements ActionListener, ItemListener {
private Button button = new Button("Push Me!");
private Checkbox checkbox = new Checkbox("Check Me!");
private Choice choice = new Choice();
private Label label = new Label("Pick something!");
public void init() {
button.addActionListener(this);
checkbox.addItemListener(this);
choice.addItemListener(this);
// An Applet is a Container because it extends Panel.
setLayout(new BorderLayout());
choice.addItem("Red");
choice.addItem("Green");
choice.addItem("Blue");
Panel panel = new Panel();
panel.add(button);
panel.add(checkbox);
panel.add(choice);
add(label, "Center");
add(panel, "South");
}
public void actionPerformed(ActionEvent e) {
if (e.getSource() == button) {
label.setText("The Button was pushed.");
}
}
public void itemStateChanged(ItemEvent e) {
if (e.getSource() == checkbox) {
label.setText("The Checkbox is now " + checkbox.getState() + ".");
} else if (e.getSource() == choice) {
label.setText(choice.getSelectedItem() + " was selected.");
}
}
}
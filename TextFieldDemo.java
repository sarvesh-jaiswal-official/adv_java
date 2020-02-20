import java.awt.*;
import java.applet.*;
/*
<applet code="TextFieldDemo" width=300 height=300>
</applet>
*/
public class TextFieldDemo extends Applet {
TextField name, pass;
	public void init() {
		Label namep = new Label("Name: ");
		Label passp = new Label("Password: ");
		name = new TextField("arkp");
		pass = new TextField(8);
		pass.setEchoChar('?');
		name.setEditable(false);
		add(namep);
		add(name);
		add(passp);
		add(pass);
	}
}
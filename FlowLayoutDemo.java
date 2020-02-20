import java.awt.*;
import java.applet.*;
/*
<applet code="FlowLayoutDemo" width=400 height=400>
</applet>
*/
public class FlowLayoutDemo extends Applet {
String msg;
Checkbox Win98, winNT, sol, mac;
CheckboxGroup cbg;
public void init() {
	cbg = new CheckboxGroup();
	setLayout(new FlowLayout(FlowLayout.RIGHT));
	Win98 = new Checkbox("Windows 98", cbg, true);
	winNT = new Checkbox("Windows NT", cbg, false);
	sol = new Checkbox("Solaris", cbg, false);
	mac = new Checkbox("MacOS", cbg, false);
	add(Win98);
	add(winNT);
	add(sol);
	add(mac);
}

public void paint(Graphics g) {
	msg = "Current selection is: ";
	msg += cbg.getSelectedCheckbox().getLabel();
	g.drawString(msg, 6, 100);
}
}
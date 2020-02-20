import java.awt.*;
import java.applet.*;
/*
<applet code="CBGroup" width=400 height=400>
</applet>
*/
public class CBGroup extends Applet {
String msg;
Checkbox c1, c2, c3, c4;
CheckboxGroup cbg;
public void init() {
	cbg = new CheckboxGroup();
	c1 = new Checkbox("Windows 98", cbg, true);
	c2 = new Checkbox("Windows NT", cbg, false);
	c3 = new Checkbox("Solaris", cbg, false);
	c4 = new Checkbox("MacOS", cbg, false);
	add(c1);
	add(c2);
	add(c3);
	add(c4);
}
}
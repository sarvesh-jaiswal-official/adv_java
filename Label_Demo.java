import java.awt.*;
import java.applet.*;
/*
<applet code="Label_Demo" width=300 height=300>
</applet>
*/
public class Label_Demo extends Applet
{
	public void init()
	{
		Label one = new Label("One");
		Label two = new Label("Two");
		Label three = new Label("Three");
		
		add(one);
		add(two);
		add(three);
	}
}
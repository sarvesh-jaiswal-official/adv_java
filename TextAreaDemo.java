import java.awt.*;
import java.applet.*;
/*
<applet code="TextAreaDemo" width=300 height=300>
</applet>
*/
public class TextAreaDemo extends Applet {
	public void init() {
		String val = "There are two ways of creating " +
		"a frame.\n" +
		" It is in AJP";
		TextArea text = new TextArea(val, 10, 30, TextArea.SCROLLBARS_VERTICAL_ONLY);
		add(text);
	}
}
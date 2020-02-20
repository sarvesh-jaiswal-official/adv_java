import java.awt.*;
import java.applet.*;
/*
<applet code="ChoiceDemo" width=300 height=180>
</applet>
*/
public class ChoiceDemo extends Applet {
Choice browser;

public void init() {

browser = new Choice();

browser.add("Netscape");
browser.add("Internet Explorer");
browser.add("Lynx");

add(browser);
}

}
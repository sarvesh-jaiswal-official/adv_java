import java.awt.*;
import java.applet.*;
/*
<applet code="ListDemo" width=300 height=180>
</applet>
*/
public class ListDemo extends Applet {
List browser;

public void init() {

browser = new List(2,true);

browser.add("Netscape");
browser.add("Internet Explorer");
browser.add("Lynx");

add(browser);
}

}
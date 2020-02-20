import java.awt.*;
import java.applet.*;
/*
<applet code="ButtonList" width=250 height=150>
</applet>
*/
public class ButtonList extends Applet {

Button bList[] = new Button[3];
public void init() {
bList[0] = new Button("Yes");
bList[1] = new Button("No");
bList[2] = new Button("Cancel");

add(bList[0]);
add(bList[1]);
add(bList[2]);
}

public void paint(Graphics g) {
g.drawString("HI", 6, 100);
}
}
import java.awt.*;

class Dialog_Demo
{
	public static void main(String args[])
	{
		Frame f = new Frame("Dialog Demo");
		f.setVisible(true);
		f.setSize(400, 400);
		Dialog d = new Dialog(f, "Dialog", true);
		d.setVisible(true);
	}
}
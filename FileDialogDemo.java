import java.awt.*;


class FileDialogDemo {
public static void main(String args[]) {
Frame f = new Frame("File Dialog Demo");
f.setVisible(true);
f.setSize(100, 100);
FileDialog fd = new FileDialog(f, "File Dialog", FileDialog.LOAD);
fd.setVisible(true);
}
}
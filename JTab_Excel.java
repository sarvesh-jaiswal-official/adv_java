import java.io.*;
import javax.swing.*;
public class JTab_Excel {
    public static void main(String[] args) {
    	final String[] columnNames = { "Stud", "Attendance" };
        final Object[][] data = {
            {"January",   new Integer(150) },
            {"February",  new Integer(500) },
            {"March",     new Integer(54)  },
            {"April",     new Integer(-50) },
            {"May",       new Integer(52)  },
            {"December",  new Integer(59)  } 
        };
        JTable table = new JTable(data, columnNames); 
        File file = new File("Book1.xls");
	    m1(table,file);
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        frame.add( table );
        frame.setVisible( true );
    }
public static void m1(JTable table, File file){
    try{        
        FileWriter fw = new FileWriter(file);
            for(int i = 0; i < table.getColumnCount(); i++)
				fw.write(table.getColumnName(i) + "\t");
            fw.write("\n");

        for(int i=0; i< table.getRowCount(); i++) {
            for(int j=0; j < table.getColumnCount(); j++) 
                fw.write(table.getValueAt(i,j).toString()+"\t");
            fw.write("\n");
        }
        fw.close();

    } catch(IOException e)
    	System.out.println(e); 
}
}
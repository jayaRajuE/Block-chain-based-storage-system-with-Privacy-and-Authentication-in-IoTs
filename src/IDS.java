import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.PrintStream;
import java.math.BigInteger;
import java.net.ServerSocket;
import java.net.Socket;
import java.security.DigestInputStream;
import java.security.MessageDigest;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Vector;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.Timer;
import javax.swing.UIManager;
import javax.swing.border.Border;

public class IDS implements ActionListener {
	JFrame jf;
	Container c;
	JLabel l1, l2, l3, l4, l5, l6, l7, l8, l9, l10, l11, l12;
	JPanel p1, p2;
	JButton b1,b2, b3, b4;
	JScrollPane sp;
	JTextArea ta;
	JTextField t1;
	MenuBar mbr;
	Menu file;
	MenuItem  item2, users,csfile,exit;
	Border b11, b22, b33;
	JScrollPane pane;
	String Scheme1, rank;
	String f1 = "", f2 = "", f3 = "", f4 = "", f5 = "", f6 = "", f7 = "",f8 = "";
	int count = 0;
	Timer timer;

	ImageIcon one,two,three,four,arrow1,arrow2,arrow3,arrow4,arrow5,arrow6;
	JLabel onel,twol,threel,fourl,arrow1l,arrow2l,arrow3l,arrow4l,arrow5l,arrow6l,arrow7l,arrow8l;
	JLabel lab1,lab2,lab3,lab4,lab5,lab6,lab7,lab8,lab9,lab10,lab11;
	
	
	public Font f = new Font("Times new roman", Font.BOLD, 14);
	public Font font = new Font("Times new roman", Font.BOLD, 18);
	
	JLabel mg1, mg2, mg3, mg4, mg5, mg6, mg7, mg8, mg9, mg10, g11, g22, g33,
			g44, g55, g66, g77;

	
	String keyWord = "ef50a0ef2c3e3a5fdf803ae9752c8c66";

	IDS() {
		jf = new JFrame("IDS MANAGER :: Blockchain based Data Storage with Privacy and Authentication in Internet of Things");
		c = jf.getContentPane();
		c.setLayout(null);
		
		c.setBackground(Color.orange);
		mbr = new MenuBar();
		file = new Menu("IDS MANAGER");
		item2 = new MenuItem("View Attackers");
		exit = new MenuItem("Exit");
		item2.addActionListener(this);
		exit.addActionListener(this);
	//	file.add(item2);
		
	//	file.add(exit);
	//	mbr.add(file);
//	/	jf.setMenuBar(mbr);
		
		b1=new JButton("Detect Attackers");
		b1.setBounds(380, 510, 120, 30);
		b1.addActionListener(this);
		
		c.add(b1);
		
		jf.setBounds(40, 0, 900,600);
		jf.show();

		int[] ports = new int[] {309};
		
		for (int i = 0; i < 1; i++) {
			Thread t2 = new Thread(new PortListener(ports[i]));
			t2.start();
		}
	}

	public static void main(String args[])
	{
//		new CloudServer();
		try {
			UIManager
					.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new IDS();
			}
		});
	}
	public void actionPerformed(ActionEvent e) {
		Object o = e.getSource();
		

		if (o == b1) {
			
			try {

				Vector heading = new Vector();

				
				heading.addElement("Node Name");
				heading.addElement("Malicious Data");
				heading.addElement("Date");
			
				Vector data = new Vector();

				String query = "SELECT * FROM ids";

				Dbcon db = new  Dbcon();
				Connection con = db.getConnection();
				
				ResultSet rs =con.createStatement().executeQuery(query);
				

				ResultSetMetaData rsm = rs.getMetaData();
				int col = rsm.getColumnCount();

				while (rs.next()) {
					Vector row = new Vector();
					for (int i = 1; i <= col; i++) {
						row.addElement(rs.getObject(i));

					}

					data.addElement(row);
				}

				JTable table = new JTable(data, heading);

				JScrollPane pane = new JScrollPane(table);

				pane.setBounds(20,30,840,450);
				c.add(pane);

			} catch (Exception ex) {
				ex.printStackTrace();
		}
			
			}
			
		
		if(o==item2)
		{
//			ViewAttacker r1 = new ViewAttacker();
//			r1.setSize(700, 400);
//			r1.setVisible(true);
		}

		
		if(o == exit)
		{
			System.exit(0);
		}
	}

class PortListener implements Runnable {
		
		int port;

		public PortListener(int port) {
			this.port = port;
		}

		public void run() {
			
			
			if (this.port == 309)
			{

				try
				{
					ServerSocket server909 = new ServerSocket(309);
					Socket con777;
					
					
					while (true) 
					{
						Dbcon db = new Dbcon();
						Connection connect = db.getConnection();
					con777 = server909.accept();
					
					DataInputStream din = new DataInputStream(con777.getInputStream());
				
					String node = din.readUTF();
					String mac  = din.readUTF();
					String dt =din.readUTF();
//					SimpleDateFormat dateFormat = new SimpleDateFormat();
//				       //get current date time with Date()
//				    Date date = new Date();
//				       
//				    String dt=dateFormat.format(date);
//				    
				    connect.createStatement().executeUpdate("insert into ids values('"+node+"','"+mac+"','"+dt+"')");
					
					DataOutputStream dos2 = new DataOutputStream(con777.getOutputStream());
					dos2.writeUTF("success");
					
					}
				}catch (Exception e) {
					e.printStackTrace();
				}
			
			
			}
			
		}


}
	
}

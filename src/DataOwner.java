import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.math.BigInteger;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;
import java.security.DigestInputStream;
import java.security.MessageDigest;
import java.sql.Connection;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import javax.sound.sampled.AudioFormat.Encoding;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import java.net.*;
public class DataOwner implements ActionListener {
	public Font f = new Font("Times new roman", Font.BOLD, 35);
	public Font f1 = new Font(" Times new roman", Font.BOLD, 18);
	public Font f2 = new Font("Times new roman", Font.BOLD, 18);
	public Font f3 = new Font("Times new roman", Font.BOLD, 16);
	public JLabel T0 = new JLabel("Source");
	public JLabel T1 = new JLabel("Select the Method");
	public JLabel T2 = new JLabel("HMAC                 :");
	public JLabel T3 = new JLabel("File Path            :");
	public JLabel T4 = new JLabel();
	public JLabel T5 = new JLabel("Select The Route");
	public JLabel T6 = new JLabel("FA    -Foriegn Agent");
	public JLabel T7 = new JLabel("GFA   -Gateway Foriegn Agent");
	public JLabel T56 = new JLabel();
	public JTextField txt1=new JTextField();
	
	public JCheckBox chk1 = new JCheckBox("");
	public JComboBox TAreu = new JComboBox();
	public JButton btn = new JButton("Submit");
	public JButton send = new JButton("Init HMAC");
	public JButton enc = new JButton("Encrypt");
	public JTextArea tf = new JTextArea();
	public JTextArea tff = new JTextArea();
	
	public JScrollPane pane = new JScrollPane();
	public JScrollPane pane1 = new JScrollPane();
	public JButton btn1 = new JButton("Browse");

	JLabel imageLabel = new JLabel();
	JLabel image = new JLabel();
	JLabel imageLabel1 = new JLabel();
	JLabel image1 = new JLabel();

	JLabel imageLabel2 = new JLabel();
	JLabel image12 = new JLabel();

	JPanel jp = new JPanel();
	JPanel jp1 = new JPanel();

	public JFrame jf;
	public Container c;
	
	String content="";
	String path="";
	String mac="";
	String file="";
	
	int[] endata;
	DataOwner() {
		jf = new JFrame("Data Owner::Blockchain based Data Storage with Privacy and Authentication in Internet of Things");
		c = jf.getContentPane();
		c.setLayout(null);
		jf.setSize(900, 650);
		// c.setBackground(Color.DARK_GRAY);

		c.setBackground(Color.yellow);
		T0.setBounds(450, 30, 350, 45);
		T0.setFont(f);
		
		txt1.setBounds(400, 120, 200,25);
		txt1.setForeground(Color.MAGENTA);
		txt1.setVisible(false);
		
		ImageIcon im = new ImageIcon(this.getClass().getResource("SourceBack.PNG"));
		JLabel image = new JLabel();
	    image.setIcon(im);
		image.setBounds(50,50,800,520);
		

		T0.setForeground(Color.WHITE);
		T2.setBounds(170, 210, 250, 45);
		T2.setFont(f2);
		T2.setForeground(Color.WHITE);

		T3.setBounds(170, 160, 250, 45);
		T3.setFont(f2);
		T3.setForeground(Color.WHITE);

		T4.setBounds(370, 160, 950, 45);
		T4.setFont(f2);
		T4.setForeground(Color.cyan);

		T56.setBounds(370, 210, 950, 45);
		T56.setFont(f2);
		T56.setForeground(Color.cyan);
		
		T5.setBounds(630, 145, 300, 45);
		T5.setFont(f2);
		T5.setForeground(Color.CYAN);

		T6.setBounds(730, 70, 400, 35);
		T6.setFont(f2);
		T6.setForeground(Color.RED);

		T7.setBounds(760, 110, 400, 35);
		T7.setFont(f2);
		T7.setForeground(Color.magenta);

		btn1.setBounds(590, 150, 150, 33);
		btn1.setFont(f2);
		// btn1.setBackground(Color.WHITE);
		btn1.setForeground(new Color(120, 0, 0));

		jp.setBounds(75, 90, 719, 450);
		jp.setBackground(Color.DARK_GRAY);
		// jp1.setBackground(new Color(120,0,0));
	//	jp1.setBounds(155, 124, 723, 453);

		T1.setBounds(270, 520, 250, 45);
		TAreu.setBounds(620, 520, 200, 35);
		btn.setBounds(570, 490, 150, 33);
		T1.setFont(f3);
		T1.setForeground(new Color(0, 120, 0));
		btn.setFont(f2);
		// btn.setBackground(Color.WHITE);
		btn.setForeground(new Color(120, 0, 0));
		
		send.setBounds(430,490,130,33);
		send.setFont(f2);
		send.setForeground(new Color(120,0,0));
		
		enc.setBounds(300,490,110,33);
		enc.setFont(f2);
		enc.setForeground(new Color(120,0,0));
		
		TAreu.addItem("Mesh Route");
		TAreu.addItem(" Node ");
		TAreu.setFont(f3);
		TAreu.setBackground(Color.WHITE);
		TAreu.setForeground(Color.BLUE);
		TAreu.setFont(f);
		pane.setBounds(355, 250, 400, 200);

		tf.setColumns(20);

		tf.setForeground(Color.MAGENTA);
		tf.setFont(f2);
		tf.setRows(10);
		tf.setName("tf");
		pane.setName("pane");
		pane.setViewportView(tf);

		tf.setColumns(30);

		tff.setForeground(Color.MAGENTA);
		tff.setFont(f2);
		tff.setRows(10);
		tff.setName("tff");
		pane1.setName("pane1");
		pane1.setViewportView(tff);
		tff.setVisible(false);
		
		btn1.addActionListener(this);
		btn.addActionListener(this);
		send.addActionListener(this);
		enc.addActionListener(this);
		

		btn1.setMnemonic(KeyEvent.VK_B);
		btn.setMnemonic(KeyEvent.VK_S);
		jf.show();

		c.add(btn);
		c.add(send);
		c.add(enc);
		c.add(T2);
		c.add(T3);
		c.add(T4);
		c.add(T56);
		c.add(txt1);
		c.add(pane, BorderLayout.CENTER);
		c.add(btn1);
		

		//c.add(jp);
		c.add(jp1);

		jf.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent win) {
				System.exit(0);
			}
		});
		
		
		c.add(image);

	}

	public void actionPerformed(ActionEvent e) {
		// DataInputStream input;

		// BufferedInputStream bis;
		BufferedOutputStream bos = null;
		
		String str = " ";
		byte[] byteArray = str.getBytes();

		String strLine = null;
		if (e.getSource() == btn1) {

			JFileChooser chooser = new JFileChooser();

			try {

				File f = new File(new File("filename.txt").getCanonicalPath());

				chooser.setSelectedFile(f);
			} catch (IOException e1) {
			}

			chooser.showOpenDialog(btn1);
			int retval = chooser.showOpenDialog(btn1);

			if (retval == JFileChooser.APPROVE_OPTION) {
				File field = chooser.getSelectedFile();
				path=field.getAbsolutePath();
				file= field.getName();
				T4.setText(field.getAbsolutePath());
			}

			File curFile = chooser.getSelectedFile();
			try {

				FileInputStream fstream = new FileInputStream(curFile);

				DataInputStream ins = new DataInputStream(fstream);
				BufferedReader br = new BufferedReader(new InputStreamReader(
						ins));

				StringBuffer buffer = new StringBuffer();

				while ((strLine = br.readLine()) != null) {

					buffer.append(strLine + "\n");
				}
				String f = curFile.getName();
				txt1.setText(f);
				
				System.out.println(path);
				tf.setText(buffer.toString());
				tff.setText(buffer.toString());
				content = tf.getText();
				PrintStream pout=new PrintStream(new FileOutputStream("sender\\"+file+".txt"));
				pout.print(content);
				pout.close();
				   MessageDigest md = MessageDigest.getInstance("SHA1");
				   FileInputStream in1 = new FileInputStream("sender\\"+file+".txt");
				   DigestInputStream dis2 = new DigestInputStream(in1, md);
				   BufferedInputStream bd = new BufferedInputStream(dis2);
				   
				   while (true) {
						int b2 = bd.read();
						if (b2 == -1)
							break;
					}
		 
					BigInteger bi2 = new BigInteger(md.digest());
					mac = bi2.toString(16);
					System.out.println(mac);


			} catch (Exception e1) {
				System.err.println("Error: " + e1.getMessage());
			}
			

		}
		

		if (e.getSource() == enc) {
			
			
			String str1 = tf.getText();
			Encryption encryption = new Encryption();
			endata = encryption.ecies_ex(str1);
			tf.setText("");
			for (int i = 0; i < endata.length; i++) {
				tf.append(" " + endata[i]);
			
			}
			
		}
		if (e.getSource() == send) {
			
			try
			{
				String cont = tf.getText();
				
				if(cont.equalsIgnoreCase(tff.getText()))
				{
					JOptionPane.showMessageDialog(null, "Please Encrypt The Content");
				}
				else
				{
					
				//	Thread.sleep(1000);
					
					
					String fname = txt1.getText();
					PrintStream out = null;
					try {
					    out = new PrintStream(new FileOutputStream("Sender\\"+fname));
					    out.print(cont);
					}
					finally {
					    if (out != null) out.close();
					}
					MessageDigest md1 = MessageDigest.getInstance("SHA1");
					FileInputStream in11 = new FileInputStream("Sender\\"+ fname);
					DigestInputStream dis21 = new DigestInputStream(in11, md1);
					BufferedInputStream bd1 = new BufferedInputStream(dis21);

					while (true) {
						int b2 = bd1.read();
						if (b2 == -1)
							break;
					}

					BigInteger bi21 = new BigInteger(md1.digest());
					String mac = bi21.toString(16);
					System.out.println(mac);
					
					T56.setText(mac);
					
					String ip = JOptionPane.showInputDialog(null, "Please Enter Router IP Address");
					
					Socket client = new Socket(ip, 1414);

					DataOutputStream dos1 = new DataOutputStream(client.getOutputStream());
					dos1.writeUTF(fname);
					dos1.writeUTF(mac);
					
					DataInputStream dos11 = new DataInputStream(client.getInputStream());
					dos11.readUTF();
					
					JOptionPane.showMessageDialog(null, "Nodes Initialised Successfully");
					
				}
				
			}catch (Exception e3) {
				// TODO: handle exception
			}
		}
		if (e.getSource() == btn) {

				String[] node1 = { "A", "B" , "C" };
				String Snode1 = (String) JOptionPane.showInputDialog(null,
						"Select Destination Node", "node",
						JOptionPane.QUESTION_MESSAGE, null, node1, node1[0]);

				Socket client = null;

				try { 
					
					String cont = tf.getText();
					String fname = txt1.getText();
					PrintStream out = null;
					try {
					    out = new PrintStream(new FileOutputStream("Sender\\"+fname));
					    out.print(cont);
					}
					finally {
					    if (out != null) out.close();
					}
					MessageDigest md1 = MessageDigest.getInstance("SHA1");
					FileInputStream in11 = new FileInputStream("Sender\\"+ fname);
					DigestInputStream dis21 = new DigestInputStream(in11, md1);
					BufferedInputStream bd1 = new BufferedInputStream(dis21);

					while (true) {
						int b2 = bd1.read();
						if (b2 == -1)
							break;
					}

					BigInteger bi21 = new BigInteger(md1.digest());
					String mac1 = bi21.toString(16);
					System.out.println(mac1);
					
					SimpleDateFormat dateFormat = new SimpleDateFormat();
				    Date date = new Date();
				    String dt = dateFormat.format(date);
				
				    String ip = JOptionPane.showInputDialog(null, "Please Enter Router IP Address");
				    
					client = new Socket(ip, 2001);
					
					
					ObjectOutputStream dos1 = new ObjectOutputStream(client.getOutputStream());
					dos1.writeObject(endata);
					dos1.writeObject(cont);
					dos1.writeObject(mac1);
					dos1.writeObject(fname);
					dos1.writeObject(Snode1);
					dos1.writeObject(dt);
					
					ObjectInputStream oiss = new ObjectInputStream(client.getInputStream());
                    String msg = oiss.readObject().toString();
			
                    System.out.println(msg);
                    if(msg.equalsIgnoreCase("success"))
                    {
                    	JOptionPane.showMessageDialog(null, "Data Sent Successfully");
                    }
		}
			catch(Exception ex) {ex.printStackTrace();
			 
			 }

			}	
		}

	public static void main(String args[]) {
		new DataOwner();
	}
}

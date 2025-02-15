import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemListener;
import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.security.DigestInputStream;
import java.security.MessageDigest;
import java.sql.Connection;
import javax.swing.*;


public class MalaciousAttacker extends JFrame implements ActionListener
{
	JPanel p1;
	JLabel l1,l2,l3;
	JTextField t1,t2;
	JTextArea ta;
	JScrollPane pane;
	JButton b1,b2;
	String keyWord = "ef50a0ef2c3e3a5fdf803ae9752c8c66";
	
	JComboBox c1,n;
	JTextField c2;
	
	public Font f1 = new Font("Times new roman", Font.BOLD, 25);
	public Font f2 = new Font("Times new roman", Font.BOLD, 15);
	
	MalaciousAttacker()
	{
		p1=new JPanel();
		p1.setLayout(null);
		p1.setBackground(Color.red);
		setTitle("Malacious Attacker :: Blockchain based Data Storage with Privacy and Authentication in Internet of Things");
		
		l2=new JLabel("Select Node");
		l2.setFont(f2);
		l2.setForeground(Color.white);
		l2.setBounds(80,160,100,30);
		
		l3=new JLabel("Malicious Data ");
		l3.setFont(f2);
		l3.setForeground(Color.white);
		l3.setBounds(80,230,130,30);
		
		t1=new JTextField();
		t1.setBounds(210,240,200,220);
		
//		c1.setBounds(210,100,100,25);
		
		c2=new JTextField();
//		c1.addActionListener(this);
		
		c2.setBounds(210,150,100,25);
		
		b1=new JButton("Get Energy");
		b1.setBounds(100,335,100,25);
		
		b2=new JButton("Attack");
		b2.setBounds(190,525,200,35);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		
		n=new JComboBox();
		n.addItem("Node3");
		n.addItem("Node4");
		n.addItem("Node9");
		n.addItem("Node10");
		n.addItem("Node15");
		n.addItem("Node16");
		
		n.setBounds(210,160,200,30);
		n.addActionListener(this);

		
//		p1.add(l1);
		p1.add(l2);
		p1.add(n);
		p1.add(t1);
		p1.add(l3);
		p1.add(b2);
		add(p1);
		setSize(610,660);
		setVisible(true);
		
		
	}
	
	public static void main(String[] args) 
	{
		new MalaciousAttacker();
		
		try
		{
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
		}
		catch(Exception es){System.out.println(es);}
		
	}
	
	
	public void actionPerformed(ActionEvent a1) 
	{
		if(a1.getSource()==b2)
		{
			try
			{
				InetAddress ia = InetAddress.getLocalHost();
				String ip = ia.getHostAddress();
				String node=(n.getSelectedItem()).toString();
				String maldata=t1.getText();
				String file="attack";
				PrintStream out = new PrintStream(new FileOutputStream("Attacker\\"+file+".txt"));
			    out.print(t1.getText());
				out.close();
				
				MessageDigest md = MessageDigest.getInstance("SHA1");
				FileInputStream in1 = new FileInputStream("Attacker\\" + file+".txt");
				DigestInputStream dis2 = new DigestInputStream(in1, md);
				BufferedInputStream bd = new BufferedInputStream(dis2);

				while (true) {
					int b2 = bd.read();
					if (b2 == -1)
						break;
				}

				BigInteger bi2 = new BigInteger(md.digest());
				String mac = bi2.toString(16);
				System.out.println("New MAC : "+mac);
				
				
					Socket s12=new Socket("localhost",1412);
					DataOutputStream dos5=new DataOutputStream(s12.getOutputStream());
					dos5.writeUTF(node);
					dos5.writeUTF(mac);
					dos5.writeUTF(maldata);
					DataInputStream in5=new DataInputStream(s12.getInputStream());
					String msg=in5.readUTF();
					
					if(msg.equalsIgnoreCase("attack"))
					{
						JOptionPane.showMessageDialog(null,"Successfully Attacked");
					}
					if(msg.equalsIgnoreCase("block"))
					{
						JOptionPane.showMessageDialog(null,"You Are Blocked");
					}
					if(msg.equalsIgnoreCase("nofile"))
					{
						JOptionPane.showMessageDialog(null,"File Not Found");
					}
					
			}catch(Exception es){System.out.println(es);}
		}
	}
}
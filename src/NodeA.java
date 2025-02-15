import java.awt.BorderLayout;

import javax.swing.Timer;

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
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;
import java.sql.DriverManager;

import javax.swing.BorderFactory;
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
import javax.swing.UIManager;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;







import java.io.*;
import java.awt.event.*;
import java.sql.*;

public class NodeA extends JFrame implements ActionListener {

	
	Socket socket;
	ServerSocket serverSocket;

	public Font f = new Font("Times new roman", Font.BOLD, 22);
	public Font f1 = new Font("Times new roman", Font.BOLD, 15);
	public Font f2 = new Font("Arial", Font.BOLD, 14);
	public Font f3 = new Font("Times new roman", Font.BOLD, 18);
	
	public JTextArea tf = new JTextArea();
	public JScrollPane pane = new JScrollPane();
	
	ImageIcon ic;
	JLabel l5;
	JButton b1;
	public JFrame jf;
	public Container c;
	FileOutputStream fout;
	String fname, tot;
	String keyWord = "ef50a0ef2c3e3a5fdf803ae9752c8c66";
	String data;
	NodeA() {
		//	ImageIcon img1 = new ImageIcon(this.getClass().getResource("Node.png"));
        

		jf = new JFrame("Receiver A::Blockchain based Data Storage with Privacy and Authentication in Internet of Things");
		c = jf.getContentPane();
		c.setLayout(null);
		jf.setSize(600,600);
		jf.setResizable(false);
		c.setBackground(Color.cyan);
	
		b1 = new JButton("SAVE");
		b1.setBounds(250, 520, 100, 30);
		c.add(b1);
		b1.addActionListener(this);
		
		Border b11=BorderFactory.createLineBorder(Color.black,2);
		
		
		TitledBorder b22=new TitledBorder(b11);
		b22.setTitle("File Receiving");
		b22.setTitleColor(Color.blue);
		b22.setTitleFont(f2);
		JLabel bord =new JLabel();
		bord.setBorder(b22);
		bord.setBackground(Color.black);
		bord.setBounds(80, 110, 440, 310);
		c.add(bord);

		
		pane.setBounds(90, 130, 410, 280);

		tf.setColumns(20);

		tf.setForeground(Color.MAGENTA);
		tf.setFont(f1);
		tf.setRows(10);
		tf.setName("tf");
		tf.setEditable(false);
		pane.setName("pane");
		pane.setViewportView(tf);
		
		jf.show();
		
		c.add(pane, BorderLayout.CENTER);
		
		jf.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent win) {
				System.exit(0);
			}
		});
		
		int[] ports = new int[] {100};
		for(int i=0;i<1;i++)
		{
			Thread th = new Thread(new PortListener(ports[i]));
			th.start();
		}
		
	
	}
	
	class PortListener implements Runnable
	{
		
		int port;
		
		public PortListener(int port)
		{
			this.port=port;
		}
		
		public void run()
		{
			if(this.port==100)
			{
				try {
					
//					ImageIcon img11 = new ImageIcon(this.getClass().getResource("GreenReceiverA.jpeg"));
//					imagelabel.setIcon(img11);
//					imagelabel.setBounds(280, 140, 550, 300);
					
					ServerSocket serverSocket = new ServerSocket(100);
					System.out.println("i am ReceiverA & listening...");

					while (true) {
						socket = serverSocket.accept();
						
						ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
						  fname = ois.readObject().toString();
                        String dec = ois.readObject().toString();
                  
						tf.setText(dec);
						
						ObjectOutputStream dos = new ObjectOutputStream(socket.getOutputStream());
						dos.writeObject("success");
						
					}

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	public static void main(String args[]) {
		//new NodeA();
		
				new NodeA();
		
	}

	public void actionPerformed(ActionEvent a1) 
	{
		if(a1.getSource()==b1)
		{
			String data= tf.getText();
			try
			{
				PrintStream out1 = null;
				try {
				    out1= new PrintStream(new FileOutputStream("NodeA\\"+fname));
				    out1.print(data);
				}
				finally {
				    if (out1 != null) out1.close();
				}
				
				JOptionPane.showMessageDialog(null,"File Stored Successfully");
				tf.setText("");
			}catch(Exception es){System.out.println(es);}
		}
		
		
		
		
	}
	

}



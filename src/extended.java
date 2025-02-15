

	
	import java.awt.BorderLayout;
	import java.awt.Color;
	import java.awt.Container;
	import java.awt.Font;
	import java.awt.event.WindowAdapter;
	import java.awt.event.WindowEvent;
	import java.io.DataInputStream;
	import java.io.DataOutputStream;
	import java.io.FileOutputStream;
	import java.io.PrintStream;
	import java.net.ServerSocket;
	import java.net.Socket;
	import java.sql.Connection;
	import java.sql.ResultSet;
	import java.sql.Statement;
	import javax.swing.JFrame;
	import javax.swing.JOptionPane;
	import javax.swing.JScrollPane;
	import javax.swing.JTextArea;




	public class extended
	{
		public Font l = new Font("Times New Roman",Font.BOLD,18);
		JFrame jf;
		Container c;
		JTextArea ja = new JTextArea("");
		JScrollPane sc = new JScrollPane();
		String fileName="";
		String secretKey="";
		String content="";
		String ipAddress="";
		String group1="";
		String group2="";
		String group3="";
	
		public 	extended()
		{
			jf = new JFrame("gateway");
			c = jf.getContentPane();
			c.setLayout(null);
			jf.setSize(1250,700);
			c.setBackground(new Color(200,120,234));
			
			sc.setBounds(350,150,350,220);
			ja.setColumns(30);
			ja.setRows(10);
			ja.setBackground(Color.BLUE);
			ja.setForeground(new Color(100,255,255));
			ja.setFont(l);
			sc.setViewportView(ja);
			
		//	c.add(sc,BorderLayout.CENTER);
			
			
			
			jf.show();
			jf.addWindowListener(new WindowAdapter()
			                      {
				public void windowClosing(WindowEvent win)
	    		{
	    			System.exit(0);
	    		}
			                      });
			
//			try
//			{
//				Socket s1 = new Socket("localhost",10001);
//				DataOutputStream ios = new DataOutputStream(s1.getOutputStream());
//				ios.writeUTF("cloud");
//			}
//			catch(Exception e)
//			{
//				e.printStackTrace();
//			}
			
			
			int[] ports = new int[] {20020,20019,20018,20017,20016,20021,50001,50002,30001,30002,30003,30004,30005,15000,14000,13000};
			
			for(int i=0;i<16;i++)
			{
				Thread th = new Thread(new PortListener(ports[i]));
				th.start();
			}
			
			
			
		}
		
		public static void main(String[] args) {
			new extended();
		}
		
		class PortListener implements Runnable
		{
			DataOutputStream dos = null;
	        DataInputStream in = null;
			
			ServerSocket server;
			Socket connection;
			int i;
			String fileid;
			Connection con;
			Statement stmt;
			int port;
			
			public PortListener(int port)
			{
				this.port=port;
			}
			
			public void run()
			{
				if(this.port==20020)
				{
					try
					{
						server = new ServerSocket(20020);
						
						while(true)
						{
							connection = server.accept();
							DataInputStream in = new DataInputStream(connection.getInputStream());
						String msg = in.readUTF();
						
						String node1 = "";
						String node2 = "";
						String node5 = "";
						String node8 = "";
						String node11 = "";
						Dbcon db = new Dbcon();
						Connection c1 = db.getConnection();
						Statement st1 = c1.createStatement();
						
						String query1 = "select * from Nodes where nid='node1'";
						String query2 = "select * from Nodes where nid='node2'";
						
						
						String query5 = "select * from Nodes where nid='node5'";
						String query8 = "select * from Nodes where nid='node8'";
						String query11 = "select * from Nodes where nid='node11'";
						ResultSet rse1 = st1.executeQuery(query1);
						if(rse1.next()==true)
						{
							node1 = rse1.getString(3);
							
						}
						
						ResultSet rse2 = st1.executeQuery(query2);
						if(rse2.next()==true)
						{
							node2 = rse2.getString(3);
							
						}
						
						ResultSet rse5 = st1.executeQuery(query5);
						if(rse5.next()==true)
						{
							node5 = rse5.getString(3);
							
						}
						ResultSet rse8 = st1.executeQuery(query8);
						if(rse8.next()==true)
						{
							node8 = rse8.getString(3);
							
						}
						ResultSet rse11 = st1.executeQuery(query11);
						if(rse11.next()==true)
						{
							node11 = rse11.getString(3);
							
						}
						
						Socket en = new Socket("localhost",10003);
						DataOutputStream eds = new DataOutputStream(en.getOutputStream());
						eds.writeUTF(node1);
						eds.writeUTF(node2);
						
						
						eds.writeUTF(node5);
						eds.writeUTF(node8);
						eds.writeUTF(node11);
						
						}
					}
					catch(Exception e)
					{
						e.printStackTrace();
					}
					
				}
				
				
				if(this.port==20019)
				{
					try
					{
						server = new ServerSocket(20019);
						
						while(true)
						{
							connection = server.accept();
							DataInputStream in = new DataInputStream(connection.getInputStream());
                          String msg = in.readUTF(); 
							
							String node1 = "";
							String node2 = "";
							
							String node4 = "";
							String node7 = "";
							String node8 = "";
							String node11 = "";
							
							Dbcon db = new Dbcon();
							Connection c1 = db.getConnection();
							Statement st1 = c1.createStatement();
							String query1 = "select * from Nodes where nid='node1'";
							String query2 = "select * from Nodes where nid='node2'";
							
							String query4 = "select * from Nodes where nid='node4'";
							String query7 = "select * from Nodes where nid='node7'";
							String query8 = "select * from Nodes where nid='node8'";
							String query11 = "select * from Nodes where nid='node11'";
							ResultSet rse1 = st1.executeQuery(query1);
							if(rse1.next()==true)
							{
								node1 = rse1.getString(3);
								
							}
							
							ResultSet rse2 = st1.executeQuery(query2);
							if(rse2.next()==true)
							{
								node2 = rse2.getString(3);
								
							}
							
							
							ResultSet rse4 = st1.executeQuery(query4);
							if(rse4.next()==true)
							{
								node4 = rse4.getString(3);
								
							}
							ResultSet rse7 = st1.executeQuery(query7);
							if(rse7.next()==true)
							{
								node7 = rse7.getString(3);
								
							}
							ResultSet rse8 = st1.executeQuery(query8);
							if(rse8.next()==true)
							{
								node8 = rse8.getString(3);
								
							}
							ResultSet rse11 = st1.executeQuery(query11);
							if(rse11.next()==true)
							{
								node11 = rse11.getString(3);
								
							}
							
							Socket en = new Socket("localhost",10001);
							DataOutputStream eds = new DataOutputStream(en.getOutputStream());
							eds.writeUTF(node1);
							eds.writeUTF(node2);
							
							eds.writeUTF(node4);
							eds.writeUTF(node7);
							eds.writeUTF(node8);
							eds.writeUTF(node11);
						
						
						
						}
					}
					catch(Exception e)
					{
						e.printStackTrace();
					}
				
				}
			
				

				if(this.port==20018)
				{
					try
					{
						server = new ServerSocket(20018);
						
						while(true)
						{
							connection = server.accept();
							DataInputStream in = new DataInputStream(connection.getInputStream());
							 String msg = in.readUTF(); 
							String node1 = "";
							String node2 = "";
							
							String node4 = "";
							String node7 = "";
							
							Dbcon db = new Dbcon();
							Connection c1 = db.getConnection();
							Statement st1 = c1.createStatement();
							String query1 = "select * from Nodes where nid='node1'";
							String query2 = "select * from Nodes where nid='node2'";
							
							String query4 = "select * from Nodes where nid='node4'";
							String query7 = "select * from Nodes where nid='node7'";
							ResultSet rse1 = st1.executeQuery(query1);
							if(rse1.next()==true)
							{
								node1 = rse1.getString(3);
								
							}
							
							ResultSet rse2 = st1.executeQuery(query2);
							if(rse2.next()==true)
							{
								node2 = rse2.getString(3);
								
							}
							
							
							ResultSet rse4 = st1.executeQuery(query4);
							if(rse4.next()==true)
							{
								node4 = rse4.getString(3);
								
							}
							ResultSet rse7 = st1.executeQuery(query7);
							if(rse7.next()==true)
							{
								node7 = rse7.getString(3);
								
							}
							
							
							Socket en = new Socket("localhost",999);
							DataOutputStream eds = new DataOutputStream(en.getOutputStream());
							eds.writeUTF(node1);
							eds.writeUTF(node2);
							
							eds.writeUTF(node4);
							eds.writeUTF(node7);
							
						
						
						
						}
					}
					catch(Exception e)
					{
						e.printStackTrace();
					}
				
				}
				
				
				if(this.port==20017)
				{
					try
					{
						server = new ServerSocket(20017);
						
						while(true)
						{
							connection = server.accept();
							DataInputStream in = new DataInputStream(connection.getInputStream());
							String node1 = "";
							String node2 = "";
							String node4 = "";
							
							String node5 = "";
							String node8 = "";
							String node11 = "";
							
							Dbcon db = new Dbcon();
							Connection c1 = db.getConnection();
							Statement st1 = c1.createStatement();
							String query1 = "select * from Nodes where nid='node1'";
							String query2 = "select * from Nodes where nid='node2'";
							String query4 = "select * from Nodes where nid='node4'";
							
							String query5 = "select * from Nodes where nid='node5'";
							String query8 = "select * from Nodes where nid='node8'";
							String query11 = "select * from Nodes where nid='node11'";
							ResultSet rse1 = st1.executeQuery(query1);
							if(rse1.next()==true)
							{
								node1 = rse1.getString(3);
								
							}
							
							ResultSet rse2 = st1.executeQuery(query2);
							if(rse2.next()==true)
							{
								node2 = rse2.getString(3);
								
							}
							ResultSet rse4 = st1.executeQuery(query4);
							if(rse4.next()==true)
							{
								node4 = rse4.getString(3);
								
							}
							
							
							ResultSet rse5 = st1.executeQuery(query5);
							if(rse5.next()==true)
							{
								node5 = rse5.getString(3);
								
							}
							ResultSet rse8 = st1.executeQuery(query8);
							if(rse8.next()==true)
							{
								node8 = rse8.getString(3);
								
							}
							ResultSet rse11 = st1.executeQuery(query11);
							if(rse11.next()==true)
							{
								node11 = rse11.getString(3);
								
							}
							
							Socket en = new Socket("localhost",10004);
							DataOutputStream eds = new DataOutputStream(en.getOutputStream());
							eds.writeUTF(node1);
							eds.writeUTF(node2);
							eds.writeUTF(node4);
							
							eds.writeUTF(node5);
							eds.writeUTF(node8);
							eds.writeUTF(node11);
						
						
						
						}
					}
					catch(Exception e)
					{
						e.printStackTrace();
					}
				
				}
				

				if(this.port==20016)
				{
					try
					{
						server = new ServerSocket(20016);
						
						while(true)
						{
							connection = server.accept();
							DataInputStream in = new DataInputStream(connection.getInputStream());
							String node1 = "";
							String node2 = "";
							String node5 = "";
							String node8 = "";
							String node11 = "";
							Dbcon db = new Dbcon();
							Connection c1 = db.getConnection();
							Statement st1 = c1.createStatement();
							
							String query1 = "select * from Nodes where nid='node1'";
							String query2 = "select * from Nodes where nid='node2'";
							
							
							String query5 = "select * from Nodes where nid='node5'";
							String query8 = "select * from Nodes where nid='node8'";
							String query11 = "select * from Nodes where nid='node11'";
							ResultSet rse1 = st1.executeQuery(query1);
							if(rse1.next()==true)
							{
								node1 = rse1.getString(3);
								
							}
							
							ResultSet rse2 = st1.executeQuery(query2);
							if(rse2.next()==true)
							{
								node2 = rse2.getString(3);
								
							}
							
							ResultSet rse5 = st1.executeQuery(query5);
							if(rse5.next()==true)
							{
								node5 = rse5.getString(3);
								
							}
							ResultSet rse8 = st1.executeQuery(query8);
							if(rse8.next()==true)
							{
								node8 = rse8.getString(3);
								
							}
							ResultSet rse11 = st1.executeQuery(query11);
							if(rse11.next()==true)
							{
								node11 = rse11.getString(3);
								
							}
							
							Socket en = new Socket("localhost",10005);
							DataOutputStream eds = new DataOutputStream(en.getOutputStream());
							eds.writeUTF(node1);
						
							eds.writeUTF(node5);
							eds.writeUTF(node8);
							eds.writeUTF(node11);
							
						
						
						
						}
					}
					catch(Exception e)
					{
						e.printStackTrace();
					}
				
				}


				if(this.port==20021)
				{
					try
					{
						server = new ServerSocket(20021);
						
						while(true)
						{
							connection = server.accept();
							DataInputStream in = new DataInputStream(connection.getInputStream());
							String node1 = "";
							String node2 = "";
							String node5 = "";
							String node8 = "";
							String node11 = "";
							Dbcon db = new Dbcon();
							Connection c1 = db.getConnection();
							Statement st1 = c1.createStatement();
							
							String query1 = "select * from Nodes where nid='node1'";
							String query2 = "select * from Nodes where nid='node2'";
							
							
							String query5 = "select * from Nodes where nid='node5'";
							String query8 = "select * from Nodes where nid='node8'";
							String query11 = "select * from Nodes where nid='node11'";
							ResultSet rse1 = st1.executeQuery(query1);
							if(rse1.next()==true)
							{
								node1 = rse1.getString(3);
								
							}
							
							ResultSet rse2 = st1.executeQuery(query2);
							if(rse2.next()==true)
							{
								node2 = rse2.getString(3);
								
							}
							
							ResultSet rse5 = st1.executeQuery(query5);
							if(rse5.next()==true)
							{
								node5 = rse5.getString(3);
								
							}
							ResultSet rse8 = st1.executeQuery(query8);
							if(rse8.next()==true)
							{
								node8 = rse8.getString(3);
								
							}
							ResultSet rse11 = st1.executeQuery(query11);
							if(rse11.next()==true)
							{
								node11 = rse11.getString(3);
								
							}
							
							Socket en = new Socket("localhost",10003);
							DataOutputStream eds = new DataOutputStream(en.getOutputStream());
							eds.writeUTF(node1);
							eds.writeUTF(node2);
							
							
							eds.writeUTF(node5);
							eds.writeUTF(node8);
							eds.writeUTF(node11);
							
						
						
						
						}
					}
					catch(Exception e)
					{
						e.printStackTrace();
					}
				
				}


				if(this.port==50001)
				{
					try
					{
						server = new ServerSocket(50001);
						
						while(true)
						{
							connection = server.accept();
							DataInputStream in = new DataInputStream(connection.getInputStream());
							String node1 = "";
							String node2 = "";
							String node5 = "";
							String node8 = "";
							String node7 = "";
							Dbcon db = new Dbcon();
							Connection c1 = db.getConnection();
							Statement st1 = c1.createStatement();
							
							String query1 = "select * from Nodes where nid='node1'";
							String query2 = "select * from Nodes where nid='node2'";
							
							
							String query5 = "select * from Nodes where nid='node5'";
							String query8 = "select * from Nodes where nid='node8'";
							String query7 = "select * from Nodes where nid='node7'";
							ResultSet rse1 = st1.executeQuery(query1);
							if(rse1.next()==true)
							{
								node1 = rse1.getString(3);
								
							}
							
							ResultSet rse2 = st1.executeQuery(query2);
							if(rse2.next()==true)
							{
								node2 = rse2.getString(3);
								
							}
							
							ResultSet rse5 = st1.executeQuery(query5);
							if(rse5.next()==true)
							{
								node5 = rse5.getString(3);
								
							}
							ResultSet rse8 = st1.executeQuery(query8);
							if(rse8.next()==true)
							{
								node8 = rse8.getString(3);
								
							}
							ResultSet rse7 = st1.executeQuery(query7);
							if(rse7.next()==true)
							{
								node7 = rse7.getString(3);
								
							}
							
							Socket en = new Socket("localhost",10011);
							DataOutputStream eds = new DataOutputStream(en.getOutputStream());
							eds.writeUTF(node1);
							
							
							
							eds.writeUTF(node5);
							eds.writeUTF(node8);
							eds.writeUTF(node7);
							
						
						
						
						}
					}
					catch(Exception e)
					{
						e.printStackTrace();
					}
				
				}

				if(this.port==50002)
				{
					try
					{
						server = new ServerSocket(50002);
						
						while(true)
						{
							connection = server.accept();
							DataInputStream in = new DataInputStream(connection.getInputStream());
							String node1 = "";
							String node2 = "";
							String node5 = "";
							String node4 = "";
							String node7 = "";
							Dbcon db = new Dbcon();
							Connection c1 = db.getConnection();
							Statement st1 = c1.createStatement();
							
							String query1 = "select * from Nodes where nid='node1'";
							String query2 = "select * from Nodes where nid='node2'";
							
							
							String query5 = "select * from Nodes where nid='node5'";
							String query4 = "select * from Nodes where nid='node4'";
							String query7 = "select * from Nodes where nid='node7'";
							ResultSet rse1 = st1.executeQuery(query1);
							if(rse1.next()==true)
							{
								node1 = rse1.getString(3);
								
							}
							
							ResultSet rse2 = st1.executeQuery(query2);
							if(rse2.next()==true)
							{
								node2 = rse2.getString(3);
								
							}
							
							ResultSet rse5 = st1.executeQuery(query5);
							if(rse5.next()==true)
							{
								node5 = rse5.getString(3);
								
							}
							ResultSet rse4 = st1.executeQuery(query4);
							if(rse4.next()==true)
							{
								node4 = rse4.getString(3);
								
							}
							ResultSet rse7 = st1.executeQuery(query7);
							if(rse7.next()==true)
							{
								node7 = rse7.getString(3);
								
							}
							
							Socket en = new Socket("localhost",10012);
							DataOutputStream eds = new DataOutputStream(en.getOutputStream());
							eds.writeUTF(node1);
							
							
							
							eds.writeUTF(node5);
							eds.writeUTF(node4);
							eds.writeUTF(node7);
							
						
						
						
						}
					}
					catch(Exception e)
					{
						e.printStackTrace();
					}
				
				}
				
				
				
				
				
				if(this.port==30001)
				{
					try
					{
						server = new ServerSocket(30001);
						
						while(true)
						{
							connection = server.accept();
							DataInputStream in = new DataInputStream(connection.getInputStream());
							String node3 = "";
							String node6 = "";
							String node9 = "";
							String node12 = "";
							String node11 = "";
							Dbcon db = new Dbcon();
							Connection c1 = db.getConnection();
							Statement st1 = c1.createStatement();
							
							String query3 = "select * from Nodes where nid='node3'";
							String query6 = "select * from Nodes where nid='node6'";
							
							
							String query9 = "select * from Nodes where nid='node9'";
							String query12 = "select * from Nodes where nid='node12'";
							String query11 = "select * from Nodes where nid='node11'";
							ResultSet rse1 = st1.executeQuery(query3);
							if(rse1.next()==true)
							{
								node3 = rse1.getString(3);
								
							}
							
							ResultSet rse2 = st1.executeQuery(query6);
							if(rse2.next()==true)
							{
								node6 = rse2.getString(3);
								
							}
							
							ResultSet rse5 = st1.executeQuery(query9);
							if(rse5.next()==true)
							{
								node9 = rse5.getString(3);
								
							}
							ResultSet rse8 = st1.executeQuery(query12);
							if(rse8.next()==true)
							{
								node12 = rse8.getString(3);
								
							}
							
							
							ResultSet rse11 = st1.executeQuery(query11);
							if(rse11.next()==true)
							{
								node11 = rse11.getString(3);
								
							}
							
							Socket en = new Socket("localhost",10006);
							DataOutputStream eds = new DataOutputStream(en.getOutputStream());
							eds.writeUTF(node3);
							
							
							
							eds.writeUTF(node6);
							eds.writeUTF(node9);
							eds.writeUTF(node12);
							eds.writeUTF(node11);
							
						
						
						
						}
					}
					catch(Exception e)
					{
						e.printStackTrace();
					}
				
				}
				
				if(this.port==30002)
				{
					try
					{
						server = new ServerSocket(30002);
						
						while(true)
						{
							connection = server.accept();
							DataInputStream in = new DataInputStream(connection.getInputStream());
							String node3 = "";
							String node6 = "";
							String node9 = "";
							String node12 = "";
							String node14 = "";
							String node15 = "";
							String node13 = "";
							Dbcon db = new Dbcon();
							Connection c1 = db.getConnection();
							Statement st1 = c1.createStatement();
							
							String query3 = "select * from Nodes where nid='node3'";
							String query6 = "select * from Nodes where nid='node6'";
							
							
							String query9 = "select * from Nodes where nid='node9'";
							String query12 = "select * from Nodes where nid='node12'";
							String query14 = "select * from Nodes where nid='node14'";
							String query15 = "select * from Nodes where nid='node15'";
							String query13 = "select * from Nodes where nid='node13'";
							
							
							
							ResultSet rse1 = st1.executeQuery(query3);
							if(rse1.next()==true)
							{
								node3 = rse1.getString(3);
								
							}
							
							ResultSet rse2 = st1.executeQuery(query6);
							if(rse2.next()==true)
							{
								node6 = rse2.getString(3);
								
							}
							
							ResultSet rse5 = st1.executeQuery(query9);
							if(rse5.next()==true)
							{
								node9 = rse5.getString(3);
								
							}
							ResultSet rse8 = st1.executeQuery(query12);
							if(rse8.next()==true)
							{
								node12 = rse8.getString(3);
								
							}
							ResultSet rse14 = st1.executeQuery(query14);
							if(rse14.next()==true)
							{
								node14 = rse14.getString(3);
								
							}
							ResultSet rse15 = st1.executeQuery(query15);
							if(rse15.next()==true)
							{
								node15 = rse15.getString(3);
								
							}
							ResultSet rse13 = st1.executeQuery(query13);
							if(rse13.next()==true)
							{
								node13 = rse13.getString(3);
								
							}
							
							
							
							
							
							
							Socket en = new Socket("localhost",10007);
							DataOutputStream eds = new DataOutputStream(en.getOutputStream());
							eds.writeUTF(node3);
							
							
							
							eds.writeUTF(node6);
							eds.writeUTF(node9);
							eds.writeUTF(node12);
							eds.writeUTF(node14);
							eds.writeUTF(node15);
							eds.writeUTF(node13);
						
						
						}
					}
					catch(Exception e)
					{
						e.printStackTrace();
					}
				
				}
				
				if(this.port==30003)
				{
					try
					{
						server = new ServerSocket(30003);
						
						while(true)
						{
							connection = server.accept();
							DataInputStream in = new DataInputStream(connection.getInputStream());
							String node3 = "";
							String node6 = "";
							String node9 = "";
							String node8 = "";
							String node11 = "";
							Dbcon db = new Dbcon();
							Connection c1 = db.getConnection();
							Statement st1 = c1.createStatement();
							
							String query3 = "select * from Nodes where nid='node3'";
							String query6 = "select * from Nodes where nid='node6'";
							
							
							String query9 = "select * from Nodes where nid='node9'";
							String query8 = "select * from Nodes where nid='node8'";
							String query11 = "select * from Nodes where nid='node11'";
							ResultSet rse1 = st1.executeQuery(query3);
							if(rse1.next()==true)
							{
								node3 = rse1.getString(3);
								
							}
							
							ResultSet rse2 = st1.executeQuery(query6);
							if(rse2.next()==true)
							{
								node6 = rse2.getString(3);
								
							}
							
							ResultSet rse5 = st1.executeQuery(query9);
							if(rse5.next()==true)
							{
								node9 = rse5.getString(3);
								
							}
							ResultSet rse8 = st1.executeQuery(query8);
							if(rse8.next()==true)
							{
								node8 = rse8.getString(3);
								
							}
							
							
							ResultSet rse11 = st1.executeQuery(query11);
							if(rse11.next()==true)
							{
								node11 = rse11.getString(3);
								
							}
							
							Socket en = new Socket("localhost",10008);
							DataOutputStream eds = new DataOutputStream(en.getOutputStream());
							eds.writeUTF(node3);
							
							
							
							eds.writeUTF(node6);
							eds.writeUTF(node9);
							eds.writeUTF(node8);
							eds.writeUTF(node11);
							
						
						
						
						}
					}
					catch(Exception e)
					{
						e.printStackTrace();
					}
				
				}
				
				if(this.port==30004)
				{
					try
					{
						server = new ServerSocket(30004);
						
						while(true)
						{
							connection = server.accept();
							DataInputStream in = new DataInputStream(connection.getInputStream());
							String s = in.readUTF();
							String node3 = "";
							String node6 = "";
							String node5 = "";
							String node8 = "";
							String node11 = "";
							Dbcon db = new Dbcon();
							Connection c1 = db.getConnection();
							Statement st1 = c1.createStatement();
							
							String query3 = "select * from Nodes where nid='node3'";
							String query6 = "select * from Nodes where nid='node6'";
							
							
							String query5 = "select * from Nodes where nid='node5'";
							String query8 = "select * from Nodes where nid='node8'";
							String query11 = "select * from Nodes where nid='node11'";
							ResultSet rse1 = st1.executeQuery(query3);
							if(rse1.next()==true)
							{
								node3 = rse1.getString(3);
								
							}
							
							ResultSet rse2 = st1.executeQuery(query6);
							if(rse2.next()==true)
							{
								node6 = rse2.getString(3);
								
							}
							
							ResultSet rse5 = st1.executeQuery(query5);
							if(rse5.next()==true)
							{
								node5 = rse5.getString(3);
								
							}
							ResultSet rse8 = st1.executeQuery(query8);
							if(rse8.next()==true)
							{
								node8 = rse8.getString(3);
								
							}
							
							
							ResultSet rse11 = st1.executeQuery(query11);
							if(rse11.next()==true)
							{
								node11 = rse11.getString(3);
								
							}
							
							Socket en = new Socket("localhost",10009);
							DataOutputStream eds = new DataOutputStream(en.getOutputStream());
							eds.writeUTF(node3);
							
							
							
							eds.writeUTF(node6);
							eds.writeUTF(node5);
							eds.writeUTF(node8);
							eds.writeUTF(node11);
							
						
						
						
						}
					}
					catch(Exception e)
					{
						e.printStackTrace();
					}
				
				}
				
				
				if(this.port==30005)
				{
					try
					{
						server = new ServerSocket(30005);
						
						while(true)
						{
							connection = server.accept();
							DataInputStream in = new DataInputStream(connection.getInputStream());
							String node3 = "";
							
							String node5 = "";
							String node8 = "";
							String node11 = "";
							Dbcon db = new Dbcon();
							Connection c1 = db.getConnection();
							Statement st1 = c1.createStatement();
							
							String query3 = "select * from Nodes where nid='node3'";
						
							
							
							String query5 = "select * from Nodes where nid='node5'";
							String query8 = "select * from Nodes where nid='node8'";
							String query11 = "select * from Nodes where nid='node11'";
							ResultSet rse1 = st1.executeQuery(query3);
							if(rse1.next()==true)
							{
								node3 = rse1.getString(3);
								
							}
							
							
							
							ResultSet rse5 = st1.executeQuery(query5);
							if(rse5.next()==true)
							{
								node5 = rse5.getString(3);
								
							}
							ResultSet rse8 = st1.executeQuery(query8);
							if(rse8.next()==true)
							{
								node8 = rse8.getString(3);
								
							}
							
							
							ResultSet rse11 = st1.executeQuery(query11);
							if(rse11.next()==true)
							{
								node11 = rse11.getString(3);
								
							}
							
							Socket en = new Socket("localhost",10010);
							DataOutputStream eds = new DataOutputStream(en.getOutputStream());
							eds.writeUTF(node3);
							
							
							
							
							eds.writeUTF(node5);
							eds.writeUTF(node8);
							eds.writeUTF(node11);
							
						
						
						
						}
					}
					catch(Exception e)
					{
						e.printStackTrace();
					}
				
				}
				

				if(this.port==15000)
				{
					try
					{
						server = new ServerSocket(15000);
						
						while(true)
						{
							connection = server.accept();
							DataInputStream in = new DataInputStream(connection.getInputStream());
							String msg = in.readUTF();
							String node1="";
							String node3 = "";
							String node6 = "";
							String node9 = "";
							String node12 = "";
							String node14 = "";
							Dbcon db = new Dbcon();
							Connection c1 = db.getConnection();
							Statement st1 = c1.createStatement();
							
							String query1 = "select * from Nodes where nid='node1'";
							String query3 = "select * from Nodes where nid='node3'";
							String query6 = "select * from Nodes where nid='node6'";
							
							
							String query9 = "select * from Nodes where nid='node9'";
							String query12 = "select * from Nodes where nid='node12'";
							String query14 = "select * from Nodes where nid='node14'";
							
							ResultSet rse = st1.executeQuery(query1);
							if(rse.next()==true)
							{
								node1 = rse.getString(3);
								
							}
							ResultSet rse1 = st1.executeQuery(query3);
							if(rse1.next()==true)
							{
								node3 = rse1.getString(3);
								
							}
							
							ResultSet rse2 = st1.executeQuery(query6);
							if(rse2.next()==true)
							{
								node6 = rse2.getString(3);
								
							}
							
							ResultSet rse5 = st1.executeQuery(query9);
							if(rse5.next()==true)
							{
								node9 = rse5.getString(3);
								
							}
							ResultSet rse8 = st1.executeQuery(query12);
							if(rse8.next()==true)
							{
								node12 = rse8.getString(3);
								
							}
							
							
							ResultSet rse14 = st1.executeQuery(query14);
							if(rse14.next()==true)
							{
								node14 = rse14.getString(3);
								
							}
							
							Socket en = new Socket("localhost",10013);
							DataOutputStream eds = new DataOutputStream(en.getOutputStream());
							eds.writeUTF(node1);
							eds.writeUTF(node3);
							
							eds.writeUTF(node6);
							eds.writeUTF(node9);
							eds.writeUTF(node12);
							eds.writeUTF(node14);
							
						
						
						
						}
					}
					catch(Exception e)
					{
						e.printStackTrace();
					}
				
				}
				
				
				if(this.port==14000)
				{
					try
					{
						server = new ServerSocket(14000);
						
						while(true)
						{
							connection = server.accept();
							DataInputStream in = new DataInputStream(connection.getInputStream());
							String msg = in.readUTF();
							String node1="";
							String node3 = "";
							String node6 = "";
							String node9 = "";
							String node12 = "";
							
							Dbcon db = new Dbcon();
							Connection c1 = db.getConnection();
							Statement st1 = c1.createStatement();
							
							String query1 = "select * from Nodes where nid='node1'";
							String query3 = "select * from Nodes where nid='node3'";
							String query6 = "select * from Nodes where nid='node6'";
							
							
							String query9 = "select * from Nodes where nid='node9'";
							String query12 = "select * from Nodes where nid='node12'";
							
							
							ResultSet rse = st1.executeQuery(query1);
							if(rse.next()==true)
							{
								node1 = rse.getString(3);
								
							}
							ResultSet rse1 = st1.executeQuery(query3);
							if(rse1.next()==true)
							{
								node3 = rse1.getString(3);
								
							}
							
							ResultSet rse2 = st1.executeQuery(query6);
							if(rse2.next()==true)
							{
								node6 = rse2.getString(3);
								
							}
							
							ResultSet rse5 = st1.executeQuery(query9);
							if(rse5.next()==true)
							{
								node9 = rse5.getString(3);
								
							}
							ResultSet rse8 = st1.executeQuery(query12);
							if(rse8.next()==true)
							{
								node12 = rse8.getString(3);
								
							}
							
							
							
							
							Socket en = new Socket("localhost",10014);
							DataOutputStream eds = new DataOutputStream(en.getOutputStream());
							eds.writeUTF(node1);
							eds.writeUTF(node3);
							
							eds.writeUTF(node6);
							eds.writeUTF(node9);
							eds.writeUTF(node12);
							
							
						
						
						
						}
					}
					catch(Exception e)
					{
						e.printStackTrace();
					}
				
				}
				

				if(this.port==13000)
				{
					try
					{
						server = new ServerSocket(13000);
						
						while(true)
						{
							connection = server.accept();
							DataInputStream in = new DataInputStream(connection.getInputStream());
							String node1 = "";
							String node2 = "";
							String node5 = "";
							String node8 = "";
							String node11 = "";
							Dbcon db = new Dbcon();
							Connection c1 = db.getConnection();
							Statement st1 = c1.createStatement();
							
							String query1 = "select * from Nodes where nid='node1'";
							String query2 = "select * from Nodes where nid='node2'";
							
							
							String query5 = "select * from Nodes where nid='node5'";
							String query8 = "select * from Nodes where nid='node8'";
							String query11 = "select * from Nodes where nid='node11'";
							ResultSet rse1 = st1.executeQuery(query1);
							if(rse1.next()==true)
							{
								node1 = rse1.getString(3);
								
							}
							
							ResultSet rse2 = st1.executeQuery(query2);
							if(rse2.next()==true)
							{
								node2 = rse2.getString(3);
								
							}
							
							ResultSet rse5 = st1.executeQuery(query5);
							if(rse5.next()==true)
							{
								node5 = rse5.getString(3);
								
							}
							ResultSet rse8 = st1.executeQuery(query8);
							if(rse8.next()==true)
							{
								node8 = rse8.getString(3);
								
							}
							ResultSet rse11 = st1.executeQuery(query11);
							if(rse11.next()==true)
							{
								node11 = rse11.getString(3);
								
							}
							
							Socket en = new Socket("localhost",10005);
							DataOutputStream eds = new DataOutputStream(en.getOutputStream());
							eds.writeUTF(node1);
							
							
							
							eds.writeUTF(node5);
							eds.writeUTF(node8);
							eds.writeUTF(node11);
							
						
						
						
						}
					}
					catch(Exception e)
					{
						e.printStackTrace();
					}
				
				}
				
				
				
					
			
				
				
			}
		}

	}

	



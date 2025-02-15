import java.awt.Color;
import java.net.*;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.awt.Container;
import java.awt.Font;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.lang.management.ThreadMXBean;
import java.math.BigInteger;
import java.net.ServerSocket;
import java.net.Socket;
import java.security.DigestInputStream;
import java.security.MessageDigest;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Timer;



public class Cloud_Network extends JFrame implements ActionListener {

	public Font f22 = new Font("Times new roman", Font.BOLD, 18);
	JFrame jf;
	Container c;	
	int encdata[];
	String dt="";
	JPanel p1;int len=0;
	ImageIcon a1,a2,a3,a4,a5,a6,a7,a8,a9,a10,a101,a102,a1g,a2g,a3g,a4g,a5g,a6g,a7g,a8g,a9g,a10g,a101g,a102g,a1r,a2r,a3r,a4r,a5r,a6r,a7r,a8r,a9r,a10r,a101r,a102r;
	ImageIcon b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b101,b102,b1g,b2g,b3g,b4g,b5g,b6g,b7g,b8g,b9g,b10g,b101g,b102g,b1r,b2r,b3r,b4r,b5r,b6r,b7r,b8r,b9r,b10r,b101r,b102r;
	ImageIcon c1,c2,c3,c4,c5,c6,c7,c8,c1g,c2g,c3g,c4g,c5g,c6g,c7g,c8g,c1r,c2r,c3r,c4r,c5r,c6r,c7r,c8r,c14,c24;
	ImageIcon black,green,red;
	String end="";String pass="";String name="";	
	JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15,l16,l17,l18,l19,l20,l21,l22,l23,l24,l25,l26,l27,l28,l29,l30,l31,l32,l33,l34,l35,l36,l37,l38;
	String node1="Node1",node2="Node2",node3="Node3" ,node4="Node4",node5="Node5",node6="Node6",node7="Node7",node8="Node8";
	String node9="Node9",node10="Node10",node11="Node11" ,node12="Node12",node13="Node13",node14="Node14",node15="Node15",node16="Node16";
	String node17="Node17",node18="Node18",node19="Node19" ,node20="Node20",node21="Node21",node22="Node22",node23="Node23",node24="Node24";
	String node25="Node25",node26="Node26",node27="Node27" ,node28="Node28",node29="Node29",node30="Node30",node31="Node31",node32="Node32";
	JLabel up,downd,down1,up1,aa,d2,d3,d4,d5,d6,d7,d22,d33,d44,d55,d66,d77,d88,lab1,lab2,lab3;
	JLabel e2,e3,e4,e5,e6,e7,e8,e22,e33,e44,e55,e66,e77,e88;
//	JLabel f3,f4,f5,f6,f7;
	ImageIcon up9,down9,down19,up19,aa9,d29,d39,d49,d59,d69,d79,d229,d339,d449,d559,d669,d779,d889;
	ImageIcon e29,e39,e49,e59,e69,e79,e89,e229,e339,e449,e559,e669,e779,e889;
	ImageIcon f29,f39,f49,f59,f69,f79;
	JLabel a11,a22,a33,a44,a55,a66,a77,a88,a99,a100,a111,a122;
	JLabel b11,b22,b33,b44,b55,b66,b77,b88,b99,b100,b111,b122;
	JLabel c11,c22,c33,c44,c55,c66,c77,c88,c114,c224;
	String CHead1,CHead2,CHead3,CHead4;
	String CHp1,CHp2,CHp3,CHp4;
	String dest="";
	String m01,m2,m3,m4,m5,m6,m7,m8,m9,m10,m11,m12,m13,m14,m15,m16,m17,m18,m19,m20,m21,m22,m23,m24,m25,m26,m27,m28,m29,m30;
	String m31,m32,m33,m34,m35,m36,m37,m38,m39,m40,m41,m42,m43,m44,m45,m46,m47,m48,m49,m50,m51,m52,m53,m54,m55,m56,m57,m58,m59,m60;
	String m61,m62,m63,m64,m65,m66,m67,m68,m69,m70,m71,m72,m73,m74,m75,m76,m77,m78,m79,m80,m81,m82,m83,m84,m85,m86,m87,m88,m89,m90;
	String m91,m92,m93,m94,m95,m96,m97,m98,m99,m100,m101,m102,m103,m104,m105,m106,m107,m108,m109,m110,m111,m112,m113,m114,m115,m116,m117,m118,m119,m120;
	String pack1=""; String pack2=""; String pack3=""; String pack4=""; String pack5="";
	MenuBar mbr;
	MenuItem i1,i2,i3,i4,i5,i6,i7,i8;
	Menu m1;
	Dbcon db = new Dbcon();
	Connection connect=db.getConnection();
	
	public Font f = new Font("Times new roman", Font.BOLD, 25);
	public Font f21 = new Font("Times new roman", Font.BOLD, 16);
	public Font f31 = new Font("Times new roman", Font.BOLD, 23);
	public Font f41 = new Font("Times new roman", Font.BOLD, 12);
	
	
	String node="";int f1=0;int f2=0;int f3=0;int f4=0;int f5=0;int f6=0;
	int g1=0;int g2=0;int g3=0;int g4=0;int g5=0;int g6=0;
	String dis1="",dis2="",dis3="",dis4="",dis5="",dis6="",dis7="",dis8="",dis9="",dis10="";
	String dis11="",dis12="",dis13="",dis14="",dis15="",dis16="",dis17="",dis18="",dis19="",dis20="";
	String dis21="",dis22="",dis23="",dis24="",dis25="",dis26="",dis27="",dis28="",dis29="",dis30="";
	String dis31="",dis32="";
	
	String mac="";String mac1=""; String fname="";
	String mac2="";String mac3="";String mac4="";String mac5="";String mac6="";String mac7="";String mac8="";
	String mac9="";String mac10="";String mac11="";String mac12="";String mac13="";String mac14="";String mac15="";String mac16="";
	String mac17="";String mac18="";String mac19="";String mac20="";String mac21="";String mac22="";String mac23="";String mac24="";
	String mac25="";String mac26="";String mac27="";String mac28="";String mac29="";String mac30="";String mac31="";String mac32="";
	
	String ene1="";String ene2="";String ene3="";String ene4="";String ene5="";String ene6="";String ene7="";String ene8="";
	String ene9="";String ene10="";String ene11="";String ene12="";String ene13="";String ene14="";String ene15="";String ene16="";
	String ene17="";String ene18="";String ene19="";String ene20="";String ene21="";String ene22="";String ene23="";String ene24="";
	String ene25="";String ene26="";String ene27="";String ene28="";String ene29="";String ene30="";String ene31="";String ene32="";
	
	String no1="";String no2="";String no3="";String no4="";String no5="";String no6="";String no7="";String no8="";
	String no9="";String no10="";String no11="";String no12="";String no13="";String no14="";String no15="";String no16="";
	String no17="";String no18="";String no19="";String no20="";String no21="";String no22="";String no23="";String no24="";
	String no25="";String no26="";String no27="";String no28="";String no29="";String no30="";String no31="";String no32="";
	String path;

	
	String Degree;
	ThreadMXBean threadBean;
	long start;
	String s;
	StringBuffer sb1;
	int fsize=0;
	ImageIcon nod,border,down;
	JLabel nodl,borderl,downl,idsl,text;
	JButton button;
                                                                                                                                                                                                                                                                                                       
	Cloud_Network() throws SQLException
	{
		updateene();
		
		p1=new JPanel();
		p1.setLayout(null);
		setTitle("Cloud Network :: Blockchain based Data Storage with Privacy and Authentication in Internet of Things");
		p1.setBackground(Color.white);
		
		jf = new JFrame("F I L E :: ");
		c = jf.getContentPane();
		c.setLayout(null);	
		c.setBackground(Color.white);
		
		c14=new ImageIcon(this.getClass().getResource("img.png"));
		c114=new JLabel();
		c114.setIcon(c14);
		c114.setBounds(80, 40, 700,500);
		
		button=new JButton("VIEW ATTACKERS");
		button.addActionListener(this);
		button.setBounds(710, 60, 150, 30);
		c.add(button);
		
	
		a1=new ImageIcon(this.getClass().getResource("black.png"));
		a11=new JLabel("Node1");
		a11.setIcon(a1);
		a11.setBounds(140, -150, 500,500);
		c.add(a11);
		
		a2=new ImageIcon(this.getClass().getResource("black.png"));
		a22=new JLabel("Node2");
		a22.setIcon(a2);
		a22.setBounds(250, -150, 500,500);
		c.add(a22);
		
		a3=new ImageIcon(this.getClass().getResource("black.png"));
		a33=new JLabel("Node3");
		a33.setIcon(a3);
		a33.setBounds(110, -70, 500,500);
		c.add(a33);
		
		a4=new ImageIcon(this.getClass().getResource("black.png"));
		a44=new JLabel("Node4");
		a44.setIcon(a4);
		a44.setBounds(195, -50, 500,500);
		c.add(a44);
		
		a5=new ImageIcon(this.getClass().getResource("black.png"));
		a55=new JLabel("Node5");
		a55.setIcon(a5);
		a55.setBounds(280, -70, 500,500);
		c.add(a55);
		
		a6=new ImageIcon(this.getClass().getResource("black.png"));
		a66=new JLabel("Node6");
		a66.setIcon(a6);
		a66.setBounds(200, 20, 500,500);
		c.add(a66);
		
		b1=new ImageIcon(this.getClass().getResource("black.png"));
		b11=new JLabel("Node7");
		b11.setIcon(b1);
		b11.setBounds(420, -150, 500,500);
		c.add(b11);
		
		b2=new ImageIcon(this.getClass().getResource("black.png"));
		b22=new JLabel("Node8");
		b22.setIcon(b2);
		b22.setBounds(530, -150, 500,500);
		c.add(b22);
		
		b3=new ImageIcon(this.getClass().getResource("black.png"));
		b33=new JLabel("Node9");
		b33.setIcon(b3);
		b33.setBounds(380, -70, 500,500);
		c.add(b33);
		
		b4=new ImageIcon(this.getClass().getResource("black.png"));
		b44=new JLabel("Node10");
		b44.setIcon(b4);
		b44.setBounds(465, -50, 500,500);
		c.add(b44);
		
		b5=new ImageIcon(this.getClass().getResource("black.png"));
		b55=new JLabel("Node11");
		b55.setIcon(b5);
		b55.setBounds(550, -70, 500,500);
		c.add(b55);
		
		b6=new ImageIcon(this.getClass().getResource("black.png"));
		b66=new JLabel("Node12");
		b66.setIcon(b6);
		b66.setBounds(468, 20, 500,500);
		c.add(b66);
		
		c1=new ImageIcon(this.getClass().getResource("black.png"));
		c11=new JLabel("Node13");
		c11.setIcon(c1);
		c11.setBounds(270, 80, 500,500);
		c.add(c11);
		
		c2=new ImageIcon(this.getClass().getResource("black.png"));
		c22=new JLabel("Node14");
		c22.setIcon(c2);
		c22.setBounds(380, 80, 500,500);
		c.add(c22);
		
		c3=new ImageIcon(this.getClass().getResource("black.png"));
		c33=new JLabel("Node15");
		c33.setIcon(c3);
		c33.setBounds(240, 150, 500,500);
		c.add(c33);
		
		c4=new ImageIcon(this.getClass().getResource("black.png"));
		c44=new JLabel("Node16");
		c44.setIcon(c4);
		c44.setBounds(330, 180, 500,500);
		c.add(c44);
		
		c5=new ImageIcon(this.getClass().getResource("black.png"));
		c55=new JLabel("Node17");
		c55.setIcon(c5);
		c55.setBounds(410, 150, 500,500);
		c.add(c55);
		
		c6=new ImageIcon(this.getClass().getResource("black.png"));
		c66=new JLabel("Node18");
		c66.setIcon(c6);
		c66.setBounds(330, 250, 500,500);
		c.add(c66);
		
		c7=new ImageIcon(this.getClass().getResource("border.png"));
		c77=new JLabel("");
		c77.setIcon(c7);
		c77.setBounds(690, 80, 500,500);
		
		
		
		lab1 = new JLabel("CLUSTER 1");
		lab1.setFont(f21);
		lab1.setForeground(Color.blue);
		lab1.setBounds(110,220, 300, 200);
		c.add(lab1);
		
		lab2 = new JLabel("CLUSTER 2");
		lab2.setFont(f21);
		lab2.setForeground(Color.blue);
		lab2.setBounds(510,220, 300, 200);
		c.add(lab2);
		
		lab3 = new JLabel("CLUSTER 3");
		lab3.setFont(f21);
		lab3.setForeground(Color.blue);
		lab3.setBounds(300,450, 300, 200);
		c.add(lab3);
		
		l1 = new JLabel();
		l1.setFont(f41);
		l1.setBounds(720,90, 300, 200);
		c.add(l1);
		
		l2 = new JLabel();
		l2.setFont(f41);
		l2.setBounds(720,140, 300, 200);
		c.add(l2);
		
		l3 = new JLabel();
		l3.setFont(f41);
		l3.setBounds(720,190, 300, 200);
		c.add(l3);
		
		l4 = new JLabel();
		l4.setFont(f41);
		l4.setBounds(720,240, 300, 200);
		c.add(l4);
		
		l5 = new JLabel();
		l5.setFont(f41);
		l5.setBounds(720,290, 300, 200);
		c.add(l5);
		
		l6 = new JLabel();
		l6.setFont(f41);
		l6.setBounds(720,340, 300, 200);
		c.add(l6);
	
		l7 = new JLabel();
		l7.setFont(f41);
		l7.setBounds(720,90, 300, 200);
		c.add(l7);
		
		l8 = new JLabel();
		l8.setFont(f41);
		l8.setBounds(720,140, 300, 200);
		c.add(l8);
		
		l9 = new JLabel();
		l9.setFont(f41);
		l9.setBounds(720,190, 300, 200);
		c.add(l9);
		
		l10 = new JLabel();
		l10.setFont(f41);
		l10.setBounds(720,240, 300, 200);
		c.add(l10);
		
		l11 = new JLabel();
		l11.setFont(f41);
		l11.setBounds(720,290, 300, 200);
		c.add(l11);
		
		l12 = new JLabel();
		l12.setFont(f41);
		l12.setBounds(720,340, 300, 200);
		c.add(l12);
		
		l13 = new JLabel();
		l13.setFont(f41);
		l13.setBounds(720,90, 300, 200);
		c.add(l13);
		
		l14 = new JLabel();
		l14.setFont(f41);
		l14.setBounds(720,140, 300, 200);
		c.add(l14);
		
		l15 = new JLabel();
		l15.setFont(f41);
		l15.setBounds(720,190, 300, 200);
		c.add(l15);
		
		l16 = new JLabel();
		l16.setFont(f41);
		l16.setBounds(720,240, 300, 200);
		c.add(l16);
		
		l17 = new JLabel();
		l17.setFont(f41);
		l17.setBounds(720,290, 300, 200);
		c.add(l17);
		
		l18 = new JLabel();
		l18.setFont(f41);
		l18.setBounds(720,340, 300, 200);
		c.add(l18);
		
		l19 = new JLabel();
		l19.setFont(f41);
		l19.setBounds(720,90, 300, 200);
		c.add(l19);
		
		l20 = new JLabel();
		l20.setFont(f41);
		l20.setBounds(720,140, 300, 200);
		c.add(l20);
		
		l21 = new JLabel();
		l21.setFont(f41);
		l21.setBounds(720,190, 300, 200);
		c.add(l21);
		
		l22 = new JLabel();
		l22.setFont(f41);
		l22.setBounds(720,240, 300, 200);
		c.add(l22);
		
		l23 = new JLabel();
		l23.setFont(f41);
		l23.setBounds(720,290, 300, 200);
		c.add(l23);
		
		l24 = new JLabel();
		l24.setFont(f41);
		l24.setBounds(720,340, 300, 200);
		c.add(l24);
	
		l25 = new JLabel();
		l25.setFont(f41);
		l25.setBounds(720,90, 300, 200);
		c.add(l25);
		
		l26 = new JLabel();
		l26.setFont(f41);
		l26.setBounds(720,140, 300, 200);
		c.add(l26);
		
		l27 = new JLabel();
		l27.setFont(f41);
		l27.setBounds(720,190, 300, 200);
		c.add(l27);
		
		l28 = new JLabel();
		l28.setFont(f41);
		l28.setBounds(720,240, 300, 200);
		c.add(l28);
		
		l29 = new JLabel();
		l29.setFont(f41);
		l29.setBounds(720,290, 300, 200);
		c.add(l29);
		
		l30 = new JLabel();
		l30.setFont(f41);
		l30.setBounds(720,340, 300, 200);
		c.add(l30);
		
		l31 = new JLabel();
		l31.setFont(f41);
		l31.setBounds(720,90, 300, 200);
		c.add(l31);
		
		l32 = new JLabel();
		l32.setFont(f41);
		l32.setBounds(720,140, 300, 200);
		c.add(l32);
		
		l33 = new JLabel();
		l33.setFont(f41);
		l33.setBounds(720,190, 300, 200);
		c.add(l33);
		
		l34 = new JLabel();
		l34.setFont(f41);
		l34.setBounds(720,240, 300, 200);
		c.add(l34);
		
		l35 = new JLabel();
		l35.setFont(f41);
		l35.setBounds(720,290, 300, 200);
		c.add(l35);
		
		l36 = new JLabel();
		l36.setFont(f41);
		l36.setBounds(720,340, 300, 200);
		c.add(l36);
		
		c.add(c77);
		mbr=new MenuBar();
		m1=new Menu("F I L E");
		setMenuBar(mbr);
		i1=new MenuItem("Assign Energy (Block Chain 1)");
		i2=new MenuItem("Assign Energy (Block Chain 2)");
		i3=new MenuItem("Assign Energy (Block Chain 3)");
		i4=new MenuItem("View Cluster Details in Block Chain");
		i5=new MenuItem("View Cloud Files");
		i6=new MenuItem("View Attackers");
		i7=new MenuItem("View Nwtwork 2");
		i8=new MenuItem("View Nwtwork 3");
		
		m1.add(i1);
		m1.add(i2);
		m1.add(i3);
		m1.add(i4);
		m1.add(i5);
		m1.add(i6);
//		m1.add(i7);
//		m1.add(i8);
		
		mbr.add(m1);
		
		i1.addActionListener(this);
		i2.addActionListener(this);
		i3.addActionListener(this);
		i4.addActionListener(this);
		i5.addActionListener(this);
		i6.addActionListener(this);
		i7.addActionListener(this);
		i8.addActionListener(this);
		
		c.add(c114);
//		c.add(c224);
		
//		jf.setBounds(5, 5, 900, 630);
//		jf.show();
		
		setSize(940,650);
		setVisible(true);
		add(c);
		
		Socket client = null;
		int[] ports = new int[] { 1414,2001,1412};

		for (int i = 0; i < 3; i++) {
			Thread t = new Thread(new PortListener(ports[i]));
			t.setName("Listener-" + ports[i]);
			t.start();
		}
	}
	
	
	void updateene() throws SQLException {

		
		connect.createStatement().executeUpdate("update Cluster1 set energy='"+rand()+"' where node='"+node1+"'");
		connect.createStatement().executeUpdate("update Cluster1 set energy='"+rand()+"' where node='"+node2+"'");
		connect.createStatement().executeUpdate("update Cluster1 set energy='"+rand()+"' where node='"+node3+"'");
		connect.createStatement().executeUpdate("update Cluster1 set energy='"+rand()+"' where node='"+node4+"'");
		connect.createStatement().executeUpdate("update Cluster1 set energy='"+rand()+"' where node='"+node5+"'");
		connect.createStatement().executeUpdate("update Cluster1 set energy='"+rand()+"' where node='"+node6+"'");

		connect.createStatement().executeUpdate("update Cluster2 set energy='"+rand()+"' where node='"+node7+"'");
		connect.createStatement().executeUpdate("update Cluster2 set energy='"+rand()+"' where node='"+node8+"'");
		connect.createStatement().executeUpdate("update Cluster2 set energy='"+rand()+"' where node='"+node9+"'");
		connect.createStatement().executeUpdate("update Cluster2 set energy='"+rand()+"' where node='"+node10+"'");
		connect.createStatement().executeUpdate("update Cluster2 set energy='"+rand()+"' where node='"+node11+"'");
		connect.createStatement().executeUpdate("update Cluster2 set energy='"+rand()+"' where node='"+node12+"'");
		
		connect.createStatement().executeUpdate("update Cluster3 set energy='"+rand()+"' where node='"+node13+"'");
		connect.createStatement().executeUpdate("update Cluster3 set energy='"+rand()+"' where node='"+node14+"'");
		connect.createStatement().executeUpdate("update Cluster3 set energy='"+rand()+"' where node='"+node15+"'");
		connect.createStatement().executeUpdate("update Cluster3 set energy='"+rand()+"' where node='"+node16+"'");
		connect.createStatement().executeUpdate("update Cluster3 set energy='"+rand()+"' where node='"+node17+"'");
		connect.createStatement().executeUpdate("update Cluster3 set energy='"+rand()+"' where node='"+node18+"'");
		
		
	}


	int rand() {
		

		  int high=100000; int low=50000;
			
			Random rr = new Random();
			int ran = rr.nextInt(high-low)+low;
			
			return ran;
	  
	}


	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==i3)
		{
			Dbcon db=new Dbcon();
			Connection con=db.getConnection();
			
			try
			{
			String nname="";
			
				String cn4[]={"Node13","Node14","Node15","Node16","Node17","Node18"};
				JComboBox clust4=new JComboBox(cn4);
				JOptionPane.showMessageDialog(null,clust4,"Update Energy",JOptionPane.QUESTION_MESSAGE);
				
				nname=clust4.getSelectedItem().toString();
					
				String Ener=JOptionPane.showInputDialog(null,"Enter Energy");
				
				int dis=Integer.parseInt(Ener);
				Statement st=con.createStatement();
				String cname="Cluster3";
				String n1="update "+cname+" set energy="+dis+" where node='"+nname+"' ";
				st.executeUpdate(n1);
				
				JOptionPane.showMessageDialog(null,"Energy Updated Successfully");
				
			}catch(Exception es){System.out.println(es);}
			
		}
		if(e.getSource()==i4)
		{
			String cn[]={"Cluster1","Cluster2","Cluster3"};
			JComboBox cb1=new JComboBox(cn);
			JOptionPane.showMessageDialog(null,cb1,"Select Cluster",JOptionPane.QUESTION_MESSAGE);
			String nname="";
			try
			{
				String cname=cb1.getSelectedItem().toString();
				
				if(cname.equalsIgnoreCase("Cluster1"))
				{
					ViewCluster1 v1 =new ViewCluster1();
					v1.setSize(900, 400);
					v1.setVisible(true);
				}
				if(cname.equalsIgnoreCase("Cluster2"))
				{
					ViewCluster2 v11 =new ViewCluster2();
					v11.setSize(900, 400);
					v11.setVisible(true);
				}
				if(cname.equalsIgnoreCase("Cluster3"))
				{
					ViewCluster3 v12 =new ViewCluster3();
					v12.setSize(900, 400);
					v12.setVisible(true);
				}
				
				
			}catch(Exception es){System.out.println(es);}
		}
		if(e.getSource()==i5)
		{
			ViewCloudFiles v31 =new ViewCloudFiles();
			v31.setSize(900, 600);
			v31.setVisible(true);
		}
		if(e.getSource()==button)
		{
			ViewAttackers v31 =new ViewAttackers();
			v31.setSize(900, 600);
			v31.setVisible(true);
		}
		if(e.getSource()==i6)
		{
			ViewAttackers v31 =new ViewAttackers();
			v31.setSize(900, 600);
			v31.setVisible(true);
		}
		if(e.getSource()==i8)
		{
			
		}
		if(e.getSource()==i1)
		{
			Dbcon db=new Dbcon();
			Connection con=db.getConnection();
			
			try
			{
			String nname="";
			
				String cn4[]={"Node1","Node2","Node3","Node4","Node5","Node6"};
				JComboBox clust4=new JComboBox(cn4);
				JOptionPane.showMessageDialog(null,clust4,"Update Energy",JOptionPane.QUESTION_MESSAGE);
				
				nname=clust4.getSelectedItem().toString();
					
				String Ener=JOptionPane.showInputDialog(null,"Enter Energy");
				
				int dis=Integer.parseInt(Ener);
				Statement st=con.createStatement();
				String cname="Cluster1";
				String n1="update "+cname+" set energy="+dis+" where node='"+nname+"' ";
				st.executeUpdate(n1);
				
				JOptionPane.showMessageDialog(null,"Energy Updated Successfully");
				
			}catch(Exception es){System.out.println(es);}
			
		}	
	
		
	if(e.getSource()==i2)
	{
		Dbcon db=new Dbcon();
		Connection con=db.getConnection();
		
		try
		{
		String nname="";
		
			String cn4[]={"Node7","Node8","Node9","Node10","Node11","Node12"};
			JComboBox clust4=new JComboBox(cn4);
			JOptionPane.showMessageDialog(null,clust4,"Update Energy",JOptionPane.QUESTION_MESSAGE);
			
			nname=clust4.getSelectedItem().toString();
				
			String Ener=JOptionPane.showInputDialog(null,"Enter Energy");
			
			int dis=Integer.parseInt(Ener);
			Statement st=con.createStatement();
			String cname="Cluster2";
			String n1="update "+cname+" set energy="+dis+" where node='"+nname+"' ";
			st.executeUpdate(n1);
			
			JOptionPane.showMessageDialog(null,"Energy Updated Successfully");
			
		}catch(Exception es){System.out.println(es);}
		
	}	
}
	class PortListener implements Runnable {
		
		BufferedOutputStream bos = null;

		ServerSocket server;
		DataInputStream di;
		Socket s1;
		BufferedReader br = null;
		int port;

		public PortListener(int port) {
			this.port = port;
		}

		@Override
		public void run() {
			
			if(this.port==1412)
			{
				try
				{
					ServerSocket server909 = new ServerSocket(1412);
					Socket con777;
					while (true) 
					{
					con777 = server909.accept();
					
					DataInputStream dis = new DataInputStream(con777.getInputStream());
					String node	= dis.readUTF();
					String mac	= dis.readUTF();
					String data	= dis.readUTF();
					
					String attack = "Yes";
					String name= "Attacker";
					
					SimpleDateFormat sd = new SimpleDateFormat("dd/MM/yyyy");
					
					Date d = new Date();
					
					String dt = sd.format(d);
					
					if(node.equalsIgnoreCase("Node3"))
					{
						connect.createStatement().executeUpdate("update Cluster1 set mac='"+mac+"',attacked='"+attack+"' where node='"+node+"'");
						connect.createStatement().executeUpdate("insert into Attacker values('"+name+"','"+node+"','"+data+"','"+dt+"')");
							
						DataOutputStream  ds = new DataOutputStream(con777.getOutputStream());
						ds.writeUTF("attack");	
					}
					if(node.equalsIgnoreCase("Node4"))
					{
						connect.createStatement().executeUpdate("update Cluster1 set mac='"+mac+"',attacked='"+attack+"' where node='"+node+"'");
						connect.createStatement().executeUpdate("insert into Attacker values('"+name+"','"+node+"','"+data+"','"+dt+"')");
							
						DataOutputStream  ds = new DataOutputStream(con777.getOutputStream());
						ds.writeUTF("attack");	
					}
					if(node.equalsIgnoreCase("Node9"))
					{
						connect.createStatement().executeUpdate("update Cluster2 set mac='"+mac+"',attacked='"+attack+"' where node='"+node+"'");
						connect.createStatement().executeUpdate("insert into Attacker values('"+name+"','"+node+"','"+data+"','"+dt+"')");
							
						DataOutputStream  ds = new DataOutputStream(con777.getOutputStream());
						ds.writeUTF("attack");	
					}
					if(node.equalsIgnoreCase("Node10"))
					{
						connect.createStatement().executeUpdate("update Cluster2 set mac='"+mac+"',attacked='"+attack+"' where node='"+node+"'");
						connect.createStatement().executeUpdate("insert into Attacker values('"+name+"','"+node+"','"+data+"','"+dt+"')");
							
						DataOutputStream  ds = new DataOutputStream(con777.getOutputStream());
						ds.writeUTF("attack");	
					}
					if(node.equalsIgnoreCase("Node15"))
					{
						connect.createStatement().executeUpdate("update Cluster3 set mac='"+mac+"',attacked='"+attack+"' where node='"+node+"'");
						connect.createStatement().executeUpdate("insert into Attacker values('"+name+"','"+node+"','"+data+"','"+dt+"')");
							
						DataOutputStream  ds = new DataOutputStream(con777.getOutputStream());
						ds.writeUTF("attack");	
					}
					if(node.equalsIgnoreCase("Node16"))
					{
						connect.createStatement().executeUpdate("update Cluster3 set mac='"+mac+"',attacked='"+attack+"' where node='"+node+"'");
						connect.createStatement().executeUpdate("insert into Attacker values('"+name+"','"+node+"','"+data+"','"+dt+"')");
							
						DataOutputStream  ds = new DataOutputStream(con777.getOutputStream());
						ds.writeUTF("attack");	
					}
					
							
					}	
					
				}catch (Exception e) {
								e.printStackTrace();
						}
						
					 }
			
			if(this.port==1414){
				
				Dbcon db = new Dbcon();
				Connection connect=db.getConnection();
				
				try{
					server = new ServerSocket(1414);
				
				while(true){
					
					settrue();
					
					s1 = server.accept();
					
					DataInputStream dos11 = new DataInputStream(s1.getInputStream());
					fname = dos11.readUTF();
					mac = dos11.readUTF();
					
					init();
					
					DataOutputStream dos1 = new DataOutputStream(s1.getOutputStream());
					dos1.writeUTF("success");
				}
				}catch (Exception e) {
					// TODO: handle exception
				}
			}

			if(this.port==2001){
				
				Dbcon db = new Dbcon();
				Connection connect=db.getConnection();
				
				try{
					server = new ServerSocket(2001);
				
				while(true){
					
					s1 = server.accept();
					
					ObjectInputStream ois = new ObjectInputStream(s1.getInputStream());
//					endata=(int[])ois.readObject();
//                    endata = (int[])ois.readObject();
                    
                    encdata =  (int[])ois.readObject();
                    String content = ois.readObject().toString();
                    mac = ois.readObject().toString();
					fname = ois.readObject().toString();
					dest = ois.readObject().toString();
					String date = ois.readObject().toString();
					
					len = fname.length();
					
					PrintStream out99 = null;
					try {
					    out99 = new PrintStream(new FileOutputStream("Router\\"+fname+".txt"));
					    out99.print(content);
					    
					}
					finally {
					    if (out99 != null) out99.close();
					}
				    
					Statement stmt = connect.createStatement();
					String query1 = "insert into Router values('"+fname+"','"+mac+"','"+dest+"','"+date+"')";
					stmt.executeUpdate(query1);
					
					
					
				//	updateene();
					getenemac();
					
					
					lab1.setVisible(false);
					Thread.sleep(1000);
					lab1.setVisible(true);
					Thread.sleep(1000);
					lab1.setVisible(false);
					Thread.sleep(1000);
					lab1.setVisible(true);
					Thread.sleep(1000);
					
					Thread.sleep(1000);
					  l1.setText("NODE 1 : "+ene1);
					  Thread.sleep(500);
					  l2.setText("NODE 2 : "+ene2);
					  Thread.sleep(500);
					  l3.setText("NODE 3 : "+ene3);
					  Thread.sleep(500);
					  l4.setText("NODE 4 : "+ene4);
					  Thread.sleep(500);
					  l5.setText("NODE 5 : "+ene5);
					  Thread.sleep(500);
					  l6.setText("NODE 6 : "+ene6);
					  Thread.sleep(1500);
					  l1.setText("");
					  l2.setText("");
					  l3.setText("");
					  l4.setText("");
					  l5.setText("");
					  l6.setText("");
					  
					  Thread.sleep(2000);
					  

					//long  start = System.currentTimeMillis();
					
//					Thread.sleep(2000);
//					a1g=new ImageIcon(this.getClass().getResource("green.jpg"));
//					a11.setIcon(a1g);
//					no1="a11->";
					
					int e1=Integer.parseInt(ene1);
					int e2=Integer.parseInt(ene2);
					int e3=Integer.parseInt(ene3);
					int e4=Integer.parseInt(ene4);
					int e5=Integer.parseInt(ene5);
					int e6=Integer.parseInt(ene6);
					
					f1=Integer.parseInt(ene7);
					f2=Integer.parseInt(ene8);
					f3=Integer.parseInt(ene9);
					f4=Integer.parseInt(ene10);
					f5=Integer.parseInt(ene11);
					f6=Integer.parseInt(ene12);
					
					g1=Integer.parseInt(ene13);
					g2=Integer.parseInt(ene14);
					g3=Integer.parseInt(ene15);
					g4=Integer.parseInt(ene16);
					g5=Integer.parseInt(ene17);
					g6=Integer.parseInt(ene18);
					
					if(e1>=e2 && e1>=e3 && e1>=e4 && e1>=e5 && e1>=e6)
					{
						Thread.sleep(2000);
						a1=new ImageIcon(this.getClass().getResource("green.jpg"));
						a11.setIcon(a1);
						
						network2();
					}
					else if(e2>=e1 && e2>=e3 && e2>=e4 && e2>=e5 && e2>=e6)
					{
						
						Thread.sleep(2000);
						a2=new ImageIcon(this.getClass().getResource("green.jpg"));
						a22.setIcon(a2);
						
						network2();
					}
					else if(e3>=e1 && e3>=e2 && e3>=e4 && e3>=e5 && e3>=e6)
					{
						if(mac.equalsIgnoreCase(mac3))
						{
							Thread.sleep(2000);
							a3=new ImageIcon(this.getClass().getResource("green.jpg"));
							a33.setIcon(a3);
							
							network2();
						 
						}
						else
						{
							Thread.sleep(2000);
							a3=new ImageIcon(this.getClass().getResource("green.jpg"));
							a33.setIcon(a3);
							
							Thread.sleep(2000);
							a3=new ImageIcon(this.getClass().getResource("red.jpg"));
							a33.setIcon(a3);
							
							node="Node3";
							ids(node,mac);
							
							if(e1>=e2 && e1>=e4 && e1>=e5 && e1>=e6)
							{
								Thread.sleep(2000);
								a1=new ImageIcon(this.getClass().getResource("green.jpg"));
								a11.setIcon(a1);
								
								network2();
							}
							else if(e2>=e1 && e2>=e4 && e2>=e5 && e2>=e6)
							{
								Thread.sleep(2000);
								a2=new ImageIcon(this.getClass().getResource("green.jpg"));
								a22.setIcon(a2);
								
								network2();
							}
							else if(e4>=e1 && e4>=e2 && e4>=e5 && e4>=e6)
							{
								if(mac.equalsIgnoreCase(mac4))
								{
									Thread.sleep(2000);
									a4=new ImageIcon(this.getClass().getResource("green.jpg"));
									a44.setIcon(a4);
									
									network2();
								}
								else
								{
									Thread.sleep(2000);
									a4=new ImageIcon(this.getClass().getResource("green.jpg"));
									a44.setIcon(a4);
									
									Thread.sleep(2000);
									a4=new ImageIcon(this.getClass().getResource("red.jpg"));
									a44.setIcon(a4);
									
									node="Node4";
									ids(node,mac);
									
									if(e1>=e2 && e1>=e5 && e1>=e6)
									{
										Thread.sleep(2000);
										a1=new ImageIcon(this.getClass().getResource("green.jpg"));
										a11.setIcon(a1);
										
										network2();
									}
									else if(e2>=e1 && e2>=e5 && e2>=e6)
									{
										Thread.sleep(2000);
										a2=new ImageIcon(this.getClass().getResource("green.jpg"));
										a22.setIcon(a2);
										
										network2();
									}
									else if(e5>=e1 && e5>=e2 && e5>=e6)
									{
										Thread.sleep(2000);
										a5=new ImageIcon(this.getClass().getResource("green.jpg"));
										a55.setIcon(a5);
										
										network2();
									}
									else if(e6>=e1 && e6>=e2 && e6>=e5)
									{
										Thread.sleep(2000);
										a6=new ImageIcon(this.getClass().getResource("green.jpg"));
										a66.setIcon(a6);
										
										network2();
									}
								}
							}
							else if(e5>=e1 && e5>=e2 && e5>=e4 && e5>=e6)
							{
								Thread.sleep(2000);
								a5=new ImageIcon(this.getClass().getResource("green.jpg"));
								a55.setIcon(a5);
								
								network2();
							}
							else if(e6>=e1 && e6>=e2 && e6>=e4 && e6>=e5)
							{
								Thread.sleep(2000);
								a6=new ImageIcon(this.getClass().getResource("green.jpg"));
								a66.setIcon(a6);
								
								network2();
							}
						}
					}
					else if(e4>=e1 && e4>=e2 && e4>=e3 && e4>=e5 && e4>=e6)
					{
						if(mac.equalsIgnoreCase(mac4))
						{
							Thread.sleep(2000);
							a4=new ImageIcon(this.getClass().getResource("green.jpg"));
							a44.setIcon(a4);
							
							network2();
						}
						else
						{
							Thread.sleep(2000);
							a4=new ImageIcon(this.getClass().getResource("green.jpg"));
							a44.setIcon(a4);
							
							Thread.sleep(2000);
							a4=new ImageIcon(this.getClass().getResource("red.jpg"));
							a44.setIcon(a4);
							
							node="Node4";
							ids(node,mac);
							
							if(e1>=e2 && e1>=e3 && e1>=e5 && e1>=e6)
							{
								Thread.sleep(2000);
								a1=new ImageIcon(this.getClass().getResource("green.jpg"));
								a11.setIcon(a1);
								
								network2();
							}
							else if(e2>=e1 && e2>=e3 && e2>=e5 && e2>=e6)
							{
								Thread.sleep(2000);
								a2=new ImageIcon(this.getClass().getResource("green.jpg"));
								a22.setIcon(a2);
								
								network2();
							}
							else if(e3>=e1 && e3>=e2 && e3>=e5 && e3>=e6)
							{
								if(mac.equalsIgnoreCase(mac3))
								{
									Thread.sleep(2000);
									a3=new ImageIcon(this.getClass().getResource("green.jpg"));
									a33.setIcon(a3);
									
									network2();
								}
								else
								{
									Thread.sleep(2000);
									a3=new ImageIcon(this.getClass().getResource("green.jpg"));
									a33.setIcon(a3);
									
									Thread.sleep(2000);
									a3=new ImageIcon(this.getClass().getResource("red.jpg"));
									a33.setIcon(a3);
									
									node="Node3";
									ids(node,mac);
									
									if(e1>=e2 && e1>=e5 && e1>=e6)
									{
										Thread.sleep(2000);
										a1=new ImageIcon(this.getClass().getResource("green.jpg"));
										a11.setIcon(a1);
										
										network2();
									}
									else if(e2>=e1 && e2>=e5 && e2>=e6)
									{
										Thread.sleep(2000);
										a2=new ImageIcon(this.getClass().getResource("green.jpg"));
										a22.setIcon(a2);
										
										network2();
									}
									else if(e5>=e1 && e5>=e2 && e5>=e6)
									{
										Thread.sleep(2000);
										a5=new ImageIcon(this.getClass().getResource("green.jpg"));
										a55.setIcon(a5);
										
										network2();
									}
									else if(e6>=e1 && e6>=e2 && e6>=e3 && e6>=e5)
									{
										Thread.sleep(2000);
										a6=new ImageIcon(this.getClass().getResource("green.jpg"));
										a66.setIcon(a6);
										
										network2();
									}
								}
								
							}
							else if(e5>=e1 && e5>=e2 && e5>=e3 && e5>=e6)
							{
								Thread.sleep(2000);
								a5=new ImageIcon(this.getClass().getResource("green.jpg"));
								a55.setIcon(a5);
								
								network2();
							}
							else if(e6>=e1 && e6>=e2 && e6>=e3 && e6>=e5)
							{
								Thread.sleep(2000);
								a6=new ImageIcon(this.getClass().getResource("green.jpg"));
								a66.setIcon(a6);
								
								network2();
							}
						}
					}
					else if(e5>=e1 && e5>=e2 && e5>=e3 && e5>=e4 && e5>=e6)
					{
						Thread.sleep(2000);
						a5=new ImageIcon(this.getClass().getResource("green.jpg"));
						a55.setIcon(a5);
							
						network2();
						
					}
					else if(e6>=e1 && e6>=e2 && e6>=e3 && e6>=e4 && e6>=e5)
					{
						Thread.sleep(2000);
						a6=new ImageIcon(this.getClass().getResource("green.jpg"));
						a66.setIcon(a6);
						
						network2();
					}

				}
				
				}catch(Exception ex){
					System.out.println(ex);					
				}
			}
		}


			void network2() throws InterruptedException {
			
				Thread.sleep(2000);
				lab2.setVisible(false);
				Thread.sleep(1000);
				lab2.setVisible(true);
				Thread.sleep(1000);
				lab2.setVisible(false);
				Thread.sleep(1000);
				lab2.setVisible(true);
				Thread.sleep(1000);
				
				Thread.sleep(1000);
				  l7.setText("NODE 7 : "+ene7);
				  Thread.sleep(500);
				  l8.setText("NODE 8 : "+ene8);
				  Thread.sleep(500);
				  l9.setText("NODE 9 : "+ene9);
				  Thread.sleep(500);
				  l10.setText("NODE 10 : "+ene10);
				  Thread.sleep(500);
				  l11.setText("NODE 11 : "+ene11);
				  Thread.sleep(500);
				  l12.setText("NODE 12 : "+ene12);
				  Thread.sleep(1500);
				  l7.setText("");
				  l8.setText("");
				  l9.setText("");
				  l10.setText("");
				  l11.setText("");
				  l12.setText("");
				  
				  Thread.sleep(2000);
				
				if(f1>=f2 && f1>=f3 && f1>=f4 && f1>=f5 && f1>=f6)
				{
					Thread.sleep(2000);
					b1=new ImageIcon(this.getClass().getResource("green.jpg"));
					b11.setIcon(b1);
					
					network3();
				}
				else if(f2>=f1 && f2>=f3 && f2>=f4 && f2>=f5 && f2>=f6)
				{
					
					Thread.sleep(2000);
					b2=new ImageIcon(this.getClass().getResource("green.jpg"));
					b22.setIcon(b2);
					
					network3();
				}
				else if(f3>=f1 && f3>=f2 && f3>=f4 && f3>=f5 && f3>=f6)
				{
					if(mac.equalsIgnoreCase(mac9))
					{
						Thread.sleep(2000);
						b3=new ImageIcon(this.getClass().getResource("green.jpg"));
						b33.setIcon(b3);
						
						network3();
					
					}
					else
					{
						Thread.sleep(2000);
						b3=new ImageIcon(this.getClass().getResource("green.jpg"));
						b33.setIcon(b3);
						
						Thread.sleep(2000);
						b3=new ImageIcon(this.getClass().getResource("red.jpg"));
						b33.setIcon(b3);
						
						node="Node9";
						ids(node,mac);
						
						if(f1>=f2 && f1>=f4 && f1>=f5 && f1>=f6)
						{
							Thread.sleep(2000);
							b1=new ImageIcon(this.getClass().getResource("green.jpg"));
							b11.setIcon(b1);
							
							network3();
						}
						else if(f2>=f1 && f2>=f4 && f2>=f5 && f2>=f6)
						{
							Thread.sleep(2000);
							b2=new ImageIcon(this.getClass().getResource("green.jpg"));
							b22.setIcon(b2);
							
							network3();
						}
						else if(f4>=f1 && f4>=f2 && f4>=f5 && f4>=f6)
						{
							if(mac.equalsIgnoreCase(mac10))
							{
								Thread.sleep(2000);
								b4=new ImageIcon(this.getClass().getResource("green.jpg"));
								b44.setIcon(b4);
								
								network3();
							}
							else
							{
								Thread.sleep(2000);
								b4=new ImageIcon(this.getClass().getResource("green.jpg"));
								b44.setIcon(b4);
								
								Thread.sleep(2000);
								b4=new ImageIcon(this.getClass().getResource("red.jpg"));
								b44.setIcon(b4);
								
								node="Node10";
								ids(node,mac);
								
								if(f1>=f2 && f1>=f5 && f1>=f6)
								{
									Thread.sleep(2000);
									b1=new ImageIcon(this.getClass().getResource("green.jpg"));
									b11.setIcon(b1);
									
									network3();
								}
								else if(f2>=f1 && f2>=f5 && f2>=f6)
								{
									Thread.sleep(2000);
									b2=new ImageIcon(this.getClass().getResource("green.jpg"));
									b22.setIcon(b2);
									
									network3();
								}
								else if(f5>=f1 && f5>=f2 && f5>=f6)
								{
									Thread.sleep(2000);
									b5=new ImageIcon(this.getClass().getResource("green.jpg"));
									b55.setIcon(b5);
									
									network3();
								}
								else if(f6>=f1 && f6>=f2 && f6>=f5)
								{
									Thread.sleep(2000);
									b6=new ImageIcon(this.getClass().getResource("green.jpg"));
									b66.setIcon(b6);
									
									network3();
								}
							}
						}
						else if(f5>=f1 && f5>=f2 && f5>=f4 && f5>=f6)
						{
							Thread.sleep(2000);
							b5=new ImageIcon(this.getClass().getResource("green.jpg"));
							b55.setIcon(b5);
							
							network3();
						}
						else if(f6>=f1 && f6>=f2 && f6>=f4 && f6>=f5)
						{
							Thread.sleep(2000);
							b6=new ImageIcon(this.getClass().getResource("green.jpg"));
							b66.setIcon(b6);
							
							network3();
						}
					}
				}
				else if(f4>=f1 && f4>=f2 && f4>=f3 && f4>=f5 && f4>=f6)
				{
					if(mac.equalsIgnoreCase(mac10))
					{
						Thread.sleep(2000);
						b4=new ImageIcon(this.getClass().getResource("green.jpg"));
						b44.setIcon(b4);
						
						network3();
					}
					else
					{
						Thread.sleep(2000);
						b4=new ImageIcon(this.getClass().getResource("green.jpg"));
						b44.setIcon(b4);
						
						Thread.sleep(2000);
						b4=new ImageIcon(this.getClass().getResource("red.jpg"));
						b44.setIcon(b4);
						
						node="Node10";
						ids(node,mac);
						
						if(f1>=f2 && f1>=f3 && f1>=f5 && f1>=f6)
						{
							Thread.sleep(2000);
							b1=new ImageIcon(this.getClass().getResource("green.jpg"));
							b11.setIcon(b1);
							
							network3();
						}
						else if(f2>=f1 && f2>=f3 && f2>=f5 && f2>=f6)
						{
							Thread.sleep(2000);
							b2=new ImageIcon(this.getClass().getResource("green.jpg"));
							b22.setIcon(b2);
							
							network3();
						}
						else if(f3>=f1 && f3>=f2 && f3>=f5 && f3>=f6)
						{
							if(mac.equalsIgnoreCase(mac9))
							{
								Thread.sleep(2000);
								b3=new ImageIcon(this.getClass().getResource("green.jpg"));
								b33.setIcon(b3);
								
								network3();
							}
							else
							{
								Thread.sleep(2000);
								b3=new ImageIcon(this.getClass().getResource("green.jpg"));
								b33.setIcon(b3);
								
								Thread.sleep(2000);
								b3=new ImageIcon(this.getClass().getResource("red.jpg"));
								b33.setIcon(b3);
								
								node="Node9";
								ids(node,mac);
								
								if(f1>=f2 && f1>=f5 && f1>=f6)
								{
									Thread.sleep(2000);
									b1=new ImageIcon(this.getClass().getResource("green.jpg"));
									b11.setIcon(b1);
									
									network3();
								}
								else if(f2>=f1 && f2>=f5 && f2>=f6)
								{
									Thread.sleep(2000);
									b2=new ImageIcon(this.getClass().getResource("green.jpg"));
									b22.setIcon(b2);
									
									network3();
								}
								else if(f5>=f1 && f5>=f2 && f5>=f6)
								{
									Thread.sleep(2000);
									b5=new ImageIcon(this.getClass().getResource("green.jpg"));
									b55.setIcon(b5);
									
									network3();
								}
								else if(f6>=f1 && f6>=f2 && f6>=f5)
								{
									Thread.sleep(2000);
									b6=new ImageIcon(this.getClass().getResource("green.jpg"));
									b66.setIcon(b6);
									
									network3();
								}
							}
							
						}
						else if(f5>=f1 && f5>=f2 && f5>=f3 && f5>=f6)
						{
							Thread.sleep(2000);
							b5=new ImageIcon(this.getClass().getResource("green.jpg"));
							b55.setIcon(b5);
							
							network3();
						}
						else if(f6>=f1 && f6>=f2 && f6>=f3 && f6>=f5)
						{
							Thread.sleep(2000);
							b6=new ImageIcon(this.getClass().getResource("green.jpg"));
							b66.setIcon(b6);
							
							network3();
						}
					}
				}
				else if(f5>=f1 && f5>=f2 && f5>=f3 && f5>=f4 && f5>=f6)
				{
					Thread.sleep(2000);
					b5=new ImageIcon(this.getClass().getResource("green.jpg"));
					b55.setIcon(b5);
						
					network3();
					
				}
				else if(f6>=f1 && f6>=f2 && f6>=f3 && f6>=f4 && f6>=f5)
				{
					Thread.sleep(2000);
					b6=new ImageIcon(this.getClass().getResource("green.jpg"));
					b66.setIcon(b6);
					
					network3();
				}
			
		}

			void network3() throws InterruptedException {
				
				Thread.sleep(2000);
				lab3.setVisible(false);
				Thread.sleep(1000);
				lab3.setVisible(true);
				Thread.sleep(1000);
				lab3.setVisible(false);
				Thread.sleep(1000);
				lab3.setVisible(true);
				Thread.sleep(1000);
				
				Thread.sleep(1000);
				  l13.setText("NODE 13 : "+ene13);
				  Thread.sleep(500);
				  l14.setText("NODE 14 : "+ene14);
				  Thread.sleep(500);
				  l15.setText("NODE 15 : "+ene15);
				  Thread.sleep(500);
				  l16.setText("NODE 16 : "+ene16);
				  Thread.sleep(500);
				  l17.setText("NODE 17 : "+ene17);
				  Thread.sleep(500);
				  l18.setText("NODE 18 : "+ene18);
				  Thread.sleep(1500);
				  l13.setText("");
				  l14.setText("");
				  l15.setText("");
				  l16.setText("");
				  l17.setText("");
				  l18.setText("");
				  
				  Thread.sleep(2000);
				
				if(g1>=g2 && g1>=g3 && g1>=g4 && g1>=g5 && g1>=g6)
				{
					Thread.sleep(2000);
					c1=new ImageIcon(this.getClass().getResource("green.jpg"));
					c11.setIcon(c1);
					
					clear();
					send(s1,dest);
				}
				else if(g2>=g1 && g2>=g3 && g2>=g4 && g2>=g5 && g2>=g6)
				{
					
					Thread.sleep(2000);
					c2=new ImageIcon(this.getClass().getResource("green.jpg"));
					c22.setIcon(c2);
					
					clear();
					send(s1,dest);
				}
				else if(g3>=g1 && g3>=g2 && g3>=g4 && g3>=g5 && g3>=g6)
				{
					if(mac.equalsIgnoreCase(mac15))
					{
						Thread.sleep(2000);
						c3=new ImageIcon(this.getClass().getResource("green.jpg"));
						c33.setIcon(c3);
						
						clear();
						send(s1,dest);
						
					
					}
					else
					{
						Thread.sleep(2000);
						c3=new ImageIcon(this.getClass().getResource("green.jpg"));
						c33.setIcon(c3);
						
						Thread.sleep(2000);
						c3=new ImageIcon(this.getClass().getResource("red.jpg"));
						c33.setIcon(c3);
						
						node="Node15";
						ids(node,mac);
						
						if(g1>=g2 && g1>=g4 && g1>=g5 && g1>=g6)
						{
							Thread.sleep(2000);
							c1=new ImageIcon(this.getClass().getResource("green.jpg"));
							c11.setIcon(c1);
							
							clear();
							send(s1,dest);
						}
						else if(g2>=g1 && g2>=g4 && g2>=g5 && g2>=g6)
						{
							Thread.sleep(2000);
							c2=new ImageIcon(this.getClass().getResource("green.jpg"));
							c22.setIcon(c2);
							
							clear();
							send(s1,dest);
						}
						else if(g4>=g1 && g4>=g2 && g4>=g5 && g4>=g6)
						{
							if(mac.equalsIgnoreCase(mac16))
							{
								Thread.sleep(2000);
								c4=new ImageIcon(this.getClass().getResource("green.jpg"));
								c44.setIcon(c4);
								
								clear();
								send(s1,dest);
							}
							else
							{
								Thread.sleep(2000);
								c4=new ImageIcon(this.getClass().getResource("green.jpg"));
								c44.setIcon(c4);
								
								Thread.sleep(2000);
								c4=new ImageIcon(this.getClass().getResource("red.jpg"));
								c44.setIcon(c4);
								
								node="Node16";
								ids(node,mac);
								
								if(g1>=g2 && g1>=g5 && g1>=g6)
								{
									Thread.sleep(2000);
									c1=new ImageIcon(this.getClass().getResource("green.jpg"));
									c11.setIcon(c1);
									
									clear();
									send(s1,dest);
								}
								else if(g2>=g1 && g2>=g5 && g2>=g6)
								{
									Thread.sleep(2000);
									c2=new ImageIcon(this.getClass().getResource("green.jpg"));
									c22.setIcon(c2);
									
									clear();
									send(s1,dest);
								}
								else if(g5>=g1 && g5>=g2 && g5>=g6)
								{
									Thread.sleep(2000);
									c5=new ImageIcon(this.getClass().getResource("green.jpg"));
									c55.setIcon(c5);
									
									clear();
									send(s1,dest);
								}
								else if(g6>=g1 && g6>=g2 && g6>=g5)
								{
									Thread.sleep(2000);
									c6=new ImageIcon(this.getClass().getResource("green.jpg"));
									c66.setIcon(c6);
									
									clear();
									send(s1,dest);
								}
							}
						}
						else if(g5>=g1 && g5>=g2 && g5>=g4 && g5>=g6)
						{
							Thread.sleep(2000);
							c5=new ImageIcon(this.getClass().getResource("green.jpg"));
							c55.setIcon(c5);
							
							clear();
							send(s1,dest);
						}
						else if(g6>=g1 && g6>=g2 && g6>=g4 && g6>=g5)
						{
							Thread.sleep(2000);
							c6=new ImageIcon(this.getClass().getResource("green.jpg"));
							c66.setIcon(c6);
							
							clear();
							send(s1,dest);
						}
					}
				}
				else if(g4>=g1 && g4>=g2 && g4>=g3 && g4>=g5 && g4>=g6)
				{
					if(mac.equalsIgnoreCase(mac16))
					{
						Thread.sleep(2000);
						c4=new ImageIcon(this.getClass().getResource("green.jpg"));
						c44.setIcon(c4);
						
						clear();
						send(s1,dest);
					}
					else
					{
						Thread.sleep(2000);
						c4=new ImageIcon(this.getClass().getResource("green.jpg"));
						c44.setIcon(c4);
						
						Thread.sleep(2000);
						c4=new ImageIcon(this.getClass().getResource("red.jpg"));
						c44.setIcon(c4);
						
						node="Node16";
						ids(node,mac);
						
						if(g1>=g2 && g1>=g3 && g1>=g5 && g1>=g6)
						{
							Thread.sleep(2000);
							c1=new ImageIcon(this.getClass().getResource("green.jpg"));
							c11.setIcon(c1);
							
							clear();
							send(s1,dest);
						}
						else if(g2>=g1 && g2>=g3 && g2>=g5 && g2>=g6)
						{
							Thread.sleep(2000);
							c2=new ImageIcon(this.getClass().getResource("green.jpg"));
							c22.setIcon(c2);
							
							clear();
							send(s1,dest);
						}
						else if(g3>=g1 && g3>=g2 && g3>=g5 && g3>=g6)
						{
							if(mac.equalsIgnoreCase(mac15))
							{
								Thread.sleep(2000);
								c3=new ImageIcon(this.getClass().getResource("green.jpg"));
								c33.setIcon(c3);
								
								clear();
								send(s1,dest);
							}
							else
							{
								Thread.sleep(2000);
								c3=new ImageIcon(this.getClass().getResource("green.jpg"));
								c33.setIcon(c3);
								
								Thread.sleep(2000);
								c3=new ImageIcon(this.getClass().getResource("red.jpg"));
								c33.setIcon(c3);
								
								node="Node15";
								ids(node,mac);
								
								if(g1>=g2 && g1>=g5 && g1>=g6)
								{
									Thread.sleep(2000);
									c1=new ImageIcon(this.getClass().getResource("green.jpg"));
									c11.setIcon(c1);
									
									clear();
									send(s1,dest);
								}
								else if(g2>=g1 && g2>=g5 && g2>=g6)
								{
									Thread.sleep(2000);
									c2=new ImageIcon(this.getClass().getResource("green.jpg"));
									c22.setIcon(c2);
									
									clear();
									send(s1,dest);
								}
								else if(g5>=g1 && g5>=g2 && g5>=g6)
								{
									Thread.sleep(2000);
									c5=new ImageIcon(this.getClass().getResource("green.jpg"));
									c55.setIcon(c5);
									
									clear();
									send(s1,dest);
								}
								else if(g6>=g1 && g6>=g2 && g6>=g5)
								{
									Thread.sleep(2000);
									c6=new ImageIcon(this.getClass().getResource("green.jpg"));
									c66.setIcon(c6);
									
									clear();
									send(s1,dest);
								}
							}
							
						}
						else if(g5>=g1 && g5>=g2 && g5>=g3 && g5>=g6)
						{
							Thread.sleep(2000);
							c5=new ImageIcon(this.getClass().getResource("green.jpg"));
							c55.setIcon(c5);
							
							clear();
							send(s1,dest);
						}
						else if(g6>=g1 && g6>=g2 && g6>=g3 && g6>=g5)
						{
							Thread.sleep(2000);
							c6=new ImageIcon(this.getClass().getResource("green.jpg"));
							c66.setIcon(c6);
							
							clear();
							send(s1,dest);
						}
					}
				}
				else if(g5>=g1 && g5>=g2 && g5>=g3 && g5>=g4 && g5>=g6)
				{
					Thread.sleep(2000);
					c5=new ImageIcon(this.getClass().getResource("green.jpg"));
					c55.setIcon(c5);
						
					clear();
					send(s1,dest);
					
				}
				else if(g6>=g1 && g6>=g2 && g6>=g3 && g6>=g4 && g6>=g5)
				{
					Thread.sleep(2000);
					c6=new ImageIcon(this.getClass().getResource("green.jpg"));
					c66.setIcon(c6);
					
					clear();
					send(s1,dest);
				}
				
			}

		
			

			void getenemac() {
			
			 try{

				ResultSet r20=connect.createStatement().executeQuery("select * from Cluster1 where node='"+node1+"'");
				if(r20.next()==true){ene1=r20.getString(3); mac1=r20.getString(4);}
				ResultSet r201=connect.createStatement().executeQuery("select * from Cluster1 where node='"+node2+"'");
				if(r201.next()==true){ene2=r201.getString(3); mac2=r201.getString(4);}
				ResultSet r202=connect.createStatement().executeQuery("select * from Cluster1 where node='"+node3+"'");
				if(r202.next()==true){ene3=r202.getString(3); mac3=r202.getString(4);}
				ResultSet r203=connect.createStatement().executeQuery("select * from Cluster1 where node='"+node4+"'");
				if(r203.next()==true){ene4=r203.getString(3); mac4=r203.getString(4);}
				ResultSet r204=connect.createStatement().executeQuery("select * from Cluster1 where node='"+node5+"'");
				if(r204.next()==true){ene5=r204.getString(3); mac5=r204.getString(4);}
				ResultSet r205=connect.createStatement().executeQuery("select * from Cluster1 where node='"+node6+"'");
				if(r205.next()==true){ene6=r205.getString(3); mac6=r205.getString(4);}
				
				ResultSet r206=connect.createStatement().executeQuery("select * from Cluster2 where node='"+node7+"'");
				if(r206.next()==true){ene7=r206.getString(3); mac7=r206.getString(4);}
				ResultSet r207=connect.createStatement().executeQuery("select * from Cluster2 where node='"+node8+"'");
				if(r207.next()==true){ene8=r207.getString(3); mac8=r207.getString(4);}
				ResultSet r208=connect.createStatement().executeQuery("select * from Cluster2 where node='"+node9+"'");
				if(r208.next()==true){ene9=r208.getString(3); mac9=r208.getString(4);}
				ResultSet r209=connect.createStatement().executeQuery("select * from Cluster2 where node='"+node10+"'");
				if(r209.next()==true){ene10=r209.getString(3); mac10=r209.getString(4);}
				ResultSet r2010=connect.createStatement().executeQuery("select * from Cluster2 where node='"+node11+"'");
				if(r2010.next()==true){ene11=r2010.getString(3); mac11=r2010.getString(4);}
				ResultSet r2011=connect.createStatement().executeQuery("select * from Cluster2 where node='"+node12+"'");
				if(r2011.next()==true){ene12=r2011.getString(3); mac12=r2011.getString(4);}
				
				ResultSet r2012=connect.createStatement().executeQuery("select * from Cluster3 where node='"+node13+"'");
				if(r2012.next()==true){ene13=r2012.getString(3); mac13=r2012.getString(4);}
				ResultSet r2013=connect.createStatement().executeQuery("select * from Cluster3 where node='"+node14+"'");
				if(r2013.next()==true){ene14=r2013.getString(3); mac14=r2013.getString(4);}
				ResultSet r2014=connect.createStatement().executeQuery("select * from Cluster3 where node='"+node15+"'");
				if(r2014.next()==true){ene15=r2014.getString(3); mac15=r2014.getString(4);}
				ResultSet r2015=connect.createStatement().executeQuery("select * from Cluster3 where node='"+node16+"'");
				if(r2015.next()==true){ene16=r2015.getString(3); mac16=r2015.getString(4);}
				ResultSet r2016=connect.createStatement().executeQuery("select * from Cluster3 where node='"+node17+"'");
				if(r2016.next()==true){ene17=r2016.getString(3); mac17=r2016.getString(4);}
				ResultSet r2017=connect.createStatement().executeQuery("select * from Cluster3 where node='"+node18+"'");
				if(r2017.next()==true){ene18=r2017.getString(3); mac18=r2017.getString(4);}
				
					
				 }catch (Exception e) {
					// TODO: handle exception
				}
			
		}

			void clear() throws InterruptedException {
				
				Thread.sleep(2000);
				a1=new ImageIcon(this.getClass().getResource("black.png"));
				a11.setIcon(a1);
				
				a2=new ImageIcon(this.getClass().getResource("black.png"));
				a22.setIcon(a2);
				
				a3=new ImageIcon(this.getClass().getResource("black.png"));
				a33.setIcon(a3);
				
				a4=new ImageIcon(this.getClass().getResource("black.png"));
				a44.setIcon(a4);
				
				a5=new ImageIcon(this.getClass().getResource("black.png"));
				a55.setIcon(a5);
				
				a6=new ImageIcon(this.getClass().getResource("black.png"));
				a66.setIcon(a6);
				
				b1=new ImageIcon(this.getClass().getResource("black.png"));
				b11.setIcon(b1);
				
				b2=new ImageIcon(this.getClass().getResource("black.png"));
				b22.setIcon(b2);
				
				b3=new ImageIcon(this.getClass().getResource("black.png"));
				b33.setIcon(b3);
				
				b4=new ImageIcon(this.getClass().getResource("black.png"));
				b44.setIcon(b4);
				
				b5=new ImageIcon(this.getClass().getResource("black.png"));
				b55.setIcon(b5);
				
				b6=new ImageIcon(this.getClass().getResource("black.png"));
				b66.setIcon(b6);
				
				c1=new ImageIcon(this.getClass().getResource("black.png"));
				c11.setIcon(c1);
				
				c2=new ImageIcon(this.getClass().getResource("black.png"));
				c22.setIcon(c2);
				
				c3=new ImageIcon(this.getClass().getResource("black.png"));
				c33.setIcon(c3);
				
				c4=new ImageIcon(this.getClass().getResource("black.png"));
				c44.setIcon(c4);
				
				c5=new ImageIcon(this.getClass().getResource("black.png"));
				c55.setIcon(c5);
				
				c6=new ImageIcon(this.getClass().getResource("black.png"));
				c66.setIcon(c6);
				
				c7=new ImageIcon(this.getClass().getResource("border.png"));
				c77.setIcon(c7);
				
				
				
			}


			void ids(String node,String mac) {
					
				try
				{
					SimpleDateFormat sd = new SimpleDateFormat("dd/MM/yyyy");
					
					Date d = new Date();
					
					String dt = sd.format(d);
					
					Socket sc = new Socket("localhost",309);
					DataOutputStream dd = new DataOutputStream(sc.getOutputStream());
					dd.writeUTF(node);
					dd.writeUTF(mac);
					dd.writeUTF(dt);
					
					DataInputStream din = new DataInputStream(sc.getInputStream());
					String mes = din.readUTF();
					System.out.println(mes);
					
/*					Thread.sleep(2000);
					nodl.setVisible(false);
					Thread.sleep(1000);
					nodl.setVisible(true);
					Thread.sleep(1000);
					nodl.setVisible(false);
					Thread.sleep(1000);
					nodl.setVisible(true);
					Thread.sleep(1000);
					
					down = new ImageIcon(this.getClass().getResource("downg.png"));
					downl.setIcon(down);
					
					Thread.sleep(1000);
					
					Thread.sleep(2000);
					idsl.setVisible(false);
					Thread.sleep(1000);
					idsl.setVisible(true);
					Thread.sleep(1000);
					idsl.setVisible(false);
					Thread.sleep(1000);
					idsl.setVisible(true);
					Thread.sleep(1000);
					
					Thread.sleep(2000);
					
					down = new ImageIcon(this.getClass().getResource("down.png"));
					downl.setIcon(down);*/
					
				}catch (Exception e) {
					
				}
			
		}
			

			void send(Socket cn,String dest) {
			
				try
				{
					
					
					Decryption d = new Decryption();
					String decData = d.decrypt(encdata);
					 
/*					String f = fname.substring(0, fname.indexOf("."));
					String cname = "Router\\";
					MergeFile mf = new MergeFile();
					mf.mergeFiles(f, cname);
					
					FileInputStream fs = new FileInputStream(cname + f + "x.txt");
					byte bs1[] = new byte[fs.available()];
					fs.read(bs1);
					String content = new String(bs1);*/
					System.out.println(decData);
					 if(dest.equalsIgnoreCase("A"))
						{
							Socket dest1=new Socket("localhost",100);
							ObjectOutputStream dos91=new ObjectOutputStream(dest1.getOutputStream());
							dos91.writeObject(fname);
							dos91.writeObject(decData);
							
							ObjectInputStream ins=new ObjectInputStream(dest1.getInputStream());
							String msg=ins.readObject().toString();
							
							ObjectOutputStream d1=new ObjectOutputStream(s1.getOutputStream());
							d1.writeObject(msg);
							
						}
						if(dest.equalsIgnoreCase("B"))
						{
							Socket dest1=new Socket("localhost",101);
							ObjectOutputStream dos91=new ObjectOutputStream(dest1.getOutputStream());
							dos91.writeObject(fname);
							dos91.writeObject(decData);
							
							ObjectInputStream ins=new ObjectInputStream(dest1.getInputStream());
							String msg=ins.readObject().toString();
							
							ObjectOutputStream d1=new ObjectOutputStream(s1.getOutputStream());
							d1.writeObject(msg);
							
						}
						if(dest.equalsIgnoreCase("C"))
						{
							Socket dest1=new Socket("localhost",102);
							ObjectOutputStream dos91=new ObjectOutputStream(dest1.getOutputStream());
							dos91.writeObject(fname);
							dos91.writeObject(decData);
							
							ObjectInputStream ins=new ObjectInputStream(dest1.getInputStream());
							String msg=ins.readObject().toString();
							
							ObjectOutputStream d1=new ObjectOutputStream(s1.getOutputStream());
							d1.writeObject(msg);
							
						}
						
					
				}catch (Exception e) {
					// TODO: handle exception
				}
			
		}

		

		void init() throws SQLException, InterruptedException {
			
			String ene="energy";
			String a="";
			ResultSet rs = connect.createStatement().executeQuery("select * from Cluster1 order by '"+ene+"' desc");
			if(rs.next())
			{
				a=rs.getString(1);
				System.out.println(a);
				
			}
			Thread.sleep(2000);
			lab1.setVisible(false);
			Thread.sleep(2000);
			lab1.setVisible(true);
			
			if(a.equalsIgnoreCase("Node1"))
			{
				Thread.sleep(2000);
				a1=new ImageIcon(this.getClass().getResource("green.jpg"));
				a11.setIcon(a1);
				Thread.sleep(2000);
				a22.setVisible(false);
				a33.setVisible(false);
				a44.setVisible(false);
				a55.setVisible(false);
				a66.setVisible(false);
				
				Thread.sleep(2000);
				a22.setVisible(true);
				a33.setVisible(true);
				a44.setVisible(true);
				a55.setVisible(true);
				a66.setVisible(true);
				Thread.sleep(2000);
				
				l19.setText("Node 1 CLUSTER HEAD");
				Thread.sleep(1000);
				
				a2=new ImageIcon(this.getClass().getResource("green.jpg"));
				a22.setIcon(a2);Thread.sleep(500);
				a22.setVisible(true);
				l20.setText("Node 2 Initialized");
				Thread.sleep(1000);
				
				a3=new ImageIcon(this.getClass().getResource("green.jpg"));
				a33.setIcon(a3);Thread.sleep(500);
				a33.setVisible(true);
				l21.setText("Node 3 Initialized");
				Thread.sleep(1000);
				
				a4=new ImageIcon(this.getClass().getResource("green.jpg"));
				a44.setIcon(a4);Thread.sleep(500);
				a44.setVisible(true);
				l22.setText("Node 4 Initialized");
				Thread.sleep(1000);
				
				a5=new ImageIcon(this.getClass().getResource("green.jpg"));
				a55.setIcon(a5);Thread.sleep(500);
				a55.setVisible(true);
				l23.setText("Node 5 Initialized");
				Thread.sleep(1000);
				
				a6=new ImageIcon(this.getClass().getResource("green.jpg"));
				a66.setIcon(a6);Thread.sleep(500);
				a66.setVisible(true);
				l24.setText("Node 6 Initialized");
				Thread.sleep(1000);
				
				net1();
				
				clear();
				node1();
			}
			if(a.equalsIgnoreCase("Node2"))
			{
				Thread.sleep(2000);
				a2=new ImageIcon(this.getClass().getResource("green.jpg"));
				a22.setIcon(a2);
				
				Thread.sleep(2000);
				a11.setVisible(false);
				a33.setVisible(false);
				a44.setVisible(false);
				a55.setVisible(false);
				a66.setVisible(false);
				
				Thread.sleep(2000);
				
				a11.setVisible(true);
				a33.setVisible(true);
				a44.setVisible(true);
				a55.setVisible(true);
				a66.setVisible(true);
				
				Thread.sleep(2000);

				l20.setText("Node 2 CLUSTER HEAD");
				Thread.sleep(1000);
				
				a1=new ImageIcon(this.getClass().getResource("green.jpg"));
				a11.setIcon(a1);Thread.sleep(500);
				a11.setVisible(true);
				l19.setText("Node 1 Initialized");
				Thread.sleep(1000);
				
				a3=new ImageIcon(this.getClass().getResource("green.jpg"));
				a33.setIcon(a3);Thread.sleep(500);
				a33.setVisible(true);
				l21.setText("Node 3 Initialized");
				Thread.sleep(1000);
				
				a4=new ImageIcon(this.getClass().getResource("green.jpg"));
				a44.setIcon(a4);Thread.sleep(500);
				a44.setVisible(true);
				l22.setText("Node 4 Initialized");
				Thread.sleep(1000);
				
				a5=new ImageIcon(this.getClass().getResource("green.jpg"));
				a55.setIcon(a5);Thread.sleep(500);a55.setVisible(true);
				l23.setText("Node 5 Initialized");
				Thread.sleep(1000);
				
				a6=new ImageIcon(this.getClass().getResource("green.jpg"));
				a66.setIcon(a6);Thread.sleep(500);
				a66.setVisible(true);
				l24.setText("Node 6 Initialized");
				Thread.sleep(1000);
				
				net1();
				
				clear();
				node1();
			}
			if(a.equalsIgnoreCase("Node3"))
			{
				Thread.sleep(2000);
				a3=new ImageIcon(this.getClass().getResource("green.jpg"));
				a33.setIcon(a3);
				Thread.sleep(2000);
				a22.setVisible(false);
				a11.setVisible(false);
				a44.setVisible(false);
				a55.setVisible(false);
				a66.setVisible(false);
				Thread.sleep(2000);
				a22.setVisible(true);
				a11.setVisible(true);
				a44.setVisible(true);
				a55.setVisible(true);
				a66.setVisible(true);
				
				Thread.sleep(2000);

				l21.setText("Node 3 CLUSTER HEAD");
				Thread.sleep(1000);
				
				a2=new ImageIcon(this.getClass().getResource("green.jpg"));
				a22.setIcon(a2);Thread.sleep(500);
				a22.setVisible(true);
				l20.setText("Node 2 Initialized");
				Thread.sleep(1000);
				
				a1=new ImageIcon(this.getClass().getResource("green.jpg"));
				a11.setIcon(a1);Thread.sleep(500);
				a11.setVisible(true);
				l19.setText("Node 1 Initialized");
				Thread.sleep(1000);
				
				a4=new ImageIcon(this.getClass().getResource("green.jpg"));
				a44.setIcon(a4);Thread.sleep(500);
				a44.setVisible(true);
				l22.setText("Node 4 Initialized");
				Thread.sleep(1000);
				
				a5=new ImageIcon(this.getClass().getResource("green.jpg"));
				a55.setIcon(a5);Thread.sleep(500);
				a55.setVisible(true);
				l23.setText("Node 5 Initialized");
				Thread.sleep(1000);
				
				a6=new ImageIcon(this.getClass().getResource("green.jpg"));
				a66.setIcon(a6);Thread.sleep(500);
				a66.setVisible(true);
				l24.setText("Node 6 Initialized");
				Thread.sleep(1000);
				
				net1();
				clear();
				node1();
			}
			if(a.equalsIgnoreCase("Node4"))
			{
				Thread.sleep(2000);
				a4=new ImageIcon(this.getClass().getResource("green.jpg"));
				a44.setIcon(a4);
				Thread.sleep(2000);
				a22.setVisible(false);
				a33.setVisible(false);
				a11.setVisible(false);
				a55.setVisible(false);
				a66.setVisible(false);
				Thread.sleep(2000);
				a22.setVisible(true);
				a33.setVisible(true);
				a11.setVisible(true);
				a55.setVisible(true);
				a66.setVisible(true);
				
				Thread.sleep(2000);

				l22.setText("Node 4 CLUSTER HEAD");
				Thread.sleep(1000);
				
				a2=new ImageIcon(this.getClass().getResource("green.jpg"));
				a22.setIcon(a2);Thread.sleep(500);
				a22.setVisible(true);
				l20.setText("Node 2 Initialized");
				Thread.sleep(1000);
				
				a3=new ImageIcon(this.getClass().getResource("green.jpg"));
				a33.setIcon(a3);Thread.sleep(500);
				a33.setVisible(true);
				l21.setText("Node 3 Initialized");
				Thread.sleep(1000);
				
				a1=new ImageIcon(this.getClass().getResource("green.jpg"));
				a11.setIcon(a1);Thread.sleep(500);
				a11.setVisible(true);
				l19.setText("Node 1 Initialized");
				Thread.sleep(1000);
				
				a5=new ImageIcon(this.getClass().getResource("green.jpg"));
				a55.setIcon(a5);Thread.sleep(500);
				a55.setVisible(true);
				l23.setText("Node 5 Initialized");
				Thread.sleep(1000);
				
				a6=new ImageIcon(this.getClass().getResource("green.jpg"));
				a66.setIcon(a6);Thread.sleep(500);
				a66.setVisible(true);
				l24.setText("Node 6 Initialized");
				Thread.sleep(1000);
				
				net1();
				clear();
				node1();
			}
			if(a.equalsIgnoreCase("Node5"))
			{
				Thread.sleep(2000);
				a5=new ImageIcon(this.getClass().getResource("green.jpg"));
				a55.setIcon(a5);
				Thread.sleep(2000);
				a22.setVisible(false);
				a33.setVisible(false);
				a44.setVisible(false);
				a11.setVisible(false);
				a66.setVisible(false);
				Thread.sleep(2000);
				a22.setVisible(true);
				a33.setVisible(true);
				a44.setVisible(true);
				a11.setVisible(true);
				a66.setVisible(true);
				
				Thread.sleep(2000);

				l23.setText("Node 5 CLUSTER HEAD");
				Thread.sleep(1000);
				
				a2=new ImageIcon(this.getClass().getResource("green.jpg"));
				a22.setIcon(a2);Thread.sleep(500);
				a22.setVisible(true);
				l20.setText("Node 2 Initialized");
				Thread.sleep(1000);
				
				a3=new ImageIcon(this.getClass().getResource("green.jpg"));
				a33.setIcon(a3);Thread.sleep(500);
				a33.setVisible(true);
				l21.setText("Node 3 Initialized");
				Thread.sleep(1000);
				
				a4=new ImageIcon(this.getClass().getResource("green.jpg"));
				a44.setIcon(a4);Thread.sleep(500);
				a44.setVisible(true);
				l22.setText("Node 4 Initialized");
				Thread.sleep(1000);
				
				a1=new ImageIcon(this.getClass().getResource("green.jpg"));
				a11.setIcon(a1);Thread.sleep(500);
				a11.setVisible(true);
				l19.setText("Node 1 Initialized");
				Thread.sleep(1000);
				
				a6=new ImageIcon(this.getClass().getResource("green.jpg"));
				a66.setIcon(a6);Thread.sleep(500);
				a66.setVisible(true);
				l24.setText("Node 6 Initialized");
				Thread.sleep(1000);
				
				net1();
				clear();
				node1();
			}
			if(a.equalsIgnoreCase("Node6"))
			{
				Thread.sleep(2000);
				a6=new ImageIcon(this.getClass().getResource("green.jpg"));
				a66.setIcon(a6);
				Thread.sleep(2000);
				a22.setVisible(false);
				a33.setVisible(false);
				a44.setVisible(false);
				a55.setVisible(false);
				a11.setVisible(false);
				Thread.sleep(2000);
				a22.setVisible(true);
				a33.setVisible(true);
				a44.setVisible(true);
				a55.setVisible(true);
				a11.setVisible(true);
				
				Thread.sleep(2000);

				l24.setText("Node 6 CLUSTER HEAD");
				Thread.sleep(1000);
				
				a2=new ImageIcon(this.getClass().getResource("green.jpg"));
				a22.setIcon(a2);Thread.sleep(500);
				a22.setVisible(true);
				l20.setText("Node 2 Initialized");
				Thread.sleep(1000);
				
				a3=new ImageIcon(this.getClass().getResource("green.jpg"));
				a33.setIcon(a3);Thread.sleep(500);
				a33.setVisible(true);
				l21.setText("Node 3 Initialized");
				Thread.sleep(1000);
				
				a4=new ImageIcon(this.getClass().getResource("green.jpg"));
				a44.setIcon(a4);Thread.sleep(500);
				a44.setVisible(true);
				l22.setText("Node 4 Initialized");
				Thread.sleep(1000);
				
				a5=new ImageIcon(this.getClass().getResource("green.jpg"));
				a55.setIcon(a5);Thread.sleep(500);
				a55.setVisible(true);
				l23.setText("Node 5 Initialized");
				Thread.sleep(1000);
				
				a1=new ImageIcon(this.getClass().getResource("green.jpg"));
				a11.setIcon(a1);Thread.sleep(500);
				a11.setVisible(true);
				l19.setText("Node 1 Initialized");
				Thread.sleep(1000);
				
				net1();
				clear();
				node1();
			}
			ResultSet rs1 = connect.createStatement().executeQuery("select * from Cluster2 order by '"+ene+"' desc");
			if(rs1.next())
			{
				a=rs1.getString(1);
				System.out.println(a);
			}
			Thread.sleep(2000);
			lab2.setVisible(false);
			Thread.sleep(2000);
			lab2.setVisible(true);
			
			if(a.equalsIgnoreCase("Node7"))
			{
				Thread.sleep(2000);
				b1=new ImageIcon(this.getClass().getResource("green.jpg"));
				b11.setIcon(b1);
				Thread.sleep(2000);
				b22.setVisible(false);
				b33.setVisible(false);
				b44.setVisible(false);
				b55.setVisible(false);
				b66.setVisible(false);
				Thread.sleep(2000);
				b22.setVisible(true);
				b33.setVisible(true);
				b44.setVisible(true);
				b55.setVisible(true);
				b66.setVisible(true);
				
				Thread.sleep(2000);

				l25.setText("Node 7 CLUSTER HEAD");
				Thread.sleep(1000);
				
				b2=new ImageIcon(this.getClass().getResource("green.jpg"));
				b22.setIcon(b2);Thread.sleep(500);
				b22.setVisible(true);
				l26.setText("Node 8 Initialized");
				Thread.sleep(1000);
				
				b3=new ImageIcon(this.getClass().getResource("green.jpg"));
				b33.setIcon(b3);Thread.sleep(500);
				b33.setVisible(true);
				l27.setText("Node 9 Initialized");
				Thread.sleep(1000);
				
				b4=new ImageIcon(this.getClass().getResource("green.jpg"));
				b44.setIcon(b4);Thread.sleep(500);
				b44.setVisible(true);
				l28.setText("Node 10 Initialized");
				Thread.sleep(1000);
				
				b5=new ImageIcon(this.getClass().getResource("green.jpg"));
				b55.setIcon(b5);Thread.sleep(500);
				b55.setVisible(true);
				l29.setText("Node 11 Initialized");
				Thread.sleep(1000);
				
				b6=new ImageIcon(this.getClass().getResource("green.jpg"));
				b66.setIcon(b6);Thread.sleep(500);
				b66.setVisible(true);
				l30.setText("Node 12 Initialized");
				Thread.sleep(1000);
				
				net2();
				clear();
				node2();
			}
			if(a.equalsIgnoreCase("Node8"))
			{
				Thread.sleep(2000);
				b2=new ImageIcon(this.getClass().getResource("green.jpg"));
				b22.setIcon(b2);
				Thread.sleep(2000);
				b11.setVisible(false);
				b33.setVisible(false);
				b44.setVisible(false);
				b55.setVisible(false);
				b66.setVisible(false);
				Thread.sleep(2000);
				b11.setVisible(true);
				b33.setVisible(true);
				b44.setVisible(true);
				b55.setVisible(true);
				b66.setVisible(true);
				
				Thread.sleep(2000);

				l26.setText("Node 8 CLUSTER HEAD");
				Thread.sleep(1000);
				
				b1=new ImageIcon(this.getClass().getResource("green.jpg"));
				b11.setIcon(b1);Thread.sleep(500);
				b11.setVisible(true);
				l25.setText("Node 7 Initialized");
				Thread.sleep(1000);
				
				b3=new ImageIcon(this.getClass().getResource("green.jpg"));
				b33.setIcon(b3);Thread.sleep(500);
				b33.setVisible(true);
				l27.setText("Node 9 Initialized");
				Thread.sleep(1000);
				
				b4=new ImageIcon(this.getClass().getResource("green.jpg"));
				b44.setIcon(b4);Thread.sleep(500);
				b44.setVisible(true);
				l28.setText("Node 10 Initialized");
				Thread.sleep(1000);
				
				b5=new ImageIcon(this.getClass().getResource("green.jpg"));
				b55.setIcon(b5);Thread.sleep(500);
				b55.setVisible(true);
				l29.setText("Node 11 Initialized");
				Thread.sleep(1000);
				
				b6=new ImageIcon(this.getClass().getResource("green.jpg"));
				b66.setIcon(b6);Thread.sleep(500);
				b66.setVisible(true);
				l30.setText("Node 12 Initialized");
				Thread.sleep(1000);
				
				net2();
				clear();
				node2();
			}
			if(a.equalsIgnoreCase("Node9"))
			{
				Thread.sleep(2000);
				b3=new ImageIcon(this.getClass().getResource("green.jpg"));
				b33.setIcon(b3);
				Thread.sleep(2000);
				b22.setVisible(false);
				b11.setVisible(false);
				b44.setVisible(false);
				b55.setVisible(false);
				b66.setVisible(false);
				Thread.sleep(2000);
				b22.setVisible(true);
				b11.setVisible(true);
				b44.setVisible(true);
				b55.setVisible(true);
				b66.setVisible(true);
				
				Thread.sleep(2000);

				l27.setText("Node 9 CLUSTER HEAD");
				Thread.sleep(1000);
				
				b2=new ImageIcon(this.getClass().getResource("green.jpg"));
				b22.setIcon(b2);Thread.sleep(500);
				b22.setVisible(true);
				l26.setText("Node 8 Initialized");
				Thread.sleep(1000);
				
				b1=new ImageIcon(this.getClass().getResource("green.jpg"));
				b11.setIcon(b1);Thread.sleep(500);
				b11.setVisible(true);
				l25.setText("Node 7 Initialized");
				Thread.sleep(1000);
				
				b4=new ImageIcon(this.getClass().getResource("green.jpg"));
				b44.setIcon(b4);Thread.sleep(500);
				b44.setVisible(true);
				l28.setText("Node 10 Initialized");
				Thread.sleep(1000);
				
				b5=new ImageIcon(this.getClass().getResource("green.jpg"));
				b55.setIcon(b5);Thread.sleep(500);
				b55.setVisible(true);
				l29.setText("Node 11 Initialized");
				Thread.sleep(1000);
				
				b6=new ImageIcon(this.getClass().getResource("green.jpg"));
				b66.setIcon(b6);Thread.sleep(500);
				b66.setVisible(true);
				l30.setText("Node 12 Initialized");
				Thread.sleep(1000);
				
				net2();
				clear();
				node2();
			}
			if(a.equalsIgnoreCase("Node10"))
			{
				Thread.sleep(2000);
				b4=new ImageIcon(this.getClass().getResource("green.jpg"));
				b44.setIcon(b4);
				Thread.sleep(2000);
				b22.setVisible(false);
				b33.setVisible(false);
				b11.setVisible(false);
				b55.setVisible(false);
				b66.setVisible(false);
				Thread.sleep(2000);
				b22.setVisible(true);
				b33.setVisible(true);
				b11.setVisible(true);
				b55.setVisible(true);
				b66.setVisible(true);
				
				Thread.sleep(2000);

				l28.setText("Node 10 CLUSTER HEAD");
				Thread.sleep(1000);
				
				b2=new ImageIcon(this.getClass().getResource("green.jpg"));
				b22.setIcon(b2);Thread.sleep(500);
				b22.setVisible(true);
				l26.setText("Node 8 Initialized");
				Thread.sleep(1000);
				
				b3=new ImageIcon(this.getClass().getResource("green.jpg"));
				b33.setIcon(b3);Thread.sleep(500);
				b33.setVisible(true);
				l27.setText("Node 9 Initialized");
				Thread.sleep(1000);
				
				b1=new ImageIcon(this.getClass().getResource("green.jpg"));
				b11.setIcon(b1);Thread.sleep(500);
				b11.setVisible(true);
				l25.setText("Node 7 Initialized");
				Thread.sleep(1000);
				
				b5=new ImageIcon(this.getClass().getResource("green.jpg"));
				b55.setIcon(b5);Thread.sleep(500);
				b55.setVisible(true);
				l29.setText("Node 11 Initialized");
				Thread.sleep(1000);
				
				b6=new ImageIcon(this.getClass().getResource("green.jpg"));
				b66.setIcon(b6);Thread.sleep(500);
				b66.setVisible(true);
				l30.setText("Node 12 Initialized");
				Thread.sleep(1000);
				
				net2();
				clear();
				node2();
			}
			if(a.equalsIgnoreCase("Node11"))
			{
				Thread.sleep(2000);
				b5=new ImageIcon(this.getClass().getResource("green.jpg"));
				b55.setIcon(b5);
				Thread.sleep(2000);
				b22.setVisible(false);
				b33.setVisible(false);
				b44.setVisible(false);
				b11.setVisible(false);
				b66.setVisible(false);
				Thread.sleep(2000);
				b22.setVisible(true);
				b33.setVisible(true);
				b44.setVisible(true);
				b11.setVisible(true);
				b66.setVisible(true);
				
				Thread.sleep(2000);

				l29.setText("Node 11 CLUSTER HEAD");
				Thread.sleep(1000);
				
				b2=new ImageIcon(this.getClass().getResource("green.jpg"));
				b22.setIcon(b2);Thread.sleep(500);
				b22.setVisible(true);
				l26.setText("Node 8 Initialized");
				Thread.sleep(1000);
				
				b3=new ImageIcon(this.getClass().getResource("green.jpg"));
				b33.setIcon(b3);Thread.sleep(500);
				b33.setVisible(true);
				l27.setText("Node 9 Initialized");
				Thread.sleep(1000);
				
				b4=new ImageIcon(this.getClass().getResource("green.jpg"));
				b44.setIcon(b4);Thread.sleep(500);
				b44.setVisible(true);
				l28.setText("Node 10 Initialized");
				Thread.sleep(1000);
				
				b1=new ImageIcon(this.getClass().getResource("green.jpg"));
				b11.setIcon(b1);Thread.sleep(500);
				b11.setVisible(true);
				l25.setText("Node 7 Initialized");
				Thread.sleep(1000);
				
				b6=new ImageIcon(this.getClass().getResource("green.jpg"));
				b66.setIcon(b6);Thread.sleep(500);
				b66.setVisible(true);
				l30.setText("Node 12 Initialized");
				Thread.sleep(1000);
				
				net2();
				clear();
				node2();
			}
			if(a.equalsIgnoreCase("Node12"))
			{
				Thread.sleep(2000);
				b6=new ImageIcon(this.getClass().getResource("green.jpg"));
				b66.setIcon(b6);
				Thread.sleep(2000);
				b22.setVisible(false);
				b33.setVisible(false);
				b44.setVisible(false);
				b55.setVisible(false);
				b11.setVisible(false);
				Thread.sleep(2000);
				b22.setVisible(true);
				b33.setVisible(true);
				b44.setVisible(true);
				b55.setVisible(true);
				b11.setVisible(true);
				
				Thread.sleep(2000);

				l30.setText("Node 12 CLUSTER HEAD");
				Thread.sleep(1000);
				
				b2=new ImageIcon(this.getClass().getResource("green.jpg"));
				b22.setIcon(b2);Thread.sleep(500);
				b22.setVisible(true);
				l26.setText("Node 8 Initialized");
				Thread.sleep(1000);
				
				b3=new ImageIcon(this.getClass().getResource("green.jpg"));
				b33.setIcon(b3);Thread.sleep(500);
				b33.setVisible(true);
				l27.setText("Node 9 Initialized");
				Thread.sleep(1000);
				
				b4=new ImageIcon(this.getClass().getResource("green.jpg"));
				b44.setIcon(b4);Thread.sleep(500);
				b44.setVisible(true);
				l28.setText("Node 10 Initialized");
				Thread.sleep(1000);
				
				b5=new ImageIcon(this.getClass().getResource("green.jpg"));
				b55.setIcon(b5);Thread.sleep(500);
				b55.setVisible(true);
				l29.setText("Node 11 Initialized");
				Thread.sleep(1000);
				
				b1=new ImageIcon(this.getClass().getResource("green.jpg"));
				b11.setIcon(b1);Thread.sleep(500);
				b11.setVisible(true);
				l25.setText("Node 7 Initialized");
				Thread.sleep(1000);
				
				net2();
				clear();
				node2();
			}
			
			ResultSet rs11 = connect.createStatement().executeQuery("select * from Cluster3 order by '"+ene+"' desc");
			if(rs11.next())
			{
				a=rs11.getString(1);
				System.out.println(a);
			}
			Thread.sleep(2000);
			lab3.setVisible(false);
			Thread.sleep(2000);
			lab3.setVisible(true);
			
			if(a.equalsIgnoreCase("Node13"))
			{
				Thread.sleep(2000);
				c1=new ImageIcon(this.getClass().getResource("green.jpg"));
				c11.setIcon(c1);
				Thread.sleep(2000);
				c22.setVisible(false);
				c33.setVisible(false);
				c44.setVisible(false);
				c55.setVisible(false);
				c66.setVisible(false);
				Thread.sleep(2000);
				c22.setVisible(true);
				c33.setVisible(true);
				c44.setVisible(true);
				c55.setVisible(true);
				c66.setVisible(true);
				
				Thread.sleep(2000);

				l31.setText("Node 13 CLUSTER HEAD");
				Thread.sleep(1000);
				
				c2=new ImageIcon(this.getClass().getResource("green.jpg"));
				c22.setIcon(c2);Thread.sleep(500);
				c22.setVisible(true);
				l32.setText("Node 14 Initialized");
				Thread.sleep(1000);
				
				c3=new ImageIcon(this.getClass().getResource("green.jpg"));
				c33.setIcon(c3);Thread.sleep(500);
				c33.setVisible(true);
				l33.setText("Node 15 Initialized");
				Thread.sleep(1000);
				
				c4=new ImageIcon(this.getClass().getResource("green.jpg"));
				c44.setIcon(c4);Thread.sleep(500);
				c44.setVisible(true);
				l34.setText("Node 16 Initialized");
				Thread.sleep(1000);
				
				c5=new ImageIcon(this.getClass().getResource("green.jpg"));
				c55.setIcon(c5);Thread.sleep(500);
				c55.setVisible(true);
				l35.setText("Node 17 Initialized");
				Thread.sleep(1000);
				
				c6=new ImageIcon(this.getClass().getResource("green.jpg"));
				c66.setIcon(c6);Thread.sleep(500);
				c66.setVisible(true);
				l36.setText("Node 18 Initialized");
				Thread.sleep(1000);
				
				net3();
				clear();
				node3();
			}
			if(a.equalsIgnoreCase("Node14"))
			{
				Thread.sleep(2000);
				c2=new ImageIcon(this.getClass().getResource("green.jpg"));
				c22.setIcon(c2);
				Thread.sleep(2000);
				c11.setVisible(false);
				c33.setVisible(false);
				c44.setVisible(false);
				c55.setVisible(false);
				c66.setVisible(false);
				Thread.sleep(2000);
				c11.setVisible(true);
				c33.setVisible(true);
				c44.setVisible(true);
				c55.setVisible(true);
				c66.setVisible(true);
				
				Thread.sleep(2000);

				l32.setText("Node 14 CLUSTER HEAD");
				Thread.sleep(1000);
				
				c1=new ImageIcon(this.getClass().getResource("green.jpg"));
				c11.setIcon(c1);Thread.sleep(500);
				c11.setVisible(true);
				l31.setText("Node 13 Initialized");
				Thread.sleep(1000);
				
				c3=new ImageIcon(this.getClass().getResource("green.jpg"));
				c33.setIcon(c3);Thread.sleep(500);
				c33.setVisible(true);
				l33.setText("Node 15 Initialized");
				Thread.sleep(1000);
				
				c4=new ImageIcon(this.getClass().getResource("green.jpg"));
				c44.setIcon(c4);Thread.sleep(500);
				c44.setVisible(true);
				l34.setText("Node 16 Initialized");
				Thread.sleep(1000);
				
				c5=new ImageIcon(this.getClass().getResource("green.jpg"));
				c55.setIcon(c5);Thread.sleep(500);
				c55.setVisible(true);
				l35.setText("Node 17 Initialized");
				Thread.sleep(1000);
				
				c6=new ImageIcon(this.getClass().getResource("green.jpg"));
				c66.setIcon(c6);Thread.sleep(500);
				c66.setVisible(true);
				l36.setText("Node 18 Initialized");
				Thread.sleep(1000);
				
				net3();
				clear();
				node3();
			}
			if(a.equalsIgnoreCase("Node15"))
			{
				Thread.sleep(2000);
				c3=new ImageIcon(this.getClass().getResource("green.jpg"));
				c33.setIcon(c3);
				Thread.sleep(2000);
				c22.setVisible(false);
				c11.setVisible(false);
				c44.setVisible(false);
				c55.setVisible(false);
				c66.setVisible(false);
				Thread.sleep(2000);
				c22.setVisible(true);
				c11.setVisible(true);
				c44.setVisible(true);
				c55.setVisible(true);
				c66.setVisible(true);
				
				Thread.sleep(2000);
				
				l33.setText("Node 15 CLUSTER HEAD");
				Thread.sleep(1000);
				
				c2=new ImageIcon(this.getClass().getResource("green.jpg"));
				c22.setIcon(c2);Thread.sleep(500);
				c22.setVisible(true);
				l32.setText("Node 14 Initialized");
				Thread.sleep(1000);
				
				c1=new ImageIcon(this.getClass().getResource("green.jpg"));
				c11.setIcon(c1);Thread.sleep(500);
				c11.setVisible(true);
				l31.setText("Node 13 Initialized");
				Thread.sleep(1000);
				
				c4=new ImageIcon(this.getClass().getResource("green.jpg"));
				c44.setIcon(c4);Thread.sleep(500);
				c44.setVisible(true);
				l34.setText("Node 16 Initialized");
				Thread.sleep(1000);
				
				c5=new ImageIcon(this.getClass().getResource("green.jpg"));
				c55.setIcon(c5);Thread.sleep(500);
				c55.setVisible(true);
				l35.setText("Node 17 Initialized");
				Thread.sleep(1000);
				
				c6=new ImageIcon(this.getClass().getResource("green.jpg"));
				c66.setIcon(c6);Thread.sleep(500);
				c66.setVisible(true);
				l36.setText("Node 18 Initialized");
				Thread.sleep(1000);
				
				net3();
				clear();
				node3();
			}
			if(a.equalsIgnoreCase("Node16"))
			{
				Thread.sleep(2000);
				c4=new ImageIcon(this.getClass().getResource("green.jpg"));
				c44.setIcon(c4);
				Thread.sleep(2000);
				c22.setVisible(false);
				c33.setVisible(false);
				c11.setVisible(false);
				c55.setVisible(false);
				c66.setVisible(false);
				Thread.sleep(2000);
				c22.setVisible(true);
				c33.setVisible(true);
				c11.setVisible(true);
				c55.setVisible(true);
				c66.setVisible(true);
				
				Thread.sleep(2000);
				
				l34.setText("Node 16 CLUSTER HEAD");
				Thread.sleep(1000);
				
				c2=new ImageIcon(this.getClass().getResource("green.jpg"));
				c22.setIcon(c2);Thread.sleep(500);
				c22.setVisible(true);
				l32.setText("Node 14 Initialized");
				Thread.sleep(1000);
				
				c3=new ImageIcon(this.getClass().getResource("green.jpg"));
				c33.setIcon(c3);Thread.sleep(500);
				c33.setVisible(true);
				l33.setText("Node 15 Initialized");
				Thread.sleep(1000);
				
				c1=new ImageIcon(this.getClass().getResource("green.jpg"));
				c11.setIcon(c1);Thread.sleep(500);
				c11.setVisible(true);
				l31.setText("Node 13 Initialized");
				Thread.sleep(1000);
				
				c5=new ImageIcon(this.getClass().getResource("green.jpg"));
				c55.setIcon(c5);Thread.sleep(500);
				c55.setVisible(true);
				l35.setText("Node 17 Initialized");
				Thread.sleep(1000);
				
				c6=new ImageIcon(this.getClass().getResource("green.jpg"));
				c66.setIcon(c6);Thread.sleep(500);
				c66.setVisible(true);
				l36.setText("Node 18 Initialized");
				Thread.sleep(1000);
				
				net3();
				clear();
				node3();
			}
			if(a.equalsIgnoreCase("Node17"))
			{
				Thread.sleep(2000);
				c5=new ImageIcon(this.getClass().getResource("green.jpg"));
				c55.setIcon(c5);
				Thread.sleep(2000);
				c22.setVisible(false);
				c33.setVisible(false);
				c44.setVisible(false);
				c11.setVisible(false);
				c66.setVisible(false);
				Thread.sleep(2000);
				c22.setVisible(true);
				c33.setVisible(true);
				c44.setVisible(true);
				c11.setVisible(true);
				c66.setVisible(true);
				
				Thread.sleep(2000);

				l35.setText("Node 17 CLUSTER HEAD");
				Thread.sleep(1000);
				
				c2=new ImageIcon(this.getClass().getResource("green.jpg"));
				c22.setIcon(c2);Thread.sleep(500);
				c22.setVisible(true);
				l32.setText("Node 14 Initialized");
				Thread.sleep(1000);
				
				c3=new ImageIcon(this.getClass().getResource("green.jpg"));
				c33.setIcon(c3);Thread.sleep(500);
				c33.setVisible(true);
				l33.setText("Node 15 Initialized");
				Thread.sleep(1000);
				
				c4=new ImageIcon(this.getClass().getResource("green.jpg"));
				c44.setIcon(c4);Thread.sleep(500);
				c44.setVisible(true);
				l34.setText("Node 16 Initialized");
				Thread.sleep(1000);
				
				c1=new ImageIcon(this.getClass().getResource("green.jpg"));
				c11.setIcon(c1);Thread.sleep(500);
				c11.setVisible(true);
				l31.setText("Node 13 Initialized");
				Thread.sleep(1000);
				
				c6=new ImageIcon(this.getClass().getResource("green.jpg"));
				c66.setIcon(c6);Thread.sleep(500);
				c66.setVisible(true);
				l36.setText("Node 18 Initialized");
				Thread.sleep(1000);
				
				net3();
				clear();
				node3();
			}
			if(a.equalsIgnoreCase("Node18"))
			{
				Thread.sleep(2000);
				c6=new ImageIcon(this.getClass().getResource("green.jpg"));
				c66.setIcon(c6);
				Thread.sleep(2000);
				c22.setVisible(false);
				c33.setVisible(false);
				c44.setVisible(false);
				c55.setVisible(false);
				c11.setVisible(false);
				Thread.sleep(2000);
				c22.setVisible(true);
				c33.setVisible(true);
				c44.setVisible(true);
				c55.setVisible(true);
				c11.setVisible(true);
				
				Thread.sleep(2000);

				l36.setText("Node 18 CLUSTER HEAD");
				Thread.sleep(1000);
				
				c2=new ImageIcon(this.getClass().getResource("green.jpg"));
				c22.setIcon(c2);Thread.sleep(500);
				c22.setVisible(true);
				l32.setText("Node 14 Initialized");
				Thread.sleep(1000);
				
				c3=new ImageIcon(this.getClass().getResource("green.jpg"));
				c33.setIcon(c3);Thread.sleep(500);
				c33.setVisible(true);
				l33.setText("Node 15 Initialized");
				Thread.sleep(1000);
				
				c4=new ImageIcon(this.getClass().getResource("green.jpg"));
				c44.setIcon(c4);Thread.sleep(500);
				c44.setVisible(true);
				l34.setText("Node 16 Initialized");
				Thread.sleep(1000);
				
				c5=new ImageIcon(this.getClass().getResource("green.jpg"));
				c55.setIcon(c5);Thread.sleep(500);
				c55.setVisible(true);
				l35.setText("Node 17 Initialized");
				Thread.sleep(1000);
				
				c1=new ImageIcon(this.getClass().getResource("green.jpg"));
				c11.setIcon(c1);Thread.sleep(500);
				c11.setVisible(true);
				l31.setText("Node 13 Initialized");
				Thread.sleep(1000);
				
				net3();
				clear();
				node3();
			}
		}

		   void net1() throws InterruptedException {
			
//			   Thread.sleep(2000);
//			   l19.setText("");
//			   l19.setVisible(false);
//			   l20.setText("");
//			   l20.setVisible(false);
//			   l21.setText("");
//			   l21.setVisible(false);
//			   l22.setText("");
//			   l22.setVisible(false);
//			   l23.setText("");
//			   l23.setVisible(false);
//			   l24.setText("");
//			   l24.setVisible(false);
			
			   Thread.sleep(2000);
			   l19.setText("");
			   l20.setText("");
			   l21.setText("");
			   l22.setText("");
			   l23.setText("");
			   l24.setText("");
			   
		}
		   
		   void net2() throws InterruptedException {
				
//			   Thread.sleep(2000);
//			   l25.setText("");
//			   l25.setVisible(false);
//			   l26.setText("");
//			   l26.setVisible(false);
//			   l27.setText("");
//			   l27.setVisible(false);
//			   l28.setText("");
//			   l28.setVisible(false);
//			   l29.setText("");
//			   l29.setVisible(false);
//			   l30.setText("");
//			   l30.setVisible(false);
			   
			   Thread.sleep(2000);
			   l25.setText("");
			   l26.setText("");
			   l27.setText("");
			   l28.setText("");
			   l29.setText("");
			   l30.setText("");
			   
			
		}
		   void net3() throws InterruptedException {
				
//			   Thread.sleep(2000);
//			   l31.setText("");
//			   l31.setVisible(false);
//			   l32.setText("");
//			   l32.setVisible(false);
//			   l33.setText("");
//			   l33.setVisible(false);
//			   l34.setText("");
//			   l34.setVisible(false);
//			   l35.setText("");
//			   l35.setVisible(false);
//			   l36.setText("");
//			   l36.setVisible(false);
			   
			   Thread.sleep(2000);
			   l31.setText("");
			   l32.setText("");
			   l33.setText("");
			   l34.setText("");
			   l35.setText("");
			   l36.setText("");
			  
				
			
		}
		
		   void settrue()
		   {
			   l1.setVisible(true);
				l2.setVisible(true);
				l3.setVisible(true);
				l4.setVisible(true);
				l5.setVisible(true);
				l6.setVisible(true);
				l7.setVisible(true);
				l8.setVisible(true);
				l9.setVisible(true);
				l10.setVisible(true);
				l11.setVisible(true);
				l12.setVisible(true);
				l13.setVisible(true);
				l14.setVisible(true);
				l15.setVisible(true);
				l16.setVisible(true);
				l17.setVisible(true);
				l18.setVisible(true);
		   }
		void node3() throws SQLException {
			
			   String att="No";
				
				connect.createStatement().executeUpdate("update Cluster3 set fname='"+fname+"',mac='"+mac+"',attacked='"+att+"' where node='"+node13+"'");
				connect.createStatement().executeUpdate("update Cluster3 set fname='"+fname+"',mac='"+mac+"',attacked='"+att+"' where node='"+node14+"'");
				connect.createStatement().executeUpdate("update Cluster3 set fname='"+fname+"',mac='"+mac+"',attacked='"+att+"' where node='"+node15+"'");
				connect.createStatement().executeUpdate("update Cluster3 set fname='"+fname+"',mac='"+mac+"',attacked='"+att+"' where node='"+node16+"'");
				connect.createStatement().executeUpdate("update Cluster3 set fname='"+fname+"',mac='"+mac+"',attacked='"+att+"' where node='"+node17+"'");
				connect.createStatement().executeUpdate("update Cluster3 set fname='"+fname+"',mac='"+mac+"',attacked='"+att+"' where node='"+node18+"'");
				
			
		}

		void node2() throws SQLException {
			
			  String att="No";
				
				connect.createStatement().executeUpdate("update Cluster2 set fname='"+fname+"',mac='"+mac+"',attacked='"+att+"' where node='"+node7+"'");
				connect.createStatement().executeUpdate("update Cluster2 set fname='"+fname+"',mac='"+mac+"',attacked='"+att+"' where node='"+node8+"'");
				connect.createStatement().executeUpdate("update Cluster2 set fname='"+fname+"',mac='"+mac+"',attacked='"+att+"' where node='"+node9+"'");
				connect.createStatement().executeUpdate("update Cluster2 set fname='"+fname+"',mac='"+mac+"',attacked='"+att+"' where node='"+node10+"'");
				connect.createStatement().executeUpdate("update Cluster2 set fname='"+fname+"',mac='"+mac+"',attacked='"+att+"' where node='"+node11+"'");
				connect.createStatement().executeUpdate("update Cluster2 set fname='"+fname+"',mac='"+mac+"',attacked='"+att+"' where node='"+node12+"'");
				
			
		}

		void node1() throws SQLException {

			 String att="No";
				connect.createStatement().executeUpdate("update Cluster1 set fname='"+fname+"',mac='"+mac+"',attacked='"+att+"' where node='"+node1+"'");
				connect.createStatement().executeUpdate("update Cluster1 set fname='"+fname+"',mac='"+mac+"',attacked='"+att+"' where node='"+node2+"'");
				connect.createStatement().executeUpdate("update Cluster1 set fname='"+fname+"',mac='"+mac+"',attacked='"+att+"' where node='"+node3+"'");
				connect.createStatement().executeUpdate("update Cluster1 set fname='"+fname+"',mac='"+mac+"',attacked='"+att+"' where node='"+node4+"'");
				connect.createStatement().executeUpdate("update Cluster1 set fname='"+fname+"',mac='"+mac+"',attacked='"+att+"' where node='"+node5+"'");
				connect.createStatement().executeUpdate("update Cluster1 set fname='"+fname+"',mac='"+mac+"',attacked='"+att+"' where node='"+node6+"'");
			
		}
	
		
	}
		
	
	public static void main(String[] args) throws SQLException {
		new Cloud_Network();
		
		
	}


	
}
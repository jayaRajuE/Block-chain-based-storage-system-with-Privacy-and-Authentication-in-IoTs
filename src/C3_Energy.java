
 
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;
import java.sql.*;
 
public class C3_Energy {
    public static void main(String[] args) {
        
    

 int count=0;
 int count1=0;
 
  double c1=0.0;
  double c2=0.0;
  double c3=0.0;
  double c4=0.0;
  double c5=0.0;
  double c6=0.0;
  double c7=0.0;
  double c8=0.0;
  
  
  try {
		Class.forName("com.mysql.jdbc.Driver");
	
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/proj20","root","root");System.out.println("Connected");
		Statement st = con.createStatement();

		ResultSet rs = st.executeQuery("select * from cluster3");

		while (rs.next() == true) {

			count++;

			if (count == 1) {
				c1 = Double.valueOf(rs.getInt("energy"));
			}

			if (count == 2) {
				c2 = Double.valueOf(rs.getInt("energy"));
			}
			if (count == 3) {
				c3 = Double.valueOf(rs.getInt("energy"));
			}
			if (count == 4) {
				c4 = Double.valueOf(rs.getInt("energy"));
			}
			if (count == 5) {
				c5 = Double.valueOf(rs.getInt("energy"));
			}
			if (count == 6) {
				c6 = Double.valueOf(rs.getInt("energy"));
			}
			

		}

		DefaultCategoryDataset dataSet = new DefaultCategoryDataset();
		dataSet.setValue(c1, "Node1", "N1");
		dataSet.setValue(c2, "Node2", "N2");
		dataSet.setValue(c3, "Node3", "N3");
		dataSet.setValue(c4, "Node4", "N4");
		dataSet.setValue(c5, "Node5", "N5");
		dataSet.setValue(c6, "Node6", "N6");
		

		JFreeChart chart = ChartFactory
				.createBarChart(
						"Blockchain based Data Storage with Privacy and Authentication in Internet of Things --- Cluster1",
						"Node Category--Cluster3", "Energy", dataSet,
						PlotOrientation.VERTICAL, true, true, true);

		ChartFrame chartFrame = new ChartFrame(
				"Cluster3 Different Transaction Energy Details", chart);
		chartFrame.setVisible(true);

		chartFrame.setSize(800, 500);

	} catch (Exception ex) {
		System.out.println(ex);

	}

    
}
}

 
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;
import java.sql.*;
 
public class Results {
    public static void main(String[] args) {
        //TODO: Add code to generate PDFs with charts
    
 int querycount=0;
 int querycount1=0;
 int querycount2=0;
 int querycount3=0;
 int querycount4=0;
 int querycount5=0;
 int querycount6=0;
 int querycount7=0;
 int querycount8=0;
 int querycount9=0;
 int querycount10=0;
 int querycount11=0;
 int count=0;
 

    	try
    	{
    		Class.forName("com.mysql.jdbc.Driver");	
   		 Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/wsearch","root","test");
   		Statement st=con.createStatement();
   		
   		ResultSet rs=st.executeQuery("select * from search1");
   		
    		
    		while(rs.next()==true)
    		{
    			   			
    				count++;
    			
    				if(count==1)
    				{
    					querycount=Integer.parseInt(rs.getString("gdp"));
    					querycount1=Integer.parseInt(rs.getString("gil"));
    				}
    				if(count==2)
    				{
    					querycount2=Integer.parseInt(rs.getString("gdp"));
    					querycount3=Integer.parseInt(rs.getString("gil"));
    				}
    				if(count==3)
    				{
    					querycount4=Integer.parseInt(rs.getString("gdp"));
    					querycount5=Integer.parseInt(rs.getString("gil"));
    				}
    				
    				if(count==4)
    				{
    					querycount6=Integer.parseInt(rs.getString("gdp"));
    					querycount7=Integer.parseInt(rs.getString("gil"));
    				}
    				
    				if(count==5)
    				{
    					querycount8=Integer.parseInt(rs.getString("gdp"));
    					querycount9=Integer.parseInt(rs.getString("gil"));
    				}
    				if(count==6)
    				{
    					querycount10=Integer.parseInt(rs.getString("gdp"));
    					querycount11=Integer.parseInt(rs.getString("gil"));
    				}
    				
    				if(count==7)
    				{
    					
    					  Connection con1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/wsearch","root","test");
    				   		Statement st1=con1.createStatement();
    		
    				   		st1.executeUpdate("delete  from search1");
    				}
    				
    				
    		}
    		
    			DefaultCategoryDataset dataSet = new DefaultCategoryDataset();
    	        dataSet.setValue(querycount, "B1", "GDP");
    	        dataSet.setValue(querycount1, "D1", "GIL");
    	        dataSet.setValue(querycount2, "B2", "GDP");
    	        dataSet.setValue(querycount3, "D2", "GIL");
    	        dataSet.setValue(querycount4, "B3", "GDP");
    	        dataSet.setValue(querycount5, "D3", "GIL");
    	        dataSet.setValue(querycount6, "B4", "GDP");
    	        dataSet.setValue(querycount7, "D4", "GIL");
    	        dataSet.setValue(querycount8, "B5", "GDP");
    	        dataSet.setValue(querycount9, "D5", "GIL");    	        
    	        
    	       
    	      
    	        
    	        
    	        JFreeChart chart = ChartFactory.createBarChart(
    	                "Supporting Privacy Protection in Personalized Web Search", "Query Limit", "Time Delay (in MS)",
    	                dataSet, PlotOrientation.HORIZONTAL, true, true, true);
    	 
    	      
    	        ChartFrame chartFrame=new ChartFrame("Time Delay Generation Results",chart);
    	        chartFrame.setVisible(true);
    	     
    	        chartFrame.setSize(800,500);
    	        
        
    	}
    	catch(Exception ex)
    	{
    	System.out.println(ex);	
    		
    	}
    
}
}
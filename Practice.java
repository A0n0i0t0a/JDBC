import java.sql.*;
public class Practice
{
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		try
		{
			Class.forName("com.mysql.jdbc.Driver");//method for class name..........
			//creating Connection....................
			Connection con=DriverManager.getConnection("jdbc:mysql://,localhost:3307/classicmodels","root","root");
			
			//statement creation.....................
			Statement stmt=con.createStatement();
			
			//result set                                                                                        
			ResultSet rs=stmt.executeQuery("select * from customers where city ='NYC' ");//forward result set
			while(rs.next())
			System.out.println(rs.getInt(1)+  " " +rs.getString(2)+  " "+rs.getString(3));
			con.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}



	}


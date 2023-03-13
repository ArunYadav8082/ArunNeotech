package jdbc;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.sql.*;

import javax.xml.stream.util.StreamReaderDelegate;

public class FirstJdbc {

	public static void main(String[] args)
	{
		try
		{   
			// load the driver
			Class.forName("com.mysql.jdbc.Driver");
		//	Class.forName("com.mysql.cj.jdbc.Driver");  
			// creating a connection
			String url = "jdbc:mysql://127.0.0.1:3306/arun";
			String user = "root";
			String password = "root";
			Connection conn = DriverManager.getConnection(url, user, password);
		
			
			if(conn.isClosed())
			{
				System.out.println("connection is closed already");
			}
			else 
			{
				System.out.println("connection is opened !!!");
				
			}
			// create query
	/*		String q = "create table Employee(e_id int (20) primary key auto_increment ,"
					+ "e_name varchar(100) not null ,e_city varchar(200) not null ,e_country varchar(300))";
			
			// create statement
			Statement stmt = conn.createStatement();
			
			stmt.executeUpdate(q);
			
			System.out.println("table created in database");*/
			
			// create query also know as dynamic query
			String q = "insert into Employee(e_name,e_city,e_country) values (?,?,?)";
			
			// get the PreaparedStatement object
			PreparedStatement pstmt = conn.prepareStatement(q);
			
			// set the value
		//	pstmt.setInt(0, 100);
			pstmt.setString(1, "Bhupesh Yadav");
			pstmt.setString(2, "Lucknow");
			pstmt.setString(3, "India");
			
			int result = pstmt.executeUpdate();
			
			System.out.println("Data Inseted Succesess :"+result);
			
		/*	BufferedReader br = new BufferedReader(new InputStreamReader(System.in)  );
			System.out.println("Enter your name");
			String name = br.readLine();
			
			System.out.println("Enter your city");
			String city = br.readLine();
			
			System.out.println("Enter your countey");
			String country = br.readLine();
			
			pstmt.setString(1, name);
			pstmt.setString(2, city);
			pstmt.setString(3, country);
			
			int result = pstmt.executeUpdate();
			System.out.println("Data Inseted Succesess :"+result); */
			
			/*String q = "insert into images (pic) values (?)";
			PreparedStatement pstmt = conn.prepareStatement(q);
			FileInputStream fis = new FileInputStream("C:\\Users\\TN1047\\Desktop/download.jpg");
			pstmt.setBinaryStream(1,fis,fis.available() );
			int result = pstmt.executeUpdate();
			System.out.println("Done :"+result); */  
			
			// update query
		/*	String q = "update Employee set e_name=?,e_city=?,e_country=? Where e_id=? ";
			PreparedStatement pstmt = conn.prepareStatement(q);
			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in)  );
			System.out.println("Enter your name");
			String name = br.readLine();
			
			System.out.println("Enter your city");
			String city = br.readLine();
			
			System.out.println("Enter your countey");
			String country = br.readLine();
			
			System.out.println("Enter your id");
			String e_id = br.readLine();
			
			pstmt.setString(1, name);
			pstmt.setString(2, city);
			pstmt.setString(3, country);
			pstmt.setString(4, e_id);
			
			int result = pstmt.executeUpdate();
			
			System.out.println("updated :"+result);*/
			
			// select query
			/*		String q = "select * from Employee";
			Statement stmt = conn.createStatement();
			ResultSet set = stmt.executeQuery(q);
			
			while(set.next())
			{
				int id = set.getInt(1);
				String name = set.getString(2);
				String city = set.getString(3);
				String country = set.getString(4);
				
				System.out.println(id+":"+name+":"+city+":"+country);
				
			}
			*/
			
			conn.close();
			
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
			
		}
		
	}

}

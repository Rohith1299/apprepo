package com.qyrus.MovieService;

import java.sql.*;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;



public class MovieRepository 
{
	
	public List<MovieDetails> getAllDetails() throws ClassNotFoundException, SQLException
	{
		Connection con = ConnectionFactory.getConnection();
		String query = "select * from moviedetails";
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(query);
		
		List<MovieDetails> list = new ArrayList<MovieDetails>();
		while(rs.next())
		{
			
			MovieDetails md = new MovieDetails();
			
			md.setScreenNo(rs.getInt("screenno"));
			md.setMovieName(rs.getString("moviename"));
			md.setTheatreName(rs.getString("theatrename"));
			md.setPrice(rs.getInt("price"));
			
			list.add(md);
			System.out.println(md);
		}
		return list;
	}


public void insertMovieDetails(MovieDetails MovieDetails) throws ClassNotFoundException, SQLException {
    Connection con = ConnectionFactory.getConnection();
String sql = "INSERT INTO MovieDetails VALUES(?,?,?,?)";



   PreparedStatement preparedStmt = con.prepareStatement(sql);



   preparedStmt.setLong(1, MovieDetails.getScreenNo());
    preparedStmt.setNString(2, MovieDetails.getMovieName());
    preparedStmt.setNString(3, MovieDetails.getTheatreName());
    preparedStmt.setLong(4, MovieDetails.getPrice());



   preparedStmt.executeUpdate();



}

public void updateMovieDetails(MovieDetails MovieDetails) throws Exception{
Connection con = ConnectionFactory.getConnection();
java.sql.PreparedStatement preparedStmt = con.prepareStatement("update MovieDetails set movieName = ? where screenNo =? ");
preparedStmt.setString(1, MovieDetails.getMovieName());
//preparedStmt.setInt(2,MovieDetails.theatreName());
preparedStmt.setInt(2, MovieDetails.getScreenNo());
int count = preparedStmt.executeUpdate();
System.out.print("updated count:"+count);
}



public void deleteMovieDetails(int screenNo) throws Exception {
    Connection con = ConnectionFactory.getConnection();
    java.sql.PreparedStatement ps =con.prepareStatement("delete from MovieDetails where screenNo = ? "); // String
   // queryUpdate = "delete from MovieDetails where screenNo = " + screenNo;
    // PreparedStatement ps  =con.prepareStatement(queryUpdate);
    ps.setInt(1, screenNo);
    int count=ps.executeUpdate();
    System.out.print("updated count:" +count);
    }          
}
	

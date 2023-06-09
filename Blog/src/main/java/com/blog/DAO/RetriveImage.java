package com.blog.DAO;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Base64;

import com.blog.entity.User;

import antlr.collections.List;
import jakarta.servlet.ServletOutputStream;
import utility.Dbutil;

public class RetriveImage {
	public byte[] getImageDataForUser(int userId, int Blogid) {
		  byte[] imageData=null;
		  Connection connection = null;
		  PreparedStatement statement = null;
		  ResultSet resultSet = null;

		  byte[] encodedImage=null;
		  try {
		    // Connect to the database
		    connection = Dbutil.getConnection();
		    		
		    // Prepare the SQL statement
		    statement = connection.prepareStatement("SELECT image_url FROM blog WHERE uid = ? and blog_id=?");
		    statement.setInt(1, userId);
		    statement.setInt(2, Blogid);

		    // Execute the query
		    resultSet = statement.executeQuery();

		    // Process the results
		   if(resultSet.next()) {
		     imageData = resultSet.getBytes("image_url");
		    }
		   encodedImage = Base64.getEncoder().encode(imageData);
		    
		  } catch (SQLException e) {
		    // Handle the exception
		  } finally {
		    // Close the database resources
		    try { resultSet.close(); } catch (Exception e) {}
		    try { statement.close(); } catch (Exception e) {}
		    try { connection.close(); } catch (Exception e) {}
		  }

		return encodedImage;
		}

}
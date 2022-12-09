package com.busticket.servlet;


import java.sql.Connection;
import java.sql.Statement;

public class MakeReservationUtil {
	
	private static Connection con = null;
	private static Statement stmt = null;
	
   public static boolean insertreservation(String Name, Integer mobile_no, String Destination, Integer seat_no,
			Integer no_of_passenger) {
    	
    	boolean isSuccess = false;
    	
    	try {
	    		con = DBConnect.getDBConnection();
				stmt = con.createStatement();
	    	    String sql = "insert into category values (0,'"+Name+"','"+mobile_no+"','"+Destination+"','"+seat_no+"',"
	    	    		+ "'"+mobile_no+"','"+no_of_passenger+"')";
	    	    int rs = stmt.executeUpdate(sql);
    		
	    		if(rs > 0) {
	    			isSuccess = true;
	    		} else {
	    			isSuccess = false;
    		}
    		
    	}
    	catch (Exception e) {
    		e.printStackTrace();
    	}
 	
    	return isSuccess;
    }
}
   
   
package com.corona.prevention.kit.admin.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.corona.prevention.kit.admin.model.AdminModel;



public class AdminDao {

	// delegate/outsource the details to web.xml as context-parameters
	private String driverName;
	private String url;
	private String username;
	private String password;
	
	private Connection connection;
	
	public AdminDao(String driverName, String url, String username, String password) {
		this.driverName = driverName;
		this.url = url;
		this.username = username;
		this.password = password;
	}

	private void connect() throws ClassNotFoundException, SQLException {
		if(this.connection == null || this.connection.isClosed()) {
			Class.forName(driverName);
			this.connection = DriverManager.getConnection(this.url, this.username, this.password);
		}
	}
	
	private void disConnect() throws SQLException {
		if(this.connection!=null && !this.connection.isClosed())
			this.connection.close();
	}

	public List<AdminModel> getProductsListRecords() throws ClassNotFoundException, SQLException {
		String sql = "select * from productslist";
		this.connect();
		
		Statement stmt = this.connection.createStatement();
		ResultSet rs = stmt.executeQuery(sql);
		
		// map it to model
		List<AdminModel> objadminmodel = new ArrayList<AdminModel>();
		while(rs.next()) {
			AdminModel objadminmodel2 = new AdminModel(rs.getInt("id"), rs.getString("pname"), rs.getInt("pcost"), rs.getString("pdesc"));
			objadminmodel.add(objadminmodel2);		
		}
		
		rs.close();
		stmt.close();
		this.disConnect();
		
		return objadminmodel;
	}

	public boolean addNewProduct(String name, String cost, String desc) throws ClassNotFoundException, SQLException {
	String sql="insert into productslist (pname,pcost,pdesc) values (?,?,?)";
	this.connect();
	PreparedStatement pstmt=this.connection.prepareStatement(sql);
	pstmt.setString(1, name);
	pstmt.setInt(2, Integer.parseInt(cost));
	pstmt.setString(3, desc);
	
	boolean added=pstmt.executeUpdate()>0;
	pstmt.close();
	this.disConnect();
	
	return added;
	
	
		
	}

	public boolean deleteProduct(String id) throws NumberFormatException, SQLException, ClassNotFoundException {
		
		String sql="delete from productslist where id=?";
		this.connect();
		PreparedStatement pstmt=this.connection.prepareStatement(sql);
		
		pstmt.setInt(1, Integer.parseInt(id));
		
		boolean deleted=pstmt.executeUpdate()>0;
		pstmt.close();
		this.disConnect();
		
		return deleted;
				
	}

	public boolean SaveUpdateProductForm2(String id,String name, String cost, String desc) throws ClassNotFoundException, SQLException {
		System.out.println("final value of IDDDDDDDD"+id);
		String sql="update productslist set pname=?,pcost=?,pdesc=? where id=?";
		this.connect();
		PreparedStatement pstmt=this.connection.prepareStatement(sql);
		pstmt.setString(1, name);
		pstmt.setInt(2, Integer.parseInt(cost));
		pstmt.setString(3, desc);
		pstmt.setString(4, id);
		
		boolean rowupdated=pstmt.executeUpdate()>0;
		pstmt.close();
		this.disConnect();
		
		return rowupdated;
		
	}
	public boolean addNewUser(String username, String useremail, String usercontact) throws ClassNotFoundException, SQLException {
		
		
		String sql="insert into guestuser (userpname,userpemail,userpcontact) values (?,?,?)";
		this.connect();
		PreparedStatement pstmt=this.connection.prepareStatement(sql);
		pstmt.setString(1, username);
		pstmt.setString(2, useremail);
		pstmt.setInt(3, Integer.parseInt(usercontact));
				
		boolean rowupdated2=pstmt.executeUpdate()>0;
		pstmt.close();
		this.disConnect();
		return rowupdated2;
		
					
			
		}

	public void adminloginDao(String uname, String pass) {
	
		
	}

	public List<AdminModel> addNewItemToKitDao(String id) throws ClassNotFoundException, SQLException {
		String sql = "select * from productslist where id=?";
		this.connect();
		
		Statement stmt = this.connection.createStatement();
		ResultSet rs = stmt.executeQuery(sql);
		
		// map it to model
		List<AdminModel> objadminmodel3 = new ArrayList<AdminModel>();
		while(rs.next()) {
			AdminModel objadminmodel4 = new AdminModel(rs.getInt("id"), rs.getString("pname"), rs.getInt("pcost"), rs.getString("pdesc"));
			objadminmodel3.add(objadminmodel4);		
		}
		
		rs.close();
		stmt.close();
		this.disConnect();
		
		return objadminmodel3;
	}

	

	
	
	

}


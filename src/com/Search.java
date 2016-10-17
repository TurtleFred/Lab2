package com;
import java.util.*;
import java.sql.*;
import com.opensymphony.xwork2.ActionSupport;
import dao.Dao;

@SuppressWarnings("serial")
public class Search extends ActionSupport {
	private int AuthorID;
	private String Name;
	private int age;
	private String country;
	private Dao dao = new Dao();
//	private AuthorInfo author = new AuthorInfo();
	
	public int getAuthorID(){
		return AuthorID;
	}
	public void setAuthorID(int AuthorID){
		this.AuthorID = AuthorID;
	}

	public String getName(){
		return Name;
	}
	public void setName(String Name){
		this.Name = Name;
	}

	public int getage(){
		return age;
	}
	public void setage(int age){
		this.age = age;
	}

	public String getcountry(){
		return country;
	}
	public void setcountry(String country){
		this.country = country;
	}

	
	public String login() {
		System.out.println(getName()+"****");
		
		ResultSet rS = dao.executeQuery("select Name from author where Name='"+getName()+"'");
		try {
			if (rS.next()) {
//				int index = rS.getInt(1);
//				setAuthorID(index);
//				getAuthorID();
				return "loginin";
			}
			return "loginout";
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return "loginout";
		}
	}
	

}
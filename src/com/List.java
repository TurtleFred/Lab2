package com;

import java.sql.*;
import java.util.ArrayList;

//import com.opensymphony.xwork2.ActionSupport;
import dao.Dao;

public class List {
//private String ISBN;
//private String Title;
//private static int AuthorID;
//private String Publisher;
//private String Date;
//private String Price;
//private String Name;
private static Dao dao = new Dao();
//
//public String getISBN(){
//	return ISBN;
//}
//public void setISBN(String ISBN){
//	this.ISBN = ISBN;
//}
//
//public String getTitle(){
//	return Title;
//}
//public void setTitle(String Title){
//	this.Title = Title;
//}
//
//public static int getAuthorID(){
//	return AuthorID;
//}
////public void setAuthorID(int AuthorID){
////	this.AuthorID = AuthorID;
////}
//
//public String getPublisher(){
//	return Publisher;
//}
//public void setPublisher(String Publisher){
//	this.Publisher = Publisher;
//}
//
//public String getDate(){
//	return Date;
//}
//public void setDate(String Date){
//	this.Date = Date;
//}
//
//public String getPrice(){
//	return Price;
//}
//public void setPrice(String Price){
//	this.Price = Price;
//}
//
//public String getName(){
//	return Name;
//}
//public void setName(String Name){
//	this.Name = Name;
//}

public  static ArrayList<BookInfo> show_books(){
	
	ArrayList<BookInfo> list = new ArrayList<BookInfo>();
	try{
		String sql = "select * from bookr where AuthorID='" + BookInfo.getAuthorID() + "'";
		ResultSet RS = dao.executeQuery(sql);
		while(RS.next()){
			BookInfo bookinfo = new BookInfo();
			bookinfo.setISBN(RS.getString(1));
			bookinfo.setTitle(RS.getString(2));
			bookinfo.setName(RS.getString(3));
			bookinfo.setPublisher(RS.getString(4));
			bookinfo.setDate(RS.getString(5));
			bookinfo.setPrice(RS.getString(6));
			list.add(bookinfo);
		}
		
	}catch(Exception e){
		   e.printStackTrace();
}
	return list;
}


//public String show_books1() throws SQLException {
//	int num = 0;
//	String sql = "select * from book where AuthorID='" + getAuthorID() + "'";
//	ResultSet RS = dao.executeQuery(sql);
//	while(RS.next()){
//		setISBN(RS.getString(1));
//		setTitle(RS.getString(2));
//		setAuthorID(RS.getInt(3));
//		setPublisher(RS.getString(4));
//		setDate(RS.getString(5));
//		setPrice(RS.getString(6));
//		num++;
//	}
//	return "success";
//}

}

package com;

public class BookInfo {
private String ISBN;
private String Title;
private static int AuthorID;
private String Publisher;
private String Date;
private String Price;
private String Name;
//git test
public String getISBN(){
	return ISBN;
}
public void setISBN(String ISBN){
	this.ISBN = ISBN;
}

public String getTitle(){
	return Title;
}
public void setTitle(String Title){
	this.Title = Title;
}

public static int getAuthorID(){
	return AuthorID;
}
public void setAuthorID(int AuthorID){
	this.AuthorID = AuthorID;
}

public String getPublisher(){
	return Publisher;
}
public void setPublisher(String Publisher){
	this.Publisher = Publisher;
}

public String getDate(){
	return Date;
}
public void setDate(String Date){
	this.Date = Date;
}

public String getPrice(){
	return Price;
}
public void setPrice(String Price){
	this.Price = Price;
}

public String getName(){
	return Name;
}
public void setName(String Name){
	this.Name = Name;
}

}
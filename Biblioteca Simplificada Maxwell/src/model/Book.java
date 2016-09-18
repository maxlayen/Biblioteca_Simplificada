package model;

public class Book {
	private String name;
	private String author;
	private int year;
	private Session session;

	public Book(){
	}
	
	public Book(String name, String author, int year, Session session) {
		this.name = name;
		this.author = author;
		this.year = year;
		this.session = session;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public Session getSession() {
		return session;
	}

	public void setSession(Session session) {
		this.session = session;
	}

}

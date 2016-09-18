package model;

public class Session {
	private int id;
	private String name;
	private Shelf shelf;

	public Session(){
	}
	
	public Session(int id, String name, Shelf shelf) {
		this.id = id;
		this.name = name;
		this.shelf = shelf;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Shelf getShelf() {
		return shelf;
	}
	public void setShelf(Shelf shelf) {
		this.shelf = shelf;
	}
}

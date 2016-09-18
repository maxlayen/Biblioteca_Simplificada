package model;

public class Client extends Person {
	private String password;

	public Client(String name, String email, String cpf, String password) {
		this.name = name;
		this.email = email;
		this.cpf = cpf;
		this.password = password;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}

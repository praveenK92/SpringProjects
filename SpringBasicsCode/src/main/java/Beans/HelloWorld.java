package Beans;

public class HelloWorld {
	private String name;
	private int id;

	public void setName(String name,int i) {
		this.name = name;
		this.id=i;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void printHello() {
		System.out.println("Hello ! " + name);
	}
}
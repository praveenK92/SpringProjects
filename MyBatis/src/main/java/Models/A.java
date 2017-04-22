package Models;

public class A {
	private String name;
	//private int id;
	@Override
	public String toString() {
		return "A [name=" + name + "]";
	}
	public String getName() {
		return name;
	}
	/*public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}*/
	public void setName(String name) {
		this.name = name;
	}
	
}

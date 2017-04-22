package mybatis.spring.dummy.models;

public class A {
	private String name;
	private int id;
	
	public A() {}
	public A(String name, int id) {
		this.name = name;
		this.id = id;
	}
	@Override
	public String toString() {
		return "A [name=" + name + ", id=" + id + "]";
	}
	public String getName() {
		return name;
	}
	public int getId() {
		return id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setId(int id) {
		this.id = id;
	}
	
}

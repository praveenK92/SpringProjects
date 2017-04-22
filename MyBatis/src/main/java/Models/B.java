package Models;

import java.util.List;

public class B {
	private String name;
	private int id;
	private A a;
	private List<A> aa;
	@Override
	public String toString() {
		return "B [name=" + name + ", id=" + id + ", a=" + a + ", aa=" + aa + "]";
	}
	public List<A> getAa() {
		return aa;
	}
	public void setAa(List<A> aa) {
		this.aa = aa;
	}
	public String getName() {
		return name;
	}
	public int getId() {
		return id;
	}
	public A getA() {
		return a;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setA(A a) {
		this.a = a;
	}
	

}

package a.b.c.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//@Component
public class Husband {
	private String name;
	private String job;
	//@Autowired
	private Wife w;
	
	public String getName() {
		return name;
	}
	public String getJob() {
		return job;
	}
	public Wife getW() {
		return w;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public void setW(Wife w) {
		this.w = w;
	}
	
}

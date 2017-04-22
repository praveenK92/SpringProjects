package a.b.c.model;

import org.springframework.stereotype.Component;

//@Component
public class Wife {
	private String name;
	private String job;
	public String getName() {
		return name;
	}
	public String getJob() {
		return job;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setJob(String job) {
		this.job = job;
	}
	
}

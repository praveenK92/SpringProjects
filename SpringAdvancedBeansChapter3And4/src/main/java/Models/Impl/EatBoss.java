package Models.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import Models.Cold;
import Models.Creamy;
import Models.Crispy;
import Models.Dessert;

@Component
public class EatBoss {
	private Dessert d;

	public Dessert getD() {
		return d;
	}
	@Autowired	
	@Creamy
	//@Cold
	@Crispy
	public void setD(Dessert d) {
		this.d = d;
	}
	public void eat(){
		d.eat();
	}
	
}

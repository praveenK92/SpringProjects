package Models.Impl;

import org.springframework.stereotype.Component;

import Models.Creamy;
import Models.Crispy;
import Models.Dessert;

@Component
@Creamy
@Crispy
public class Cake implements Dessert {

	public void eat() {
		System.out.println("Eating Cake");
	}

}

package Models.Impl;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import Models.Dessert;

@Component
@Primary
public class Cookies implements Dessert {

	public void eat() {
		System.out.println("Eating Cookies");
	}

}

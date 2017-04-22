package Models.Impl;

import org.springframework.stereotype.Component;

import Models.Cold;
import Models.Creamy;
import Models.Dessert;

@Component
@Cold
@Creamy
public class IceCream implements Dessert {

	public void eat() {
		System.out.println("Eating Ice-Cream");
	}

}

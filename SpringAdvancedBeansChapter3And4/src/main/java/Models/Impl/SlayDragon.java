package Models.Impl;

import org.springframework.stereotype.Component;

import Models.Quest;

@Component
public class SlayDragon implements Quest {
	
	public String embark() {
		return "Embarking on quest to slay the dragon!";
	}

}

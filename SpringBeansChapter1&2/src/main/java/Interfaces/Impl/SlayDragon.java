package Interfaces.Impl;

import java.io.PrintStream;

import org.springframework.stereotype.Component;

import Interfaces.Quest;

@Component
public class SlayDragon implements Quest {
	private PrintStream stream;
	
	public SlayDragon(PrintStream stream) {
		this.stream = stream;
	}
	public SlayDragon() {
		this.stream = System.out;
	}
	//@Override
	public void embark(String s) {
		stream.println(s+": Embarking on quest to slay the dragon!");
	}

}

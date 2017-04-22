package Interfaces.Impl;

import java.io.PrintStream;

import org.springframework.stereotype.Component;

@Component
public class Minstrel {
	private PrintStream stream;
	
	public Minstrel(PrintStream stream) {
		this.stream = stream;
	}
	public Minstrel() {
		this.stream = System.out;
	}
	public void singBeforeQuest() {
		stream.println("Fa la la, the knight is so brave!");
	}
	public void singAfterQuest() {
		stream.println("Tee hee hee, the brave knight " + "did embark on a quest!");
	}
}
package Interfaces.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import Interfaces.Knight;
import Interfaces.Quest;

@Component("sasuke")
public class BraveKnight implements Knight {
	//@Autowired
	private Quest q;
	public int k=1;
	@Autowired(required=false)
	public BraveKnight(Quest q) {
		System.out.println("Here Babes!");
		this.q=q;
	}
	public BraveKnight() {
		System.out.println("BraveKnight Here!");
		//this.q=new SlayDragon();
	}
	//@Override
	public void embarkOnQuest(String name) {
		q.embark(name);
	}

}

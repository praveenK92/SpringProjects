package Models.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import Models.Knight;
import Models.Quest;

@Component
public class BraveKnight implements Knight {
	@Autowired
	private Quest q;
	
	public BraveKnight(Quest q){
		this.q=q;
	}
	public BraveKnight(){}
	
	public void embarkOnQuest(String ss) {
		System.out.println(ss+" is "+q.embark());
	}

}

package Interfaces.Impl;

public class CDPlayer {
	private CompactDisc c;

	public CompactDisc getC() {
		return c;
	}

	public void setC(CompactDisc c) {
		this.c = c;
	}

	@Override
	public String toString() {
		return "CDPlayer [c=" + c + "]";
	}
}

package Interfaces.Impl;

public class CompactDisc {
	private String title;
	private String song;
	public String getTitle() {
		return title;
	}
	public String getSong() {
		return song;
	}
	public void setTitle(String title) {
		System.out.println("setting title");
		this.title = title;
	}
	public void setSong(String song) {
		System.out.println("Setting Song");
		this.song = song;
	}
	@Override
	public String toString() {
		return "CompactDisc [title=" + title + ", song=" + song + "]";
	}
	
}

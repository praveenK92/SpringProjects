package Models.Impl;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("Song")
public class Song {
	@Value("I wanna fuck you")
	private String title;
	@Value("Akon")
	private String author;
	@Value("#{A}")
	private A a;
	@Value("#{A.ReleaseYr}")
	private int yr2;
	@Value("#{A.getReleaseYr()}")
	private int yr1;

	@Override
	public String toString() {
		return "Song [title=" + title + ", author=" + author + ", a=" + a + ", yr2=" + yr2 + ", yr1=" + yr1 + "]";
	}

	public Song(){
	}
	/*@Autowired
	public Song(@Value("${x.title}")String title,@Value("${x.author}") String author) {
		this.title = title;
		this.author = author;
	}*/
	/*
	public Song(@Value("#{systemProperties[x.title]}")String title,
			@Value("#{systemProperties[x.author]}") String author) {
		this.title = title;
		this.author = author;
	}*/

	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}

	public A getA() {
		return a;
	}

	public int getYr2() {
		return yr2;
	}

	public int getYr1() {
		return yr1;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public void setA(A a) {
		this.a = a;
	}

	public void setYr2(int yr2) {
		this.yr2 = yr2;
	}

	public void setYr1(int yr1) {
		this.yr1 = yr1;
	}	
}

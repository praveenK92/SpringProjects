package Models;

import java.util.ArrayList;

public class Blog {
	private int id;
	private String title;
	private Author author;
	private ArrayList<Post> posts;

	@Override
	public String toString() {
		return "Blog [id=" + id + ", title=" + title + ", author=" + author + ", posts=" + posts + "]";
	}
	public Blog(Integer id) {
		this.id = id;
	}
	public int getId() {
		return id;
	}
	public String getTitle() {
		return title;
	}
	public Author getAuthor() {
		return author;
	}
	public ArrayList<Post> getPosts() {
		return posts;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public void setAuthor(Author author) {
		this.author = author;
	}
	public void setPosts(ArrayList<Post> posts) {
		this.posts = posts;
	}
}
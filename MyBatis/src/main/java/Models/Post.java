package Models;

import java.util.ArrayList;

public class Post {
	private int id;
	private String subject;
	private String body;
	private Author author;
	private ArrayList<Tag> tags;
	@Override
	public String toString() {
		return "Post [id=" + id + ", subject=" + subject + ", body=" + body + ", author=" + author + ", tags=" + tags
				+ "]";
	}
	public int getId() {
		return id;
	}
	public String getSubject() {
		return subject;
	}
	public String getBody() {
		return body;
	}
	public Author getAuthor() {
		return author;
	}
	public ArrayList<Tag> getTags() {
		return tags;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public void setBody(String body) {
		this.body = body;
	}
	public void setAuthor(Author author) {
		this.author = author;
	}
	public void setTags(ArrayList<Tag> tags) {
		this.tags = tags;
	}
}
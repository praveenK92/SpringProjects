package Models;

public class Author {
	private int id;
	private String username;
	private String password;
	private String email;
	private String bio;
	private String favouriteSection;
	@Override
	public String toString() {
		return "Author [id=" + id + ", username=" + username + ", password=" + password + ", email=" + email + ", bio="
				+ bio + ", favouriteSection=" + favouriteSection + "]";
	}
	public int getId() {
		return id;
	}
	public String getUsername() {
		return username;
	}
	public String getPassword() {
		return password;
	}
	public String getEmail() {
		return email;
	}
	public String getBio() {
		return bio;
	}
	public String getFavouriteSection() {
		return favouriteSection;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setBio(String bio) {
		this.bio = bio;
	}
	public void setFavouriteSection(String favouriteSection) {
		this.favouriteSection = favouriteSection;
	}
}
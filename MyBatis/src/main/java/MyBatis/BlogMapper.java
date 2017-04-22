package MyBatis;

import Models.B;
import Models.Blog;

public interface BlogMapper {
	public Blog findById(int id);
	public B findNickNames();
}
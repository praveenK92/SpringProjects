package MyBatis;

import java.io.IOException;
import java.io.Reader;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import Models.Author;
import Models.B;
import Models.A;
import Models.Blog;

public class Main {
	public static void main(String[] args) throws IOException {
		
		Reader reader = Resources.getResourceAsReader("config.xml");
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
		SqlSession session = sqlSessionFactory.openSession();
		
		//List<Blog> b=session.selectList("findById");
		List<Author> aa=session.selectList("selectAll");
		//System.out.println("Hello"+b);
		for(Author x:aa)System.out.println(x);
		
		List<B> b1=session.selectList("getB");
		for(B x:b1)System.out.println(x);
		
		session.commit();
		session.close();
	}
}
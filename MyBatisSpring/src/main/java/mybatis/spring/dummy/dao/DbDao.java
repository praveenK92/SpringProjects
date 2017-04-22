package mybatis.spring.dummy.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

import mybatis.spring.dummy.models.A;

@Component
@EnableAspectJAutoProxy
public class DbDao implements DbDa {
	//private static final Logger logger=LoggerFactory.getLogger(DbDao.class);
	@Autowired
	private SqlSessionTemplate session;
	
	public SqlSessionTemplate getSession() {
		return session;
	}

	public void setSession(SqlSessionTemplate session) {
		this.session = session;
	}
	@Override
	public List<A> getA(){
		List<A> a=session.selectList("getA");
		Ax x=new Ax();
		x.setAxi((List)a);
		List<A> b=(List)x.getAxi();
		//if(a==null)logger.debug("No data found! a is null");
		//return a;
		//logger.debug("DbDao 34:: "+b.toString());
		return b;
	}
	
}
class Ax{
	private int i;
	private List<Object> axi;
	public int getI() {
		return i;
	}
	public List<Object> getAxi() {
		return axi;
	}
	public void setI(int i) {
		this.i = i;
	}
	public void setAxi(List<Object> axi) {
		this.axi = axi;
	}
	
}

package mybatis.spring.dummy.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.exceptions.JedisConnectionException;

@Component
public class RedisDao {
	//@Autowired
	//private RedisTemplate<String, String> redis;
	@Autowired
	private JedisPool rd;

	
	public void setData(String key,String value){
		Jedis r=null;
		try{
	        r = rd.getResource();
	        r.set(key, value);
	        }
		catch (JedisConnectionException e){
	        	if (r != null){
	        		rd.returnBrokenResource(r);
	        		r= null;
	        		e.printStackTrace();
	        		}
	        		throw e;
	        }
	    finally
	    {
	        if (r != null)
	            rd.returnResource(r);
	    }
	}
	public String getData(String key){
		Jedis r=null;
		try{
	        r = rd.getResource();
	        return r.get(key);
	        }
		catch (JedisConnectionException e){
	        	if (r != null){
	        		rd.returnBrokenResource(r);
	        		r= null;
	        		e.printStackTrace();
	        		return null;
	        		}
	        		throw e;
	        }
	    finally
	    {
	        if (r != null)
	            rd.returnResource(r);
	        return null;
	    }
	}
}

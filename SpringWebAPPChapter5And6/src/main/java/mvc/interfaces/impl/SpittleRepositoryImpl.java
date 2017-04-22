package mvc.interfaces.impl;

import java.util.Date;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import mvc.interfaces.SpittleRepository;
import mvc.models.Spitter;
import mvc.models.Spittle;

@Component
@Qualifier("samWise")
@Primary
public class SpittleRepositoryImpl implements SpittleRepository {
	private Map<Integer,Spittle> spittleRepo;
	private Map<Integer,Spitter> spitterDb;
	private int count=0,sp_c=1;
	
	public SpittleRepositoryImpl(){
		spittleRepo=new HashMap<Integer, Spittle>();
		for(int i=0;i<40;i++){
			Spittle s1=new Spittle("I am Praveen!"+i,new Date(),28.6139,77.2090);
			spittleRepo.put(i, s1);
		}
		//setSpittleRepo(spittleRepo);
		setCount(40);
		spitterDb=new HashMap<Integer,Spitter>();
	}
	public Map<Integer, Spittle> getSpittleRepo() {
		return spittleRepo;
	}
	public int getCount() {
		return count;
	}
	public void setSpittleRepo(Map<Integer, Spittle> spittleRepo) {
		this.spittleRepo = spittleRepo;
	}
	public void setCount(int count) {
		this.count = count;
	}
	@Override
	public List<Spittle> findSpittles(long max, int count) {
		List<Spittle> res=new LinkedList<Spittle>();
		for(int i=0;i<count;i++){
			res.add(spittleRepo.get(count--));
		}
		return res;
	}
	@Override
	public Spittle findOne(int spittleId) {
		return spittleRepo.get(spittleId);
	}
	@Override
	public void save(Spitter spitter) {
		spitterDb.put(sp_c++, spitter);
	}
}

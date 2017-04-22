package mvc.interfaces;

import java.util.List;

import mvc.models.Spitter;
import mvc.models.Spittle;

public interface SpittleRepository {
	List<Spittle> findSpittles(long max, int count);
	Spittle findOne(int spittleId);
	void save(Spitter spitter);
}
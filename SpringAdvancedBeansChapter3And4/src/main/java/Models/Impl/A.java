package Models.Impl;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("A")
public class A {
	@Value("2010")
	private int ReleaseYr;

	public int getReleaseYr() {
		return ReleaseYr;
	}

	public void setReleaseYr(int releaseYr) {
		ReleaseYr = releaseYr;
	}

	@Override
	public String toString() {
		return "A [ReleaseYr=" + ReleaseYr + "]";
	}
	
}

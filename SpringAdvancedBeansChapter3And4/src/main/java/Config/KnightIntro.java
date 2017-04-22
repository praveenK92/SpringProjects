package Config;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareParents;

import Models.Hello;
import Models.Impl.HelloImpl;

@Aspect
public class KnightIntro {
	@DeclareParents(value="Models.Knight+",defaultImpl=HelloImpl.class)
	public static Hello h;
}

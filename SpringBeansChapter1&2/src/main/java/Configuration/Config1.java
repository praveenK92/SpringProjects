package Configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import Interfaces.Knight;
import Interfaces.Quest;
import Interfaces.Impl.SlayDragon;

@Configuration
@ComponentScan(basePackageClasses={Knight.class})
//@ComponentScan(basePackages={"Interfaces"})
public class Config1 {
}

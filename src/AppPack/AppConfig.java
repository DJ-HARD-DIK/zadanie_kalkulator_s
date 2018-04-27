
package AppPack;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;



@Configuration
public class AppConfig {
    @Bean(name="PolskaKraj")
    public Kraj polskaKraj() {
        return new Kraj("Polska", "pln", 19, 1200);
    }
    
    @Bean(name="NiemcyKraj")
    public Kraj NiemcyKraj() {
        return new Kraj("Niemcy", "eur", 20, 800);
    }
    
    @Bean(name="WielkaBrytaniaKraj")
    public Kraj WielkaBrytaniaKraj() {
        return new Kraj("WielkaBrytania", "pln", 25, 600);
    }
    
}

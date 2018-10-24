package fr.ema.examples.has.spring.conf;

import fr.ema.examples.has.config.AdjustableLamp;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ImportResource({"classpath*:applicationContext.xml"})
public class BeansConfiguration {

    @Bean(name="lampBeanConfiguration")
    public Object lampBeanConfiguration() {
        return new AdjustableLamp();
    }

    @Bean(name="lampBeanConfigurationToErasedWithNewImplementation")
    public Object lampBeanConfigurationToErased() {
        return new AdjustableLamp();
    }
}

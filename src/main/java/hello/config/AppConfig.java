package hello.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.convert.ConversionService;
import org.springframework.core.convert.support.DefaultConversionService;

@Configuration
public class AppConfig {

    @Bean
    public ConversionService converterService() {
        return new DefaultConversionService();
    }
}

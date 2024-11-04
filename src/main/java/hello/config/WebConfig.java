package hello.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.format.FormatterRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import com.fasterxml.jackson.core.type.TypeReference;

import java.util.ArrayList;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addFormatters(FormatterRegistry registry) {
        registry.addConverter(new MapToObjectConverter<String>(new TypeReference<>(){}));
        registry.addConverter(new ListToListObjectConverter<ArrayList<String>>(new TypeReference<>(){}));
    }
}
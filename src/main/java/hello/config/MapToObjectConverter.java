package hello.config;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import java.util.Map;

@RequiredArgsConstructor
@Component
public class MapToObjectConverter<T> implements Converter<Map<String, Object>, T> {
    private final TypeReference<? extends T> typeReference;

    @Override
    public T convert(Map<String, Object> map) {
        return new ObjectMapper().convertValue(map, typeReference);
    }
}

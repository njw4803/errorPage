package hello.config;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@RequiredArgsConstructor
@Component
public class ListToListObjectConverter<T> implements Converter<List<Map<String, Object>>, List<T>> {
    private final TypeReference<? extends List<T>> typeReference;

    @Override
    public List<T> convert(List<Map<String, Object>> list) {
        return new ObjectMapper().convertValue(list, typeReference);
    }

}

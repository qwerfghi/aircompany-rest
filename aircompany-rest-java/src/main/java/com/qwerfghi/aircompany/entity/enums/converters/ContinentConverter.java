package com.qwerfghi.aircompany.entity.enums.converters;

import com.qwerfghi.aircompany.entity.enums.Continent;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;
import java.util.stream.Stream;

@Converter(autoApply = true)
public class ContinentConverter implements AttributeConverter<Continent, String> {

    @Override
    public String convertToDatabaseColumn(Continent continent) {
        if (continent == null) {
            return null;
        }
        return continent.getName();
    }

    @Override
    public Continent convertToEntityAttribute(String name) {
        if (name == null) {
            return null;
        }

        return Stream.of(Continent.values())
                .filter(continent -> continent.getName().equals(name))
                .findFirst()
                .orElseThrow(IllegalArgumentException::new);
    }
}

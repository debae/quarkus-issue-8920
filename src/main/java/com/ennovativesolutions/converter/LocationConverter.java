package com.ennovativesolutions.converter;

import java.util.List;

import com.ennovativesolutions.model.Location;
import org.apache.commons.lang3.StringUtils;
import org.eclipse.microprofile.config.spi.Converter;

public class LocationConverter implements Converter<Location> {

    private static final String[] FIELD_NAMES = { "prefix", "name"};

    @Override
    public Location convert(String value) {
        Location location = new Location();
        location.setPrefix(getValue(value, "prefix"));
        location.setName(getValue(value, "name"));
        return location;
    }

    private String getValue(String value, String fieldName) {
        String fieldValue = StringUtils.substringAfter(value, fieldName + "=");
        int indexNextFields = Integer.MAX_VALUE;
        for (String possibleFieldName : FIELD_NAMES) {
            int fieldNameIndex = fieldValue.indexOf(possibleFieldName + "=");
            if (fieldNameIndex != -1 && fieldNameIndex < indexNextFields) {
                indexNextFields = fieldNameIndex;
            }
        }
        fieldValue = fieldValue.substring(0, indexNextFields == Integer.MAX_VALUE ? fieldValue.length() : indexNextFields);
        return fieldValue;
    }
}

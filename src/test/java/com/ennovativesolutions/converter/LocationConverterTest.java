package com.ennovativesolutions.converter;

import com.ennovativesolutions.model.Location;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


class LocationConverterTest {
    LocationConverter locationConverter = new LocationConverter();

    @Test
    public void testConvert() {
        Location location = locationConverter.convert("prefix=27name=Bornem C1");
        assertThat(location).isNotNull();
        assertThat(location.getName()).isEqualTo("Bornem C1");
        assertThat(location.getPrefix()).isEqualTo("27");
    }

}

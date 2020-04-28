package com.ennovativesolutions.service;

import javax.inject.Inject;

import com.ennovativesolutions.model.Location;
import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@QuarkusTest
public class LocationServiceTest {

    @Inject
    LocationService locationService;

    @Test
    void getLocation() {
        Location location = locationService.getLocation("27");
        assertEquals("27", location.getPrefix());
    }
}

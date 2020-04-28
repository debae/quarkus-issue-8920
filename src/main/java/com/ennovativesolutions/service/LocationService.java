package com.ennovativesolutions.service;

import javax.enterprise.context.ApplicationScoped;
import java.util.List;

import com.ennovativesolutions.model.Location;
import org.eclipse.microprofile.config.inject.ConfigProperty;

@ApplicationScoped
public class LocationService {

    @ConfigProperty(name = "locations")
    public List<Location> locations;


    public Location getLocation(String prefix) {
        for (Location location : locations) {
            if (location.getPrefix().equals(prefix)) {
                return location;
            }
        }
        return null;
    }

}

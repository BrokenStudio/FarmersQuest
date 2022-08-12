package dev.brokenstudio.farmersquest.location;

import dev.brokenstudio.farmersquest.api.handler.Handler;
import dev.brokenstudio.farmersquest.api.serializer.Serializer;
import org.bukkit.Bukkit;
import org.bukkit.Location;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;

/*
    Project: FarmersQuest
    File: LocationHandler
    Created by: Jan Z.
    Created at: 09.08.2022
     
    © 2022 BrokenStudio x Jan
*/
public class LocationHandler implements Handler<Location> {

    private class JsonLocation {
        public double x;
        public double y;
        public double z;
        public float yaw;
        public float pitch;
        public String world;

        public JsonLocation(Location location) {
            this.x = location.getX();
            this.y = location.getY();
            this.z = location.getZ();
            this.yaw = location.getYaw();
            this.pitch = location.getPitch();
            this.world = location.getWorld().getName();
        }

        public Location toLocation() {
            return new Location(Bukkit.getWorld(world), x, y, z, yaw, pitch);
        }

        public String toJson(){
            return Serializer.prettySerialize(this);
        }
    }

    private HashMap<String, Location> locationHashMap;

    {
        locationHashMap = new HashMap<>();
        init();
    }

    public Location get(String key) {
        return locationHashMap.get(key);
    }

    public void set(String key, Location value) {
        locationHashMap.put(key, value);
    }

    public boolean init() {
        File file = new File("plugins/FarmersQuest", "locations.yml");
        file.mkdirs();
        try {
            file.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return false;
    }

    public void save() throws IOException{
        for(String key : locationHashMap.keySet()){
            File file = new File("plugins/FarmersQuest/locations", key + ".yml");
            file.createNewFile();
            FileWriter writer = new FileWriter(file);
            JsonLocation jsonLocation = new JsonLocation(locationHashMap.get(key));
            writer.write(jsonLocation.toJson());
        }
    }

}


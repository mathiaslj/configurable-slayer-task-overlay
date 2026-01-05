package com.mathiaslj.configurableslayertaskoverlay.models;

import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;

public class DungeonLocation {
    private final String name;
    private final WorldArea area;
    private final WorldPoint entrancePoint;

    public DungeonLocation(String name, WorldArea area, WorldPoint entrancePoint) {
        this.name = name;
        this.area = area;
        this.entrancePoint = entrancePoint;
    }

    public String getName() {
        return name;
    }

    public WorldArea getArea() {
        return area;
    }

    public WorldPoint getEntrancePoint() {
        return entrancePoint;
    }

    public boolean contains(WorldPoint point) {
        return area.contains(point);
    }
}

package com.mathiaslj.configurableslayertaskoverlay;

import com.mathiaslj.configurableslayertaskoverlay.models.DungeonLocation;
import com.mathiaslj.configurableslayertaskoverlay.utils.WorldAreaUtils;
import net.runelite.api.coords.WorldPoint;

import java.util.ArrayList;
import java.util.List;

public class DungeonLocationRegistry {
    private static final List<DungeonLocation> ENTRANCES = new ArrayList<>();

    static {
        // Catacombs of Kourend
        ENTRANCES.add(new DungeonLocation(
                "Catacombs of Kourend",
                WorldAreaUtils.fromCorners(
                        new WorldPoint(1597, 10112, 0), // Example coordinates - adjust these
                        new WorldPoint(1737, 9974, 0)
                ),
                new WorldPoint(1640, 3673, 0) // Entrance location on surface
        ));

        // Stronghold Slayer Cave
        ENTRANCES.add(new DungeonLocation(
                "Stronghold Slayer Cave",
                WorldAreaUtils.fromCorners(
                        new WorldPoint(2379, 9838, 0),
                        new WorldPoint(2497, 9767, 0)
                ),
                new WorldPoint(2431, 3423, 0) // Entrance on surface
        ));

        // Stronghold Of Security
        ENTRANCES.add(new DungeonLocation(
                "Stronghold Of Security",
                WorldAreaUtils.fromCorners(
                        new WorldPoint(1853, 5248, 0),
                        new WorldPoint(2018, 4891, 0)
                ),
                new WorldPoint(3079, 3420, 0) // Entrance on surface
        ));

        // God wars dungeon
        ENTRANCES.add(new DungeonLocation(
                "God Wars Dungeon",
                WorldAreaUtils.fromCorners(
                        new WorldPoint(2789, 5381, 0),
                        new WorldPoint(2978, 5130, 0)
                ),
                new WorldPoint(2909, 3743, 0) // Entrance on surface
        ));

        // Fremennik slayer dungeon
        ENTRANCES.add(new DungeonLocation(
                "Fremennik Slayer Dungeon",
                WorldAreaUtils.fromCorners(
                        new WorldPoint(2670, 10072, 0),
                        new WorldPoint(2828, 9902, 0)
                ),
                new WorldPoint(2790, 3613, 0) // Entrance on surface
        ));

        ENTRANCES.add(new DungeonLocation(
                "Taverley Dungeon",
                WorldAreaUtils.fromCorners(
                        new WorldPoint(2644, 10017, 0),
                        new WorldPoint(3012, 9579, 0)
                ),
                new WorldPoint(2882, 3387, 0) // Entrance on surface
        ));

        ENTRANCES.add(new DungeonLocation(
                "Chasm of Fire Upper level",
                WorldAreaUtils.fromCorners(
                        new WorldPoint(1304, 10090, 0),
                        new WorldPoint(1321, 10072, 0)
                ),
                new WorldPoint(1435, 3672, 0) // Entrance on surface
        ));
        ENTRANCES.add(new DungeonLocation(
                "Chasm of Fire Mid level",
                WorldAreaUtils.fromCorners(
                        new WorldPoint(1292, 10000, 0),
                        new WorldPoint(1334, 9968, 0)
                ),
                new WorldPoint(1435, 3672, 0) // Entrance on surface
        ));
        ENTRANCES.add(new DungeonLocation(
                "Chasm of Fire Lower level",
                WorldAreaUtils.fromCorners(
                        new WorldPoint(1291, 9907, 0),
                        new WorldPoint(1328, 9870, 0)
                ),
                new WorldPoint(1435, 3672, 0) // Entrance on surface
        ));

        ENTRANCES.add(new DungeonLocation(
                "Mount Karuulm",
                WorldAreaUtils.fromCorners(
                        new WorldPoint(1104, 10297, 0),
                        new WorldPoint(1396, 9899, 0)
                ),
                new WorldPoint(1311, 3806, 0) // Entrance on surface
        ));

        ENTRANCES.add(new DungeonLocation(
                "Asgarnia dungeon",
                WorldAreaUtils.fromCorners(
                        new WorldPoint(2869, 9664, 0),
                        new WorldPoint(3164, 9524, 0)
                ),
                new WorldPoint(3010, 3151, 0) // Entrance on surface
        ));

        ENTRANCES.add(new DungeonLocation(
                "Braindeath Island",
                WorldAreaUtils.fromCorners(
                        new WorldPoint(2110, 5182, 0),
                        new WorldPoint(2178, 5053, 0)
                ),
                new WorldPoint(3680, 3536, 0) // Entrance on surface
        ));

        ENTRANCES.add(new DungeonLocation(
                "Fossil Island Wyvern Cave",
                WorldAreaUtils.fromCorners(
                        new WorldPoint(3582, 10304, 0),
                        new WorldPoint(3651, 10169, 0)
                ),
                new WorldPoint(3680, 3853, 0) // Entrance on surface
        ));

        ENTRANCES.add(new DungeonLocation(
                "Grimstone Dungeon",
                WorldAreaUtils.fromCorners(
                        new WorldPoint(2838, 10495, 0),
                        new WorldPoint(2938, 10433, 0)
                ),
                new WorldPoint(2910, 4067, 0) // Entrance on surface
        ));

        ENTRANCES.add(new DungeonLocation(
                "Gryphon dungeon",
                WorldAreaUtils.fromCorners(
                        new WorldPoint(3074, 8891, 0),
                        new WorldPoint(3256, 8764, 0)
                ),
                new WorldPoint(3125, 2485, 0) // Entrance on surface
        ));

        ENTRANCES.add(new DungeonLocation(
                "Mos Le'Harmless cave",
                WorldAreaUtils.fromCorners(
                        new WorldPoint(3711, 9469, 0),
                        new WorldPoint(3844, 9342, 0)
                ),
                new WorldPoint(3749, 2968, 0) // Entrance on surface
        ));

        ENTRANCES.add(new DungeonLocation(
                "Kalphite cave",
                WorldAreaUtils.fromCorners(
                        new WorldPoint(3155, 9548, 0),
                        new WorldPoint(3419, 9399, 0)
                ),
                new WorldPoint(3321, 3124, 0) // Entrance on surface
        ));

        ENTRANCES.add(new DungeonLocation(
                "Edgeville dungeon",
                WorldAreaUtils.fromCorners(
                        new WorldPoint(3063, 9999, 0),
                        new WorldPoint(3330, 9788, 0)
                ),
                new WorldPoint(3094, 3472, 0) // Entrance on surface
        ));

        ENTRANCES.add(new DungeonLocation(
                "Ancient Cavern",
                WorldAreaUtils.fromCorners(
                        new WorldPoint(1714, 5430, 0),
                        new WorldPoint(1865, 5310, 0)
                ),
                new WorldPoint(2512, 3513, 0) // Entrance on surface
        ));

        ENTRANCES.add(new DungeonLocation(
                "Dorgesh-Kaan South Dungeon",
                WorldAreaUtils.fromCorners(
                        new WorldPoint(2708, 5221, 0),
                        new WorldPoint(2735, 5245, 0)
                ),
                new WorldPoint(3206, 3217, 0) // Entrance on surface
        ));

        ENTRANCES.add(new DungeonLocation(
                "Miscellania Dungeon",
                WorldAreaUtils.fromCorners(
                        new WorldPoint(2497, 10304, 0),
                        new WorldPoint(2627, 10239, 0)
                ),
                new WorldPoint(2510, 3849, 0) // Entrance on surface
        ));

        ENTRANCES.add(new DungeonLocation(
                "Zanaris",
                WorldAreaUtils.fromCorners(
                        new WorldPoint(2362, 4479, 0),
                        new WorldPoint(2506, 4347, 0)
                ),
                new WorldPoint(3203, 3173, 0) // Entrance on surface
        ));

        ENTRANCES.add(new DungeonLocation(
                "Lumbridge dungeon",
                WorldAreaUtils.fromCorners(
                        new WorldPoint(3144, 9602, 0),
                        new WorldPoint(3265, 9538, 0)
                ),
                new WorldPoint(3173, 3170, 0) // Entrance on surface
        ));

        ENTRANCES.add(new DungeonLocation(
                "Smoke Devil Dungeon",
                WorldAreaUtils.fromCorners(
                        new WorldPoint(2343, 9469, 0),
                        new WorldPoint(2432, 9409, 0)
                ),
                new WorldPoint(2413, 3059, 0) // Entrance on surface
        ));


        // Add more dungeons as needed
    }

    public static WorldPoint getEntranceFor(WorldPoint location) {
        for (DungeonLocation entrance : ENTRANCES) {
            if (entrance.contains(location)) {
                return entrance.getEntrancePoint();
            }
        }
        return null;
    }

    public static List<DungeonLocation> getAllEntrances() {
        return ENTRANCES;
    }
}

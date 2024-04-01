package br.com;

import java.util.Random;

public class Island {
    private final int index;
    private final String name;
    private final boolean hasTreasure;
    private final boolean isDeathIsland;

    public Island(int index, String name) {
        this.index = index;
        this.name = name;
        Random random = new Random();
        this.hasTreasure = random.nextBoolean();
        this.isDeathIsland = random.nextBoolean();

    }

    public int getIndex() {
        return index;
    }
    public String getName() {
        return name;
    }
    public boolean hasTreasure() {
        return hasTreasure;
    }

    public boolean isDeathIsland() {
        return isDeathIsland;
    }


}

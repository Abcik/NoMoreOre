package ua.abcik.nomoreore;

import java.util.HashSet;
import java.util.List;

public class Preset {

    private final HashSet<String> biomes;
    private final int minY;
    private final int maxY;
    private final double chance;

    public Preset(List<String> biomes, int minY, int maxY, double chance) {
        this.biomes = new HashSet<>();
        this.biomes.addAll(biomes);
        this.minY = minY;
        this.maxY = maxY;
        this.chance = chance;
    }

    public boolean isCorrectBiome(String biome) {
        return (biomes.contains("ALL") || biomes.contains(biome)) && !biomes.contains("-" + biome);
    }

    public boolean isCorrectHeight(int height) {
        return height >= minY && height <= maxY;
    }

    public double getChance() {
        return chance;
    }
}
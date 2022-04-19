package ua.abcik.nomoreore;

import org.bukkit.Material;
import org.bukkit.block.Block;

import java.util.HashMap;
import java.util.HashSet;

public class OreManager {

    public HashMap<String, HashSet<Material>> noGenerateInWorlds;
    private final HashMap<String, HashSet<OreType>> enableInWorlds;
    private final HashMap<OreType, HashSet<Preset>> presets;

    public OreManager(Main main) {
        noGenerateInWorlds = new HashMap<>();
        enableInWorlds = new HashMap<>();
        presets = new HashMap<>();

        for (String worlds : main.getConfig().getStringList("CoalOre.noGenerateInWorlds")) {
            if (!noGenerateInWorlds.containsKey(worlds)) {
                noGenerateInWorlds.put(worlds, new HashSet<>());
            }
            noGenerateInWorlds.get(worlds).add(Material.COAL_ORE);
            noGenerateInWorlds.get(worlds).add(Material.DEEPSLATE_COAL_ORE);
        }
        for (String worlds : main.getConfig().getStringList("CopperOre.noGenerateInWorlds")) {
            if (!noGenerateInWorlds.containsKey(worlds)) {
                noGenerateInWorlds.put(worlds, new HashSet<>());
            }
            noGenerateInWorlds.get(worlds).add(Material.COPPER_ORE);
            noGenerateInWorlds.get(worlds).add(Material.DEEPSLATE_COPPER_ORE);
        }
        for (String worlds : main.getConfig().getStringList("IronOre.noGenerateInWorlds")) {
            if (!noGenerateInWorlds.containsKey(worlds)) {
                noGenerateInWorlds.put(worlds, new HashSet<>());
            }
            noGenerateInWorlds.get(worlds).add(Material.IRON_ORE);
            noGenerateInWorlds.get(worlds).add(Material.DEEPSLATE_IRON_ORE);
        }
        for (String worlds : main.getConfig().getStringList("GoldOre.noGenerateInWorlds")) {
            if (!noGenerateInWorlds.containsKey(worlds)) {
                noGenerateInWorlds.put(worlds, new HashSet<>());
            }
            noGenerateInWorlds.get(worlds).add(Material.GOLD_ORE);
            noGenerateInWorlds.get(worlds).add(Material.DEEPSLATE_GOLD_ORE);
        }
        for (String worlds : main.getConfig().getStringList("RedstoneOre.noGenerateInWorlds")) {
            if (!noGenerateInWorlds.containsKey(worlds)) {
                noGenerateInWorlds.put(worlds, new HashSet<>());
            }
            noGenerateInWorlds.get(worlds).add(Material.REDSTONE_ORE);
            noGenerateInWorlds.get(worlds).add(Material.DEEPSLATE_REDSTONE_ORE);
        }
        for (String worlds : main.getConfig().getStringList("EmeraldOre.noGenerateInWorlds")) {
            if (!noGenerateInWorlds.containsKey(worlds)) {
                noGenerateInWorlds.put(worlds, new HashSet<>());
            }
            noGenerateInWorlds.get(worlds).add(Material.EMERALD_ORE);
            noGenerateInWorlds.get(worlds).add(Material.DEEPSLATE_EMERALD_ORE);
        }
        for (String worlds : main.getConfig().getStringList("LapisOre.noGenerateInWorlds")) {
            if (!noGenerateInWorlds.containsKey(worlds)) {
                noGenerateInWorlds.put(worlds, new HashSet<>());
            }
            noGenerateInWorlds.get(worlds).add(Material.LAPIS_ORE);
            noGenerateInWorlds.get(worlds).add(Material.DEEPSLATE_LAPIS_ORE);
        }
        for (String worlds : main.getConfig().getStringList("DiamondOre.noGenerateInWorlds")) {
            if (!noGenerateInWorlds.containsKey(worlds)) {
                noGenerateInWorlds.put(worlds, new HashSet<>());
            }
            noGenerateInWorlds.get(worlds).add(Material.DIAMOND_ORE);
            noGenerateInWorlds.get(worlds).add(Material.DEEPSLATE_DIAMOND_ORE);
        }
        for (String worlds : main.getConfig().getStringList("NetherGoldOre.noGenerateInWorlds")) {
            if (!noGenerateInWorlds.containsKey(worlds)) {
                noGenerateInWorlds.put(worlds, new HashSet<>());
            }
            noGenerateInWorlds.get(worlds).add(Material.NETHER_GOLD_ORE);
        }
        for (String worlds : main.getConfig().getStringList("NetherQuartzOre.noGenerateInWorlds")) {
            if (!noGenerateInWorlds.containsKey(worlds)) {
                noGenerateInWorlds.put(worlds, new HashSet<>());
            }
            noGenerateInWorlds.get(worlds).add(Material.NETHER_QUARTZ_ORE);
        }
        for (String worlds : main.getConfig().getStringList("GildedBlackstone.noGenerateInWorlds")) {
            if (!noGenerateInWorlds.containsKey(worlds)) {
                noGenerateInWorlds.put(worlds, new HashSet<>());
            }
            noGenerateInWorlds.get(worlds).add(Material.GILDED_BLACKSTONE);
        }
        for (String worlds : main.getConfig().getStringList("AncientDebris.noGenerateInWorlds")) {
            if (!noGenerateInWorlds.containsKey(worlds)) {
                noGenerateInWorlds.put(worlds, new HashSet<>());
            }
            noGenerateInWorlds.get(worlds).add(Material.ANCIENT_DEBRIS);
        }

        for (String worlds : main.getConfig().getStringList("CoalOre.enableInWorlds")) {
            if (!enableInWorlds.containsKey(worlds)) {
                enableInWorlds.put(worlds, new HashSet<>());
            }
            enableInWorlds.get(worlds).add(OreType.COAL);
        }
        for (String worlds : main.getConfig().getStringList("CopperOre.enableInWorlds")) {
            if (!enableInWorlds.containsKey(worlds)) {
                enableInWorlds.put(worlds, new HashSet<>());
            }
            enableInWorlds.get(worlds).add(OreType.COPPER);
        }
        for (String worlds : main.getConfig().getStringList("IronOre.enableInWorlds")) {
            if (!enableInWorlds.containsKey(worlds)) {
                enableInWorlds.put(worlds, new HashSet<>());
            }
            enableInWorlds.get(worlds).add(OreType.IRON);
        }
        for (String worlds : main.getConfig().getStringList("GoldOre.enableInWorlds")) {
            if (!enableInWorlds.containsKey(worlds)) {
                enableInWorlds.put(worlds, new HashSet<>());
            }
            enableInWorlds.get(worlds).add(OreType.GOLD);
        }
        for (String worlds : main.getConfig().getStringList("RedstoneOre.enableInWorlds")) {
            if (!enableInWorlds.containsKey(worlds)) {
                enableInWorlds.put(worlds, new HashSet<>());
            }
            enableInWorlds.get(worlds).add(OreType.REDSTONE);
        }
        for (String worlds : main.getConfig().getStringList("EmeraldOre.enableInWorlds")) {
            if (!enableInWorlds.containsKey(worlds)) {
                enableInWorlds.put(worlds, new HashSet<>());
            }
            enableInWorlds.get(worlds).add(OreType.EMERALD);
        }
        for (String worlds : main.getConfig().getStringList("LapisOre.enableInWorlds")) {
            if (!enableInWorlds.containsKey(worlds)) {
                enableInWorlds.put(worlds, new HashSet<>());
            }
            enableInWorlds.get(worlds).add(OreType.LAPIS);
        }
        for (String worlds : main.getConfig().getStringList("DiamondOre.enableInWorlds")) {
            if (!enableInWorlds.containsKey(worlds)) {
                enableInWorlds.put(worlds, new HashSet<>());
            }
            enableInWorlds.get(worlds).add(OreType.DIAMOND);
        }
        for (String worlds : main.getConfig().getStringList("NetherGoldOre.enableInWorlds")) {
            if (!enableInWorlds.containsKey(worlds)) {
                enableInWorlds.put(worlds, new HashSet<>());
            }
            enableInWorlds.get(worlds).add(OreType.NETHER_GOLD);
        }
        for (String worlds : main.getConfig().getStringList("NetherQuartzOre.enableInWorlds")) {
            if (!enableInWorlds.containsKey(worlds)) {
                enableInWorlds.put(worlds, new HashSet<>());
            }
            enableInWorlds.get(worlds).add(OreType.NETHER_QUARTZ);
        }
        for (String worlds : main.getConfig().getStringList("GildedBlackstone.enableInWorlds")) {
            if (!enableInWorlds.containsKey(worlds)) {
                enableInWorlds.put(worlds, new HashSet<>());
            }
            enableInWorlds.get(worlds).add(OreType.GILDED_BLACKSTONE);
        }
        for (String worlds : main.getConfig().getStringList("AncientDebris.enableInWorlds")) {
            if (!enableInWorlds.containsKey(worlds)) {
                enableInWorlds.put(worlds, new HashSet<>());
            }
            enableInWorlds.get(worlds).add(OreType.ANCIENT_DEBRIS);
        }

        for (String key : main.getConfig().getConfigurationSection("CoalOre.presets").getKeys(false)) {
            if (!presets.containsKey(OreType.COAL)) {
                presets.put(OreType.COAL, new HashSet<>());
            }
            presets.get(OreType.COAL).add(new Preset(main.getConfig().getStringList("CoalOre.presets." + key + ".biomes"),
                    main.getConfig().getInt("CoalOre.presets." + key + ".minY"),
                    main.getConfig().getInt("CoalOre.presets." + key + ".maxY"),
                    main.getConfig().getDouble("CoalOre.presets." + key + ".chance")));
        }
        for (String key : main.getConfig().getConfigurationSection("CopperOre.presets").getKeys(false)) {
            if (!presets.containsKey(OreType.COPPER)) {
                presets.put(OreType.COPPER, new HashSet<>());
            }
            presets.get(OreType.COPPER).add(new Preset(main.getConfig().getStringList("CopperOre.presets." + key + ".biomes"),
                    main.getConfig().getInt("CopperOre.presets." + key + ".minY"),
                    main.getConfig().getInt("CopperOre.presets." + key + ".maxY"),
                    main.getConfig().getDouble("CopperOre.presets." + key + ".chance")));
        }
        for (String key : main.getConfig().getConfigurationSection("IronOre.presets").getKeys(false)) {
            if (!presets.containsKey(OreType.IRON)) {
                presets.put(OreType.IRON, new HashSet<>());
            }
            presets.get(OreType.IRON).add(new Preset(main.getConfig().getStringList("IronOre.presets." + key + ".biomes"),
                    main.getConfig().getInt("IronOre.presets." + key + ".minY"),
                    main.getConfig().getInt("IronOre.presets." + key + ".maxY"),
                    main.getConfig().getDouble("IronOre.presets." + key + ".chance")));
        }
        for (String key : main.getConfig().getConfigurationSection("GoldOre.presets").getKeys(false)) {
            if (!presets.containsKey(OreType.GOLD)) {
                presets.put(OreType.GOLD, new HashSet<>());
            }
            presets.get(OreType.GOLD).add(new Preset(main.getConfig().getStringList("GoldOre.presets." + key + ".biomes"),
                    main.getConfig().getInt("GoldOre.presets." + key + ".minY"),
                    main.getConfig().getInt("GoldOre.presets." + key + ".maxY"),
                    main.getConfig().getDouble("GoldOre.presets." + key + ".chance")));
        }
        for (String key : main.getConfig().getConfigurationSection("RedstoneOre.presets").getKeys(false)) {
            if (!presets.containsKey(OreType.REDSTONE)) {
                presets.put(OreType.REDSTONE, new HashSet<>());
            }
            presets.get(OreType.REDSTONE).add(new Preset(main.getConfig().getStringList("RedstoneOre.presets." + key + ".biomes"),
                    main.getConfig().getInt("RedstoneOre.presets." + key + ".minY"),
                    main.getConfig().getInt("RedstoneOre.presets." + key + ".maxY"),
                    main.getConfig().getDouble("RedstoneOre.presets." + key + ".chance")));
        }
        for (String key : main.getConfig().getConfigurationSection("EmeraldOre.presets").getKeys(false)) {
            if (!presets.containsKey(OreType.EMERALD)) {
                presets.put(OreType.EMERALD, new HashSet<>());
            }
            presets.get(OreType.EMERALD).add(new Preset(main.getConfig().getStringList("EmeraldOre.presets." + key + ".biomes"),
                    main.getConfig().getInt("EmeraldOre.presets." + key + ".minY"),
                    main.getConfig().getInt("EmeraldOre.presets." + key + ".maxY"),
                    main.getConfig().getDouble("EmeraldOre.presets." + key + ".chance")));
        }
        for (String key : main.getConfig().getConfigurationSection("LapisOre.presets").getKeys(false)) {
            if (!presets.containsKey(OreType.LAPIS)) {
                presets.put(OreType.LAPIS, new HashSet<>());
            }
            presets.get(OreType.LAPIS).add(new Preset(main.getConfig().getStringList("LapisOre.presets." + key + ".biomes"),
                    main.getConfig().getInt("LapisOre.presets." + key + ".minY"),
                    main.getConfig().getInt("LapisOre.presets." + key + ".maxY"),
                    main.getConfig().getDouble("LapisOre.presets." + key + ".chance")));
        }
        for (String key : main.getConfig().getConfigurationSection("DiamondOre.presets").getKeys(false)) {
            if (!presets.containsKey(OreType.DIAMOND)) {
                presets.put(OreType.DIAMOND, new HashSet<>());
            }
            presets.get(OreType.DIAMOND).add(new Preset(main.getConfig().getStringList("DiamondOre.presets." + key + ".biomes"),
                    main.getConfig().getInt("DiamondOre.presets." + key + ".minY"),
                    main.getConfig().getInt("DiamondOre.presets." + key + ".maxY"),
                    main.getConfig().getDouble("DiamondOre.presets." + key + ".chance")));
        }
        for (String key : main.getConfig().getConfigurationSection("NetherGoldOre.presets").getKeys(false)) {
            if (!presets.containsKey(OreType.NETHER_GOLD)) {
                presets.put(OreType.NETHER_GOLD, new HashSet<>());
            }
            presets.get(OreType.NETHER_GOLD).add(new Preset(main.getConfig().getStringList("NetherGoldOre.presets." + key + ".biomes"),
                    main.getConfig().getInt("NetherGoldOre.presets." + key + ".minY"),
                    main.getConfig().getInt("NetherGoldOre.presets." + key + ".maxY"),
                    main.getConfig().getDouble("NetherGoldOre.presets." + key + ".chance")));
        }
        for (String key : main.getConfig().getConfigurationSection("NetherQuartzOre.presets").getKeys(false)) {
            if (!presets.containsKey(OreType.NETHER_QUARTZ)) {
                presets.put(OreType.NETHER_QUARTZ, new HashSet<>());
            }
            presets.get(OreType.NETHER_QUARTZ).add(new Preset(main.getConfig().getStringList("NetherQuartzOre.presets." + key + ".biomes"),
                    main.getConfig().getInt("NetherQuartzOre.presets." + key + ".minY"),
                    main.getConfig().getInt("NetherQuartzOre.presets." + key + ".maxY"),
                    main.getConfig().getDouble("NetherQuartzOre.presets." + key + ".chance")));
        }
        for (String key : main.getConfig().getConfigurationSection("GildedBlackstone.presets").getKeys(false)) {
            if (!presets.containsKey(OreType.GILDED_BLACKSTONE)) {
                presets.put(OreType.GILDED_BLACKSTONE, new HashSet<>());
            }
            presets.get(OreType.GILDED_BLACKSTONE).add(new Preset(main.getConfig().getStringList("GildedBlackstone.presets." + key + ".biomes"),
                    main.getConfig().getInt("GildedBlackstone.presets." + key + ".minY"),
                    main.getConfig().getInt("GildedBlackstone.presets." + key + ".maxY"),
                    main.getConfig().getDouble("GildedBlackstone.presets." + key + ".chance")));
        }
        for (String key : main.getConfig().getConfigurationSection("AncientDebris.presets").getKeys(false)) {
            if (!presets.containsKey(OreType.ANCIENT_DEBRIS)) {
                presets.put(OreType.ANCIENT_DEBRIS, new HashSet<>());
            }
            presets.get(OreType.ANCIENT_DEBRIS).add(new Preset(main.getConfig().getStringList("AncientDebris.presets." + key + ".biomes"),
                    main.getConfig().getInt("AncientDebris.presets." + key + ".minY"),
                    main.getConfig().getInt("AncientDebris.presets." + key + ".maxY"),
                    main.getConfig().getDouble("AncientDebris.presets." + key + ".chance")));
        }

    }

    public Material tryGetOre(Block block, Material pick) {

        return switch (block.getType()) {
            case STONE, DEEPSLATE -> {
                HashSet<OreType> enables = enableInWorlds.get(block.getWorld().getName());
                if (enables.isEmpty() || block.hasMetadata("empty")) yield null;

                if (enables.contains(OreType.COAL) && isRightPickaxe(OreType.COAL, pick)) {
                    for (Preset preset : presets.get(OreType.COAL)) {
                        if (preset.isCorrectBiome(block.getBiome().name()) && preset.isCorrectHeight(block.getY())) {
                            if (Utils.getRandom(preset.getChance())) {
                                yield convert(OreType.COAL, block.getType());
                            }
                            break;
                        }
                    }
                }
                if (enables.contains(OreType.COPPER) && isRightPickaxe(OreType.COPPER, pick)) {
                    for (Preset preset : presets.get(OreType.COPPER)) {
                        if (preset.isCorrectBiome(block.getBiome().name()) && preset.isCorrectHeight(block.getY())) {
                            if (Utils.getRandom(preset.getChance())) {
                                yield convert(OreType.COPPER, block.getType());
                            }
                            break;
                        }
                    }
                }
                if (enables.contains(OreType.IRON) && isRightPickaxe(OreType.IRON, pick)) {
                    for (Preset preset : presets.get(OreType.IRON)) {
                        if (preset.isCorrectBiome(block.getBiome().name()) && preset.isCorrectHeight(block.getY())) {
                            if (Utils.getRandom(preset.getChance())) {
                                yield convert(OreType.IRON, block.getType());
                            }
                            break;
                        }
                    }
                }
                if (enables.contains(OreType.GOLD) && isRightPickaxe(OreType.GOLD, pick)) {
                    for (Preset preset : presets.get(OreType.GOLD)) {
                        if (preset.isCorrectBiome(block.getBiome().name()) && preset.isCorrectHeight(block.getY())) {
                            if (Utils.getRandom(preset.getChance())) {
                                yield convert(OreType.GOLD, block.getType());
                            }
                            break;
                        }
                    }
                }
                if (enables.contains(OreType.REDSTONE) && isRightPickaxe(OreType.REDSTONE, pick)) {
                    for (Preset preset : presets.get(OreType.REDSTONE)) {
                        if (preset.isCorrectBiome(block.getBiome().name()) && preset.isCorrectHeight(block.getY())) {
                            if (Utils.getRandom(preset.getChance())) {
                                yield convert(OreType.REDSTONE, block.getType());
                            }
                            break;
                        }
                    }
                }
                if (enables.contains(OreType.EMERALD) && isRightPickaxe(OreType.EMERALD, pick)) {
                    for (Preset preset : presets.get(OreType.EMERALD)) {
                        if (preset.isCorrectBiome(block.getBiome().name()) && preset.isCorrectHeight(block.getY())) {
                            if (Utils.getRandom(preset.getChance())) {
                                yield convert(OreType.EMERALD, block.getType());
                            }
                            break;
                        }
                    }
                }
                if (enables.contains(OreType.LAPIS) && isRightPickaxe(OreType.LAPIS, pick)) {
                    for (Preset preset : presets.get(OreType.LAPIS)) {
                        if (preset.isCorrectBiome(block.getBiome().name()) && preset.isCorrectHeight(block.getY())) {
                            if (Utils.getRandom(preset.getChance())) {
                                yield convert(OreType.LAPIS, block.getType());
                            }
                            break;
                        }
                    }
                }
                if (enables.contains(OreType.DIAMOND) && isRightPickaxe(OreType.DIAMOND, pick)) {
                    for (Preset preset : presets.get(OreType.DIAMOND)) {
                        if (preset.isCorrectBiome(block.getBiome().name()) && preset.isCorrectHeight(block.getY())) {
                            if (Utils.getRandom(preset.getChance())) {
                                yield convert(OreType.DIAMOND, block.getType());
                            }
                            break;
                        }
                    }
                }

                yield null;
            }
            case NETHERRACK -> {
                HashSet<OreType> enables = enableInWorlds.get(block.getWorld().getName());
                if (enables.isEmpty() || block.hasMetadata("empty")) yield null;

                if (enables.contains(OreType.NETHER_GOLD) && isRightPickaxe(OreType.NETHER_GOLD, pick)) {
                    for (Preset preset : presets.get(OreType.NETHER_GOLD)) {
                        if (preset.isCorrectBiome(block.getBiome().name()) && preset.isCorrectHeight(block.getY())) {
                            if (Utils.getRandom(preset.getChance())) {
                                yield convert(OreType.NETHER_GOLD, block.getType());
                            }
                            break;
                        }
                    }
                }
                if (enables.contains(OreType.NETHER_QUARTZ) && isRightPickaxe(OreType.NETHER_QUARTZ, pick)) {
                    for (Preset preset : presets.get(OreType.NETHER_QUARTZ)) {
                        if (preset.isCorrectBiome(block.getBiome().name()) && preset.isCorrectHeight(block.getY())) {
                            if (Utils.getRandom(preset.getChance())) {
                                yield convert(OreType.NETHER_QUARTZ, block.getType());
                            }
                            break;
                        }
                    }
                }
                if (enables.contains(OreType.ANCIENT_DEBRIS) && isRightPickaxe(OreType.ANCIENT_DEBRIS, pick)) {
                    for (Preset preset : presets.get(OreType.ANCIENT_DEBRIS)) {
                        if (preset.isCorrectBiome(block.getBiome().name()) && preset.isCorrectHeight(block.getY())) {
                            if (Utils.getRandom(preset.getChance())) {
                                yield convert(OreType.ANCIENT_DEBRIS, block.getType());
                            }
                            break;
                        }
                    }
                }
                yield null;
            }
            case BLACKSTONE -> {
                HashSet<OreType> enables = enableInWorlds.get(block.getWorld().getName());
                if (enables.isEmpty() || block.hasMetadata("empty")) yield null;

                if (enables.contains(OreType.GILDED_BLACKSTONE) && block.getType() == Material.BLACKSTONE && isRightPickaxe(OreType.GILDED_BLACKSTONE, pick)) {
                    for (Preset preset : presets.get(OreType.GILDED_BLACKSTONE)) {
                        if (preset.isCorrectBiome(block.getBiome().name()) && preset.isCorrectHeight(block.getY())) {
                            if (Utils.getRandom(preset.getChance())) {
                                yield convert(OreType.GILDED_BLACKSTONE, block.getType());
                            }
                            break;
                        }
                    }
                }
                yield null;
            }
            default -> null;
        };
    }

    public boolean isRightPickaxe(OreType oreType, Material pick) {
        switch (oreType) {
            case COAL, NETHER_GOLD, GILDED_BLACKSTONE, NETHER_QUARTZ -> {
                return switch (pick) {
                    case WOODEN_PICKAXE, STONE_PICKAXE, IRON_PICKAXE, GOLDEN_PICKAXE, DIAMOND_PICKAXE, NETHERITE_PICKAXE -> true;
                    default -> false;
                };
            }
            case LAPIS, COPPER, IRON -> {
                return switch (pick) {
                    case STONE_PICKAXE, IRON_PICKAXE, DIAMOND_PICKAXE, NETHERITE_PICKAXE -> true;
                    default -> false;
                };
            }
            case GOLD, REDSTONE, EMERALD, DIAMOND -> {
                return switch (pick) {
                    case IRON_PICKAXE, DIAMOND_PICKAXE, NETHERITE_PICKAXE -> true;
                    default -> false;
                };
            }
            case ANCIENT_DEBRIS -> {
                return switch (pick) {
                    case DIAMOND_PICKAXE, NETHERITE_PICKAXE -> true;
                    default -> false;
                };
            }
            default -> {
                return false;
            }
        }
    }

    private Material convert(OreType oreType, Material material) {
        switch (material) {
            case STONE -> {
                return switch (oreType) {
                    case COAL -> Material.COAL_ORE;
                    case COPPER -> Material.COPPER_ORE;
                    case IRON -> Material.IRON_ORE;
                    case GOLD -> Material.GOLD_ORE;
                    case REDSTONE -> Material.REDSTONE_ORE;
                    case EMERALD -> Material.EMERALD_ORE;
                    case LAPIS -> Material.LAPIS_ORE;
                    case DIAMOND -> Material.DIAMOND_ORE;
                    default -> null;
                };
            }
            case DEEPSLATE -> {
                return switch (oreType) {
                    case COAL -> Material.DEEPSLATE_COAL_ORE;
                    case COPPER -> Material.DEEPSLATE_COPPER_ORE;
                    case IRON -> Material.DEEPSLATE_IRON_ORE;
                    case GOLD -> Material.DEEPSLATE_GOLD_ORE;
                    case REDSTONE -> Material.DEEPSLATE_REDSTONE_ORE;
                    case EMERALD -> Material.DEEPSLATE_EMERALD_ORE;
                    case LAPIS -> Material.DEEPSLATE_LAPIS_ORE;
                    case DIAMOND -> Material.DEEPSLATE_DIAMOND_ORE;
                    default -> null;
                };
            }
            case NETHERRACK -> {
                return switch (oreType) {
                    case NETHER_GOLD -> Material.NETHER_GOLD_ORE;
                    case NETHER_QUARTZ -> Material.NETHER_QUARTZ_ORE;
                    case ANCIENT_DEBRIS -> Material.ANCIENT_DEBRIS;
                    default -> null;
                };
            }
            case BLACKSTONE -> {
                if (oreType == OreType.GILDED_BLACKSTONE)
                    return Material.GILDED_BLACKSTONE;
                return null;
            }
            default -> {
                return null;
            }
        }
    }

}
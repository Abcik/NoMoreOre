package ua.abcik.nomoreore;

import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.block.*;
import org.bukkit.event.world.ChunkPopulateEvent;
import org.bukkit.metadata.FixedMetadataValue;

import java.util.HashSet;

public record Events(Main main) implements Listener {

    public Events(Main main) {
        this.main = main;
    }

    @EventHandler(priority = EventPriority.LOW)
    public void onChunkGenerate(ChunkPopulateEvent event) {
        if (!main.oreManager.noGenerateInWorlds.containsKey(event.getWorld().getName())) return;

        HashSet<Material> oresToRemove = main.oreManager.noGenerateInWorlds.get(event.getWorld().getName());
        if (oresToRemove.isEmpty()) return;

        if (event.getWorld().getEnvironment() == World.Environment.NORMAL) {
            int cX = event.getChunk().getX() * 16;
            int cZ = event.getChunk().getZ() * 16;

            for (int x = 0; x < 16; x++) {
                for (int z = 0; z < 16; z++) {
                    for (int y = -64; y < 320; y++) {
                        if (oresToRemove.contains(event.getWorld().getBlockAt(cX + x, y, cZ + z).getType())) {
                            switch (event.getWorld().getBlockAt(cX + x, y, cZ + z).getType()) {
                                case COAL_ORE, IRON_ORE, COPPER_ORE, GOLD_ORE, REDSTONE_ORE, EMERALD_ORE, LAPIS_ORE, DIAMOND_ORE -> {
                                    event.getWorld().getBlockAt(cX + x, y, cZ + z).setType(Material.STONE, false);
                                }
                                case DEEPSLATE_COAL_ORE, DEEPSLATE_IRON_ORE, DEEPSLATE_COPPER_ORE, DEEPSLATE_GOLD_ORE, DEEPSLATE_REDSTONE_ORE, DEEPSLATE_EMERALD_ORE, DEEPSLATE_LAPIS_ORE, DEEPSLATE_DIAMOND_ORE -> {
                                    event.getWorld().getBlockAt(cX + x, y, cZ + z).setType(Material.DEEPSLATE, false);
                                }
                            }
                        }
                    }
                }
            }
        } else {
            int cX = event.getChunk().getX() * 16;
            int cZ = event.getChunk().getZ() * 16;

            for (int x = 0; x < 16; x++) {
                for (int z = 0; z < 16; z++) {
                    for (int y = 0; y < 128; y++) {
                        if (oresToRemove.contains(event.getWorld().getBlockAt(cX + x, y, cZ + z).getType())) {
                            switch (event.getWorld().getBlockAt(cX + x, y, cZ + z).getType()) {
                                case NETHER_QUARTZ_ORE, NETHER_GOLD_ORE -> {
                                    event.getWorld().getBlockAt(cX + x, y, cZ + z).setType(Material.NETHERRACK, false);
                                }
                                case GILDED_BLACKSTONE -> {
                                    event.getWorld().getBlockAt(cX + x, y, cZ + z).setType(Material.BLACKSTONE, false);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @EventHandler(priority = EventPriority.LOW)
    public void onBlockBreak(BlockBreakEvent event) {
        Material material = main.oreManager.tryGetOre(event.getBlock(), event.getPlayer().getInventory().getItemInMainHand().getType());
        if (material != null) {
            event.getBlock().setType(material);
            switch (material) {
                case COAL_ORE, DEEPSLATE_COAL_ORE -> event.setExpToDrop(Utils.getRandom(0, 2));
                case REDSTONE_ORE, DEEPSLATE_REDSTONE_ORE -> event.setExpToDrop(Utils.getRandom(1, 5));
                case EMERALD_ORE, DEEPSLATE_EMERALD_ORE, DIAMOND_ORE, DEEPSLATE_DIAMOND_ORE -> event.setExpToDrop(Utils.getRandom(3, 7));
                case LAPIS_ORE, DEEPSLATE_LAPIS_ORE, NETHER_QUARTZ_ORE -> event.setExpToDrop(Utils.getRandom(2, 5));
                case NETHER_GOLD_ORE, GILDED_BLACKSTONE -> event.setExpToDrop(Utils.getRandom(0, 1));
            }
        }
    }

    @EventHandler(priority = EventPriority.LOW)
    public void onBlockPlace(BlockPlaceEvent event) {
        if (event.getBlock().getType() == Material.STONE || event.getBlock().getType() == Material.DEEPSLATE
                || event.getBlock().getType() == Material.NETHERRACK || event.getBlock().getType() == Material.BLACKSTONE) {
            event.getBlock().setMetadata("empty", new FixedMetadataValue(main, true));
        }
    }

}
package com.mineshaft.copperOxidationDisabler;

import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockFormEvent;

import java.util.List;

public class BlockListener implements Listener {

    private static final List<Material> blockedMaterials = List.of(
        Material.COPPER_BLOCK, Material.COPPER_GRATE, Material.COPPER_BULB, Material.COPPER_DOOR, Material.COPPER_TRAPDOOR, Material.CHISELED_COPPER, Material.CUT_COPPER, Material.CUT_COPPER_SLAB, Material.CUT_COPPER_STAIRS,
        Material.EXPOSED_COPPER, Material.EXPOSED_COPPER_GRATE, Material.EXPOSED_COPPER_BULB, Material.EXPOSED_COPPER_DOOR, Material.EXPOSED_COPPER_TRAPDOOR, Material.EXPOSED_CHISELED_COPPER, Material.EXPOSED_CUT_COPPER, Material.EXPOSED_CUT_COPPER_SLAB, Material.EXPOSED_CUT_COPPER_STAIRS,
        Material.WEATHERED_COPPER, Material.WEATHERED_COPPER_GRATE, Material.WEATHERED_COPPER_BULB, Material.WEATHERED_COPPER_DOOR, Material.WEATHERED_COPPER_TRAPDOOR, Material.WEATHERED_CHISELED_COPPER, Material.WEATHERED_CUT_COPPER, Material.WEATHERED_CUT_COPPER_SLAB, Material.WEATHERED_CUT_COPPER_STAIRS,
        Material.OXIDIZED_COPPER, Material.OXIDIZED_COPPER_GRATE, Material.OXIDIZED_COPPER_BULB, Material.OXIDIZED_COPPER_DOOR, Material.OXIDIZED_COPPER_TRAPDOOR, Material.OXIDIZED_CHISELED_COPPER, Material.OXIDIZED_CUT_COPPER, Material.OXIDIZED_CUT_COPPER_SLAB, Material.OXIDIZED_CUT_COPPER_STAIRS
    );

    @EventHandler
    void onBlockForm(BlockFormEvent e) {
        if(blockedMaterials.contains(e.getBlock().getType())) {
            e.setCancelled(true);
        }
    }
}

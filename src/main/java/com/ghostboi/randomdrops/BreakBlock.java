package com.ghostboi.randomdrops;

import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.inventory.ItemStack;

import java.util.Random;

public class BreakBlock implements Listener {

    @EventHandler
    public void onPlayerBreakBlock(BlockBreakEvent event){
        Block blockBroken = event.getBlock();

        Random rnd = new Random();
        int amount = rnd.nextInt(65);

        Block blockType = blockBroken;
        Material _blockType = blockType.getType();
        event.setCancelled(true);
        blockBroken.setType(Material.AIR);
        ItemStack drops = new ItemStack(_blockType, amount);
        blockBroken.getWorld().dropItemNaturally(blockBroken.getLocation(), drops);
    }
}

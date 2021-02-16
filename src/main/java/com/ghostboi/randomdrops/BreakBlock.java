package com.ghostboi.randomdrops;

import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.inventory.ItemStack;

import java.util.Random;

public class BreakBlock implements Listener {

    @EventHandler
    public void onPlayerBreakBlock(BlockBreakEvent event){
        Block blockBroken = event.getBlock();

        ItemStack inHand = event.getPlayer().getInventory().getItemInMainHand();

        Random rnd = new Random();
        int amount = rnd.nextInt(65);

        Block blockType = blockBroken;
        Material _blockType = blockType.getType();
        event.setCancelled(true);
        blockBroken.setType(Material.AIR);

        if(blockType.getType() == Material.STONE){
            if( (inHand.getType() == Material.DIAMOND_PICKAXE || inHand.getType() == Material.STONE_PICKAXE || inHand.getType() == Material.WOODEN_PICKAXE || inHand.getType() == Material.IRON_PICKAXE || inHand.getType() == Material.GOLDEN_PICKAXE || inHand.getType() == Material.NETHERITE_PICKAXE) && inHand.containsEnchantment(Enchantment.SILK_TOUCH)){
                ItemStack drops = new ItemStack(Material.STONE, amount);
                blockBroken.getWorld().dropItemNaturally(blockBroken.getLocation(), drops);
            }else{
                ItemStack drops = new ItemStack(Material.COBBLESTONE, amount);
                blockBroken.getWorld().dropItemNaturally(blockBroken.getLocation(), drops);
            }

        }else if(blockType.getType() == Material.GRASS_BLOCK){
            if( (inHand.getType() == Material.DIAMOND_SHOVEL || inHand.getType() == Material.STONE_SHOVEL || inHand.getType() == Material.WOODEN_SHOVEL || inHand.getType() == Material.IRON_SHOVEL || inHand.getType() == Material.GOLDEN_SHOVEL || inHand.getType() == Material.NETHERITE_SHOVEL) && inHand.containsEnchantment(Enchantment.SILK_TOUCH)){
                ItemStack drops = new ItemStack(Material.GRASS_BLOCK, amount);
                blockBroken.getWorld().dropItemNaturally(blockBroken.getLocation(), drops);
            }else{
                ItemStack drops = new ItemStack(Material.DIRT, amount);
                blockBroken.getWorld().dropItemNaturally(blockBroken.getLocation(), drops);
            }
        }else if(blockType.getType() == Material.DIAMOND_ORE){
            if( (inHand.getType() == Material.DIAMOND_PICKAXE || inHand.getType() == Material.STONE_PICKAXE || inHand.getType() == Material.WOODEN_PICKAXE || inHand.getType() == Material.IRON_PICKAXE || inHand.getType() == Material.GOLDEN_PICKAXE || inHand.getType() == Material.NETHERITE_PICKAXE) && inHand.containsEnchantment(Enchantment.SILK_TOUCH)){
                ItemStack drops = new ItemStack(Material.DIAMOND_ORE, amount);
                blockBroken.getWorld().dropItemNaturally(blockBroken.getLocation(), drops);
            }else{
                ItemStack drops = new ItemStack(Material.DIAMOND, amount);
                blockBroken.getWorld().dropItemNaturally(blockBroken.getLocation(), drops);
            }
        }else if(blockType.getType() == Material.COAL_ORE){
            if( (inHand.getType() == Material.DIAMOND_PICKAXE || inHand.getType() == Material.STONE_PICKAXE || inHand.getType() == Material.WOODEN_PICKAXE || inHand.getType() == Material.IRON_PICKAXE || inHand.getType() == Material.GOLDEN_PICKAXE || inHand.getType() == Material.NETHERITE_PICKAXE) && inHand.containsEnchantment(Enchantment.SILK_TOUCH)){
                ItemStack drops = new ItemStack(Material.COAL_ORE, amount);
                blockBroken.getWorld().dropItemNaturally(blockBroken.getLocation(), drops);
            }else{
                ItemStack drops = new ItemStack(Material.COAL, amount);
                blockBroken.getWorld().dropItemNaturally(blockBroken.getLocation(), drops);
            }
        }else if(blockType.getType() == Material.REDSTONE_ORE){
            if( (inHand.getType() == Material.DIAMOND_PICKAXE || inHand.getType() == Material.STONE_PICKAXE || inHand.getType() == Material.WOODEN_PICKAXE || inHand.getType() == Material.IRON_PICKAXE || inHand.getType() == Material.GOLDEN_PICKAXE || inHand.getType() == Material.NETHERITE_PICKAXE) && inHand.containsEnchantment(Enchantment.SILK_TOUCH)){
                ItemStack drops = new ItemStack(Material.REDSTONE_ORE, amount);
                blockBroken.getWorld().dropItemNaturally(blockBroken.getLocation(), drops);
            }else{
                ItemStack drops = new ItemStack(Material.REDSTONE, amount);
                blockBroken.getWorld().dropItemNaturally(blockBroken.getLocation(), drops);
            }
        }else if(blockType.getType() == Material.LAPIS_ORE){
            if( (inHand.getType() == Material.DIAMOND_PICKAXE || inHand.getType() == Material.STONE_PICKAXE  || inHand.getType() == Material.IRON_PICKAXE || inHand.getType() == Material.GOLDEN_PICKAXE || inHand.getType() == Material.NETHERITE_PICKAXE) && inHand.containsEnchantment(Enchantment.SILK_TOUCH)){
                ItemStack drops = new ItemStack(Material.LAPIS_ORE, amount);
                blockBroken.getWorld().dropItemNaturally(blockBroken.getLocation(), drops);
            }else{
                ItemStack drops = new ItemStack(Material.LAPIS_LAZULI, amount);
                blockBroken.getWorld().dropItemNaturally(blockBroken.getLocation(), drops);
            }
        }else if(blockType.getType() == Material.SNOW){
            if( (inHand.getType() == Material.DIAMOND_SHOVEL || inHand.getType() == Material.STONE_SHOVEL || inHand.getType() == Material.WOODEN_SHOVEL || inHand.getType() == Material.IRON_SHOVEL || inHand.getType() == Material.GOLDEN_SHOVEL || inHand.getType() == Material.NETHERITE_SHOVEL) && inHand.containsEnchantment(Enchantment.SILK_TOUCH)){
                ItemStack drops = new ItemStack(Material.SNOW, amount);
                blockBroken.getWorld().dropItemNaturally(blockBroken.getLocation(), drops);
            }else{
                ItemStack drops = new ItemStack(Material.SNOWBALL, amount);
                blockBroken.getWorld().dropItemNaturally(blockBroken.getLocation(), drops);
            }
        }else if(blockType.getType() == Material.SNOW_BLOCK){
            if( (inHand.getType() == Material.DIAMOND_SHOVEL || inHand.getType() == Material.STONE_SHOVEL || inHand.getType() == Material.WOODEN_SHOVEL || inHand.getType() == Material.IRON_SHOVEL || inHand.getType() == Material.GOLDEN_SHOVEL || inHand.getType() == Material.NETHERITE_SHOVEL) && inHand.containsEnchantment(Enchantment.SILK_TOUCH)){
                ItemStack drops = new ItemStack(Material.SNOW_BLOCK, amount);
                blockBroken.getWorld().dropItemNaturally(blockBroken.getLocation(), drops);
            }else{
                ItemStack drops = new ItemStack(Material.SNOWBALL, amount);
                blockBroken.getWorld().dropItemNaturally(blockBroken.getLocation(), drops);
            }
        }else if(blockType.getType() == Material.ENDER_CHEST){
            if( (inHand.getType() == Material.DIAMOND_PICKAXE || inHand.getType() == Material.STONE_PICKAXE  || inHand.getType() == Material.IRON_PICKAXE || inHand.getType() == Material.GOLDEN_PICKAXE || inHand.getType() == Material.NETHERITE_PICKAXE) && inHand.containsEnchantment(Enchantment.SILK_TOUCH)){
                ItemStack drops = new ItemStack(Material.ENDER_CHEST, amount);
                blockBroken.getWorld().dropItemNaturally(blockBroken.getLocation(), drops);
            }else{
                ItemStack drops = new ItemStack(Material.OBSIDIAN, amount);
                blockBroken.getWorld().dropItemNaturally(blockBroken.getLocation(), drops);
            }
        }else if(blockType.getType() == Material.NETHER_GOLD_ORE){
            if( (inHand.getType() == Material.DIAMOND_PICKAXE || inHand.getType() == Material.STONE_PICKAXE || inHand.getType() == Material.WOODEN_PICKAXE || inHand.getType() == Material.IRON_PICKAXE || inHand.getType() == Material.GOLDEN_PICKAXE || inHand.getType() == Material.NETHERITE_PICKAXE) && inHand.containsEnchantment(Enchantment.SILK_TOUCH)){
                ItemStack drops = new ItemStack(Material.NETHER_GOLD_ORE, amount);
                blockBroken.getWorld().dropItemNaturally(blockBroken.getLocation(), drops);
            }else{
                ItemStack drops = new ItemStack(Material.GOLD_NUGGET, amount);
                blockBroken.getWorld().dropItemNaturally(blockBroken.getLocation(), drops);
            }
        }else if(blockType.getType() == Material.NETHER_QUARTZ_ORE){
            if( (inHand.getType() == Material.DIAMOND_PICKAXE || inHand.getType() == Material.STONE_PICKAXE || inHand.getType() == Material.WOODEN_PICKAXE || inHand.getType() == Material.IRON_PICKAXE || inHand.getType() == Material.GOLDEN_PICKAXE || inHand.getType() == Material.NETHERITE_PICKAXE) && inHand.containsEnchantment(Enchantment.SILK_TOUCH)){
                ItemStack drops = new ItemStack(Material.NETHER_QUARTZ_ORE, amount);
                blockBroken.getWorld().dropItemNaturally(blockBroken.getLocation(), drops);
            }else{
                ItemStack drops = new ItemStack(Material.QUARTZ, amount);
                blockBroken.getWorld().dropItemNaturally(blockBroken.getLocation(), drops);
            }
        }else if(blockType.getType() == Material.CRIMSON_NYLIUM){
            if( (inHand.getType() == Material.DIAMOND_PICKAXE || inHand.getType() == Material.STONE_PICKAXE || inHand.getType() == Material.WOODEN_PICKAXE || inHand.getType() == Material.IRON_PICKAXE || inHand.getType() == Material.GOLDEN_PICKAXE || inHand.getType() == Material.NETHERITE_PICKAXE) && inHand.containsEnchantment(Enchantment.SILK_TOUCH)){
                ItemStack drops = new ItemStack(Material.CRIMSON_NYLIUM, amount);
                blockBroken.getWorld().dropItemNaturally(blockBroken.getLocation(), drops);
            }else{
                ItemStack drops = new ItemStack(Material.NETHERRACK, amount);
                blockBroken.getWorld().dropItemNaturally(blockBroken.getLocation(), drops);
            }
        }else if(blockType.getType() == Material.WARPED_NYLIUM){
            if( (inHand.getType() == Material.DIAMOND_PICKAXE || inHand.getType() == Material.STONE_PICKAXE || inHand.getType() == Material.WOODEN_PICKAXE || inHand.getType() == Material.IRON_PICKAXE || inHand.getType() == Material.GOLDEN_PICKAXE || inHand.getType() == Material.NETHERITE_PICKAXE) && inHand.containsEnchantment(Enchantment.SILK_TOUCH)){
                ItemStack drops = new ItemStack(Material.WARPED_NYLIUM, amount);
                blockBroken.getWorld().dropItemNaturally(blockBroken.getLocation(), drops);
            }else{
                ItemStack drops = new ItemStack(Material.NETHERRACK, amount);
                blockBroken.getWorld().dropItemNaturally(blockBroken.getLocation(), drops);
            }
        }else if(blockType.getType() == Material.EMERALD_ORE) {
            if ((inHand.getType() == Material.DIAMOND_PICKAXE || inHand.getType() == Material.IRON_PICKAXE || inHand.getType() == Material.GOLDEN_PICKAXE || inHand.getType() == Material.NETHERITE_PICKAXE) && inHand.containsEnchantment(Enchantment.SILK_TOUCH)) {
                ItemStack drops = new ItemStack(Material.EMERALD_ORE, amount);
                blockBroken.getWorld().dropItemNaturally(blockBroken.getLocation(), drops);
            } else {
                ItemStack drops = new ItemStack(Material.EMERALD, amount);
                blockBroken.getWorld().dropItemNaturally(blockBroken.getLocation(), drops);
            }
        }else if(blockType.getType() == Material.BEE_NEST){
            if( (inHand.getType() == Material.DIAMOND_PICKAXE || inHand.getType() == Material.STONE_PICKAXE || inHand.getType() == Material.WOODEN_PICKAXE || inHand.getType() == Material.IRON_PICKAXE || inHand.getType() == Material.GOLDEN_PICKAXE || inHand.getType() == Material.NETHERITE_PICKAXE) && inHand.containsEnchantment(Enchantment.SILK_TOUCH)){
                ItemStack drops = new ItemStack(Material.BEE_NEST, amount);
                blockBroken.getWorld().dropItemNaturally(blockBroken.getLocation(), drops);
            }
        }else if(blockType.getType() == Material.BEEHIVE){
            if( (inHand.getType() == Material.DIAMOND_PICKAXE || inHand.getType() == Material.STONE_PICKAXE || inHand.getType() == Material.WOODEN_PICKAXE || inHand.getType() == Material.IRON_PICKAXE || inHand.getType() == Material.GOLDEN_PICKAXE || inHand.getType() == Material.NETHERITE_PICKAXE) && inHand.containsEnchantment(Enchantment.SILK_TOUCH)){
                ItemStack drops = new ItemStack(Material.BEEHIVE, amount);
                blockBroken.getWorld().dropItemNaturally(blockBroken.getLocation(), drops);
            }else{
                ItemStack drops = new ItemStack(Material.BEEHIVE, amount);
                blockBroken.getWorld().dropItemNaturally(blockBroken.getLocation(), drops);
            }
        }else if(blockType.getType() == Material.BLUE_ICE){
            if(inHand.containsEnchantment(Enchantment.SILK_TOUCH)){
                ItemStack drops = new ItemStack(Material.BLUE_ICE, amount);
                blockBroken.getWorld().dropItemNaturally(blockBroken.getLocation(), drops);
            }
        }else if(blockType.getType() == Material.BOOKSHELF){
            if(inHand.containsEnchantment(Enchantment.SILK_TOUCH)){
                ItemStack drops = new ItemStack(Material.BOOKSHELF, amount);
                blockBroken.getWorld().dropItemNaturally(blockBroken.getLocation(), drops);
            }else{
                ItemStack drops = new ItemStack(Material.BOOK, amount);
                blockBroken.getWorld().dropItemNaturally(blockBroken.getLocation(), drops);
            }
        }else if(blockType.getType() == Material.CAMPFIRE){
            if(inHand.containsEnchantment(Enchantment.SILK_TOUCH)){
                ItemStack drops = new ItemStack(Material.CAMPFIRE, amount);
                blockBroken.getWorld().dropItemNaturally(blockBroken.getLocation(), drops);
            }else{
                ItemStack drops = new ItemStack(Material.CHARCOAL, amount);
                blockBroken.getWorld().dropItemNaturally(blockBroken.getLocation(), drops);
            }
        }else if(blockType.getType() == Material.CLAY){
            if(inHand.containsEnchantment(Enchantment.SILK_TOUCH)){
                ItemStack drops = new ItemStack(Material.CLAY, amount);
                blockBroken.getWorld().dropItemNaturally(blockBroken.getLocation(), drops);
            }else{
                ItemStack drops = new ItemStack(Material.CLAY_BALL, amount);
                blockBroken.getWorld().dropItemNaturally(blockBroken.getLocation(), drops);
            }
        }else if(blockType.getType() == Material.GLASS){
            if(inHand.containsEnchantment(Enchantment.SILK_TOUCH)){
                ItemStack drops = new ItemStack(Material.GLASS, amount);
                blockBroken.getWorld().dropItemNaturally(blockBroken.getLocation(), drops);
            }
        }else if( blockType.getType() == Material.WHITE_STAINED_GLASS){
            if(inHand.containsEnchantment(Enchantment.SILK_TOUCH)){
                ItemStack drops = new ItemStack(Material.WHITE_STAINED_GLASS, amount);
                blockBroken.getWorld().dropItemNaturally(blockBroken.getLocation(), drops);
            }
        }else if( blockType.getType() == Material.RED_STAINED_GLASS){
            if(inHand.containsEnchantment(Enchantment.SILK_TOUCH)){
                ItemStack drops = new ItemStack(Material.RED_STAINED_GLASS, amount);
                blockBroken.getWorld().dropItemNaturally(blockBroken.getLocation(), drops);
            }
        }else if( blockType.getType() == Material.ORANGE_STAINED_GLASS){
            if(inHand.containsEnchantment(Enchantment.SILK_TOUCH)){
                ItemStack drops = new ItemStack(Material.ORANGE_STAINED_GLASS, amount);
                blockBroken.getWorld().dropItemNaturally(blockBroken.getLocation(), drops);
            }
        }else if( blockType.getType() == Material.PINK_STAINED_GLASS){
            if(inHand.containsEnchantment(Enchantment.SILK_TOUCH)){
                ItemStack drops = new ItemStack(Material.PINK_STAINED_GLASS, amount);
                blockBroken.getWorld().dropItemNaturally(blockBroken.getLocation(), drops);
            }
        }else if( blockType.getType() == Material.YELLOW_STAINED_GLASS){
            if(inHand.containsEnchantment(Enchantment.SILK_TOUCH)){
                ItemStack drops = new ItemStack(Material.YELLOW_STAINED_GLASS, amount);
                blockBroken.getWorld().dropItemNaturally(blockBroken.getLocation(), drops);
            }
        }else if( blockType.getType() == Material.LIME_STAINED_GLASS){
            if(inHand.containsEnchantment(Enchantment.SILK_TOUCH)){
                ItemStack drops = new ItemStack(Material.LIME_STAINED_GLASS, amount);
                blockBroken.getWorld().dropItemNaturally(blockBroken.getLocation(), drops);
            }
        }else if( blockType.getType() == Material.GREEN_STAINED_GLASS){
            if(inHand.containsEnchantment(Enchantment.SILK_TOUCH)){
                ItemStack drops = new ItemStack(Material.GREEN_STAINED_GLASS, amount);
                blockBroken.getWorld().dropItemNaturally(blockBroken.getLocation(), drops);
            }
        }else if( blockType.getType() == Material.LIGHT_BLUE_STAINED_GLASS){
            if(inHand.containsEnchantment(Enchantment.SILK_TOUCH)){
                ItemStack drops = new ItemStack(Material.LIGHT_BLUE_STAINED_GLASS, amount);
                blockBroken.getWorld().dropItemNaturally(blockBroken.getLocation(), drops);
            }
        }else if( blockType.getType() == Material.CYAN_STAINED_GLASS){
            if(inHand.containsEnchantment(Enchantment.SILK_TOUCH)){
                ItemStack drops = new ItemStack(Material.CYAN_STAINED_GLASS, amount);
                blockBroken.getWorld().dropItemNaturally(blockBroken.getLocation(), drops);
            }
        }else if( blockType.getType() == Material.BLUE_STAINED_GLASS){
            if(inHand.containsEnchantment(Enchantment.SILK_TOUCH)){
                ItemStack drops = new ItemStack(Material.BLUE_STAINED_GLASS, amount);
                blockBroken.getWorld().dropItemNaturally(blockBroken.getLocation(), drops);
            }
        }else if( blockType.getType() == Material.MAGENTA_STAINED_GLASS){
            if(inHand.containsEnchantment(Enchantment.SILK_TOUCH)){
                ItemStack drops = new ItemStack(Material.MAGENTA_STAINED_GLASS, amount);
                blockBroken.getWorld().dropItemNaturally(blockBroken.getLocation(), drops);
            }
        }else if( blockType.getType() == Material.PURPLE_STAINED_GLASS){
            if(inHand.containsEnchantment(Enchantment.SILK_TOUCH)){
                ItemStack drops = new ItemStack(Material.PURPLE_STAINED_GLASS, amount);
                blockBroken.getWorld().dropItemNaturally(blockBroken.getLocation(), drops);
            }
        }else if( blockType.getType() == Material.BROWN_STAINED_GLASS){
            if(inHand.containsEnchantment(Enchantment.SILK_TOUCH)){
                ItemStack drops = new ItemStack(Material.BROWN_STAINED_GLASS, amount);
                blockBroken.getWorld().dropItemNaturally(blockBroken.getLocation(), drops);
            }
        }else if( blockType.getType() == Material.GRAY_STAINED_GLASS){
            if(inHand.containsEnchantment(Enchantment.SILK_TOUCH)){
                ItemStack drops = new ItemStack(Material.GRAY_STAINED_GLASS, amount);
                blockBroken.getWorld().dropItemNaturally(blockBroken.getLocation(), drops);
            }
        }else if( blockType.getType() == Material.LIGHT_GRAY_STAINED_GLASS){
            if(inHand.containsEnchantment(Enchantment.SILK_TOUCH)){
                ItemStack drops = new ItemStack(Material.LIGHT_GRAY_STAINED_GLASS, amount);
                blockBroken.getWorld().dropItemNaturally(blockBroken.getLocation(), drops);
            }
        }else if( blockType.getType() == Material.BLACK_STAINED_GLASS){
            if(inHand.containsEnchantment(Enchantment.SILK_TOUCH)){
                ItemStack drops = new ItemStack(Material.BLACK_STAINED_GLASS, amount);
                blockBroken.getWorld().dropItemNaturally(blockBroken.getLocation(), drops);
            }
        }else if(blockType.getType() == Material.GLASS_PANE){
            if(inHand.containsEnchantment(Enchantment.SILK_TOUCH)){
                ItemStack drops = new ItemStack(Material.GLASS_PANE, amount);
                blockBroken.getWorld().dropItemNaturally(blockBroken.getLocation(), drops);
            }
        }else if( blockType.getType() == Material.WHITE_STAINED_GLASS_PANE){
            if(inHand.containsEnchantment(Enchantment.SILK_TOUCH)){
                ItemStack drops = new ItemStack(Material.WHITE_STAINED_GLASS_PANE, amount);
                blockBroken.getWorld().dropItemNaturally(blockBroken.getLocation(), drops);
            }
        }else if( blockType.getType() == Material.RED_STAINED_GLASS_PANE){
            if(inHand.containsEnchantment(Enchantment.SILK_TOUCH)){
                ItemStack drops = new ItemStack(Material.RED_STAINED_GLASS_PANE, amount);
                blockBroken.getWorld().dropItemNaturally(blockBroken.getLocation(), drops);
            }
        }else if( blockType.getType() == Material.ORANGE_STAINED_GLASS_PANE){
            if(inHand.containsEnchantment(Enchantment.SILK_TOUCH)){
                ItemStack drops = new ItemStack(Material.ORANGE_STAINED_GLASS_PANE, amount);
                blockBroken.getWorld().dropItemNaturally(blockBroken.getLocation(), drops);
            }
        }else if( blockType.getType() == Material.PINK_STAINED_GLASS_PANE){
            if(inHand.containsEnchantment(Enchantment.SILK_TOUCH)){
                ItemStack drops = new ItemStack(Material.PINK_STAINED_GLASS_PANE, amount);
                blockBroken.getWorld().dropItemNaturally(blockBroken.getLocation(), drops);
            }
        }else if( blockType.getType() == Material.YELLOW_STAINED_GLASS_PANE){
            if(inHand.containsEnchantment(Enchantment.SILK_TOUCH)){
                ItemStack drops = new ItemStack(Material.YELLOW_STAINED_GLASS_PANE, amount);
                blockBroken.getWorld().dropItemNaturally(blockBroken.getLocation(), drops);
            }
        }else if( blockType.getType() == Material.LIME_STAINED_GLASS_PANE){
            if(inHand.containsEnchantment(Enchantment.SILK_TOUCH)){
                ItemStack drops = new ItemStack(Material.LIME_STAINED_GLASS_PANE, amount);
                blockBroken.getWorld().dropItemNaturally(blockBroken.getLocation(), drops);
            }
        }else if( blockType.getType() == Material.GREEN_STAINED_GLASS_PANE){
            if(inHand.containsEnchantment(Enchantment.SILK_TOUCH)){
                ItemStack drops = new ItemStack(Material.GREEN_STAINED_GLASS_PANE, amount);
                blockBroken.getWorld().dropItemNaturally(blockBroken.getLocation(), drops);
            }
        }else if( blockType.getType() == Material.LIGHT_BLUE_STAINED_GLASS_PANE){
            if(inHand.containsEnchantment(Enchantment.SILK_TOUCH)){
                ItemStack drops = new ItemStack(Material.LIGHT_BLUE_STAINED_GLASS_PANE, amount);
                blockBroken.getWorld().dropItemNaturally(blockBroken.getLocation(), drops);
            }
        }else if( blockType.getType() == Material.CYAN_STAINED_GLASS_PANE){
            if(inHand.containsEnchantment(Enchantment.SILK_TOUCH)){
                ItemStack drops = new ItemStack(Material.CYAN_STAINED_GLASS_PANE, amount);
                blockBroken.getWorld().dropItemNaturally(blockBroken.getLocation(), drops);
            }
        }else if( blockType.getType() == Material.BLUE_STAINED_GLASS_PANE){
            if(inHand.containsEnchantment(Enchantment.SILK_TOUCH)){
                ItemStack drops = new ItemStack(Material.BLUE_STAINED_GLASS_PANE, amount);
                blockBroken.getWorld().dropItemNaturally(blockBroken.getLocation(), drops);
            }
        }else if( blockType.getType() == Material.MAGENTA_STAINED_GLASS_PANE){
            if(inHand.containsEnchantment(Enchantment.SILK_TOUCH)){
                ItemStack drops = new ItemStack(Material.MAGENTA_STAINED_GLASS_PANE, amount);
                blockBroken.getWorld().dropItemNaturally(blockBroken.getLocation(), drops);
            }
        }else if( blockType.getType() == Material.PURPLE_STAINED_GLASS_PANE){
            if(inHand.containsEnchantment(Enchantment.SILK_TOUCH)){
                ItemStack drops = new ItemStack(Material.PURPLE_STAINED_GLASS_PANE, amount);
                blockBroken.getWorld().dropItemNaturally(blockBroken.getLocation(), drops);
            }
        }else if( blockType.getType() == Material.BROWN_STAINED_GLASS_PANE){
            if(inHand.containsEnchantment(Enchantment.SILK_TOUCH)){
                ItemStack drops = new ItemStack(Material.BROWN_STAINED_GLASS_PANE, amount);
                blockBroken.getWorld().dropItemNaturally(blockBroken.getLocation(), drops);
            }
        }else if( blockType.getType() == Material.GRAY_STAINED_GLASS_PANE){
            if(inHand.containsEnchantment(Enchantment.SILK_TOUCH)){
                ItemStack drops = new ItemStack(Material.GRAY_STAINED_GLASS_PANE, amount);
                blockBroken.getWorld().dropItemNaturally(blockBroken.getLocation(), drops);
            }
        }else if( blockType.getType() == Material.LIGHT_GRAY_STAINED_GLASS_PANE){
            if(inHand.containsEnchantment(Enchantment.SILK_TOUCH)){
                ItemStack drops = new ItemStack(Material.LIGHT_GRAY_STAINED_GLASS_PANE, amount);
                blockBroken.getWorld().dropItemNaturally(blockBroken.getLocation(), drops);
            }
        }else if( blockType.getType() == Material.BLACK_STAINED_GLASS_PANE){
            if(inHand.containsEnchantment(Enchantment.SILK_TOUCH)){
                ItemStack drops = new ItemStack(Material.BLACK_STAINED_GLASS_PANE, amount);
                blockBroken.getWorld().dropItemNaturally(blockBroken.getLocation(), drops);
            }
        }else if(blockType.getType() == Material.GLOWSTONE) {
            if (inHand.containsEnchantment(Enchantment.SILK_TOUCH)) {
                ItemStack drops = new ItemStack(Material.GLOWSTONE, amount);
                blockBroken.getWorld().dropItemNaturally(blockBroken.getLocation(), drops);
            } else {
                ItemStack drops = new ItemStack(Material.GLOWSTONE_DUST, amount);
                blockBroken.getWorld().dropItemNaturally(blockBroken.getLocation(), drops);
            }
        }else if(blockType.getType() == Material.ICE) {
            if (inHand.containsEnchantment(Enchantment.SILK_TOUCH)) {
                ItemStack drops = new ItemStack(Material.ICE, amount);
                blockBroken.getWorld().dropItemNaturally(blockBroken.getLocation(), drops);
            }
        }else if(blockType.getType() == Material.MELON) {
            if (inHand.containsEnchantment(Enchantment.SILK_TOUCH)) {
                ItemStack drops = new ItemStack(Material.MELON, amount);
                blockBroken.getWorld().dropItemNaturally(blockBroken.getLocation(), drops);
            } else {
                ItemStack drops = new ItemStack(Material.MELON_SLICE, amount);
                blockBroken.getWorld().dropItemNaturally(blockBroken.getLocation(), drops);
            }
        }else if(blockType.getType() == Material.BROWN_MUSHROOM_BLOCK) {
            if (inHand.containsEnchantment(Enchantment.SILK_TOUCH)) {
                ItemStack drops = new ItemStack(Material.BROWN_MUSHROOM_BLOCK, amount);
                blockBroken.getWorld().dropItemNaturally(blockBroken.getLocation(), drops);
            } else {
                ItemStack drops = new ItemStack(Material.BROWN_MUSHROOM, amount);
                blockBroken.getWorld().dropItemNaturally(blockBroken.getLocation(), drops);
            }
        }else if(blockType.getType() == Material.RED_MUSHROOM) {
            if (inHand.containsEnchantment(Enchantment.SILK_TOUCH)) {
                ItemStack drops = new ItemStack(Material.RED_MUSHROOM, amount);
                blockBroken.getWorld().dropItemNaturally(blockBroken.getLocation(), drops);
            } else {
                ItemStack drops = new ItemStack(Material.RED_MUSHROOM_BLOCK, amount);
                blockBroken.getWorld().dropItemNaturally(blockBroken.getLocation(), drops);
            }
        }else if(blockType.getType() == Material.MYCELIUM) {
            if (inHand.containsEnchantment(Enchantment.SILK_TOUCH)) {
                ItemStack drops = new ItemStack(Material.MYCELIUM, amount);
                blockBroken.getWorld().dropItemNaturally(blockBroken.getLocation(), drops);
            } else {
                ItemStack drops = new ItemStack(Material.DIRT, amount);
                blockBroken.getWorld().dropItemNaturally(blockBroken.getLocation(), drops);
            }
        }else if(blockType.getType() == Material.PACKED_ICE) {
            if (inHand.containsEnchantment(Enchantment.SILK_TOUCH)) {
                ItemStack drops = new ItemStack(Material.PACKED_ICE, amount);
                blockBroken.getWorld().dropItemNaturally(blockBroken.getLocation(), drops);
            }
        }else if(blockType.getType() == Material.PODZOL) {
            if (inHand.containsEnchantment(Enchantment.SILK_TOUCH)) {
                ItemStack drops = new ItemStack(Material.PODZOL, amount);
                blockBroken.getWorld().dropItemNaturally(blockBroken.getLocation(), drops);
            } else {
                ItemStack drops = new ItemStack(Material.DIRT, amount);
                blockBroken.getWorld().dropItemNaturally(blockBroken.getLocation(), drops);
            }
        }else if(blockType.getType() == Material.SEA_LANTERN) {
            if (inHand.containsEnchantment(Enchantment.SILK_TOUCH)) {
                ItemStack drops = new ItemStack(Material.SEA_LANTERN, amount);
                blockBroken.getWorld().dropItemNaturally(blockBroken.getLocation(), drops);
            } else {
                ItemStack drops = new ItemStack(Material.PRISMARINE_CRYSTALS, amount);
                blockBroken.getWorld().dropItemNaturally(blockBroken.getLocation(), drops);
            }
        }else if(blockType.getType() == Material.SOUL_CAMPFIRE) {
            if (inHand.containsEnchantment(Enchantment.SILK_TOUCH)) {
                ItemStack drops = new ItemStack(Material.SOUL_CAMPFIRE, amount);
                blockBroken.getWorld().dropItemNaturally(blockBroken.getLocation(), drops);
            } else {
                ItemStack drops = new ItemStack(Material.SOUL_SOIL, amount);
                blockBroken.getWorld().dropItemNaturally(blockBroken.getLocation(), drops);
            }
        }else if(blockType.getType() == Material.TURTLE_EGG) {
            if (inHand.containsEnchantment(Enchantment.SILK_TOUCH)) {
                ItemStack drops = new ItemStack(Material.TURTLE_EGG, amount);
                blockBroken.getWorld().dropItemNaturally(blockBroken.getLocation(), drops);
            }
        }else if(blockType.getType() == Material.BEETROOTS) {
            ItemStack _drops = new ItemStack(Material.BEETROOT_SEEDS, amount);
            blockBroken.getWorld().dropItemNaturally(blockBroken.getLocation(), _drops);
            ItemStack drops = new ItemStack(Material.BEETROOT, amount);
            blockBroken.getWorld().dropItemNaturally(blockBroken.getLocation(), drops);
        }else if(blockType.getType() == Material.CARROTS) {
            ItemStack _drops = new ItemStack(Material.CARROT, amount);
            blockBroken.getWorld().dropItemNaturally(blockBroken.getLocation(), _drops);
        }else if(blockType.getType() == Material.MELON_STEM) {
            ItemStack _drops = new ItemStack(Material.MELON_SEEDS, amount);
            blockBroken.getWorld().dropItemNaturally(blockBroken.getLocation(), _drops);
        }else if(blockType.getType() == Material.PUMPKIN_STEM) {
            ItemStack _drops = new ItemStack(Material.PUMPKIN_SEEDS, amount);
            blockBroken.getWorld().dropItemNaturally(blockBroken.getLocation(), _drops);
        }else if(blockType.getType() == Material.WHEAT) {
            ItemStack _drops = new ItemStack(Material.WHEAT_SEEDS, amount);
            blockBroken.getWorld().dropItemNaturally(blockBroken.getLocation(), _drops);
            ItemStack drops = new ItemStack(Material.WHEAT, amount);
            blockBroken.getWorld().dropItemNaturally(blockBroken.getLocation(), drops);
        }
        else{
            ItemStack drops = new ItemStack(_blockType, amount);
            blockBroken.getWorld().dropItemNaturally(blockBroken.getLocation(), drops);
        }


    }
}

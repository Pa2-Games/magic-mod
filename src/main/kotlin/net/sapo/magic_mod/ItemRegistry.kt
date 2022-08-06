package net.sapo.magic_mod

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder
import net.fabricmc.fabric.api.item.v1.FabricItemSettings
import net.fabricmc.fabric.api.`object`.builder.v1.block.FabricBlockSettings
import net.minecraft.block.Block
import net.minecraft.block.Material
import net.minecraft.item.BlockItem
import net.minecraft.item.Item
import net.minecraft.item.ItemGroup
import net.minecraft.util.Identifier
import net.minecraft.util.registry.Registry


class ItemRegistry {
    companion object {
        // Items
        val GEM = Item(FabricItemSettings().group(Main.ITEM_GROUP))
        val RED_GEM = Item(FabricItemSettings().group(Main.ITEM_GROUP))

        // Blocks
        val GEM_ORE = Block(FabricBlockSettings.of(Material.AMETHYST).strength(4.0f))
    }

    fun RegisterItems(){
        Registry.register(Registry.ITEM, Identifier(Main.MODID, "gem"), Companion.GEM)
        Registry.register(Registry.ITEM, Identifier(Main.MODID, "red_gem"), Companion.RED_GEM)
    }

    fun RegisterBlock(){
        Registry.register(Registry.BLOCK, Identifier(Main.MODID, "gem_ore"), GEM_ORE)
        Registry.register(Registry.ITEM, Identifier(Main.MODID, "gem_ore"), BlockItem(GEM_ORE, FabricItemSettings().group(Main.ITEM_GROUP)))
    }
}
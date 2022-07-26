package net.sapo.magic_mod

import net.fabricmc.api.ModInitializer
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder
import net.minecraft.item.ItemStack
import net.minecraft.item.Items
import net.minecraft.util.Identifier
import java.util.function.Supplier

class Main : ModInitializer{
    companion object{
        val MODID = "magicmod"
        val ITEM_GROUP = FabricItemGroupBuilder.create(
            Identifier(MODID, "magic_stuff")
        )
            .icon{ ItemStack(Items.EXPERIENCE_BOTTLE) }
            .build()
    }

    override fun onInitialize() {
        // Register custom items
        val ir = ItemRegistry()
        ir.RegisterItems()
        ir.RegisterBlock()
    }
}

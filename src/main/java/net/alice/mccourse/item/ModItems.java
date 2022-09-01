package net.alice.mccourse.item;

import net.alice.mccourse.MCCourseMod;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    public static final Item ORICAHLCUM_INGOT = registerItem("orichalcum_ingot",
            new Item(new FabricItemSettings().group(ItemGroup.MISC)));

    public static final Item ORICAHLCUM_NUGGET = registerItem("orichalcum_nugget",
            new Item(new FabricItemSettings().group(ItemGroup.MISC)));

    // This call is a helper method that will register the item under our namespace AKA our MOD ID
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(MCCourseMod.MOD_ID, name), item);
    }

    // Will be called inside onInitialize method to initialize the static items in MCCourseMod.java
    // that we have in this class, needed otherwise the items will not be properly registered
    public static void registerModItems() {
        System.out.println("Registering Mod Items for " + MCCourseMod.MOD_ID);
    }

}

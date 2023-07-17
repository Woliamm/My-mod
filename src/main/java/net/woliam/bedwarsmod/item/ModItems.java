package net.woliam.bedwarsmod.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.woliam.bedwarsmod.BedwarsMod;
import net.woliam.bedwarsmod.item.custom.FireballItem;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, BedwarsMod.MODID);

    public static final RegistryObject<Item> FIREBALL = ITEMS.register("fireball",
            () -> new FireballItem(new Item.Properties().stacksTo(16)));

    public static final RegistryObject<Item> SNOWBALL = ITEMS.register("snowball",
            () -> new Item(new Item.Properties().stacksTo(16)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}

package net.sveklich.mptmod.item;

import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.sveklich.mptmod.MptMod;
import net.sveklich.mptmod.armor.ModArmors;


public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
    DeferredRegister.create(ForgeRegistries.ITEMS, MptMod.MOD_ID);

    public static RegistryObject<Item> AMBER = ITEMS.register("amber",
            ()-> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    public static RegistryObject<Item> AMBERRAW = ITEMS.register("amber_raw",
            ()-> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    public static RegistryObject<Item> AMBER_HELMET = ITEMS.register ("amber_helmet",
            () -> new ArmorItem(ModArmors.AMBER, EquipmentSlot.HEAD,
                    new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    public static RegistryObject<Item> AMBER_LEGGING = ITEMS.register ("amber_legging",
            () -> new ArmorItem(ModArmors.AMBER, EquipmentSlot.LEGS,
                    new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    public static RegistryObject<Item> AMBER_CHESTPLATE = ITEMS.register ("amber_chestplate",
            () -> new ArmorItem(ModArmors.AMBER, EquipmentSlot.CHEST,
                    new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    public static RegistryObject<Item> AMBER_BOOTS = ITEMS.register ("amber_boots",
            () -> new ArmorItem(ModArmors.AMBER, EquipmentSlot.FEET,
                    new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    public static RegistryObject<Item> AMBER_SWORD = ITEMS.register ("amber_sword",
            () -> new SwordItem(ModTiers.AMBER, 2, 3f,
                    new Item.Properties().tab(ModCreativeItemTab.MPT_TAB)));
    public static RegistryObject<Item> AMBER_AXE = ITEMS.register ("amber_axe",
            () -> new AxeItem(ModTiers.AMBER, 4, 0f,
                    new Item.Properties().tab(ModCreativeItemTab.MPT_TAB)));

    public static RegistryObject<Item> AMBER_PICKAXE = ITEMS.register ("amber_pickaxe",
            () -> new PickaxeItem(ModTiers.AMBER, 1, 1f,
                    new Item.Properties().tab(ModCreativeItemTab.MPT_TAB)));
    public static RegistryObject<Item> AMBER_HOE = ITEMS.register ("amber_hoe",
            () -> new HoeItem(ModTiers.AMBER, 0, 0f,
                    new Item.Properties().tab(ModCreativeItemTab.MPT_TAB)));

    public static RegistryObject<Item> AMBER_SHOVEL = ITEMS.register ("amber_shovel",
            () -> new ShovelItem(ModTiers.AMBER, 0, 1f,
                    new Item.Properties().tab(ModCreativeItemTab.MPT_TAB)));
    
    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}

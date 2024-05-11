package com.magistuarmory.addon.item;

import dev.architectury.injectables.annotations.ExpectPlatform;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.Item;


public class AddonItemRegistryHelper {

    @ExpectPlatform
    public static RegistrySupplier<WearableArmorDecorationItem> registerWearableArmorDecorationItem(String id, ArmorMaterial material, EquipmentSlot type, Item.Properties properties) {
            throw new AssertionError();
    }

    @ExpectPlatform
    public static RegistrySupplier<DyeableWearableArmorDecorationItem> registerDyeableWearableArmorDecorationItem(String id, ArmorMaterial material, EquipmentSlot type, Item.Properties properties, int defaultcolor) {
        throw new AssertionError();
    }
}

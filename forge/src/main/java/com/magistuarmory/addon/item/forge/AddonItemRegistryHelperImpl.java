package com.magistuarmory.addon.item.forge;

import com.magistuarmory.addon.forge.item.WearableArmorDecorationItemForge;
import com.magistuarmory.addon.item.DyeableWearableArmorDecorationItem;
import com.magistuarmory.addon.item.WearableArmorDecorationItem;
import com.magistuarmory.item.ModItems;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.Item;

public class AddonItemRegistryHelperImpl {
    public static RegistrySupplier<WearableArmorDecorationItem> registerWearableArmorDecorationItem(String id, ArmorMaterial material, EquipmentSlot type, Item.Properties properties) {
        return ModItems.ITEMS.register(id, () -> new WearableArmorDecorationItemForge(material, type, properties));
    }

    public static RegistrySupplier<DyeableWearableArmorDecorationItem> registerDyeableWearableArmorDecorationItem(String id, ArmorMaterial material, EquipmentSlot type, Item.Properties properties, int defaultcolor) {
        return ModItems.ITEMS.register(id, () -> new DyeableWearableArmorDecorationItem(material, type, properties,0xffffff));
    }
}

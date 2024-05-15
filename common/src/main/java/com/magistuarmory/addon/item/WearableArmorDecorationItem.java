package com.magistuarmory.addon.item;

import com.magistuarmory.item.ArmorDecoration;
import com.magistuarmory.item.armor.MedievalArmorItem;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ItemStack;

public class WearableArmorDecorationItem extends MedievalArmorItem implements ArmorDecoration
{
    public WearableArmorDecorationItem(ArmorMaterial material, EquipmentSlot type, Properties properties)
    {
        super(material, type, properties);
    }

    @Override
    public String getName() {
        return this.getMaterial().getName();
    }

    @Override
    public CompoundTag getItemArmorDecorationData(ItemStack stack) {
            CompoundTag compoundnbt = new CompoundTag();

            compoundnbt.putString("name", this.getName());
            compoundnbt.putBoolean("dyeable", true);
            compoundnbt.putInt("color", 1);
            return compoundnbt;
    }

    @Override
    public EquipmentSlot getArmorType()
    {
        return this.getSlot();
    }
}

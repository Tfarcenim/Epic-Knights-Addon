package com.magistuarmory.addon.item.armor;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.Util;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.tags.TagKey;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.crafting.Ingredient;

import java.util.EnumMap;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class AddonArmorType implements ArmorMaterial {

    private final ResourceLocation location;
    private final ResourceLocation modellocation;
    private final float toughness;
    private final float knockbackResistance;
    private final EnumMap<EquipmentSlot, Integer> durability;
    private final EnumMap<EquipmentSlot, Integer> defenseForSlot;
    private final int enchantmentValue;
    private final SoundEvent equipSound;
    private final boolean enabled;

    private Supplier<Ingredient> repairIngredient = () -> Ingredient.EMPTY;

    public AddonArmorType(ResourceLocation location, ResourceLocation modellocation, float toughness, float knockbackResistance, int[] durability, int[] defenseForSlot, int enchantmentValue, SoundEvent equipSound, boolean enabled)
    {
        this.location = location;
        this.modellocation = modellocation;
        this.toughness = toughness;
        this.knockbackResistance = knockbackResistance;
        this.durability = Util.make(new EnumMap(EquipmentSlot.class), (enumMap) -> {
            enumMap.put(EquipmentSlot.FEET, durability[0]);
            enumMap.put(EquipmentSlot.LEGS, durability[1]);
            enumMap.put(EquipmentSlot.CHEST, durability[2]);
            enumMap.put(EquipmentSlot.HEAD, durability[3]);
        });
        this.defenseForSlot = Util.make(new EnumMap(EquipmentSlot.class), (enumMap) -> {
            enumMap.put(EquipmentSlot.FEET, defenseForSlot[0]);
            enumMap.put(EquipmentSlot.LEGS, defenseForSlot[1]);
            enumMap.put(EquipmentSlot.CHEST, defenseForSlot[2]);
            enumMap.put(EquipmentSlot.HEAD, defenseForSlot[3]);
        });
        this.enchantmentValue = enchantmentValue;
        this.equipSound = equipSound;
        this.enabled = enabled;
    }

    public AddonArmorType(ResourceLocation location, ResourceLocation modellocation, float toughness, float knockbackResistance, int[] durability, int[] defenseForSlot, int enchantmentValue, SoundEvent equipSound, boolean enabled, Supplier<Ingredient> repairIngredient)
    {
        this(location, modellocation, toughness, knockbackResistance, durability, defenseForSlot, enchantmentValue, equipSound, enabled);
        this.repairIngredient = repairIngredient;
    }

    public AddonArmorType(ResourceLocation location, ResourceLocation modellocation, float toughness, float knockbackResistance, int[] durability, int[] defenseForSlot, int enchantmentValue, SoundEvent equipSound, boolean enabled, String repairitemtag)
    {
        this(location, modellocation, toughness, knockbackResistance, durability, defenseForSlot, enchantmentValue, equipSound, enabled);
        this.repairIngredient = () -> Ingredient.of(TagKey.create(Registry.ITEM_REGISTRY, new ResourceLocation(repairitemtag)));
    }

    @Override
    public String getName() {
        return this.location.toString();
    }

    @Override
    public float getToughness() {
        return this.toughness;
    }

    @Override
    public float getKnockbackResistance() {
        return this.knockbackResistance;
    }

    @Override
    public int getDurabilityForSlot(EquipmentSlot type) {
        return this.durability.get(type);
    }

    @Override
    public int getDefenseForSlot(EquipmentSlot type) {
        return this.defenseForSlot.get(type);
    }

    @Override
    public int getEnchantmentValue() {
        return this.enchantmentValue;
    }

    @Override
    public SoundEvent getEquipSound() {
        return this.equipSound;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }

    public boolean isDisabled()
    {
        return !this.enabled;
    }

  /*  @Environment(EnvType.CLIENT)
    public Optional<ModelLayerLocation> getModelLocation()
    {
        if (Objects.equals(this.modellocation.getPath(), "default"))
            return Optional.empty();
        return Optional.of(ModModels.createArmorLocation(this.modellocation));
    }*/
}

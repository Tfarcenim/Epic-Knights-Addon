package com.magistuarmory.addon.item;

import com.magistuarmory.addon.misc.AddonModelMaps;
import com.magistuarmory.addon.EpicKnightsAddon;
import com.magistuarmory.addon.item.armor.AddonArmorType;
import com.magistuarmory.addon.item.armor.AddonArmorTypes;
import com.magistuarmory.client.render.ModRender;
import com.magistuarmory.client.render.model.Models;
import com.magistuarmory.item.ArmorDecorationItem;
import com.magistuarmory.item.DyeableArmorDecorationItem;
import com.magistuarmory.item.MedievalWeaponItem;
import com.magistuarmory.item.ModItemTier;
import com.magistuarmory.item.WeaponType;
import com.magistuarmory.item.armor.ArmorType;
import com.magistuarmory.item.armor.MedievalArmorItem;
import com.magistuarmory.item.armor.MedievalHorseArmorItem;
import com.magistuarmory.misc.ModCreativeTabs;
import dev.architectury.event.events.common.LifecycleEvent;
import dev.architectury.platform.Platform;
import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import me.shedaniel.cloth.clothconfig.shadowed.blue.endless.jankson.annotation.Nullable;
import net.fabricmc.api.EnvType;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.item.Item;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class AddonItems {
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(EpicKnightsAddon.ID, Registry.ITEM_REGISTRY);

	//public static final List<RegistrySupplier<MedievalShieldItem>> SHIELD_ITEMS = new ArrayList<>();
	public static final List<RegistrySupplier<MedievalWeaponItem>> WEAPON_ITEMS = new ArrayList<>();
	public static final List<RegistrySupplier<? extends Item>> DYEABLE_ITEMS = new ArrayList<>();
	public static final List<RegistrySupplier<MedievalArmorItem>> ARMOR_ITEMS = new ArrayList<>();
	public static final List<RegistrySupplier<? extends ArmorDecorationItem>> ARMOR_DECORATION_ITEMS = new ArrayList<>();

	//Weapons
	public static final @Nullable RegistrySupplier<MedievalWeaponItem> STEEL_BATTLEAXE = addMedievalWeaponItem("steel_battleaxe", new Item.Properties().tab(ModCreativeTabs.PARTICULAR_WEAPONS), ModItemTier.STEEL, AddonWeaponTypes.BATTLEAXE);
	public static final @Nullable RegistrySupplier<MedievalWeaponItem> STEEL_FRANCISCA_AXE = addMedievalWeaponItem("steel_francisca_axe", new Item.Properties().tab(ModCreativeTabs.PARTICULAR_WEAPONS), ModItemTier.STEEL, AddonWeaponTypes.FRANCISCA_AXE);
	public static final @Nullable RegistrySupplier<MedievalWeaponItem> STEEL_WAR_AXE = addMedievalWeaponItem("steel_war_axe", new Item.Properties().tab(ModCreativeTabs.PARTICULAR_WEAPONS), ModItemTier.STEEL, AddonWeaponTypes.WAR_AXE);
	public static final @Nullable RegistrySupplier<MedievalWeaponItem> STEEL_WAR_HAMMER = addMedievalWeaponItem("steel_war_hammer", new Item.Properties().tab(ModCreativeTabs.PARTICULAR_WEAPONS), ModItemTier.STEEL, AddonWeaponTypes.WAR_HAMMER);
	public static final @Nullable RegistrySupplier<MedievalWeaponItem> STEEL_BOLLOCK_DAGGER = addMedievalWeaponItem("steel_bollock_dagger", new Item.Properties().tab(ModCreativeTabs.PARTICULAR_WEAPONS), ModItemTier.STEEL, AddonWeaponTypes.BOLLOCK_DAGGER);
	public static final @Nullable RegistrySupplier<MedievalWeaponItem> STEEL_DAGGER = addMedievalWeaponItem("steel_dagger", new Item.Properties().tab(ModCreativeTabs.PARTICULAR_WEAPONS), ModItemTier.STEEL, AddonWeaponTypes.DAGGER);
	public static final @Nullable RegistrySupplier<MedievalWeaponItem> STEEL_RONDEL_DAGGER = addMedievalWeaponItem("steel_rondel_dagger", new Item.Properties().tab(ModCreativeTabs.PARTICULAR_WEAPONS), ModItemTier.STEEL, AddonWeaponTypes.RONDEL_DAGGER);
	public static final @Nullable RegistrySupplier<MedievalWeaponItem> STEEL_SICKLE = addMedievalWeaponItem("steel_sickle", new Item.Properties().tab(ModCreativeTabs.PARTICULAR_WEAPONS), ModItemTier.STEEL, AddonWeaponTypes.SICKLE);
	public static final @Nullable RegistrySupplier<MedievalWeaponItem> STEEL_EXECUTIONERS_SWORD = addMedievalWeaponItem("steel_executioners_sword", new Item.Properties().tab(ModCreativeTabs.PARTICULAR_WEAPONS), ModItemTier.STEEL, AddonWeaponTypes.EXECUTIONERS_SWORD);
	public static final @Nullable RegistrySupplier<MedievalWeaponItem> STEEL_GERMAN_GREATSWORD = addMedievalWeaponItem("steel_german_greatsword", new Item.Properties().tab(ModCreativeTabs.PARTICULAR_WEAPONS), ModItemTier.STEEL, AddonWeaponTypes.GERMAN_GREATSWORD);
	public static final @Nullable RegistrySupplier<MedievalWeaponItem> STEEL_ENGLISH_POLEAXE = addMedievalWeaponItem("steel_english_poleaxe", new Item.Properties().tab(ModCreativeTabs.PARTICULAR_WEAPONS), ModItemTier.STEEL, AddonWeaponTypes.ENGLISH_POLEAXE);
	public static final @Nullable RegistrySupplier<MedievalWeaponItem> STEEL_FRENCH_HALBERD = addMedievalWeaponItem("steel_french_halberd", new Item.Properties().tab(ModCreativeTabs.PARTICULAR_WEAPONS), ModItemTier.STEEL, AddonWeaponTypes.FRENCH_HALBERD);
	public static final @Nullable RegistrySupplier<MedievalWeaponItem> STEEL_ITALIAN_POLEAXE = addMedievalWeaponItem("steel_italian_poleaxe", new Item.Properties().tab(ModCreativeTabs.PARTICULAR_WEAPONS), ModItemTier.STEEL, AddonWeaponTypes.ITALIAN_POLEAXE);
	public static final @Nullable RegistrySupplier<MedievalWeaponItem> STEEL_SWISS_HALBERD = addMedievalWeaponItem("steel_swiss_halberd", new Item.Properties().tab(ModCreativeTabs.PARTICULAR_WEAPONS), ModItemTier.STEEL, AddonWeaponTypes.SWISS_HALBERD);
	public static final @Nullable RegistrySupplier<MedievalWeaponItem> STEEL_LANCE = addLanceItem("steel_lance", new Item.Properties().tab(ModCreativeTabs.PARTICULAR_WEAPONS), ModItemTier.STEEL, AddonWeaponTypes.LANCE);
	public static final @Nullable RegistrySupplier<MedievalWeaponItem> STEEL_BROADAXE = addMedievalWeaponItem("steel_broadaxe", new Item.Properties().tab(ModCreativeTabs.PARTICULAR_WEAPONS), ModItemTier.STEEL, AddonWeaponTypes.BROADAXE);
	public static final @Nullable RegistrySupplier<MedievalWeaponItem> STEEL_DANEAXE = addMedievalWeaponItem("steel_daneaxe", new Item.Properties().tab(ModCreativeTabs.PARTICULAR_WEAPONS), ModItemTier.STEEL, AddonWeaponTypes.DANEAXE);
	public static final @Nullable RegistrySupplier<MedievalWeaponItem> STEEL_GALLOWGLASS_AXE = addMedievalWeaponItem("steel_gallowglass_axe", new Item.Properties().tab(ModCreativeTabs.PARTICULAR_WEAPONS), ModItemTier.STEEL, AddonWeaponTypes.GALLOWGLASS_AXE);
	public static final @Nullable RegistrySupplier<MedievalWeaponItem> STEEL_CUTLASS = addMedievalWeaponItem("steel_cutlass", new Item.Properties().tab(ModCreativeTabs.PARTICULAR_WEAPONS), ModItemTier.STEEL, AddonWeaponTypes.CUTLASS);
	public static final @Nullable RegistrySupplier<MedievalWeaponItem> STEEL_FALCHION = addMedievalWeaponItem("steel_falchion", new Item.Properties().tab(ModCreativeTabs.PARTICULAR_WEAPONS), ModItemTier.STEEL, AddonWeaponTypes.FALCHION);
	public static final @Nullable RegistrySupplier<MedievalWeaponItem> STEEL_FEDER = addMedievalWeaponItem("steel_feder", new Item.Properties().tab(ModCreativeTabs.PARTICULAR_WEAPONS), ModItemTier.STEEL, AddonWeaponTypes.FEDER);
	public static final @Nullable RegistrySupplier<MedievalWeaponItem> STEEL_GRAND_FALCHION = addMedievalWeaponItem("steel_grand_falchion", new Item.Properties().tab(ModCreativeTabs.PARTICULAR_WEAPONS), ModItemTier.STEEL, AddonWeaponTypes.GRAND_FALCHION);
	public static final @Nullable RegistrySupplier<MedievalWeaponItem> STEEL_LONGSWORD = addMedievalWeaponItem("steel_longsword", new Item.Properties().tab(ModCreativeTabs.PARTICULAR_WEAPONS), ModItemTier.STEEL, AddonWeaponTypes.LONGSWORD);
	public static final @Nullable RegistrySupplier<MedievalWeaponItem> STEEL_LONG_SEAX = addMedievalWeaponItem("steel_long_seax", new Item.Properties().tab(ModCreativeTabs.PARTICULAR_WEAPONS), ModItemTier.STEEL, AddonWeaponTypes.LONG_SEAX);
	public static final @Nullable RegistrySupplier<MedievalWeaponItem> STEEL_MESSER_SWORD = addMedievalWeaponItem("steel_messer_sword", new Item.Properties().tab(ModCreativeTabs.PARTICULAR_WEAPONS), ModItemTier.STEEL, AddonWeaponTypes.MESSER_SWORD);
	public static final @Nullable RegistrySupplier<MedievalWeaponItem> STEEL_RAPIER = addMedievalWeaponItem("steel_rapier", new Item.Properties().tab(ModCreativeTabs.PARTICULAR_WEAPONS), ModItemTier.STEEL, AddonWeaponTypes.RAPIER);
	public static final @Nullable RegistrySupplier<MedievalWeaponItem> STEEL_SCIMITAR = addMedievalWeaponItem("steel_scimitar", new Item.Properties().tab(ModCreativeTabs.PARTICULAR_WEAPONS), ModItemTier.STEEL, AddonWeaponTypes.SCIMITAR);
	public static final @Nullable RegistrySupplier<MedievalWeaponItem> STEEL_SIDESWORD = addMedievalWeaponItem("steel_sidesword", new Item.Properties().tab(ModCreativeTabs.PARTICULAR_WEAPONS), ModItemTier.STEEL, AddonWeaponTypes.SIDESWORD);
	public static final @Nullable RegistrySupplier<MedievalWeaponItem> STEEL_BILLHOOK = addMedievalWeaponItem("steel_billhook", new Item.Properties().tab(ModCreativeTabs.PARTICULAR_WEAPONS), ModItemTier.STEEL, AddonWeaponTypes.BILLHOOK);
	public static final @Nullable RegistrySupplier<MedievalWeaponItem> STEEL_BOAR_SPEAR = addMedievalWeaponItem("steel_boar_spear", new Item.Properties().tab(ModCreativeTabs.PARTICULAR_WEAPONS), ModItemTier.STEEL, AddonWeaponTypes.BOAR_SPEAR);
	public static final @Nullable RegistrySupplier<MedievalWeaponItem> STEEL_FAUCHARD = addMedievalWeaponItem("steel_fauchard", new Item.Properties().tab(ModCreativeTabs.PARTICULAR_WEAPONS), ModItemTier.STEEL, AddonWeaponTypes.FAUCHARD);
	public static final @Nullable RegistrySupplier<MedievalWeaponItem> STEEL_GLAIVE = addMedievalWeaponItem("steel_glaive", new Item.Properties().tab(ModCreativeTabs.PARTICULAR_WEAPONS), ModItemTier.STEEL, AddonWeaponTypes.GLAIVE);
	public static final @Nullable RegistrySupplier<MedievalWeaponItem> STEEL_GOEDENDAG = addMedievalWeaponItem("steel_goedendag", new Item.Properties().tab(ModCreativeTabs.PARTICULAR_WEAPONS), ModItemTier.STEEL, AddonWeaponTypes.GOEDENDAG);
	public static final @Nullable RegistrySupplier<MedievalWeaponItem> STEEL_PARTISAN = addMedievalWeaponItem("steel_partisan", new Item.Properties().tab(ModCreativeTabs.PARTICULAR_WEAPONS), ModItemTier.STEEL, AddonWeaponTypes.PARTISAN);
	public static final @Nullable RegistrySupplier<MedievalWeaponItem> STEEL_SCYTHE = addMedievalWeaponItem("steel_scythe", new Item.Properties().tab(ModCreativeTabs.PARTICULAR_WEAPONS), ModItemTier.STEEL, AddonWeaponTypes.SCYTHE);
	public static final @Nullable RegistrySupplier<MedievalWeaponItem> STEEL_SHORT_SPEAR = addMedievalWeaponItem("steel_short_spear", new Item.Properties().tab(ModCreativeTabs.PARTICULAR_WEAPONS), ModItemTier.STEEL, AddonWeaponTypes.SHORT_SPEAR);
	public static final @Nullable RegistrySupplier<MedievalWeaponItem> STEEL_VOULGE = addMedievalWeaponItem("steel_voulge", new Item.Properties().tab(ModCreativeTabs.PARTICULAR_WEAPONS), ModItemTier.STEEL, AddonWeaponTypes.VOULGE);
	public static final @Nullable RegistrySupplier<MedievalWeaponItem> STEEL_WELSH_GUISARME = addMedievalWeaponItem("steel_welsh_guisarme", new Item.Properties().tab(ModCreativeTabs.PARTICULAR_WEAPONS), ModItemTier.STEEL, AddonWeaponTypes.WELSH_GUISARME);
	public static final @Nullable RegistrySupplier<MedievalWeaponItem> STEEL_ARMING_SWORD_TYPE_XIII = addMedievalWeaponItem("steel_arming_sword_type_xiii", new Item.Properties().tab(ModCreativeTabs.PARTICULAR_WEAPONS), ModItemTier.STEEL, AddonWeaponTypes.ARMING_SWORD_TYPE_XIII);
	public static final @Nullable RegistrySupplier<MedievalWeaponItem> STEEL_ARMING_SWORD_TYPE_XIV = addMedievalWeaponItem("steel_arming_sword_type_xiv", new Item.Properties().tab(ModCreativeTabs.PARTICULAR_WEAPONS), ModItemTier.STEEL, AddonWeaponTypes.ARMING_SWORD_TYPE_XIV);
	public static final @Nullable RegistrySupplier<MedievalWeaponItem> STEEL_ARMING_SWORD_TYPE_XV = addMedievalWeaponItem("steel_arming_sword_type_xv", new Item.Properties().tab(ModCreativeTabs.PARTICULAR_WEAPONS), ModItemTier.STEEL, AddonWeaponTypes.ARMING_SWORD_TYPE_XV);
	public static final @Nullable RegistrySupplier<MedievalWeaponItem> RICH_SAXON_SWORD = addMedievalWeaponItem("rich_saxon_sword", new Item.Properties().tab(ModCreativeTabs.PARTICULAR_WEAPONS), ModItemTier.STEEL, AddonWeaponTypes.RICH_SAXON_SWORD);
	public static final @Nullable RegistrySupplier<MedievalWeaponItem> STEEL_SABRE = addMedievalWeaponItem("steel_sabre", new Item.Properties().tab(ModCreativeTabs.PARTICULAR_WEAPONS), ModItemTier.STEEL, AddonWeaponTypes.SABRE);
	public static final @Nullable RegistrySupplier<MedievalWeaponItem> STEEL_SAXON_SWORD = addMedievalWeaponItem("steel_saxon_sword", new Item.Properties().tab(ModCreativeTabs.PARTICULAR_WEAPONS), ModItemTier.STEEL, AddonWeaponTypes.SAXON_SWORD);
	public static final @Nullable RegistrySupplier<MedievalWeaponItem> STEEL_SHORT_SEAX = addMedievalWeaponItem("steel_short_seax", new Item.Properties().tab(ModCreativeTabs.PARTICULAR_WEAPONS), ModItemTier.STEEL, AddonWeaponTypes.SHORT_SEAX);
	public static final @Nullable RegistrySupplier<MedievalWeaponItem> TRAINING_SWORD = addMedievalWeaponItem("training_sword", new Item.Properties().tab(ModCreativeTabs.PARTICULAR_WEAPONS), ModItemTier.WOOD, AddonWeaponTypes.TRAINING_SWORD);

	//Armor
	public static final @Nullable RegistrySupplier<MedievalArmorItem> DARK_ARMET = addKnightItem("dark_knight_helmet", AddonArmorTypes.DARK_ARMET, EquipmentSlot.HEAD, new Item.Properties().tab(ModCreativeTabs.ARMOR));
	public static final @Nullable RegistrySupplier<MedievalArmorItem> DARK_KNIGHT_CHESTPLATE = addMedievalArmorItem("dark_knight_chestplate", AddonArmorTypes.DARK_KNIGHT, EquipmentSlot.CHEST, new Item.Properties().tab(ModCreativeTabs.ARMOR));
	public static final @Nullable RegistrySupplier<MedievalArmorItem> DARK_KNIGHT_LEGGINGS = addMedievalArmorItem("dark_knight_leggings", AddonArmorTypes.DARK_KNIGHT, EquipmentSlot.LEGS, new Item.Properties().tab(ModCreativeTabs.ARMOR));
	public static final @Nullable RegistrySupplier<MedievalArmorItem> DARK_KNIGHT_BOOTS = addMedievalArmorItem("dark_knight_boots", AddonArmorTypes.DARK_KNIGHT, EquipmentSlot.FEET, new Item.Properties().tab(ModCreativeTabs.ARMOR));

	public static final @Nullable RegistrySupplier<MedievalArmorItem> DARK_STECHHELM = addJoustingItem("dark_jousting_helmet", AddonArmorTypes.DARK_STECHHELM, EquipmentSlot.HEAD, new Item.Properties().tab(ModCreativeTabs.ARMOR));
	public static final @Nullable RegistrySupplier<MedievalArmorItem> DARK_JOUSTING_CHESTPLATE = addJoustingItem("dark_jousting_chestplate", AddonArmorTypes.DARK_JOUSTING, EquipmentSlot.CHEST, new Item.Properties().tab(ModCreativeTabs.ARMOR));
	public static final @Nullable RegistrySupplier<MedievalArmorItem> DARK_JOUSTING_LEGGINGS = addJoustingItem("dark_jousting_leggings", AddonArmorTypes.DARK_JOUSTING, EquipmentSlot.LEGS, new Item.Properties().tab(ModCreativeTabs.ARMOR));
	public static final @Nullable RegistrySupplier<MedievalArmorItem> DARK_JOUSTING_BOOTS = addJoustingItem("dark_jousting_boots", AddonArmorTypes.DARK_JOUSTING, EquipmentSlot.FEET, new Item.Properties().tab(ModCreativeTabs.ARMOR));

	public static final @Nullable RegistrySupplier<MedievalArmorItem> DARK_SALLET = addMedievalArmorItem("dark_gothic_helmet", AddonArmorTypes.DARK_SALLET, EquipmentSlot.HEAD, new Item.Properties().tab(ModCreativeTabs.ARMOR));
	public static final @Nullable RegistrySupplier<MedievalArmorItem> DARK_GOTHIC_CHESTPLATE = addMedievalArmorItem("dark_gothic_chestplate", AddonArmorTypes.DARK_GOTHIC, EquipmentSlot.CHEST, new Item.Properties().tab(ModCreativeTabs.ARMOR));
	public static final @Nullable RegistrySupplier<MedievalArmorItem> DARK_GOTHIC_LEGGINGS = addMedievalArmorItem("dark_gothic_leggings", AddonArmorTypes.DARK_GOTHIC, EquipmentSlot.LEGS, new Item.Properties().tab(ModCreativeTabs.ARMOR));
	public static final @Nullable RegistrySupplier<MedievalArmorItem> DARK_GOTHIC_BOOTS = addMedievalArmorItem("dark_gothic_boots", AddonArmorTypes.DARK_GOTHIC, EquipmentSlot.FEET, new Item.Properties().tab(ModCreativeTabs.ARMOR));

	public static final @Nullable RegistrySupplier<MedievalArmorItem> DARK_MAXIMILIAN_HELMET = addMedievalArmorItem("dark_maximilian_helmet", AddonArmorTypes.DARK_MAXIMILIAN_HELMET, EquipmentSlot.HEAD, new Item.Properties().tab(ModCreativeTabs.ARMOR));
	public static final @Nullable RegistrySupplier<MedievalArmorItem> DARK_MAXIMILIAN_CHESTPLATE = addMedievalArmorItem("dark_maximilian_chestplate", AddonArmorTypes.DARK_MAXIMILIAN, EquipmentSlot.CHEST, new Item.Properties().tab(ModCreativeTabs.ARMOR));
	public static final @Nullable RegistrySupplier<MedievalArmorItem> DARK_MAXIMILIAN_LEGGINGS = addMedievalArmorItem("dark_maximilian_leggings", AddonArmorTypes.DARK_MAXIMILIAN, EquipmentSlot.LEGS, new Item.Properties().tab(ModCreativeTabs.ARMOR));
	public static final @Nullable RegistrySupplier<MedievalArmorItem> DARK_MAXIMILIAN_BOOTS = addMedievalArmorItem("dark_maximilian_boots", AddonArmorTypes.DARK_MAXIMILIAN, EquipmentSlot.FEET, new Item.Properties().tab(ModCreativeTabs.ARMOR));

	public static final @Nullable RegistrySupplier<MedievalArmorItem> DARK_CRUSADER_HELMET = addMedievalArmorItem("dark_crusader_helmet", AddonArmorTypes.DARK_GREATHELM, EquipmentSlot.HEAD, new Item.Properties().tab(ModCreativeTabs.ARMOR));

	public static final @Nullable RegistrySupplier<MedievalArmorItem> DARK_CRUSADER_CHESTPLATE = addDyeableMedievalArmorItem("dark_crusader_chestplate", AddonArmorTypes.DARK_CRUSADER, EquipmentSlot.CHEST, new Item.Properties().tab(ModCreativeTabs.ARMOR), 16777215);
	public static final @Nullable RegistrySupplier<MedievalArmorItem> DARK_CRUSADER_LEGGINGS = addMedievalArmorItem("dark_crusader_leggings", AddonArmorTypes.DARK_CRUSADER, EquipmentSlot.LEGS, new Item.Properties().tab(ModCreativeTabs.ARMOR));
	public static final @Nullable RegistrySupplier<MedievalArmorItem> DARK_CRUSADER_BOOTS = addDyeableMedievalArmorItem("dark_crusader_boots", AddonArmorTypes.DARK_CRUSADER, EquipmentSlot.FEET, new Item.Properties().tab(ModCreativeTabs.ARMOR), -3227226);

	public static final @Nullable RegistrySupplier<MedievalArmorItem> DARK_GRAND_BASCINET = addMedievalArmorItem("dark_grand_bascinet", AddonArmorTypes.DARK_GRAND_BASCINET, EquipmentSlot.HEAD, new Item.Properties().tab(ModCreativeTabs.ARMOR));
	public static final @Nullable RegistrySupplier<MedievalArmorItem> DARK_KASTENBRUST_CHESTPLATE = addMedievalArmorItem("dark_kastenbrust_chestplate", AddonArmorTypes.DARK_KASTENBRUST, EquipmentSlot.CHEST, new Item.Properties().tab(ModCreativeTabs.ARMOR));
	public static final @Nullable RegistrySupplier<MedievalArmorItem> DARK_KASTENBRUST_LEGGINGS = addMedievalArmorItem("dark_kastenbrust_leggings", AddonArmorTypes.DARK_KASTENBRUST, EquipmentSlot.LEGS, new Item.Properties().tab(ModCreativeTabs.ARMOR));
	public static final @Nullable RegistrySupplier<MedievalArmorItem> DARK_KASTENBRUST_BOOTS = addMedievalArmorItem("dark_kastenbrust_boots", AddonArmorTypes.DARK_KASTENBRUST, EquipmentSlot.FEET, new Item.Properties().tab(ModCreativeTabs.ARMOR));

	public static final @Nullable RegistrySupplier<MedievalArmorItem> SAVOYARD_HELMET = addMedievalArmorItem("savoyard_helmet", AddonArmorTypes.SAVOYARD_HELMET, EquipmentSlot.HEAD, new Item.Properties().tab(ModCreativeTabs.ARMOR));
	public static final @Nullable RegistrySupplier<MedievalArmorItem> MORION = addMedievalArmorItem("morion", AddonArmorTypes.MORION, EquipmentSlot.HEAD, new Item.Properties().tab(ModCreativeTabs.ARMOR));
	public static final @Nullable RegistrySupplier<MedievalArmorItem> PIKEMAN_CHESTPLATE = addMedievalArmorItem("pikeman_chestplate", AddonArmorTypes.PIKEMAN, EquipmentSlot.CHEST, new Item.Properties().tab(ModCreativeTabs.ARMOR));
	public static final @Nullable RegistrySupplier<MedievalArmorItem> PIKEMAN_BOOTS = addMedievalArmorItem("pikeman_boots", AddonArmorTypes.PIKEMAN, EquipmentSlot.FEET, new Item.Properties().tab(ModCreativeTabs.ARMOR));

	public static final @Nullable RegistrySupplier<MedievalArmorItem> BRITISH_ARMET = addMedievalArmorItem("british_armet", AddonArmorTypes.BRITISH_ARMET, EquipmentSlot.HEAD, new Item.Properties().tab(ModCreativeTabs.ARMOR));
	public static final @Nullable RegistrySupplier<MedievalArmorItem> MILANESE_ARMET = addMedievalArmorItem("milanese_armet", AddonArmorTypes.MILANESE_ARMET, EquipmentSlot.HEAD, new Item.Properties().tab(ModCreativeTabs.ARMOR));
	public static final @Nullable RegistrySupplier<MedievalArmorItem> AVANT_CHESTPLATE = addDyeableMedievalArmorItem("avant_chestplate", AddonArmorTypes.AVANT, EquipmentSlot.CHEST, new Item.Properties().tab(ModCreativeTabs.ARMOR), 2178191);
	public static final @Nullable RegistrySupplier<MedievalArmorItem> AVANT_LEGGINGS = addMedievalArmorItem("avant_leggings", AddonArmorTypes.AVANT, EquipmentSlot.LEGS, new Item.Properties().tab(ModCreativeTabs.ARMOR));
	public static final @Nullable RegistrySupplier<MedievalArmorItem> AVANT_BOOTS = addDyeableMedievalArmorItem("avant_boots", AddonArmorTypes.AVANT, EquipmentSlot.FEET, new Item.Properties().tab(ModCreativeTabs.ARMOR), 2178191);

	public static final @Nullable RegistrySupplier<MedievalArmorItem> VISORED_KETTLEHAT = addMedievalArmorItem("visored_kettlehat", AddonArmorTypes.VISORED_KETTLEHAT, EquipmentSlot.HEAD, new Item.Properties().tab(ModCreativeTabs.ARMOR));

	public static final @Nullable RegistrySupplier<MedievalArmorItem> CERVELLIERE = addMedievalArmorItem("cervelliere", AddonArmorTypes.CERVELLIERE, EquipmentSlot.HEAD, new Item.Properties().tab(ModCreativeTabs.ARMOR));

	public static final @Nullable RegistrySupplier<MedievalArmorItem> CLOSED_BARBUTE = addMedievalArmorItem("closed_barbute", AddonArmorTypes.CLOSED_BARBUTE, EquipmentSlot.HEAD, new Item.Properties().tab(ModCreativeTabs.ARMOR));

	public static final @Nullable RegistrySupplier<MedievalArmorItem> BICOQUE = addMedievalArmorItem("bicoque", AddonArmorTypes.BICOQUE, EquipmentSlot.HEAD, new Item.Properties().tab(ModCreativeTabs.ARMOR));
	
	public static final @Nullable RegistrySupplier<MedievalArmorItem> KULAH_KHUD = addMedievalArmorItem("kulah_khud", AddonArmorTypes.KULAH_KHUD, EquipmentSlot.HEAD, new Item.Properties().tab(ModCreativeTabs.ARMOR));
	public static final @Nullable RegistrySupplier<MedievalArmorItem> CUMAN_CAPTAIN_HELMET = addMedievalArmorItem("cuman_captain_helmet", AddonArmorTypes.CUMAN_CAPTAIN_HELMET, EquipmentSlot.HEAD, new Item.Properties().tab(ModCreativeTabs.ARMOR));
	public static final @Nullable RegistrySupplier<MedievalArmorItem> MIRROR_CHESTPLATE = addMedievalArmorItem("mirror_chestplate", AddonArmorTypes.MIRROR, EquipmentSlot.CHEST, new Item.Properties().tab(ModCreativeTabs.ARMOR));
	public static final @Nullable RegistrySupplier<MedievalArmorItem> MIRROR_BOOTS = addMedievalArmorItem("mirror_boots", AddonArmorTypes.MIRROR, EquipmentSlot.FEET, new Item.Properties().tab(ModCreativeTabs.ARMOR));

	public static final @Nullable RegistrySupplier<MedievalArmorItem> SARACEN_HELMET = addDyeableMedievalArmorItem("saracen_helmet", AddonArmorTypes.SARACEN, EquipmentSlot.HEAD, new Item.Properties().tab(ModCreativeTabs.ARMOR), DyeColor.RED.getMaterialColor().col);
	public static final @Nullable RegistrySupplier<MedievalArmorItem> SARACEN_CHESTPLATE = addDyeableMedievalArmorItem("saracen_chestplate", AddonArmorTypes.SARACEN, EquipmentSlot.CHEST, new Item.Properties().tab(ModCreativeTabs.ARMOR), DyeColor.RED.getMaterialColor().col);
	public static final @Nullable RegistrySupplier<MedievalArmorItem> SARACEN_BOOTS = addDyeableMedievalArmorItem("saracen_boots", AddonArmorTypes.SARACEN, EquipmentSlot.FEET, new Item.Properties().tab(ModCreativeTabs.ARMOR), DyeColor.RED.getMaterialColor().col);
	
	public static final @Nullable RegistrySupplier<MedievalArmorItem> EARLY_GREATHELM = addMedievalArmorItem("early_greathelm", AddonArmorTypes.EARLY_GREATHELM, EquipmentSlot.HEAD, new Item.Properties().tab(ModCreativeTabs.ARMOR));
	public static final @Nullable RegistrySupplier<MedievalArmorItem> XIII_CENTURY_KNIGHT_CHESTPLATE = addMedievalArmorItem("xiii_century_knight_chestplate", AddonArmorTypes.XIII_CENTURY_KNIGHT, EquipmentSlot.CHEST, new Item.Properties().tab(ModCreativeTabs.ARMOR));
	public static final @Nullable RegistrySupplier<MedievalArmorItem> XIII_CENTURY_KNIGHT_LEGGINGS = addMedievalArmorItem("xiii_century_knight_leggings", AddonArmorTypes.XIII_CENTURY_KNIGHT, EquipmentSlot.LEGS, new Item.Properties().tab(ModCreativeTabs.ARMOR));
	public static final @Nullable RegistrySupplier<MedievalArmorItem> XIII_CENTURY_KNIGHT_BOOTS = addMedievalArmorItem("xiii_century_knight_boots", AddonArmorTypes.XIII_CENTURY_KNIGHT, EquipmentSlot.FEET, new Item.Properties().tab(ModCreativeTabs.ARMOR));
	
	public static final @Nullable RegistrySupplier<MedievalArmorItem> LOBSTER_TAILED_HELMET = addMedievalArmorItem("lobster_tailed_helmet", AddonArmorTypes.LOBSTER_TAILED_HELMET, EquipmentSlot.HEAD, new Item.Properties().tab(ModCreativeTabs.ARMOR));

	public static final @Nullable RegistrySupplier<MedievalArmorItem> ORANGE_PUFF_AND_SLASH_CHESTPLATE = addDyeableMedievalArmorItem("orange_puff_and_slash_chestplate", AddonArmorTypes.ORANGE_PUFF_AND_SLASH, EquipmentSlot.CHEST, new Item.Properties().tab(ModCreativeTabs.ARMOR), DyeColor.WHITE.getMaterialColor().col);
	public static final @Nullable RegistrySupplier<MedievalArmorItem> ORANGE_PUFF_AND_SLASH_LEGGINGS = addDyeableMedievalArmorItem("orange_puff_and_slash_leggings", AddonArmorTypes.ORANGE_PUFF_AND_SLASH, EquipmentSlot.LEGS, new Item.Properties().tab(ModCreativeTabs.ARMOR), DyeColor.WHITE.getMaterialColor().col);
	public static final @Nullable RegistrySupplier<MedievalArmorItem> MAGENTA_PUFF_AND_SLASH_CHESTPLATE = addDyeableMedievalArmorItem("magenta_puff_and_slash_chestplate", AddonArmorTypes.MAGENTA_PUFF_AND_SLASH, EquipmentSlot.CHEST, new Item.Properties().tab(ModCreativeTabs.ARMOR), DyeColor.WHITE.getMaterialColor().col);
	public static final @Nullable RegistrySupplier<MedievalArmorItem> MAGENTA_PUFF_AND_SLASH_LEGGINGS = addDyeableMedievalArmorItem("magenta_puff_and_slash_leggings", AddonArmorTypes.MAGENTA_PUFF_AND_SLASH, EquipmentSlot.LEGS, new Item.Properties().tab(ModCreativeTabs.ARMOR), DyeColor.WHITE.getMaterialColor().col);
	public static final @Nullable RegistrySupplier<MedievalArmorItem> LIGHT_BLUE_PUFF_AND_SLASH_CHESTPLATE = addDyeableMedievalArmorItem("light_blue_puff_and_slash_chestplate", AddonArmorTypes.LIGHT_BLUE_PUFF_AND_SLASH, EquipmentSlot.CHEST, new Item.Properties().tab(ModCreativeTabs.ARMOR), DyeColor.WHITE.getMaterialColor().col);
	public static final @Nullable RegistrySupplier<MedievalArmorItem> LIGHT_BLUE_PUFF_AND_SLASH_LEGGINGS = addDyeableMedievalArmorItem("light_blue_puff_and_slash_leggings", AddonArmorTypes.LIGHT_BLUE_PUFF_AND_SLASH, EquipmentSlot.LEGS, new Item.Properties().tab(ModCreativeTabs.ARMOR), DyeColor.WHITE.getMaterialColor().col);
	public static final @Nullable RegistrySupplier<MedievalArmorItem> YELLOW_PUFF_AND_SLASH_CHESTPLATE = addDyeableMedievalArmorItem("yellow_puff_and_slash_chestplate", AddonArmorTypes.YELLOW_PUFF_AND_SLASH, EquipmentSlot.CHEST, new Item.Properties().tab(ModCreativeTabs.ARMOR), DyeColor.WHITE.getMaterialColor().col);
	public static final @Nullable RegistrySupplier<MedievalArmorItem> YELLOW_PUFF_AND_SLASH_LEGGINGS = addDyeableMedievalArmorItem("yellow_puff_and_slash_leggings", AddonArmorTypes.YELLOW_PUFF_AND_SLASH, EquipmentSlot.LEGS, new Item.Properties().tab(ModCreativeTabs.ARMOR), DyeColor.WHITE.getMaterialColor().col);
	public static final @Nullable RegistrySupplier<MedievalArmorItem> LIME_PUFF_AND_SLASH_CHESTPLATE = addDyeableMedievalArmorItem("lime_puff_and_slash_chestplate", AddonArmorTypes.LIME_PUFF_AND_SLASH, EquipmentSlot.CHEST, new Item.Properties().tab(ModCreativeTabs.ARMOR), DyeColor.WHITE.getMaterialColor().col);
	public static final @Nullable RegistrySupplier<MedievalArmorItem> LIME_PUFF_AND_SLASH_LEGGINGS = addDyeableMedievalArmorItem("lime_puff_and_slash_leggings", AddonArmorTypes.LIME_PUFF_AND_SLASH, EquipmentSlot.LEGS, new Item.Properties().tab(ModCreativeTabs.ARMOR), DyeColor.WHITE.getMaterialColor().col);
	public static final @Nullable RegistrySupplier<MedievalArmorItem> PINK_PUFF_AND_SLASH_CHESTPLATE = addDyeableMedievalArmorItem("pink_puff_and_slash_chestplate", AddonArmorTypes.PINK_PUFF_AND_SLASH, EquipmentSlot.CHEST, new Item.Properties().tab(ModCreativeTabs.ARMOR), DyeColor.WHITE.getMaterialColor().col);
	public static final @Nullable RegistrySupplier<MedievalArmorItem> PINK_PUFF_AND_SLASH_LEGGINGS = addDyeableMedievalArmorItem("pink_puff_and_slash_leggings", AddonArmorTypes.PINK_PUFF_AND_SLASH, EquipmentSlot.LEGS, new Item.Properties().tab(ModCreativeTabs.ARMOR), DyeColor.WHITE.getMaterialColor().col);
	public static final @Nullable RegistrySupplier<MedievalArmorItem> GRAY_PUFF_AND_SLASH_CHESTPLATE = addDyeableMedievalArmorItem("gray_puff_and_slash_chestplate", AddonArmorTypes.GRAY_PUFF_AND_SLASH, EquipmentSlot.CHEST, new Item.Properties().tab(ModCreativeTabs.ARMOR), DyeColor.WHITE.getMaterialColor().col);
	public static final @Nullable RegistrySupplier<MedievalArmorItem> GRAY_PUFF_AND_SLASH_LEGGINGS = addDyeableMedievalArmorItem("gray_puff_and_slash_leggings", AddonArmorTypes.GRAY_PUFF_AND_SLASH, EquipmentSlot.LEGS, new Item.Properties().tab(ModCreativeTabs.ARMOR), DyeColor.WHITE.getMaterialColor().col);
	public static final @Nullable RegistrySupplier<MedievalArmorItem> LIGHT_GRAY_PUFF_AND_SLASH_CHESTPLATE = addDyeableMedievalArmorItem("light_gray_puff_and_slash_chestplate", AddonArmorTypes.LIGHT_GRAY_PUFF_AND_SLASH, EquipmentSlot.CHEST, new Item.Properties().tab(ModCreativeTabs.ARMOR), DyeColor.WHITE.getMaterialColor().col);
	public static final @Nullable RegistrySupplier<MedievalArmorItem> LIGHT_GRAY_PUFF_AND_SLASH_LEGGINGS = addDyeableMedievalArmorItem("light_gray_puff_and_slash_leggings", AddonArmorTypes.LIGHT_GRAY_PUFF_AND_SLASH, EquipmentSlot.LEGS, new Item.Properties().tab(ModCreativeTabs.ARMOR), DyeColor.WHITE.getMaterialColor().col);
	public static final @Nullable RegistrySupplier<MedievalArmorItem> CYAN_PUFF_AND_SLASH_CHESTPLATE = addDyeableMedievalArmorItem("cyan_puff_and_slash_chestplate", AddonArmorTypes.CYAN_PUFF_AND_SLASH, EquipmentSlot.CHEST, new Item.Properties().tab(ModCreativeTabs.ARMOR), DyeColor.WHITE.getMaterialColor().col);
	public static final @Nullable RegistrySupplier<MedievalArmorItem> CYAN_PUFF_AND_SLASH_LEGGINGS = addDyeableMedievalArmorItem("cyan_puff_and_slash_leggings", AddonArmorTypes.CYAN_PUFF_AND_SLASH, EquipmentSlot.LEGS, new Item.Properties().tab(ModCreativeTabs.ARMOR), DyeColor.WHITE.getMaterialColor().col);
	public static final @Nullable RegistrySupplier<MedievalArmorItem> PURPLE_PUFF_AND_SLASH_CHESTPLATE = addDyeableMedievalArmorItem("purple_puff_and_slash_chestplate", AddonArmorTypes.PURPLE_PUFF_AND_SLASH, EquipmentSlot.CHEST, new Item.Properties().tab(ModCreativeTabs.ARMOR), DyeColor.WHITE.getMaterialColor().col);
	public static final @Nullable RegistrySupplier<MedievalArmorItem> PURPLE_PUFF_AND_SLASH_LEGGINGS = addDyeableMedievalArmorItem("purple_puff_and_slash_leggings", AddonArmorTypes.PURPLE_PUFF_AND_SLASH, EquipmentSlot.LEGS, new Item.Properties().tab(ModCreativeTabs.ARMOR), DyeColor.WHITE.getMaterialColor().col);
	public static final @Nullable RegistrySupplier<MedievalArmorItem> BLUE_PUFF_AND_SLASH_CHESTPLATE = addDyeableMedievalArmorItem("blue_puff_and_slash_chestplate", AddonArmorTypes.BLUE_PUFF_AND_SLASH, EquipmentSlot.CHEST, new Item.Properties().tab(ModCreativeTabs.ARMOR), DyeColor.WHITE.getMaterialColor().col);
	public static final @Nullable RegistrySupplier<MedievalArmorItem> BLUE_PUFF_AND_SLASH_LEGGINGS = addDyeableMedievalArmorItem("blue_puff_and_slash_leggings", AddonArmorTypes.BLUE_PUFF_AND_SLASH, EquipmentSlot.LEGS, new Item.Properties().tab(ModCreativeTabs.ARMOR), DyeColor.WHITE.getMaterialColor().col);
	public static final @Nullable RegistrySupplier<MedievalArmorItem> BROWN_PUFF_AND_SLASH_CHESTPLATE = addDyeableMedievalArmorItem("brown_puff_and_slash_chestplate", AddonArmorTypes.BROWN_PUFF_AND_SLASH, EquipmentSlot.CHEST, new Item.Properties().tab(ModCreativeTabs.ARMOR), DyeColor.WHITE.getMaterialColor().col);
	public static final @Nullable RegistrySupplier<MedievalArmorItem> BROWN_PUFF_AND_SLASH_LEGGINGS = addDyeableMedievalArmorItem("brown_puff_and_slash_leggings", AddonArmorTypes.BROWN_PUFF_AND_SLASH, EquipmentSlot.LEGS, new Item.Properties().tab(ModCreativeTabs.ARMOR), DyeColor.WHITE.getMaterialColor().col);
	public static final @Nullable RegistrySupplier<MedievalArmorItem> GREEN_PUFF_AND_SLASH_CHESTPLATE = addDyeableMedievalArmorItem("green_puff_and_slash_chestplate", AddonArmorTypes.GREEN_PUFF_AND_SLASH, EquipmentSlot.CHEST, new Item.Properties().tab(ModCreativeTabs.ARMOR), DyeColor.WHITE.getMaterialColor().col);
	public static final @Nullable RegistrySupplier<MedievalArmorItem> GREEN_PUFF_AND_SLASH_LEGGINGS = addDyeableMedievalArmorItem("green_puff_and_slash_leggings", AddonArmorTypes.GREEN_PUFF_AND_SLASH, EquipmentSlot.LEGS, new Item.Properties().tab(ModCreativeTabs.ARMOR), DyeColor.WHITE.getMaterialColor().col);
	public static final @Nullable RegistrySupplier<MedievalArmorItem> RED_PUFF_AND_SLASH_CHESTPLATE = addDyeableMedievalArmorItem("red_puff_and_slash_chestplate", AddonArmorTypes.RED_PUFF_AND_SLASH, EquipmentSlot.CHEST, new Item.Properties().tab(ModCreativeTabs.ARMOR), DyeColor.WHITE.getMaterialColor().col);
	public static final @Nullable RegistrySupplier<MedievalArmorItem> RED_PUFF_AND_SLASH_LEGGINGS = addDyeableMedievalArmorItem("red_puff_and_slash_leggings", AddonArmorTypes.RED_PUFF_AND_SLASH, EquipmentSlot.LEGS, new Item.Properties().tab(ModCreativeTabs.ARMOR), DyeColor.WHITE.getMaterialColor().col);
	public static final @Nullable RegistrySupplier<MedievalArmorItem> BLACK_PUFF_AND_SLASH_CHESTPLATE = addDyeableMedievalArmorItem("black_puff_and_slash_chestplate", AddonArmorTypes.BLACK_PUFF_AND_SLASH, EquipmentSlot.CHEST, new Item.Properties().tab(ModCreativeTabs.ARMOR), DyeColor.WHITE.getMaterialColor().col);
	public static final @Nullable RegistrySupplier<MedievalArmorItem> BLACK_PUFF_AND_SLASH_LEGGINGS = addDyeableMedievalArmorItem("black_puff_and_slash_leggings", AddonArmorTypes.BLACK_PUFF_AND_SLASH, EquipmentSlot.LEGS, new Item.Properties().tab(ModCreativeTabs.ARMOR), DyeColor.WHITE.getMaterialColor().col);
	public static final @Nullable RegistrySupplier<MedievalArmorItem> WHITE_PUFF_AND_SLASH_CHESTPLATE = addDyeableMedievalArmorItem("white_puff_and_slash_chestplate", AddonArmorTypes.WHITE_PUFF_AND_SLASH, EquipmentSlot.CHEST, new Item.Properties().tab(ModCreativeTabs.ARMOR), DyeColor.WHITE.getMaterialColor().col);
	public static final @Nullable RegistrySupplier<MedievalArmorItem> WHITE_PUFF_AND_SLASH_LEGGINGS = addDyeableMedievalArmorItem("white_puff_and_slash_leggings", AddonArmorTypes.WHITE_PUFF_AND_SLASH, EquipmentSlot.LEGS, new Item.Properties().tab(ModCreativeTabs.ARMOR), DyeColor.WHITE.getMaterialColor().col);
	public static final @Nullable RegistrySupplier<MedievalArmorItem> WHITE_UFF_AND_SLASH_BOOTS = addMedievalArmorItem("puff_and_slash_boots", AddonArmorTypes.PUFF_AND_SLASH, EquipmentSlot.FEET, new Item.Properties().tab(ModCreativeTabs.ARMOR));

	public static final @Nullable RegistrySupplier<MedievalArmorItem> LINEN_COIF = addDyeableMedievalArmorItem("linen_coif", AddonArmorTypes.LINEN, EquipmentSlot.HEAD, new Item.Properties().tab(ModCreativeTabs.ARMOR), DyeColor.WHITE.getMaterialColor().col);
	
	public static final @Nullable RegistrySupplier<MedievalArmorItem> SALLET_WITHOUT_NECK_PROTECTION = addMedievalArmorItem("sallet_without_neck_protection", AddonArmorTypes.SALLET_WITHOUT_NECK_PROTECTION, EquipmentSlot.HEAD, new Item.Properties().tab(ModCreativeTabs.ARMOR));
	
	public static final @Nullable RegistrySupplier<MedievalArmorItem> BELLOWS_MAXIMILIAN_HELMET = addMedievalArmorItem("bellows_maximilian_helmet", AddonArmorTypes.BELLOWS_MAXIMILIAN_HELMET, EquipmentSlot.HEAD, new Item.Properties().tab(ModCreativeTabs.ARMOR));
	
	public static final @Nullable RegistrySupplier<MedievalArmorItem> KLAPPVISOR_BASCINET = addMedievalArmorItem("klappvisor_bascinet", AddonArmorTypes.KLAPPVISOR_BASCINET, EquipmentSlot.HEAD, new Item.Properties().tab(ModCreativeTabs.ARMOR));
	public static final @Nullable RegistrySupplier<MedievalArmorItem> LATE_BASCINET = addMedievalArmorItem("late_bascinet", AddonArmorTypes.LATE_BASCINET, EquipmentSlot.HEAD, new Item.Properties().tab(ModCreativeTabs.ARMOR));

    public static final @Nullable RegistrySupplier<MedievalArmorItem> SCALE_HELMET = addMedievalArmorItem("scale_helmet", AddonArmorTypes.SCALE_HELMET, EquipmentSlot.HEAD, new Item.Properties().tab(ModCreativeTabs.ARMOR));
	
	public static final @Nullable RegistrySupplier<MedievalArmorItem> CHAPEL = addDyeableMedievalArmorItem("chapel", AddonArmorTypes.CHAPEL, EquipmentSlot.HEAD, new Item.Properties().tab(ModCreativeTabs.ARMOR), -4280691);
	public static final @Nullable RegistrySupplier<MedievalArmorItem> CHAINED_GAMBESON = addDyeableMedievalArmorItem("chained_gambeson", AddonArmorTypes.CHAINED_GAMBESON, EquipmentSlot.CHEST, new Item.Properties().tab(ModCreativeTabs.ARMOR), -4280691);
	public static final @Nullable RegistrySupplier<MedievalArmorItem> CHAINED_GAMBESON_BOOTS = addDyeableMedievalArmorItem("chained_gambeson_boots", AddonArmorTypes.CHAINED_GAMBESON, EquipmentSlot.FEET, new Item.Properties().tab(ModCreativeTabs.ARMOR), -4280691);
	
	public static final @Nullable RegistrySupplier<MedievalArmorItem> TABLET_HELMET = addMedievalArmorItem("tablet_helmet", AddonArmorTypes.TABLET_HELMET, EquipmentSlot.HEAD, new Item.Properties().tab(ModCreativeTabs.ARMOR));

	public static final @Nullable RegistrySupplier<MedievalArmorItem> LATE_GREATHELM = addMedievalArmorItem("late_greathelm", AddonArmorTypes.LATE_GREATHELM, EquipmentSlot.HEAD, new Item.Properties().tab(ModCreativeTabs.ARMOR));
	
	public static final @Nullable RegistrySupplier<MedievalArmorItem> BURGUNDIAN_KETTLEHAT = addMedievalArmorItem("burgundian_kettlehat", AddonArmorTypes.BURGUNDIAN_KETTLEHAT, EquipmentSlot.HEAD, new Item.Properties().tab(ModCreativeTabs.ARMOR));
	
	public static final @Nullable RegistrySupplier<MedievalArmorItem> CLOSED_BURGONET = addMedievalArmorItem("closed_burgonet", AddonArmorTypes.CLOSED_BURGONET, EquipmentSlot.HEAD, new Item.Properties().tab(ModCreativeTabs.ARMOR));

	public static final @Nullable RegistrySupplier<MedievalArmorItem> LATE_BURGONET = addMedievalArmorItem("late_burgonet", AddonArmorTypes.LATE_BURGONET, EquipmentSlot.HEAD, new Item.Properties().tab(ModCreativeTabs.ARMOR));

	public static final @Nullable RegistrySupplier<MedievalArmorItem> LIGHT_BURGONET = addMedievalArmorItem("light_burgonet", AddonArmorTypes.LIGHT_BURGONET, EquipmentSlot.HEAD, new Item.Properties().tab(ModCreativeTabs.ARMOR));

	public static final @Nullable RegistrySupplier<MedievalArmorItem> DEVILISH_GROTESQUE_MAXIMILIAN_HELMET = addMedievalArmorItem("devilish_grotesque_maximilian_helmet", AddonArmorTypes.DEVILISH_GROTESQUE_MAXIMILIAN_HELMET, EquipmentSlot.HEAD, new Item.Properties().tab(ModCreativeTabs.ARMOR));

	public static final @Nullable RegistrySupplier<MedievalArmorItem> FACIAL_GROTESQUE_MAXIMILIAN_HELMET = addMedievalArmorItem("facial_grotesque_maximilian_helmet", AddonArmorTypes.FACIAL_GROTESQUE_MAXIMILIAN_HELMET, EquipmentSlot.HEAD, new Item.Properties().tab(ModCreativeTabs.ARMOR));

	public static final @Nullable RegistrySupplier<MedievalArmorItem> DARK_GILDED_GREENWICH_ARMET = addMedievalArmorItem("dark_gilded_greenwich_armet", AddonArmorTypes.DARK_GILDED_GREENWICH_ARMET, EquipmentSlot.HEAD, new Item.Properties().tab(ModCreativeTabs.ARMOR));
	public static final @Nullable RegistrySupplier<MedievalArmorItem> DARK_GILDED_GREENWICH_CHESTPLATE = addMedievalArmorItem("dark_gilded_greenwich_chestplate", AddonArmorTypes.DARK_GILDED_GREENWICH, EquipmentSlot.CHEST, new Item.Properties().tab(ModCreativeTabs.ARMOR));
	public static final @Nullable RegistrySupplier<MedievalArmorItem> DARK_GILDED_GREENWICH_BOOTS = addMedievalArmorItem("dark_gilded_greenwich_boots", AddonArmorTypes.DARK_GILDED_GREENWICH, EquipmentSlot.FEET, new Item.Properties().tab(ModCreativeTabs.ARMOR));

	public static final @Nullable RegistrySupplier<MedievalArmorItem> DARK_GREENWICH_ARMET = addMedievalArmorItem("dark_greenwich_armet", AddonArmorTypes.DARK_GREENWICH_ARMET, EquipmentSlot.HEAD, new Item.Properties().tab(ModCreativeTabs.ARMOR));
	public static final @Nullable RegistrySupplier<MedievalArmorItem> DARK_GREENWICH_CHESTPLATE = addMedievalArmorItem("dark_greenwich_chestplate", AddonArmorTypes.DARK_GREENWICH, EquipmentSlot.CHEST, new Item.Properties().tab(ModCreativeTabs.ARMOR));
	public static final @Nullable RegistrySupplier<MedievalArmorItem> DARK_GREENWICH_BOOTS = addMedievalArmorItem("dark_greenwich_boots", AddonArmorTypes.DARK_GREENWICH, EquipmentSlot.FEET, new Item.Properties().tab(ModCreativeTabs.ARMOR));

	public static final @Nullable RegistrySupplier<MedievalArmorItem> LATE_SALLET = addMedievalArmorItem("late_sallet", AddonArmorTypes.LATE_SALLET, EquipmentSlot.HEAD, new Item.Properties().tab(ModCreativeTabs.ARMOR));

	public static final @Nullable RegistrySupplier<MedievalArmorItem> DARK_LATE_SALLET = addMedievalArmorItem("dark_late_sallet", AddonArmorTypes.DARK_LATE_SALLET, EquipmentSlot.HEAD, new Item.Properties().tab(ModCreativeTabs.ARMOR));

	public static final @Nullable RegistrySupplier<MedievalArmorItem> STEEL_PUFF_AND_SLASH_CHESTPLATE = addMedievalArmorItem("steel_puff_and_slash_chestplate", AddonArmorTypes.STEEL_PUFF_AND_SLASH, EquipmentSlot.CHEST, new Item.Properties().tab(ModCreativeTabs.ARMOR));
	public static final @Nullable RegistrySupplier<MedievalArmorItem> STEEL_PUFF_AND_SLASH_BOOTS = addMedievalArmorItem("steel_puff_and_slash_boots", AddonArmorTypes.STEEL_PUFF_AND_SLASH, EquipmentSlot.FEET, new Item.Properties().tab(ModCreativeTabs.ARMOR));

	public static final @Nullable RegistrySupplier<MedievalArmorItem> STURMHAUBE = addMedievalArmorItem("sturmhaube", AddonArmorTypes.STURMHAUBE, EquipmentSlot.HEAD, new Item.Properties().tab(ModCreativeTabs.ARMOR));

	public static final @Nullable RegistrySupplier<MedievalArmorItem> SILVERED_DARK_MAXIMILIAN_HELMET = addMedievalArmorItem("silvered_dark_maximilian_helmet", AddonArmorTypes.SILVERED_DARK_MAXIMILIAN_HELMET, EquipmentSlot.HEAD, new Item.Properties().tab(ModCreativeTabs.ARMOR));
	public static final @Nullable RegistrySupplier<MedievalArmorItem> SILVERED_DARK_MAXIMILIAN_CHESTPLATE = addMedievalArmorItem("silvered_dark_maximilian_chestplate", AddonArmorTypes.SILVERED_DARK_MAXIMILIAN, EquipmentSlot.CHEST, new Item.Properties().tab(ModCreativeTabs.ARMOR));
	public static final @Nullable RegistrySupplier<MedievalArmorItem> SILVERED_DARK_MAXIMILIAN_BOOTS = addMedievalArmorItem("silvered_dark_maximilian_boots", AddonArmorTypes.SILVERED_DARK_MAXIMILIAN, EquipmentSlot.FEET, new Item.Properties().tab(ModCreativeTabs.ARMOR));

	public static final @Nullable RegistrySupplier<MedievalArmorItem> SILVERED_DARK_BELLOWS_MAXIMILIAN_HELMET = addMedievalArmorItem("silvered_dark_bellows_maximilian_helmet", AddonArmorTypes.SILVERED_DARK_BELLOWS_MAXIMILIAN_HELMET, EquipmentSlot.HEAD, new Item.Properties().tab(ModCreativeTabs.ARMOR));

	public static final @Nullable RegistrySupplier<MedievalArmorItem> GILDED_GRAND_BASCINET = addMedievalArmorItem("gilded_grand_bascinet", AddonArmorTypes.GILDED_GRAND_BASCINET, EquipmentSlot.HEAD, new Item.Properties().tab(ModCreativeTabs.ARMOR));
	public static final @Nullable RegistrySupplier<MedievalArmorItem> CEREMONIAL_KASTENBRUST_CHESTPLATE = addDyeableMedievalArmorItem("ceremonial_kastenbrust_chestplate", AddonArmorTypes.CEREMONIAL_KASTENBRUST, EquipmentSlot.CHEST, new Item.Properties().tab(ModCreativeTabs.ARMOR), DyeColor.RED.getMaterialColor().col);
	public static final @Nullable RegistrySupplier<MedievalArmorItem> CEREMONIAL_KASTENBRUST_BOOTS = addDyeableMedievalArmorItem("ceremonial_kastenbrust_boots", AddonArmorTypes.CEREMONIAL_KASTENBRUST, EquipmentSlot.FEET, new Item.Properties().tab(ModCreativeTabs.ARMOR), DyeColor.RED.getMaterialColor().col);

	public static final @Nullable RegistrySupplier<MedievalArmorItem> GILDED_STEEL_PUFF_AND_SLASH_CHESTPLATE = addMedievalArmorItem("gilded_steel_puff_and_slash_chestplate", AddonArmorTypes.GILDED_STEEL_PUFF_AND_SLASH, EquipmentSlot.CHEST, new Item.Properties().tab(ModCreativeTabs.ARMOR));
	public static final @Nullable RegistrySupplier<MedievalArmorItem> GILDED_STEEL_PUFF_AND_SLASH_BOOTS = addMedievalArmorItem("gilded_steel_puff_and_slash_boots", AddonArmorTypes.GILDED_STEEL_PUFF_AND_SLASH, EquipmentSlot.FEET, new Item.Properties().tab(ModCreativeTabs.ARMOR));

	public static final @Nullable RegistrySupplier<MedievalArmorItem> HEAVY_CUIRASSIER_CHESTPLATE = addMedievalArmorItem("heavy_cuirassier_chestplate", AddonArmorTypes.HEAVY_CUIRASSIER, EquipmentSlot.CHEST, new Item.Properties().tab(ModCreativeTabs.ARMOR));
	public static final @Nullable RegistrySupplier<MedievalArmorItem> HEAVY_CUIRASSIER_BOOTS = addMedievalArmorItem("heavy_cuirassier_boots", AddonArmorTypes.HEAVY_CUIRASSIER, EquipmentSlot.FEET, new Item.Properties().tab(ModCreativeTabs.ARMOR));

	public static final @Nullable RegistrySupplier<MedievalArmorItem> DARK_HEAVY_CUIRASSIER_CHESTPLATE = addMedievalArmorItem("dark_heavy_cuirassier_chestplate", AddonArmorTypes.DARK_HEAVY_CUIRASSIER, EquipmentSlot.CHEST, new Item.Properties().tab(ModCreativeTabs.ARMOR));
	public static final @Nullable RegistrySupplier<MedievalArmorItem> DARK_HEAVY_CUIRASSIER_BOOTS = addMedievalArmorItem("dark_heavy_cuirassier_boots", AddonArmorTypes.DARK_HEAVY_CUIRASSIER, EquipmentSlot.FEET, new Item.Properties().tab(ModCreativeTabs.ARMOR));

	public static final @Nullable RegistrySupplier<MedievalArmorItem> GILDED_XIV_CENTURY_KNIGHT_CHESTPLATE = addMedievalArmorItem("gilded_xivcenturyknight_chestplate", AddonArmorTypes.GILDED_XIV_CENTURY_KNIGHT, EquipmentSlot.CHEST, new Item.Properties().tab(ModCreativeTabs.ARMOR));
	public static final @Nullable RegistrySupplier<MedievalArmorItem> GILDED_XIV_CENTURY_KNIGHT_BOOTS = addMedievalArmorItem("gilded_xivcenturyknight_boots", AddonArmorTypes.GILDED_XIV_CENTURY_KNIGHT, EquipmentSlot.FEET, new Item.Properties().tab(ModCreativeTabs.ARMOR));

	public static final @Nullable RegistrySupplier<MedievalArmorItem> GALLOWGLASS_CHESTPLATE = addDyeableMedievalArmorItem("gallowglass_chestplate", AddonArmorTypes.GALLOWGLASS, EquipmentSlot.CHEST, new Item.Properties().tab(ModCreativeTabs.ARMOR), 0xc4c38c);
	public static final @Nullable RegistrySupplier<MedievalArmorItem> GALLOWGLASS_LEGGINGS = addDyeableMedievalArmorItem("gallowglass_leggings", AddonArmorTypes.GALLOWGLASS, EquipmentSlot.LEGS, new Item.Properties().tab(ModCreativeTabs.ARMOR), 0xc4c38c);
	public static final @Nullable RegistrySupplier<MedievalArmorItem> GALLOWGLASS_BOOTS = addMedievalArmorItem("gallowglass_boots", AddonArmorTypes.GALLOWGLASS, EquipmentSlot.FEET, new Item.Properties().tab(ModCreativeTabs.ARMOR));

	public static final @Nullable RegistrySupplier<MedievalArmorItem> ENGLISH_KNIGHT_CHESTPLATE = addMedievalArmorItem("english_knight_chestplate", AddonArmorTypes.ENGLISH_KNIGHT, EquipmentSlot.CHEST, new Item.Properties().tab(ModCreativeTabs.ARMOR));
	public static final @Nullable RegistrySupplier<MedievalArmorItem> ENGLISH_KNIGHT_BOOTS = addMedievalArmorItem("english_knight_boots", AddonArmorTypes.ENGLISH_KNIGHT, EquipmentSlot.FEET, new Item.Properties().tab(ModCreativeTabs.ARMOR));

	public static final @Nullable RegistrySupplier<MedievalArmorItem> GILDED_HALF_ARMOR = addMedievalArmorItem("gilded_half_armor", AddonArmorTypes.GILDED_HALF_ARMOR, EquipmentSlot.CHEST, new Item.Properties().tab(ModCreativeTabs.ARMOR));

//	public static final @Nullable RegistrySupplier<MedievalArmorItem> GILDED_MAXIMILIAN_HELMET = addMedievalArmorItem("gilded_maximilian_helmet", AddonArmorTypes.GILDED_MAXIMILIAN_HELMET, EquipmentSlot.HEAD, new Item.Properties().tab(ModCreativeTabs.ARMOR);
	public static final @Nullable RegistrySupplier<MedievalArmorItem> GILDED_MAXIMILIAN_CHESTPLATE = addMedievalArmorItem("gilded_maximilian_chestplate", AddonArmorTypes.GILDED_MAXIMILIAN, EquipmentSlot.CHEST, new Item.Properties().tab(ModCreativeTabs.ARMOR));
	public static final @Nullable RegistrySupplier<MedievalArmorItem> GILDED_MAXIMILIAN_BOOTS = addMedievalArmorItem("gilded_maximilian_boots", AddonArmorTypes.GILDED_MAXIMILIAN, EquipmentSlot.FEET, new Item.Properties().tab(ModCreativeTabs.ARMOR));

	public static final @Nullable RegistrySupplier<MedievalArmorItem> COAT_OF_PLATES_CHESTPLATE = addDyeableMedievalArmorItem("coat_of_plates_chestplate", AddonArmorTypes.COAT_OF_PLATES, EquipmentSlot.CHEST, new Item.Properties().tab(ModCreativeTabs.ARMOR), DyeColor.BROWN.getMaterialColor().col);
	public static final @Nullable RegistrySupplier<MedievalArmorItem> COAT_OF_PLATES_BOOTS = addDyeableMedievalArmorItem("coat_of_plates_boots", AddonArmorTypes.COAT_OF_PLATES, EquipmentSlot.FEET, new Item.Properties().tab(ModCreativeTabs.ARMOR), DyeColor.BROWN.getMaterialColor().col);

	public static final @Nullable RegistrySupplier<MedievalArmorItem> SILVERED_DARK_HALF_ARMOR = addMedievalArmorItem("silvered_dark_half_armor", AddonArmorTypes.SILVERED_DARK_HALF_ARMOR, EquipmentSlot.CHEST, new Item.Properties().tab(ModCreativeTabs.ARMOR));

	public static final @Nullable RegistrySupplier<MedievalArmorItem> GILDED_DARK_SALLET = addMedievalArmorItem("gilded_dark_sallet", AddonArmorTypes.GILDED_DARK_SALLET, EquipmentSlot.HEAD, new Item.Properties().tab(ModCreativeTabs.ARMOR));
	public static final @Nullable RegistrySupplier<MedievalArmorItem> GILDED_DARK_GOTHIC_CHESTPLATE = addMedievalArmorItem("gilded_dark_gothic_chestplate", AddonArmorTypes.GILDED_DARK_GOTHIC, EquipmentSlot.CHEST, new Item.Properties().tab(ModCreativeTabs.ARMOR));
	public static final @Nullable RegistrySupplier<MedievalArmorItem> GILDED_DARK_GOTHIC_BOOTS = addMedievalArmorItem("gilded_dark_gothic_boots", AddonArmorTypes.GILDED_DARK_GOTHIC, EquipmentSlot.FEET, new Item.Properties().tab(ModCreativeTabs.ARMOR));

	public static final @Nullable RegistrySupplier<MedievalArmorItem> GILDED_SALLET = addMedievalArmorItem("gilded_sallet", AddonArmorTypes.GILDED_SALLET, EquipmentSlot.HEAD, new Item.Properties().tab(ModCreativeTabs.ARMOR));
	public static final @Nullable RegistrySupplier<MedievalArmorItem> GILDED_GOTHIC_CHESTPLATE = addMedievalArmorItem("gilded_gothic_chestplate", AddonArmorTypes.GILDED_GOTHIC, EquipmentSlot.CHEST, new Item.Properties().tab(ModCreativeTabs.ARMOR));
	public static final @Nullable RegistrySupplier<MedievalArmorItem> GILDED_GOTHIC_BOOTS = addMedievalArmorItem("gilded_gothic_boots", AddonArmorTypes.GILDED_GOTHIC, EquipmentSlot.FEET, new Item.Properties().tab(ModCreativeTabs.ARMOR));

	public static final @Nullable RegistrySupplier<MedievalArmorItem> GILDED_EXQUISITE_MAXIMILIAN_HELMET = addMedievalArmorItem("gilded_exquisite_maximilian_helmet", AddonArmorTypes.GILDED_EXQUISITE_MAXIMILIAN_HELMET, EquipmentSlot.HEAD, new Item.Properties().tab(ModCreativeTabs.ARMOR));

	public static final @Nullable RegistrySupplier<MedievalArmorItem> GILDED_GREENWICH_ARMET = addMedievalArmorItem("gilded_greenwich_armet", AddonArmorTypes.GILDED_GREENWICH_ARMET, EquipmentSlot.HEAD, new Item.Properties().tab(ModCreativeTabs.ARMOR));
	public static final @Nullable RegistrySupplier<MedievalArmorItem> GILDED_GREENWICH_CHESTPLATE = addMedievalArmorItem("gilded_greenwich_chestplate", AddonArmorTypes.GILDED_GREENWICH, EquipmentSlot.CHEST, new Item.Properties().tab(ModCreativeTabs.ARMOR));
	public static final @Nullable RegistrySupplier<MedievalArmorItem> GILDED_GREENWICH_BOOTS = addMedievalArmorItem("gilded_greenwich_boots", AddonArmorTypes.GILDED_GREENWICH, EquipmentSlot.FEET, new Item.Properties().tab(ModCreativeTabs.ARMOR));

	public static final @Nullable RegistrySupplier<MedievalArmorItem> GREENWICH_ARMET = addMedievalArmorItem("greenwich_armet", AddonArmorTypes.GREENWICH_ARMET, EquipmentSlot.HEAD, new Item.Properties().tab(ModCreativeTabs.ARMOR));
	public static final @Nullable RegistrySupplier<MedievalArmorItem> GREENWICH_CHESTPLATE = addMedievalArmorItem("greenwich_chestplate", AddonArmorTypes.GREENWICH, EquipmentSlot.CHEST, new Item.Properties().tab(ModCreativeTabs.ARMOR));
	public static final @Nullable RegistrySupplier<MedievalArmorItem> GREENWICH_BOOTS = addMedievalArmorItem("greenwich_boots", AddonArmorTypes.GREENWICH, EquipmentSlot.FEET, new Item.Properties().tab(ModCreativeTabs.ARMOR));

	public static final @Nullable RegistrySupplier<MedievalArmorItem> CONDOTTIERO_CAP = addDyeableMedievalArmorItem("condottiero_cap", AddonArmorTypes.CONDOTTIERO_CAP, EquipmentSlot.HEAD, new Item.Properties().tab(ModCreativeTabs.ARMOR), DyeColor.RED.getMaterialColor().col);

	public static final @Nullable RegistrySupplier<MedievalArmorItem> SUGARLOAF_HELMET = addMedievalArmorItem("sugarloaf_helmet", AddonArmorTypes.SUGARLOAF_HELMET, EquipmentSlot.HEAD, new Item.Properties().tab(ModCreativeTabs.ARMOR));

	public static final @Nullable RegistrySupplier<MedievalArmorItem> GILDED_SUGARLOAF_HELMET = addMedievalArmorItem("gilded_sugarloaf_helmet", AddonArmorTypes.GILDED_SUGARLOAF_HELMET, EquipmentSlot.HEAD, new Item.Properties().tab(ModCreativeTabs.ARMOR));

	public static final @Nullable RegistrySupplier<MedievalArmorItem> PATRICIAN_TUHER_HELMET = addMedievalArmorItem("patrician_tuher_helmet", AddonArmorTypes.PATRICIAN_TUHER_HELMET, EquipmentSlot.HEAD, new Item.Properties().tab(ModCreativeTabs.ARMOR));

	public static final @Nullable RegistrySupplier<MedievalArmorItem> LATE_KETTLEHAT = addMedievalArmorItem("late_kettlehat", AddonArmorTypes.LATE_KETTLEHAT, EquipmentSlot.HEAD, new Item.Properties().tab(ModCreativeTabs.ARMOR));

	public static final @Nullable RegistrySupplier<MedievalArmorItem> CLOSE_HELMET = addMedievalArmorItem("close_helmet", AddonArmorTypes.CLOSE_HELMET, EquipmentSlot.HEAD, new Item.Properties().tab(ModCreativeTabs.ARMOR));

	public static final @Nullable RegistrySupplier<MedievalArmorItem> EXQUISITE_MAXIMILIAN_HELMET = addMedievalArmorItem("exquisite_maximilian_helmet", AddonArmorTypes.EXQUISITE_MAXIMILIAN_HELMET, EquipmentSlot.HEAD, new Item.Properties().tab(ModCreativeTabs.ARMOR));

	public static final @Nullable RegistrySupplier<MedievalArmorItem> PROTO_MAXIMILIAN_CHESTPLATE = addMedievalArmorItem("proto_maximilian_chestplate", AddonArmorTypes.PROTO_MAXIMILIAN, EquipmentSlot.CHEST, new Item.Properties().tab(ModCreativeTabs.ARMOR));
	public static final @Nullable RegistrySupplier<MedievalArmorItem> PROTO_MAXIMILIAN_BOOTS = addMedievalArmorItem("proto_maximilian_boots", AddonArmorTypes.PROTO_MAXIMILIAN, EquipmentSlot.FEET, new Item.Properties().tab(ModCreativeTabs.ARMOR));

	public static final @Nullable RegistrySupplier<MedievalArmorItem> DARK_PROTO_MAXIMILIAN_CHESTPLATE = addDyeableMedievalArmorItem("dark_proto_maximilian_chestplate", AddonArmorTypes.DARK_PROTO_MAXIMILIAN, EquipmentSlot.CHEST, new Item.Properties().tab(ModCreativeTabs.ARMOR), DyeColor.RED.getMaterialColor().col);
	public static final @Nullable RegistrySupplier<MedievalArmorItem> DARK_PROTO_MAXIMILIAN_BOOTS = addMedievalArmorItem("dark_proto_maximilian_boots", AddonArmorTypes.DARK_PROTO_MAXIMILIAN, EquipmentSlot.FEET, new Item.Properties().tab(ModCreativeTabs.ARMOR));

	public static final @Nullable RegistrySupplier<MedievalArmorItem> HEAVY_BRIGANDINE_CHESTPLATE = addDyeableMedievalArmorItem("heavy_brigandine_chestplate", AddonArmorTypes.HEAVY_BRIGANDINE, EquipmentSlot.CHEST, new Item.Properties().tab(ModCreativeTabs.ARMOR), 10511680);
	public static final @Nullable RegistrySupplier<MedievalArmorItem> HEAVY_BRIGANDINE_LEGGINGS = addDyeableMedievalArmorItem("heavy_brigandine_leggings", AddonArmorTypes.HEAVY_BRIGANDINE, EquipmentSlot.LEGS, new Item.Properties().tab(ModCreativeTabs.ARMOR), 10511680);
	public static final @Nullable RegistrySupplier<MedievalArmorItem> HEAVY_BRIGANDINE_BOOTS = addMedievalArmorItem("heavy_brigandine_boots", AddonArmorTypes.HEAVY_BRIGANDINE, EquipmentSlot.FEET, new Item.Properties().tab(ModCreativeTabs.ARMOR));

	public static final @Nullable RegistrySupplier<MedievalArmorItem> GILDED_HEAVY_BRIGANDINE_CHESTPLATE = addDyeableMedievalArmorItem("gilded_heavy_brigandine_chestplate", AddonArmorTypes.GILDED_HEAVY_BRIGANDINE, EquipmentSlot.CHEST, new Item.Properties().tab(ModCreativeTabs.ARMOR), 10511680);
	public static final @Nullable RegistrySupplier<MedievalArmorItem> GILDED_HEAVY_BRIGANDINE_LEGGINGS = addDyeableMedievalArmorItem("gilded_heavy_brigandine_leggings", AddonArmorTypes.GILDED_HEAVY_BRIGANDINE, EquipmentSlot.LEGS, new Item.Properties().tab(ModCreativeTabs.ARMOR), 10511680);
	public static final @Nullable RegistrySupplier<MedievalArmorItem> GILDED_HEAVY_BRIGANDINE_BOOTS = addMedievalArmorItem("gilded_heavy_brigandine_boots", AddonArmorTypes.GILDED_HEAVY_BRIGANDINE, EquipmentSlot.FEET, new Item.Properties().tab(ModCreativeTabs.ARMOR));

	public static final @Nullable RegistrySupplier<MedievalArmorItem> DARK_HEAVY_BRIGANDINE_CHESTPLATE = addDyeableMedievalArmorItem("dark_heavy_brigandine_chestplate", AddonArmorTypes.DARK_HEAVY_BRIGANDINE, EquipmentSlot.CHEST, new Item.Properties().tab(ModCreativeTabs.ARMOR), 0x3a2818);
	public static final @Nullable RegistrySupplier<MedievalArmorItem> DARK_HEAVY_BRIGANDINE_LEGGINGS = addDyeableMedievalArmorItem("dark_heavy_brigandine_leggings", AddonArmorTypes.DARK_HEAVY_BRIGANDINE, EquipmentSlot.LEGS, new Item.Properties().tab(ModCreativeTabs.ARMOR), 0x3a2818);
	public static final @Nullable RegistrySupplier<MedievalArmorItem> DARK_HEAVY_BRIGANDINE_BOOTS = addMedievalArmorItem("dark_heavy_brigandine_boots", AddonArmorTypes.DARK_HEAVY_BRIGANDINE, EquipmentSlot.FEET, new Item.Properties().tab(ModCreativeTabs.ARMOR));

	public static final @Nullable RegistrySupplier<MedievalArmorItem> CABASSET = addMedievalArmorItem("cabasset", AddonArmorTypes.CABASSET, EquipmentSlot.HEAD, new Item.Properties().tab(ModCreativeTabs.ARMOR));

	public static final @Nullable RegistrySupplier<MedievalArmorItem> GILDED_CABASSET = addMedievalArmorItem("gilded_cabasset", AddonArmorTypes.GILDED_CABASSET, EquipmentSlot.HEAD, new Item.Properties().tab(ModCreativeTabs.ARMOR));

	public static final @Nullable RegistrySupplier<MedievalArmorItem> EARLY_CABASSET = addMedievalArmorItem("early_cabasset", AddonArmorTypes.EARLY_CABASSET, EquipmentSlot.HEAD, new Item.Properties().tab(ModCreativeTabs.ARMOR));
	
	public static final @Nullable RegistrySupplier<MedievalArmorItem> DARK_EARLY_CABASSET = addMedievalArmorItem("dark_early_cabasset", AddonArmorTypes.DARK_EARLY_CABASSET, EquipmentSlot.HEAD, new Item.Properties().tab(ModCreativeTabs.ARMOR));

	public static final @Nullable RegistrySupplier<MedievalArmorItem> GILDED_EARLY_CABASSET = addMedievalArmorItem("gilded_early_cabasset", AddonArmorTypes.GILDED_EARLY_CABASSET, EquipmentSlot.HEAD, new Item.Properties().tab(ModCreativeTabs.ARMOR));

	public static final @Nullable RegistrySupplier<MedievalArmorItem> STRAW_HAT = addMedievalArmorItem("straw_hat", AddonArmorTypes.STRAW_HAT, EquipmentSlot.HEAD, new Item.Properties().tab(ModCreativeTabs.ARMOR));

	public static final @Nullable RegistrySupplier<MedievalArmorItem> FANCY_HAT = addDyeableMedievalArmorItem("fancy_hat", AddonArmorTypes.FANCY_HAT, EquipmentSlot.HEAD, new Item.Properties().tab(ModCreativeTabs.ARMOR), DyeColor.RED.getMaterialColor().col);

	public static final @Nullable RegistrySupplier<MedievalArmorItem> TUNIC = addDyeableMedievalArmorItem("tunic", AddonArmorTypes.TUNIC, EquipmentSlot.CHEST, new Item.Properties().tab(ModCreativeTabs.ARMOR), -4280691);
	public static final @Nullable RegistrySupplier<MedievalArmorItem> TUNIC_BOOTS = addDyeableMedievalArmorItem("tunic_boots", AddonArmorTypes.TUNIC, EquipmentSlot.FEET, new Item.Properties().tab(ModCreativeTabs.ARMOR), -4280691);

	public static final @Nullable RegistrySupplier<MedievalArmorItem> EMBOSED_PARADE_BURGONET = addMedievalArmorItem("embosed_parade_burgonet", AddonArmorTypes.EMBOSED_PARADE_BURGONET, EquipmentSlot.HEAD, new Item.Properties().tab(ModCreativeTabs.ARMOR));

	public static final @Nullable RegistrySupplier<MedievalArmorItem> EMBOSED_PARADE_CHESTPLATE = addMedievalArmorItem("embosed_parade_chestplate", AddonArmorTypes.EMBOSED_PARADE, EquipmentSlot.CHEST, new Item.Properties().tab(ModCreativeTabs.ARMOR));
	public static final @Nullable RegistrySupplier<MedievalArmorItem> EMBOSED_PARADE_BOOTS = addMedievalArmorItem("embosed_parade_boots", AddonArmorTypes.EMBOSED_PARADE, EquipmentSlot.FEET, new Item.Properties().tab(ModCreativeTabs.ARMOR));

	public static final @Nullable RegistrySupplier<MedievalArmorItem> DARK_GILDED_PARADE_BURGONET = addMedievalArmorItem("dark_gilded_parade_burgonet", AddonArmorTypes.DARK_GILDED_PARADE_BURGONET, EquipmentSlot.HEAD, new Item.Properties().tab(ModCreativeTabs.ARMOR));

	public static final @Nullable RegistrySupplier<MedievalArmorItem> DARK_GILDED_PARADE_CHESTPLATE = addMedievalArmorItem("dark_gilded_parade_chestplate", AddonArmorTypes.DARK_GILDED_PARADE, EquipmentSlot.CHEST, new Item.Properties().tab(ModCreativeTabs.ARMOR));
	public static final @Nullable RegistrySupplier<MedievalArmorItem> DARK_GILDED_PARADE_BOOTS = addMedievalArmorItem("dark_gilded_parade_boots", AddonArmorTypes.DARK_GILDED_PARADE, EquipmentSlot.FEET, new Item.Properties().tab(ModCreativeTabs.ARMOR));
	
	public static final @Nullable RegistrySupplier<MedievalArmorItem> DOUBLET = addDyeableMedievalArmorItem("doublet", AddonArmorTypes.DOUBLET, EquipmentSlot.CHEST, new Item.Properties().tab(ModCreativeTabs.ARMOR), DyeColor.WHITE.getMaterialColor().col);
	public static final @Nullable RegistrySupplier<MedievalArmorItem> SHOES = addMedievalArmorItem("shoes", AddonArmorTypes.DOUBLET, EquipmentSlot.FEET, new Item.Properties().tab(ModCreativeTabs.ARMOR));


	// Horse Armor
	public static final @Nullable RegistrySupplier<MedievalHorseArmorItem> DARK_BARDING = ITEMS.register("dark_barding", () -> new MedievalHorseArmorItem(12, new ResourceLocation(EpicKnightsAddon.ID, "textures/entity/horse/armor/dark_barding.png"), new Item.Properties().tab(ModCreativeTabs.ARMOR).stacksTo(1)));

	// Decorations
	public static final RegistrySupplier<ArmorDecorationItem> GOLDEN_PINCE_NEZ_DECORATION = addArmorDecorationItem("golden_pince_nez_decoration", () -> new ArmorDecorationItem(new ResourceLocation(EpicKnightsAddon.ID, "golden_pince_nez").toString(), new Item.Properties().tab(ModCreativeTabs.ARMOR_DECORATIONS), EquipmentSlot.HEAD));
	public static final RegistrySupplier<ArmorDecorationItem> STEEL_MUSTACHE_DECORATION = addArmorDecorationItem("steel_mustache_decoration", () -> new ArmorDecorationItem(new ResourceLocation(EpicKnightsAddon.ID, "steel_mustache").toString(), new Item.Properties().tab(ModCreativeTabs.ARMOR_DECORATIONS), EquipmentSlot.HEAD));
	public static final RegistrySupplier<ArmorDecorationItem> STEEL_SKIRT_DECORATION = addArmorDecorationItem("steel_skirt_decoration", () -> new ArmorDecorationItem(new ResourceLocation(EpicKnightsAddon.ID, "steel_skirt").toString(), new Item.Properties().tab(ModCreativeTabs.ARMOR_DECORATIONS), EquipmentSlot.CHEST));
	public static final RegistrySupplier<ArmorDecorationItem> GILDED_STEEL_SKIRT_DECORATION = addArmorDecorationItem("gilded_steel_skirt_decoration", () -> new ArmorDecorationItem(new ResourceLocation(EpicKnightsAddon.ID, "gilded_steel_skirt").toString(), new Item.Properties().tab(ModCreativeTabs.ARMOR_DECORATIONS), EquipmentSlot.CHEST));
	public static final RegistrySupplier<ArmorDecorationItem> DARK_STEEL_SKIRT_DECORATION = addArmorDecorationItem("dark_steel_skirt_decoration", () -> new ArmorDecorationItem(new ResourceLocation(EpicKnightsAddon.ID, "dark_steel_skirt").toString(), new Item.Properties().tab(ModCreativeTabs.ARMOR_DECORATIONS), EquipmentSlot.CHEST));
	public static final RegistrySupplier<ArmorDecorationItem> GILDED_DARK_STEEL_SKIRT_DECORATION = addArmorDecorationItem("gilded_dark_steel_skirt_decoration", () -> new ArmorDecorationItem(new ResourceLocation(EpicKnightsAddon.ID, "gilded_dark_steel_skirt").toString(), new Item.Properties().tab(ModCreativeTabs.ARMOR_DECORATIONS), EquipmentSlot.CHEST));
	public static final RegistrySupplier<ArmorDecorationItem> HELMET_RONDEL_DECORATION = addArmorDecorationItem("helmet_rondel_decoration", () -> new ArmorDecorationItem(new ResourceLocation(EpicKnightsAddon.ID, "helmet_rondel").toString(), new Item.Properties().tab(ModCreativeTabs.ARMOR_DECORATIONS), EquipmentSlot.HEAD));
	public static final RegistrySupplier<ArmorDecorationItem> GILDED_HELMET_RONDEL_DECORATION = addArmorDecorationItem("gilded_helmet_rondel_decoration", () -> new ArmorDecorationItem(new ResourceLocation(EpicKnightsAddon.ID, "gilded_helmet_rondel").toString(), new Item.Properties().tab(ModCreativeTabs.ARMOR_DECORATIONS), EquipmentSlot.HEAD));
	public static final RegistrySupplier<ArmorDecorationItem> DARK_HELMET_RONDEL_DECORATION = addArmorDecorationItem("dark_helmet_rondel_decoration", () -> new ArmorDecorationItem(new ResourceLocation(EpicKnightsAddon.ID, "dark_helmet_rondel").toString(), new Item.Properties().tab(ModCreativeTabs.ARMOR_DECORATIONS), EquipmentSlot.HEAD));
	public static final RegistrySupplier<ArmorDecorationItem> GILDED_DARK_HELMET_RONDEL_DECORATION = addArmorDecorationItem("gilded_dark_helmet_rondel_decoration", () -> new ArmorDecorationItem(new ResourceLocation(EpicKnightsAddon.ID, "gilded_dark_helmet_rondel").toString(), new Item.Properties().tab(ModCreativeTabs.ARMOR_DECORATIONS), EquipmentSlot.HEAD));
	public static final RegistrySupplier<ArmorDecorationItem> DARK_HEAVY_SHOULDER_PAD_DECORATION = addArmorDecorationItem("dark_heavy_shoulder_pad_decoration", () -> new ArmorDecorationItem(new ResourceLocation(EpicKnightsAddon.ID, "dark_heavy_shoulder_pad").toString(), new Item.Properties().tab(ModCreativeTabs.ARMOR_DECORATIONS), EquipmentSlot.CHEST));
	public static final RegistrySupplier<ArmorDecorationItem> DARK_SHOULDER_PADS_DECORATION = addArmorDecorationItem("dark_shoulder_pads_decoration", () -> new ArmorDecorationItem(new ResourceLocation(EpicKnightsAddon.ID, "dark_shoulder_pads").toString(), new Item.Properties().tab(ModCreativeTabs.ARMOR_DECORATIONS), EquipmentSlot.CHEST));
	public static final RegistrySupplier<ArmorDecorationItem> GILDED_SHOULDER_PADS_DECORATION = addArmorDecorationItem("gilded_shoulder_pads_decoration", () -> new ArmorDecorationItem(new ResourceLocation(EpicKnightsAddon.ID, "gilded_shoulder_pads").toString(), new Item.Properties().tab(ModCreativeTabs.ARMOR_DECORATIONS), EquipmentSlot.CHEST));
	public static final RegistrySupplier<ArmorDecorationItem> DARK_RONDEL_DECORATION = addArmorDecorationItem("dark_rondel_decoration", () -> new ArmorDecorationItem(new ResourceLocation(EpicKnightsAddon.ID, "dark_rondel").toString(), new Item.Properties().tab(ModCreativeTabs.ARMOR_DECORATIONS), EquipmentSlot.CHEST));
	public static final RegistrySupplier<ArmorDecorationItem> GILDED_RONDEL_DECORATION = addArmorDecorationItem("gilded_rondel_decoration", () -> new ArmorDecorationItem(new ResourceLocation(EpicKnightsAddon.ID, "gilded_rondel").toString(), new Item.Properties().tab(ModCreativeTabs.ARMOR_DECORATIONS), EquipmentSlot.CHEST));
	public static final RegistrySupplier<ArmorDecorationItem> GILDED_DARK_RONDEL_DECORATION = addArmorDecorationItem("gilded_dark_rondel_decoration", () -> new ArmorDecorationItem(new ResourceLocation(EpicKnightsAddon.ID, "gilded_dark_rondel").toString(), new Item.Properties().tab(ModCreativeTabs.ARMOR_DECORATIONS), EquipmentSlot.CHEST));
	public static final RegistrySupplier<ArmorDecorationItem> CHAINMAIL_HOOD_DECORATION = addArmorDecorationItem("chainmail_hood_decoration", () -> new ArmorDecorationItem(new ResourceLocation(EpicKnightsAddon.ID, "chainmail_hood").toString(), new Item.Properties().tab(ModCreativeTabs.ARMOR_DECORATIONS), EquipmentSlot.CHEST));
	public static final RegistrySupplier<ArmorDecorationItem> SHOULDER_PADS_DECORATION = addArmorDecorationItem("shoulder_pads_decoration", () -> new ArmorDecorationItem(new ResourceLocation(EpicKnightsAddon.ID, "shoulder_pads").toString(), new Item.Properties().tab(ModCreativeTabs.ARMOR_DECORATIONS), EquipmentSlot.CHEST));
	public static final RegistrySupplier<ArmorDecorationItem> HEAVY_SHOULDER_PAD_DECORATION = addArmorDecorationItem("heavy_shoulder_pad_decoration", () -> new ArmorDecorationItem(new ResourceLocation(EpicKnightsAddon.ID, "heavy_shoulder_pad").toString(), new Item.Properties().tab(ModCreativeTabs.ARMOR_DECORATIONS), EquipmentSlot.CHEST));
	public static final RegistrySupplier<ArmorDecorationItem> GOLDEN_BALL_DECORATION = addArmorDecorationItem("golden_ball_decoration", () -> new ArmorDecorationItem(new ResourceLocation(EpicKnightsAddon.ID, "golden_ball").toString(), new Item.Properties().tab(ModCreativeTabs.ARMOR_DECORATIONS), EquipmentSlot.HEAD));
	public static final RegistrySupplier<ArmorDecorationItem> GORGET_DECORATION = addArmorDecorationItem("gorget_decoration", () -> new ArmorDecorationItem(new ResourceLocation(EpicKnightsAddon.ID, "gorget").toString(), new Item.Properties().tab(ModCreativeTabs.ARMOR_DECORATIONS), EquipmentSlot.CHEST));
	public static final RegistrySupplier<DyeableArmorDecorationItem> ROYAL_PLUME_DECORATION = addDyeableArmorDecorationItem("royal_plume_decoration", () -> new DyeableArmorDecorationItem(new ResourceLocation(EpicKnightsAddon.ID, "royal_plume").toString(), new Item.Properties().tab(ModCreativeTabs.ARMOR_DECORATIONS), EquipmentSlot.HEAD, DyeColor.WHITE.getMaterialColor().col));
	public static final RegistrySupplier<DyeableArmorDecorationItem> HORSE_TAIL_DECORATION = addDyeableArmorDecorationItem("horse_tail_decoration", () -> new DyeableArmorDecorationItem(new ResourceLocation(EpicKnightsAddon.ID, "horse_tail").toString(), new Item.Properties().tab(ModCreativeTabs.ARMOR_DECORATIONS), EquipmentSlot.HEAD, DyeColor.RED.getMaterialColor().col));
	public static final RegistrySupplier<DyeableArmorDecorationItem> LANDSKNECHT_FEATHERS_DECORATION = addDyeableArmorDecorationItem("landsknecht_feathers_decoration", () -> new DyeableArmorDecorationItem(new ResourceLocation(EpicKnightsAddon.ID, "landsknecht_feathers").toString(), new Item.Properties().tab(ModCreativeTabs.ARMOR_DECORATIONS), EquipmentSlot.HEAD, DyeColor.WHITE.getMaterialColor().col));
	public static final RegistrySupplier<DyeableArmorDecorationItem> HANGING_CLOTH_DECORATION = addDyeableArmorDecorationItem("hanging_cloth_decoration", () -> new DyeableArmorDecorationItem(new ResourceLocation(EpicKnightsAddon.ID, "hanging_cloth").toString(), new Item.Properties().tab(ModCreativeTabs.ARMOR_DECORATIONS), EquipmentSlot.CHEST, DyeColor.RED.getMaterialColor().col));
	public static final RegistrySupplier<DyeableArmorDecorationItem> UNDERARMOR_DECORATIONS_TUNIC_DECORATION = addDyeableArmorDecorationItem("underarmor_tunic_decoration", () -> new DyeableArmorDecorationItem(new ResourceLocation(EpicKnightsAddon.ID, "underarmor_tunic").toString(), new Item.Properties().tab(ModCreativeTabs.ARMOR_DECORATIONS), EquipmentSlot.CHEST, DyeColor.RED.getMaterialColor().col));
	public static final RegistrySupplier<DyeableWearableArmorDecorationItem> LANDSKNECHT_ORANGE_HAT_DECORATION = addDyeableWearableArmorDecorationItem("landsknecht_orange_hat_decoration", AddonArmorTypes.LANDSKNECHT_ORANGE_HAT, EquipmentSlot.HEAD, new Item.Properties().tab(ModCreativeTabs.ARMOR_DECORATIONS), DyeColor.WHITE.getMaterialColor().col);
	public static final RegistrySupplier<DyeableWearableArmorDecorationItem> LANDSKNECHT_MAGENTA_HAT_DECORATION = addDyeableWearableArmorDecorationItem("landsknecht_magenta_hat_decoration", AddonArmorTypes.LANDSKNECHT_MAGENTA_HAT, EquipmentSlot.HEAD, new Item.Properties().tab(ModCreativeTabs.ARMOR_DECORATIONS), DyeColor.WHITE.getMaterialColor().col);
	public static final RegistrySupplier<DyeableWearableArmorDecorationItem> LANDSKNECHT_LIGHT_BLUE_HAT_DECORATION = addDyeableWearableArmorDecorationItem("landsknecht_light_blue_hat_decoration", AddonArmorTypes.LANDSKNECHT_LIGHT_BLUE_HAT, EquipmentSlot.HEAD, new Item.Properties().tab(ModCreativeTabs.ARMOR_DECORATIONS), DyeColor.WHITE.getMaterialColor().col);
	public static final RegistrySupplier<DyeableWearableArmorDecorationItem> LANDSKNECHT_YELLOW_HAT_DECORATION = addDyeableWearableArmorDecorationItem("landsknecht_yellow_hat_decoration", AddonArmorTypes.LANDSKNECHT_YELLOW_HAT, EquipmentSlot.HEAD, new Item.Properties().tab(ModCreativeTabs.ARMOR_DECORATIONS), DyeColor.WHITE.getMaterialColor().col);
	public static final RegistrySupplier<DyeableWearableArmorDecorationItem> LANDSKNECHT_LIME_HAT_DECORATION = addDyeableWearableArmorDecorationItem("landsknecht_lime_hat_decoration", AddonArmorTypes.LANDSKNECHT_LIME_HAT, EquipmentSlot.HEAD, new Item.Properties().tab(ModCreativeTabs.ARMOR_DECORATIONS), DyeColor.WHITE.getMaterialColor().col);
	public static final RegistrySupplier<DyeableWearableArmorDecorationItem> LANDSKNECHT_PINK_HAT_DECORATION = addDyeableWearableArmorDecorationItem("landsknecht_pink_hat_decoration", AddonArmorTypes.LANDSKNECHT_PINK_HAT, EquipmentSlot.HEAD, new Item.Properties().tab(ModCreativeTabs.ARMOR_DECORATIONS), DyeColor.WHITE.getMaterialColor().col);
	public static final RegistrySupplier<DyeableWearableArmorDecorationItem> LANDSKNECHT_GRAY_HAT_DECORATION = addDyeableWearableArmorDecorationItem("landsknecht_gray_hat_decoration", AddonArmorTypes.LANDSKNECHT_GRAY_HAT, EquipmentSlot.HEAD, new Item.Properties().tab(ModCreativeTabs.ARMOR_DECORATIONS), DyeColor.WHITE.getMaterialColor().col);
	public static final RegistrySupplier<DyeableWearableArmorDecorationItem> LANDSKNECHT_LIGHT_GRAY_HAT_DECORATION = addDyeableWearableArmorDecorationItem("landsknecht_light_gray_hat_decoration", AddonArmorTypes.LANDSKNECHT_LIGHT_GRAY_HAT, EquipmentSlot.HEAD, new Item.Properties().tab(ModCreativeTabs.ARMOR_DECORATIONS), DyeColor.WHITE.getMaterialColor().col);
	public static final RegistrySupplier<DyeableWearableArmorDecorationItem> LANDSKNECHT_CYAN_HAT_DECORATION = addDyeableWearableArmorDecorationItem("landsknecht_cyan_hat_decoration", AddonArmorTypes.LANDSKNECHT_CYAN_HAT, EquipmentSlot.HEAD, new Item.Properties().tab(ModCreativeTabs.ARMOR_DECORATIONS), DyeColor.WHITE.getMaterialColor().col);
	public static final RegistrySupplier<DyeableWearableArmorDecorationItem> LANDSKNECHT_PURPLE_HAT_DECORATION = addDyeableWearableArmorDecorationItem("landsknecht_purple_hat_decoration", AddonArmorTypes.LANDSKNECHT_PURPLE_HAT, EquipmentSlot.HEAD, new Item.Properties().tab(ModCreativeTabs.ARMOR_DECORATIONS), DyeColor.WHITE.getMaterialColor().col);
	public static final RegistrySupplier<DyeableWearableArmorDecorationItem> LANDSKNECHT_BLUE_HAT_DECORATION = addDyeableWearableArmorDecorationItem("landsknecht_blue_hat_decoration", AddonArmorTypes.LANDSKNECHT_BLUE_HAT, EquipmentSlot.HEAD, new Item.Properties().tab(ModCreativeTabs.ARMOR_DECORATIONS), DyeColor.WHITE.getMaterialColor().col);
	public static final RegistrySupplier<DyeableWearableArmorDecorationItem> LANDSKNECHT_BROWN_HAT_DECORATION = addDyeableWearableArmorDecorationItem("landsknecht_brown_hat_decoration", AddonArmorTypes.LANDSKNECHT_BROWN_HAT, EquipmentSlot.HEAD, new Item.Properties().tab(ModCreativeTabs.ARMOR_DECORATIONS), DyeColor.WHITE.getMaterialColor().col);
	public static final RegistrySupplier<DyeableWearableArmorDecorationItem> LANDSKNECHT_GREEN_HAT_DECORATION = addDyeableWearableArmorDecorationItem("landsknecht_green_hat_decoration", AddonArmorTypes.LANDSKNECHT_GREEN_HAT, EquipmentSlot.HEAD, new Item.Properties().tab(ModCreativeTabs.ARMOR_DECORATIONS), DyeColor.WHITE.getMaterialColor().col);
	public static final RegistrySupplier<DyeableWearableArmorDecorationItem> LANDSKNECHT_RED_HAT_DECORATION = addDyeableWearableArmorDecorationItem("landsknecht_red_hat_decoration", AddonArmorTypes.LANDSKNECHT_RED_HAT, EquipmentSlot.HEAD, new Item.Properties().tab(ModCreativeTabs.ARMOR_DECORATIONS), DyeColor.WHITE.getMaterialColor().col);
	public static final RegistrySupplier<DyeableWearableArmorDecorationItem> LANDSKNECHT_BLACK_HAT_DECORATION = addDyeableWearableArmorDecorationItem("landsknecht_black_hat_decoration", AddonArmorTypes.LANDSKNECHT_BLACK_HAT, EquipmentSlot.HEAD, new Item.Properties().tab(ModCreativeTabs.ARMOR_DECORATIONS), DyeColor.WHITE.getMaterialColor().col);
	public static final RegistrySupplier<DyeableWearableArmorDecorationItem> LANDSKNECHT_WHITE_HAT_DECORATION = addDyeableWearableArmorDecorationItem("landsknecht_white_hat_decoration", AddonArmorTypes.LANDSKNECHT_WHITE_HAT, EquipmentSlot.HEAD, new Item.Properties().tab(ModCreativeTabs.ARMOR_DECORATIONS), DyeColor.WHITE.getMaterialColor().col);
	public static final RegistrySupplier<ArmorDecorationItem> PLACKART_DECORATION = addArmorDecorationItem("plackart_decoration", () -> new ArmorDecorationItem(new ResourceLocation(EpicKnightsAddon.ID, "plackart").toString(), new Item.Properties().tab(ModCreativeTabs.ARMOR_DECORATIONS), EquipmentSlot.CHEST));
	public static final RegistrySupplier<ArmorDecorationItem> GILDED_PLACKART_DECORATION = addArmorDecorationItem("gilded_plackart_decoration", () -> new ArmorDecorationItem(new ResourceLocation(EpicKnightsAddon.ID, "gilded_plackart").toString(), new Item.Properties().tab(ModCreativeTabs.ARMOR_DECORATIONS), EquipmentSlot.CHEST));
	public static final RegistrySupplier<ArmorDecorationItem> DARK_PLACKART_DECORATION = addArmorDecorationItem("dark_plackart_decoration", () -> new ArmorDecorationItem(new ResourceLocation(EpicKnightsAddon.ID, "dark_plackart").toString(), new Item.Properties().tab(ModCreativeTabs.ARMOR_DECORATIONS), EquipmentSlot.CHEST));
	public static final RegistrySupplier<ArmorDecorationItem> ARTICULATED_SHOULDER_DEFENSES_DECORATION = addArmorDecorationItem("articulated_shoulder_defenses_decoration", () -> new ArmorDecorationItem(new ResourceLocation(EpicKnightsAddon.ID, "articulated_shoulder_defenses").toString(), new Item.Properties().tab(ModCreativeTabs.ARMOR_DECORATIONS), EquipmentSlot.CHEST));
	public static final RegistrySupplier<ArmorDecorationItem> DRAGON_SHOULDER_PADS_DECORATION = addArmorDecorationItem("dragon_shoulder_pads_decoration", () -> new ArmorDecorationItem(new ResourceLocation(EpicKnightsAddon.ID, "dragon_shoulder_pads").toString(), new Item.Properties().tab(ModCreativeTabs.ARMOR_DECORATIONS), EquipmentSlot.CHEST));
	public static final RegistrySupplier<DyeableArmorDecorationItem> GIORNEA_DECORATION = addDyeableArmorDecorationItem("giornea_decoration", () -> new DyeableArmorDecorationItem(new ResourceLocation(EpicKnightsAddon.ID, "giornea").toString(), new Item.Properties().tab(ModCreativeTabs.ARMOR_DECORATIONS), EquipmentSlot.CHEST, DyeColor.RED.getMaterialColor().col));
	public static final RegistrySupplier<DyeableArmorDecorationItem> RAM_HORNS_DECORATION = addDyeableArmorDecorationItem("ram_horns_decoration", () -> new DyeableArmorDecorationItem(new ResourceLocation(EpicKnightsAddon.ID, "ram_horns").toString(), new Item.Properties().tab(ModCreativeTabs.ARMOR_DECORATIONS), EquipmentSlot.HEAD, 0xc9c79f));
	public static final RegistrySupplier<ArmorDecorationItem> GOOSE_DECORATION = addArmorDecorationItem("goose_decoration", () -> new ArmorDecorationItem(new ResourceLocation(EpicKnightsAddon.ID, "goose").toString(), new Item.Properties().tab(ModCreativeTabs.ARMOR_DECORATIONS), EquipmentSlot.HEAD));
	public static final RegistrySupplier<DyeableArmorDecorationItem> ORANGE_PUFF_AND_SLASH_SLEEVES_DECORATION = addDyeableArmorDecorationItem("orange_puff_and_slash_sleeves_decoration", () -> new DyeableArmorDecorationItem(new ResourceLocation(EpicKnightsAddon.ID, "orange_puff_and_slash_sleeves").toString(), new Item.Properties().tab(ModCreativeTabs.ARMOR_DECORATIONS), EquipmentSlot.CHEST, DyeColor.WHITE.getMaterialColor().col));
	public static final RegistrySupplier<DyeableArmorDecorationItem> MAGENTA_PUFF_AND_SLASH_SLEEVES_DECORATION = addDyeableArmorDecorationItem("magenta_puff_and_slash_sleeves_decoration", () -> new DyeableArmorDecorationItem(new ResourceLocation(EpicKnightsAddon.ID, "magenta_puff_and_slash_sleeves").toString(), new Item.Properties().tab(ModCreativeTabs.ARMOR_DECORATIONS), EquipmentSlot.CHEST, DyeColor.WHITE.getMaterialColor().col));
	public static final RegistrySupplier<DyeableArmorDecorationItem> LIGHT_BLUE_PUFF_AND_SLASH_SLEEVES_DECORATION = addDyeableArmorDecorationItem("light_blue_puff_and_slash_sleeves_decoration", () -> new DyeableArmorDecorationItem(new ResourceLocation(EpicKnightsAddon.ID, "light_blue_puff_and_slash_sleeves").toString(), new Item.Properties().tab(ModCreativeTabs.ARMOR_DECORATIONS), EquipmentSlot.CHEST, DyeColor.WHITE.getMaterialColor().col));
	public static final RegistrySupplier<DyeableArmorDecorationItem> YELLOW_PUFF_AND_SLASH_SLEEVES_DECORATION = addDyeableArmorDecorationItem("yellow_puff_and_slash_sleeves_decoration", () -> new DyeableArmorDecorationItem(new ResourceLocation(EpicKnightsAddon.ID, "yellow_puff_and_slash_sleeves").toString(), new Item.Properties().tab(ModCreativeTabs.ARMOR_DECORATIONS), EquipmentSlot.CHEST, DyeColor.WHITE.getMaterialColor().col));
	public static final RegistrySupplier<DyeableArmorDecorationItem> LIME_PUFF_AND_SLASH_SLEEVES_DECORATION = addDyeableArmorDecorationItem("lime_puff_and_slash_sleeves_decoration", () -> new DyeableArmorDecorationItem(new ResourceLocation(EpicKnightsAddon.ID, "lime_puff_and_slash_sleeves").toString(), new Item.Properties().tab(ModCreativeTabs.ARMOR_DECORATIONS), EquipmentSlot.CHEST, DyeColor.WHITE.getMaterialColor().col));
	public static final RegistrySupplier<DyeableArmorDecorationItem> PINK_PUFF_AND_SLASH_SLEEVES_DECORATION = addDyeableArmorDecorationItem("pink_puff_and_slash_sleeves_decoration", () -> new DyeableArmorDecorationItem(new ResourceLocation(EpicKnightsAddon.ID, "pink_puff_and_slash_sleeves").toString(), new Item.Properties().tab(ModCreativeTabs.ARMOR_DECORATIONS), EquipmentSlot.CHEST, DyeColor.WHITE.getMaterialColor().col));
	public static final RegistrySupplier<DyeableArmorDecorationItem> GRAY_PUFF_AND_SLASH_SLEEVES_DECORATION = addDyeableArmorDecorationItem("gray_puff_and_slash_sleeves_decoration", () -> new DyeableArmorDecorationItem(new ResourceLocation(EpicKnightsAddon.ID, "gray_puff_and_slash_sleeves").toString(), new Item.Properties().tab(ModCreativeTabs.ARMOR_DECORATIONS), EquipmentSlot.CHEST, DyeColor.WHITE.getMaterialColor().col));
	public static final RegistrySupplier<DyeableArmorDecorationItem> LIGHT_GRAY_PUFF_AND_SLASH_SLEEVES_DECORATION = addDyeableArmorDecorationItem("light_gray_puff_and_slash_sleeves_decoration", () -> new DyeableArmorDecorationItem(new ResourceLocation(EpicKnightsAddon.ID, "light_gray_puff_and_slash_sleeves").toString(), new Item.Properties().tab(ModCreativeTabs.ARMOR_DECORATIONS), EquipmentSlot.CHEST, DyeColor.WHITE.getMaterialColor().col));
	public static final RegistrySupplier<DyeableArmorDecorationItem> CYAN_PUFF_AND_SLASH_SLEEVES_DECORATION = addDyeableArmorDecorationItem("cyan_puff_and_slash_sleeves_decoration", () -> new DyeableArmorDecorationItem(new ResourceLocation(EpicKnightsAddon.ID, "cyan_puff_and_slash_sleeves").toString(), new Item.Properties().tab(ModCreativeTabs.ARMOR_DECORATIONS), EquipmentSlot.CHEST, DyeColor.WHITE.getMaterialColor().col));
	public static final RegistrySupplier<DyeableArmorDecorationItem> PURPLE_PUFF_AND_SLASH_SLEEVES_DECORATION = addDyeableArmorDecorationItem("purple_puff_and_slash_sleeves_decoration", () -> new DyeableArmorDecorationItem(new ResourceLocation(EpicKnightsAddon.ID, "purple_puff_and_slash_sleeves").toString(), new Item.Properties().tab(ModCreativeTabs.ARMOR_DECORATIONS), EquipmentSlot.CHEST, DyeColor.WHITE.getMaterialColor().col));
	public static final RegistrySupplier<DyeableArmorDecorationItem> BLUE_PUFF_AND_SLASH_SLEEVES_DECORATION = addDyeableArmorDecorationItem("blue_puff_and_slash_sleeves_decoration", () -> new DyeableArmorDecorationItem(new ResourceLocation(EpicKnightsAddon.ID, "blue_puff_and_slash_sleeves").toString(), new Item.Properties().tab(ModCreativeTabs.ARMOR_DECORATIONS), EquipmentSlot.CHEST, DyeColor.WHITE.getMaterialColor().col));
	public static final RegistrySupplier<DyeableArmorDecorationItem> BROWN_PUFF_AND_SLASH_SLEEVES_DECORATION = addDyeableArmorDecorationItem("brown_puff_and_slash_sleeves_decoration", () -> new DyeableArmorDecorationItem(new ResourceLocation(EpicKnightsAddon.ID, "brown_puff_and_slash_sleeves").toString(), new Item.Properties().tab(ModCreativeTabs.ARMOR_DECORATIONS), EquipmentSlot.CHEST, DyeColor.WHITE.getMaterialColor().col));
	public static final RegistrySupplier<DyeableArmorDecorationItem> GREEN_PUFF_AND_SLASH_SLEEVES_DECORATION = addDyeableArmorDecorationItem("green_puff_and_slash_sleeves_decoration", () -> new DyeableArmorDecorationItem(new ResourceLocation(EpicKnightsAddon.ID, "green_puff_and_slash_sleeves").toString(), new Item.Properties().tab(ModCreativeTabs.ARMOR_DECORATIONS), EquipmentSlot.CHEST, DyeColor.WHITE.getMaterialColor().col));
	public static final RegistrySupplier<DyeableArmorDecorationItem> RED_PUFF_AND_SLASH_SLEEVES_DECORATION = addDyeableArmorDecorationItem("red_puff_and_slash_sleeves_decoration", () -> new DyeableArmorDecorationItem(new ResourceLocation(EpicKnightsAddon.ID, "red_puff_and_slash_sleeves").toString(), new Item.Properties().tab(ModCreativeTabs.ARMOR_DECORATIONS), EquipmentSlot.CHEST, DyeColor.WHITE.getMaterialColor().col));
	public static final RegistrySupplier<DyeableArmorDecorationItem> BLACK_PUFF_AND_SLASH_SLEEVES_DECORATION = addDyeableArmorDecorationItem("black_puff_and_slash_sleeves_decoration", () -> new DyeableArmorDecorationItem(new ResourceLocation(EpicKnightsAddon.ID, "black_puff_and_slash_sleeves").toString(), new Item.Properties().tab(ModCreativeTabs.ARMOR_DECORATIONS), EquipmentSlot.CHEST, DyeColor.WHITE.getMaterialColor().col));
	public static final RegistrySupplier<DyeableArmorDecorationItem> WHITE_PUFF_AND_SLASH_SLEEVES_DECORATION = addDyeableArmorDecorationItem("white_puff_and_slash_sleeves_decoration", () -> new DyeableArmorDecorationItem(new ResourceLocation(EpicKnightsAddon.ID, "white_puff_and_slash_sleeves").toString(), new Item.Properties().tab(ModCreativeTabs.ARMOR_DECORATIONS), EquipmentSlot.CHEST, DyeColor.WHITE.getMaterialColor().col));
	public static final RegistrySupplier<ArmorDecorationItem> DARK_GORGET_DECORATION = addArmorDecorationItem("dark_gorget_decoration", () -> new ArmorDecorationItem(new ResourceLocation(EpicKnightsAddon.ID, "dark_gorget").toString(), new Item.Properties().tab(ModCreativeTabs.ARMOR_DECORATIONS), EquipmentSlot.CHEST));
	public static final RegistrySupplier<ArmorDecorationItem> GILDED_GORGET_DECORATION = addArmorDecorationItem("gilded_gorget_decoration", () -> new ArmorDecorationItem(new ResourceLocation(EpicKnightsAddon.ID, "gilded_gorget").toString(), new Item.Properties().tab(ModCreativeTabs.ARMOR_DECORATIONS), EquipmentSlot.CHEST));
	public static final RegistrySupplier<ArmorDecorationItem> SQUARE_BESAGEWS_DECORATION = addArmorDecorationItem("square_besagews_decoration", () -> new ArmorDecorationItem(new ResourceLocation(EpicKnightsAddon.ID, "square_besagews").toString(), new Item.Properties().tab(ModCreativeTabs.ARMOR_DECORATIONS), EquipmentSlot.CHEST));
	public static final RegistrySupplier<ArmorDecorationItem> CODPIECE_DECORATION = addArmorDecorationItem("codpiece_decoration", () -> new ArmorDecorationItem(new ResourceLocation(EpicKnightsAddon.ID, "codpiece").toString(), new Item.Properties().tab(ModCreativeTabs.ARMOR_DECORATIONS), EquipmentSlot.CHEST));
	public static final RegistrySupplier<WearableArmorDecorationItem> GOLDEN_NECKLACE_DECORATION = addWearableArmorDecorationItem("golden_necklace_decoration", AddonArmorTypes.GOLDEN_NECKLACE, EquipmentSlot.CHEST, new Item.Properties().tab(ModCreativeTabs.ARMOR_DECORATIONS));
	public static final RegistrySupplier<WearableArmorDecorationItem> SILVER_NECKLACE_DECORATION = addWearableArmorDecorationItem("silver_necklace_decoration", AddonArmorTypes.SILVER_NECKLACE, EquipmentSlot.CHEST, new Item.Properties().tab(ModCreativeTabs.ARMOR_DECORATIONS));
	public static final RegistrySupplier<WearableArmorDecorationItem> SILVER_CROSS_NECKLACE_DECORATION = addWearableArmorDecorationItem("silver_cross_necklace_decoration", AddonArmorTypes.SILVER_CROSS_NECKLACE, EquipmentSlot.CHEST, new Item.Properties().tab(ModCreativeTabs.ARMOR_DECORATIONS));
	public static final RegistrySupplier<WearableArmorDecorationItem> GOLDEN_CROSS_NECKLACE_DECORATION = addWearableArmorDecorationItem("golden_cross_necklace_decoration", AddonArmorTypes.GOLDEN_CROSS_NECKLACE, EquipmentSlot.CHEST, new Item.Properties().tab(ModCreativeTabs.ARMOR_DECORATIONS));

	public static @Nullable RegistrySupplier<MedievalArmorItem> addMedievalArmorItem(String id, AddonArmorType type, EquipmentSlot slot, Item.Properties properties)
	{
		if (type.isDisabled())
			return null;
		RegistrySupplier<MedievalArmorItem> armor = AddonItemRegistryHelper.registerMedievalArmorItem(id, type, slot, properties,id);
		ARMOR_ITEMS.add(armor);
		return armor;
	}

	public static RegistrySupplier<WearableArmorDecorationItem> addWearableArmorDecorationItem(String id, ArmorMaterial material, EquipmentSlot type, Item.Properties properties)
	{
		RegistrySupplier<WearableArmorDecorationItem> registrysupplier = AddonItemRegistryHelper.registerWearableArmorDecorationItem(id, material, type, properties);
	//	ARMOR_DECORATION_ITEMS.add(registrysupplier);
//		ARMOR_ITEMS.add(registrysupplier);
		return registrysupplier;
	}

	public static @Nullable RegistrySupplier<MedievalWeaponItem> addMedievalWeaponItem(String id, Item.Properties properties, ModItemTier material, WeaponType type)
	{
		if (type.isDisabled())
			return null;
		RegistrySupplier<MedievalWeaponItem> weapon = AddonItemRegistryHelper.registerMedievalWeaponItem(id, properties, material, type);
		WEAPON_ITEMS.add(weapon);
		return weapon;
	}

	public static RegistrySupplier<ArmorDecorationItem> addArmorDecorationItem(String id, Supplier<ArmorDecorationItem> supplier)
	{
		RegistrySupplier<ArmorDecorationItem> registrysupplier = ITEMS.register(id, supplier);
		ARMOR_DECORATION_ITEMS.add(registrysupplier);
		return registrysupplier;
	}

	public static @Nullable RegistrySupplier<MedievalArmorItem> addDyeableMedievalArmorItem(String id, ArmorType type, EquipmentSlot slot, Item.Properties properties, int defaultcolor, Models.ArmorEnum modelkey)
	{
		if (type.isDisabled())
			return null;
		RegistrySupplier<MedievalArmorItem> armor = AddonItemRegistryHelper.registerDyeableMedievalArmorItem(id, type, slot, properties, defaultcolor, modelkey);
		DYEABLE_ITEMS.add(armor);
		ARMOR_ITEMS.add(armor);
		return armor;
	}

	public static @Nullable RegistrySupplier<MedievalArmorItem> addDyeableMedievalArmorItem(String id, AddonArmorType type, EquipmentSlot slot, Item.Properties properties, int defaultcolor)
	{
		if (type.isDisabled())
			return null;
		RegistrySupplier<MedievalArmorItem> armor = AddonItemRegistryHelper.registerDyeableMedievalArmorItem(id, type, slot, properties, defaultcolor);
		DYEABLE_ITEMS.add(armor);
		ARMOR_ITEMS.add(armor);
		return armor;
	}


	public static RegistrySupplier<DyeableArmorDecorationItem> addDyeableArmorDecorationItem(String id, Supplier<DyeableArmorDecorationItem> supplier)
	{
		RegistrySupplier<DyeableArmorDecorationItem> registrysupplier = ITEMS.register(id, supplier);
		ARMOR_DECORATION_ITEMS.add(registrysupplier);
		DYEABLE_ITEMS.add(registrysupplier);
		return registrysupplier;
	}

	public static @Nullable RegistrySupplier<MedievalArmorItem> addKnightItem(String id, AddonArmorType type, EquipmentSlot slot, Item.Properties properties)
	{
		if (type.isDisabled())
			return null;
		RegistrySupplier<MedievalArmorItem> armor = AddonItemRegistryHelper.registerKnightItem(id, type, slot, properties);
		DYEABLE_ITEMS.add(armor);
		ARMOR_ITEMS.add(armor);
		return armor;
	}

	public static RegistrySupplier<DyeableWearableArmorDecorationItem> addDyeableWearableArmorDecorationItem(String id, ArmorMaterial material, EquipmentSlot type, Item.Properties properties, int defaultcolor)
	{
		RegistrySupplier<DyeableWearableArmorDecorationItem> registrysupplier = AddonItemRegistryHelper.registerDyeableWearableArmorDecorationItem(id, material, type, properties, defaultcolor);
	//	ARMOR_DECORATION_ITEMS.add(registrysupplier);
		DYEABLE_ITEMS.add(registrysupplier);
	//	ARMOR_ITEMS.add(registrysupplier);
		return registrysupplier;
	}

	public static @Nullable RegistrySupplier<MedievalArmorItem> addDyeableWearableMedievalArmorItem(String id, AddonArmorType type, EquipmentSlot slot, Item.Properties properties, int defaultcolor)
	{
		if (type.isDisabled())
			return null;
		RegistrySupplier<MedievalArmorItem> armor = AddonItemRegistryHelper.registerDyeableMedievalArmorItem(id, type, slot, properties, defaultcolor);
		DYEABLE_ITEMS.add(armor);
		ARMOR_ITEMS.add(armor);
		return armor;
	}

	public static @Nullable RegistrySupplier<MedievalArmorItem> addJoustingItem(String id, AddonArmorType type, EquipmentSlot slot, Item.Properties properties)
	{
		if (type.isDisabled())
			return null;
		RegistrySupplier<MedievalArmorItem> armor = AddonItemRegistryHelper.registerJoustingItem(id, type, slot, properties);
		ARMOR_ITEMS.add(armor);
		return armor;
	}

	public static @Nullable RegistrySupplier<MedievalWeaponItem> addLanceItem(String id, Item.Properties properties, ModItemTier material, WeaponType type)
	{
		if (type.isDisabled())
			return null;
		RegistrySupplier<MedievalWeaponItem> weapon = AddonItemRegistryHelper.registerLanceItem(id, properties, material, type);
		WEAPON_ITEMS.add(weapon);
		return weapon;
	}

	public static void init() {
		ITEMS.register();
		if (Platform.getEnv() == EnvType.CLIENT)
			LifecycleEvent.SETUP.register(() -> ModRender.setup());
	}
}

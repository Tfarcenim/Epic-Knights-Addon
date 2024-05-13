package com.magistuarmory.addon.item.armor;

import com.magistuarmory.addon.EpicKnightsAddon;
import com.magistuarmory.addon.config.ArmorConfig;
import dev.architectury.platform.Platform;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;

public class AddonArmorTypes
{
	public static final ArmorConfig ARMOR_CONFIG = EpicKnightsAddon.CONFIG.armor;

	public static final AddonArmorType DARK_KNIGHT = new AddonArmorType(new ResourceLocation("magistuarmoryaddon", "dark_knight"), new ResourceLocation("default"),1.25f, 0.5f, new int[] { 230, 315, 335, 275 }, new int[] { 2, 5, 8, 3 }, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.enableDarkKnight, Platform.isForge() ? "forge:ingots/steel" : "c:steel_ingots");

	public static final AddonArmorType DARK_ARMET = new AddonArmorType(new ResourceLocation("magistuarmoryaddon", "dark_armet"), new ResourceLocation("magistuarmory:armet"), 1.25f, 0.5f, new int[] { 230, 315, 335, 275 }, new int[] { 2, 5, 8, 3 }, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.enableDarkArmet, Platform.isForge() ? "forge:ingots/steel" : "c:steel_ingots");

	public static final AddonArmorType DARK_STECHHELM = new AddonArmorType(new ResourceLocation("magistuarmoryaddon", "dark_stechhelm"), new ResourceLocation("magistuarmory:stechhelm"), 2.0f, 1.5f, new int[] { 345, 500, 440, 385 }, new int[] { 3, 6, 9, 4 }, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.enableDarkStechhelm, Platform.isForge() ? "forge:ingots/steel" : "c:steel_ingots");

	public static final AddonArmorType DARK_JOUSTING = new AddonArmorType(new ResourceLocation("magistuarmoryaddon", "dark_jousting"), new ResourceLocation("magistuarmory:default"), 2.0f, 1.5f, new int[] { 345, 500, 440, 385 }, new int[] { 3, 6, 9, 4 }, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.enableDarkJousting, Platform.isForge() ? "forge:ingots/steel" : "c:steel_ingots");

	public static final AddonArmorType DARK_SALLET = new AddonArmorType(new ResourceLocation("magistuarmoryaddon", "dark_sallet"), new ResourceLocation("magistuarmoryaddon:sallet"), 1.25f, 0.5f, new int[] { 230, 315, 335, 275 }, new int[] { 2, 5, 8, 3 }, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.enableDarkSallet, Platform.isForge() ? "forge:ingots/steel" : "c:steel_ingots");

	public static final AddonArmorType DARK_GOTHIC = new AddonArmorType(new ResourceLocation("magistuarmoryaddon", "dark_gothic"), new ResourceLocation("magistuarmory:default"), 1.25f, 0.5f, new int[] { 230, 315, 335, 275 }, new int[] { 2, 5, 8, 3 }, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.enableDarkGothic, Platform.isForge() ? "forge:ingots/steel" : "c:steel_ingots");

	public static final AddonArmorType DARK_MAXIMILIAN_HELMET = new AddonArmorType(new ResourceLocation("magistuarmoryaddon", "dark_maximilian_helmet"), new ResourceLocation("magistuarmory:maximilian_helmet"), 1.8f, 0.5f, new int[] { 345, 500, 440, 385 }, new int[] { 3, 6, 9, 4 }, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.enableDarkMaximilianHelmet, Platform.isForge() ? "forge:ingots/steel" : "c:steel_ingots");

	public static final AddonArmorType DARK_MAXIMILIAN = new AddonArmorType(new ResourceLocation("magistuarmoryaddon", "dark_maximilian"), new ResourceLocation("magistuarmory:default"), 1.8f, 0.5f, new int[] { 345, 500, 440, 385 }, new int[] { 3, 6, 9, 4 }, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.enableDarkMaximilian, Platform.isForge() ? "forge:ingots/steel" : "c:steel_ingots");

	public static final AddonArmorType DARK_GREATHELM = new AddonArmorType(new ResourceLocation("magistuarmoryaddon", "dark_greathelm"), new ResourceLocation("magistuarmoryaddon:greathelm"), 0.6f, 0.0f, new int[] { 150, 280, 295, 220 }, new int[] { 1, 5, 6, 3 }, 9, SoundEvents.ARMOR_EQUIP_CHAIN, ARMOR_CONFIG.enableDarkGreathelm, Platform.isForge() ? "forge:ingots/steel" : "c:steel_ingots");

	public static final AddonArmorType DARK_CRUSADER = new AddonArmorType(new ResourceLocation("magistuarmoryaddon", "dark_crusader"), new ResourceLocation("magistuarmory:default"), 0.6f, 0.0f, new int[] { 150, 280, 295, 220 }, new int[] { 1, 5, 6, 3 }, 9, SoundEvents.ARMOR_EQUIP_CHAIN, ARMOR_CONFIG.enableDarkCrusader, Platform.isForge() ? "forge:ingots/steel" : "c:steel_ingots");

	public static final AddonArmorType DARK_KASTENBRUST = new AddonArmorType(new ResourceLocation("magistuarmoryaddon", "dark_kastenbrust"), new ResourceLocation("magistuarmory:default"), 1.25f, 0.5f, new int[] { 230, 315, 335, 275 }, new int[] { 2, 5, 8, 3 }, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.enableDarkKastenbrust, Platform.isForge() ? "forge:ingots/steel" : "c:steel_ingots");

	public static final AddonArmorType DARK_GRAND_BASCINET = new AddonArmorType(new ResourceLocation("magistuarmoryaddon", "dark_grand_bascinet"), new ResourceLocation("magistuarmory:grand_bascinet"), 1.25f, 0.5f, new int[] { 230, 315, 335, 275 }, new int[] { 2, 5, 8, 3 }, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.enableDarkGrandBascinet, Platform.isForge() ? "forge:ingots/steel" : "c:steel_ingots");

	public static final AddonArmorType SAVOYARD_HELMET = new AddonArmorType(new ResourceLocation("magistuarmoryaddon", "savoyard_helmet"), new ResourceLocation("magistuarmoryaddon:savoyard_helmet"), 1.25f, 0.0f, new int[] { 150, 0, 315, 225 }, new int[] { 2, 0, 8, 3 }, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.enableSavoyardHelmet, Platform.isForge() ? "forge:ingots/steel" : "c:steel_ingots");

	public static final AddonArmorType MORION = new AddonArmorType(new ResourceLocation("magistuarmoryaddon", "morion"), new ResourceLocation("magistuarmoryaddon:morion"), 0.6f, 0.0f, new int[] { 150, 0, 315, 180 }, new int[] { 2, 0, 8, 2 }, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.enableMorion, Platform.isForge() ? "forge:ingots/steel" : "c:steel_ingots");

	public static final AddonArmorType PIKEMAN = new AddonArmorType(new ResourceLocation("magistuarmoryaddon", "pikeman"), new ResourceLocation("default"), 0.6f, 0.0f, new int[] { 170, 0, 365, 180 }, new int[] { 2, 0, 8, 2 }, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.enablePikeman, Platform.isForge() ? "forge:ingots/steel" : "c:steel_ingots");

	public static final AddonArmorType MILANESE_ARMET = new AddonArmorType(new ResourceLocation("magistuarmoryaddon", "milanese_armet"), new ResourceLocation("magistuarmoryaddon:milanese_armet"), 1.25f, 0.5f, new int[] { 230, 315, 335, 275 }, new int[] { 2, 5, 8, 3 }, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.enableMilaneseArmet, Platform.isForge() ? "forge:ingots/steel" : "c:steel_ingots");

	public static final AddonArmorType BRITISH_ARMET = new AddonArmorType(new ResourceLocation("magistuarmoryaddon", "british_armet"), new ResourceLocation("magistuarmoryaddon:british_armet"), 1.25f, 0.5f, new int[] { 230, 315, 335, 275 }, new int[] { 2, 5, 8, 3 }, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.enableBritishArmet, Platform.isForge() ? "forge:ingots/steel" : "c:steel_ingots");

	public static final AddonArmorType AVANT = new AddonArmorType(new ResourceLocation("magistuarmoryaddon", "avant"), new ResourceLocation("default"), 1.25f, 0.5f, new int[] { 230, 315, 335, 275 }, new int[] { 2, 5, 8, 3 }, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.enableAvant, Platform.isForge() ? "forge:ingots/steel" : "c:steel_ingots");

	public static final AddonArmorType VISORED_KETTLEHAT = new AddonArmorType(new ResourceLocation("magistuarmoryaddon", "visored_kettlehat"), new ResourceLocation("magistuarmoryaddon:visored_kettlehat"), 0.6f, 0.0f, new int[] { 220, 290, 210, 260 }, new int[] { 2, 5, 6, 2 }, 9, SoundEvents.ARMOR_EQUIP_CHAIN, ARMOR_CONFIG.enableVisoredKettlehat, Platform.isForge() ? "forge:ingots/steel" : "c:steel_ingots");

	public static final AddonArmorType CERVELLIERE = new AddonArmorType(new ResourceLocation("magistuarmoryaddon", "cervelliere"), new ResourceLocation("default"), 0.2f, 0.0f, new int[] { 180, 290, 315, 170 }, new int[] { 2, 5, 6, 2 }, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.enableCervelliere, Platform.isForge() ? "forge:ingots/steel" : "c:steel_ingots");

	public static final AddonArmorType CLOSED_BARBUTE = new AddonArmorType(new ResourceLocation("magistuarmoryaddon", "closed_barbute"), new ResourceLocation("default"), 1.0f, 0.5f, new int[] { 220, 290, 210, 260 }, new int[] { 2, 5, 6, 2 }, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.enableClosedBarbute, Platform.isForge() ? "forge:ingots/steel" : "c:steel_ingots");

	public static final AddonArmorType BICOQUE = new AddonArmorType(new ResourceLocation("magistuarmoryaddon", "bicoque"), new ResourceLocation("magistuarmoryaddon:bicoque"), 1.25f, 0.5f, new int[] { 230, 315, 335, 275 }, new int[] { 2, 5, 8, 3 }, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.enableBicoque, Platform.isForge() ? "forge:ingots/steel" : "c:steel_ingots");

	public static final AddonArmorType LINEN = new AddonArmorType(new ResourceLocation("magistuarmoryaddon", "linen"), new ResourceLocation("magistuarmoryaddon:underarmor"), 0.0f, 0.0f, new int[] { 150, 200, 250, 200 }, new int[] { 0, 0, 0, 0 }, 9, SoundEvents.ARMOR_EQUIP_LEATHER, ARMOR_CONFIG.enableLinen, () -> Ingredient.of(TagKey.create(Registry.ITEM_REGISTRY, new ResourceLocation("magistuarmory:woolen_fabric"))));

	public static final AddonArmorType SALLET_WITHOUT_NECK_PROTECTION = new AddonArmorType(new ResourceLocation("magistuarmoryaddon", "sallet_without_neck_protection"), new ResourceLocation("magistuarmoryaddon:sallet_without_neck_protection"), 0.7f, 0.0f, new int[] { 230, 315, 335, 245 }, new int[] { 2, 5, 8, 3 }, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.enableSalletWithoutNeckProtection, Platform.isForge() ? "forge:ingots/steel" : "c:steel_ingots");

	public static final AddonArmorType BELLOWS_MAXIMILIAN_HELMET = new AddonArmorType(new ResourceLocation("magistuarmoryaddon", "bellows_maximilian_helmet"), new ResourceLocation("magistuarmoryaddon:bellows_maximilian_helmet"), 1.8f, 0.5f, new int[] { 345, 500, 440, 385 }, new int[] { 3, 6, 9, 4 }, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.enableBellowsMaximilianHelmet, Platform.isForge() ? "forge:ingots/steel" : "c:steel_ingots");

	public static final AddonArmorType KULAH_KHUD = new AddonArmorType(new ResourceLocation("magistuarmoryaddon", "kulah_khud"), new ResourceLocation("magistuarmoryaddon:kulah_khud"), 0.6f, 0.0f, new int[] { 150, 315, 200, 170 }, new int[] { 2, 0, 8, 2 }, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.enableKulahKhud, Platform.isForge() ? "forge:ingots/steel" : "c:steel_ingots");

	public static final AddonArmorType CUMAN_CAPTAIN_HELMET = new AddonArmorType(new ResourceLocation("magistuarmoryaddon", "mirror"), new ResourceLocation("magistuarmoryaddon:kulah_khud"), 0.8f, 0.0f, new int[] { 150, 325, 200, 200 }, new int[] { 2, 5, 8, 3 }, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.enableCumanCaptainHelmet, Platform.isForge() ? "forge:ingots/steel" : "c:steel_ingots");

	public static final AddonArmorType MIRROR = new AddonArmorType(new ResourceLocation("magistuarmoryaddon", "mirror"), new ResourceLocation("default"), 0.8f, 0.0f, new int[] { 150, 200, 325, 200 }, new int[] { 2, 5, 8, 3 }, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.enableMirror, Platform.isForge() ? "forge:ingots/steel" : "c:steel_ingots");

	public static final AddonArmorType SARACEN = new AddonArmorType(new ResourceLocation("magistuarmoryaddon", "saracen"), new ResourceLocation("default"), 0.2f, 0.0f, new int[] { 200, 200, 270, 190 }, new int[] { 2, 5, 6, 2 }, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.enableSaracen, Platform.isForge() ? "forge:ingots/steel" : "c:steel_ingots");

	public static final AddonArmorType EARLY_GREATHELM = new AddonArmorType(new ResourceLocation("magistuarmoryaddon", "early_greathelm"), new ResourceLocation("magistuarmoryaddon:early_greathelm"), 0.4f, 0.0f, new int[] { 150, 280, 295, 220 }, new int[] { 1, 5, 6, 3 }, 9, SoundEvents.ARMOR_EQUIP_CHAIN, ARMOR_CONFIG.enableEarlyGreathelm, Platform.isForge() ? "forge:ingots/steel" : "c:steel_ingots");

	public static final AddonArmorType XIII_CENTURY_KNIGHT = new AddonArmorType(new ResourceLocation("magistuarmoryaddon", "xiii_century_knight"), new ResourceLocation("default"), 0.35f, 0.0f, new int[] { 200, 160, 270, 220 }, new int[] { 2, 5, 6, 2 }, 9, SoundEvents.ARMOR_EQUIP_CHAIN, ARMOR_CONFIG.enableXiiiCenturyKnight, Platform.isForge() ? "forge:ingots/steel" : "c:steel_ingots");

	public static final AddonArmorType KLAPPVISOR_BASCINET = new AddonArmorType(new ResourceLocation("magistuarmoryaddon", "klappvisor_bascinet"), new ResourceLocation("magistuarmoryaddon:klappvisor_bascinet"), 1.25f, 0.0f, new int[] { 210, 300, 320, 250 }, new int[] { 2, 5, 7, 3 }, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.enableKlappvisorBascinet, Platform.isForge() ? "forge:ingots/steel" : "c:steel_ingots");

	public static final AddonArmorType LATE_BASCINET = new AddonArmorType(new ResourceLocation("magistuarmoryaddon", "late_bascinet"), new ResourceLocation("magistuarmoryaddon:late_bascinet"), 1.25f, 0.0f, new int[] { 210, 300, 320, 250 }, new int[] { 2, 5, 7, 3 }, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.enableLateBascinet, Platform.isForge() ? "forge:ingots/steel" : "c:steel_ingots");

	public static final AddonArmorType LOBSTER_TAILED_HELMET = new AddonArmorType(new ResourceLocation("magistuarmoryaddon", "lobster_tailed_helmet"), new ResourceLocation("magistuarmoryaddon:lobster_tailed_helmet"), 0.6f, 0.0f, new int[] { 150, 0, 315, 180 }, new int[] { 1, 0, 6, 3 }, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.enableLobsterTailedHelmet, Platform.isForge() ? "forge:ingots/steel" : "c:steel_ingots");

	public static final AddonArmorType CHAPEL = new AddonArmorType(new ResourceLocation("magistuarmoryaddon", "chapel"), new ResourceLocation("magistuarmoryaddon:chapel"), 0.3f, 0.0f, new int[] { 0, 0, 0, 220 }, new int[] { 0, 0, 0, 2 }, 9, SoundEvents.ARMOR_EQUIP_LEATHER, ARMOR_CONFIG.enableChapel, Platform.isForge() ? "forge:ingots/steel" : "c:steel_ingots");

	public static final AddonArmorType CHAINED_GAMBESON = new AddonArmorType(new ResourceLocation("magistuarmoryaddon", "chained_gambeson"), new ResourceLocation("default"), 0.2f, 0.0f, new int[] { 150, 0, 192, 132 }, new int[] { 2, 0, 3, 2 }, 9, SoundEvents.ARMOR_EQUIP_LEATHER, ARMOR_CONFIG.enableChainedGambeson, Platform.isForge() ? "forge:ingots/steel" : "c:steel_ingots");

	public static final AddonArmorType TABLET_HELMET = new AddonArmorType(new ResourceLocation("magistuarmoryaddon", "tablet_helmet"), new ResourceLocation("default"), 0.2f, 0.0f, new int[] { 0, 0, 0, 200 }, new int[] { 0, 0, 0, 2 }, 9, SoundEvents.ARMOR_EQUIP_CHAIN, ARMOR_CONFIG.enableTabletHelmet, Platform.isForge() ? "forge:ingots/steel" : "c:steel_ingots");

	public static final AddonArmorType LATE_GREATHELM = new AddonArmorType(new ResourceLocation("magistuarmoryaddon", "late_greathelm"), new ResourceLocation("magistuarmoryaddon:late_greathelm"), 1.25f, 1.0f, new int[] { 0, 0, 0, 300 }, new int[] { 0, 0, 0, 3 }, 9, SoundEvents.ARMOR_EQUIP_CHAIN, ARMOR_CONFIG.enableLateGreathelm, Platform.isForge() ? "forge:ingots/steel" : "c:steel_ingots");

	public static final AddonArmorType BURGUNDIAN_KETTLEHAT = new AddonArmorType(new ResourceLocation("magistuarmoryaddon", "burgundian_kettlehat"), new ResourceLocation("magistuarmoryaddon:burgundian_kettlehat"), 0.3f, 0.0f, new int[] { 0, 0, 0, 230 }, new int[] { 0, 0, 0, 2 }, 9, SoundEvents.ARMOR_EQUIP_CHAIN, ARMOR_CONFIG.enableBurgundianKettlehat, Platform.isForge() ? "forge:ingots/steel" : "c:steel_ingots");

	public static final AddonArmorType CLOSED_BURGONET = new AddonArmorType(new ResourceLocation("magistuarmoryaddon", "closed_burgonet"), new ResourceLocation("magistuarmoryaddon:closed_burgonet"), 1.25f, 0.5f, new int[] { 0, 0, 0, 275 }, new int[] { 0, 0, 0, 3 }, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.enableClosedBurgonet, Platform.isForge() ? "forge:ingots/steel" : "c:steel_ingots");

	public static final AddonArmorType HEAVY_CUIRASSIER = new AddonArmorType(new ResourceLocation("magistuarmoryaddon", "heavy_cuirassier"), new ResourceLocation("default"), 1.4f, 0.8f, new int[] { 253, 346, 368, 302 }, new int[] { 2, 5, 8, 3 }, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.enableHeavyCuirassier, Platform.isForge() ? "forge:ingots/steel" : "c:steel_ingots");

	public static final AddonArmorType DARK_HEAVY_CUIRASSIER = new AddonArmorType(new ResourceLocation("magistuarmoryaddon", "dark_heavy_cuirassier"), new ResourceLocation("default"), 1.4f, 0.8f, new int[] { 253, 346, 368, 302 }, new int[] { 2, 5, 8, 3 }, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.enableDarkHeavyCuirassier, Platform.isForge() ? "forge:ingots/steel" : "c:steel_ingots");

	public static final AddonArmorType LIGHT_BURGONET = new AddonArmorType(new ResourceLocation("magistuarmoryaddon", "light_burgonet"), new ResourceLocation("magistuarmoryaddon:late_burgonet"), 0.5f, 0.0f, new int[] { 0, 0, 0, 200 }, new int[] { 0, 0, 0, 2 }, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.enableLightBurgonet, Platform.isForge() ? "forge:ingots/steel" : "c:steel_ingots");

	public static final AddonArmorType LATE_BURGONET = new AddonArmorType(new ResourceLocation("magistuarmoryaddon", "late_burgonet"), new ResourceLocation("magistuarmoryaddon:late_burgonet"), 0.6f, 0.0f, new int[] { 0, 0, 0, 250 }, new int[] { 0, 0, 0, 3 }, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.enableLateBurgonet, Platform.isForge() ? "forge:ingots/steel" : "c:steel_ingots");

	public static final AddonArmorType DEVILISH_GROTESQUE_MAXIMILIAN_HELMET = new AddonArmorType(new ResourceLocation("magistuarmoryaddon", "devilish_grotesque_maximilian_helmet"), new ResourceLocation("magistuarmoryaddon:devilish_grotesque_maximilian_helmet"), 1.8f, 0.5f, new int[] { 0, 0, 0, 385 }, new int[] { 0, 0, 0, 4 }, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.enableDevilishGrotesqueMaximilianHelmet, Platform.isForge() ? "forge:ingots/steel" : "c:steel_ingots");

	public static final AddonArmorType FACIAL_GROTESQUE_MAXIMILIAN_HELMET = new AddonArmorType(new ResourceLocation("magistuarmoryaddon", "facial_grotesque_maximilian_helmet"), new ResourceLocation("magistuarmoryaddon:facial_grotesque_maximilian_helmet"), 1.8f, 0.5f, new int[] { 0, 0, 0, 385 }, new int[] { 0, 0, 0, 4 }, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.enableFacialGrotesqueMaximilianHelmet, Platform.isForge() ? "forge:ingots/steel" : "c:steel_ingots");

	public static final AddonArmorType DARK_GILDED_GREENWICH_ARMET = new AddonArmorType(new ResourceLocation("magistuarmoryaddon", "dark_gilded_greenwich_armet"), new ResourceLocation("magistuarmoryaddon:greenwich_armet"), 1.25f, 0.5f, new int[] { 230, 315, 335, 275 }, new int[] { 2, 5, 8, 3 }, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.enableDarkGildedGreenwichArmet, Platform.isForge() ? "forge:ingots/steel" : "c:steel_ingots");

	public static final AddonArmorType DARK_GILDED_GREENWICH = new AddonArmorType(new ResourceLocation("magistuarmoryaddon", "dark_gilded_greenwich"), new ResourceLocation("default"), 1.25f, 0.5f, new int[] { 230, 315, 335, 275 }, new int[] { 2, 5, 8, 3 }, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.enableDarkGildedGreenwich, Platform.isForge() ? "forge:ingots/steel" : "c:steel_ingots");

	public static final AddonArmorType DARK_GREENWICH_ARMET = new AddonArmorType(new ResourceLocation("magistuarmoryaddon", "dark_greenwich_armet"), new ResourceLocation("magistuarmoryaddon:greenwich_armet"), 1.25f, 0.5f, new int[] { 230, 315, 335, 275 }, new int[] { 2, 5, 8, 3 }, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.enableDarkGreenwichArmet, Platform.isForge() ? "forge:ingots/steel" : "c:steel_ingots");

	public static final AddonArmorType DARK_GREENWICH = new AddonArmorType(new ResourceLocation("magistuarmoryaddon", "dark_greenwich"), new ResourceLocation("default"), 1.25f, 0.5f, new int[] { 230, 315, 335, 275 }, new int[] { 2, 5, 8, 3 }, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.enableDarkGreenwich, Platform.isForge() ? "forge:ingots/steel" : "c:steel_ingots");

	public static final AddonArmorType LATE_SALLET = new AddonArmorType(new ResourceLocation("magistuarmoryaddon", "late_sallet"), new ResourceLocation("magistuarmoryaddon:late_sallet"), 1.25f, 0.5f, new int[] { 230, 315, 335, 275 }, new int[] { 2, 5, 8, 3 }, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.enableLateSallet, Platform.isForge() ? "forge:ingots/steel" : "c:steel_ingots");

	public static final AddonArmorType DARK_LATE_SALLET = new AddonArmorType(new ResourceLocation("magistuarmoryaddon", "dark_late_sallet"), new ResourceLocation("magistuarmoryaddon:late_sallet"), 1.25f, 0.5f, new int[] { 230, 315, 335, 275 }, new int[] { 2, 5, 8, 3 }, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.enableDarkLateSallet, Platform.isForge() ? "forge:ingots/steel" : "c:steel_ingots");

	public static final AddonArmorType STEEL_PUFF_AND_SLASH = new AddonArmorType(new ResourceLocation("magistuarmoryaddon", "steel_puff_and_slash"), new ResourceLocation("magistuarmoryaddon:steel_puff_and_slash"), 1.25f, 0.5f, new int[] { 230, 315, 335, 275 }, new int[] { 2, 5, 8, 3 }, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.enableSteelPuffAndSlash, Platform.isForge() ? "forge:ingots/steel" : "c:steel_ingots");

	public static final AddonArmorType GILDED_STEEL_PUFF_AND_SLASH = new AddonArmorType(new ResourceLocation("magistuarmoryaddon", "gilded_steel_puff_and_slash"), new ResourceLocation("magistuarmoryaddon:steel_puff_and_slash"), 1.25f, 0.5f, new int[] { 230, 315, 335, 275 }, new int[] { 2, 5, 8, 3 }, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.enableGildedSteelPuffAndSlash, Platform.isForge() ? "forge:ingots/steel" : "c:steel_ingots");

	public static final AddonArmorType STURMHAUBE = new AddonArmorType(new ResourceLocation("magistuarmoryaddon", "sturmhaube"), new ResourceLocation("magistuarmoryaddon:sturmhaube"), 0.6f, 0.0f, new int[] { 0, 0, 0, 210 }, new int[] { 0, 0, 0, 2 }, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.enableSturmhaube, Platform.isForge() ? "forge:ingots/steel" : "c:steel_ingots");

	public static final AddonArmorType SILVERED_DARK_BELLOWS_MAXIMILIAN_HELMET = new AddonArmorType(new ResourceLocation("magistuarmoryaddon", "silvered_dark_bellows_maximilian_helmet"), new ResourceLocation("magistuarmoryaddon:bellows_maximilian_helmet"), 1.8f, 0.5f, new int[] { 345, 500, 440, 385 }, new int[] { 3, 6, 9, 4 }, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.enableSilveredDarkBellowsMaximilianHelmet, Platform.isForge() ? "forge:ingots/steel" : "c:steel_ingots");

	public static final AddonArmorType SILVERED_DARK_MAXIMILIAN_HELMET = new AddonArmorType(new ResourceLocation("magistuarmoryaddon", "silvered_dark_maximilian_helmet"), new ResourceLocation("magistuarmory:maximilian_helmet"), 1.8f, 0.5f, new int[] { 345, 500, 440, 385 }, new int[] { 3, 6, 9, 4 }, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.enableSilveredDarkMaximilianHelmet, Platform.isForge() ? "forge:ingots/steel" : "c:steel_ingots");

	public static final AddonArmorType SILVERED_DARK_MAXIMILIAN = new AddonArmorType(new ResourceLocation("magistuarmoryaddon", "silvered_dark_maximilian"), new ResourceLocation("default"), 1.8f, 0.5f, new int[] { 345, 500, 440, 385 }, new int[] { 3, 6, 9, 4 }, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.enableSilveredDarkMaximilian, Platform.isForge() ? "forge:ingots/steel" : "c:steel_ingots");

	public static final AddonArmorType GILDED_GRAND_BASCINET = new AddonArmorType(new ResourceLocation("magistuarmoryaddon", "gilded_grand_bascinet"), new ResourceLocation("magistuarmory:grand_bascinet"), 1.25f, 0.5f, new int[] { 230, 315, 335, 275 }, new int[] { 2, 5, 8, 3 }, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.enableGildedGrandBascinet, Platform.isForge() ? "forge:ingots/steel" : "c:steel_ingots");

	public static final AddonArmorType CEREMONIAL_KASTENBRUST = new AddonArmorType(new ResourceLocation("magistuarmoryaddon", "ceremonial_kastenbrust"), new ResourceLocation("default"), 1.25f, 0.5f, new int[] { 230, 315, 335, 275 }, new int[] { 2, 5, 8, 3 }, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.enableCeremonialKastenbrust, Platform.isForge() ? "forge:ingots/steel" : "c:steel_ingots");

	public static final AddonArmorType GILDED_XIV_CENTURY_KNIGHT = new AddonArmorType(new ResourceLocation("magistuarmoryaddon", "gilded_xivcenturyknight"), new ResourceLocation("default"), 1.25f, 0.5f, new int[] { 210, 300, 320, 250 }, new int[] { 2, 5, 7, 3 }, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.enableGildedXivCenturyKnight, Platform.isForge() ? "forge:ingots/steel" : "c:steel_ingots");

	public static final AddonArmorType GALLOWGLASS = new AddonArmorType(new ResourceLocation("magistuarmoryaddon", "gallowglass"), new ResourceLocation("default"), 0.0f, 0.0f, new int[] { 170, 235, 250, 205 }, new int[] { 1, 4, 5, 2 }, 9, SoundEvents.ARMOR_EQUIP_CHAIN, ARMOR_CONFIG.enableGallowglass, Platform.isForge() ? "forge:ingots/steel" : "c:steel_ingots");

	public static final AddonArmorType ENGLISH_KNIGHT = new AddonArmorType(new ResourceLocation("magistuarmoryaddon", "english_knight"), new ResourceLocation("default"), 1.25f, 0.5f, new int[] { 230, 315, 335, 275 }, new int[] { 2, 5, 8, 3 }, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.enableEnglishKnight, Platform.isForge() ? "forge:ingots/steel" : "c:steel_ingots");

	public static final AddonArmorType GILDED_HALF_ARMOR = new AddonArmorType(new ResourceLocation("magistuarmoryaddon", "gilded_half_armor"), new ResourceLocation("default"), 0.5f, 0.0f, new int[] { 180, 290, 315, 170 }, new int[] { 2, 5, 6, 2 }, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.enableGildedHalfArmor, Platform.isForge() ? "forge:ingots/steel" : "c:steel_ingots");

	public static final AddonArmorType GILDED_EXQUISITE_MAXIMILIAN_HELMET = new AddonArmorType(new ResourceLocation("magistuarmoryaddon", "gilded_exquisite_maximilian_helmet"), new ResourceLocation("magistuarmoryaddon:exquisite_armet"), 1.8f, 0.5f, new int[] { 345, 500, 440, 385 }, new int[] { 3, 6, 9, 4 }, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.enableGildedExquisiteMaximilianHelmet, Platform.isForge() ? "forge:ingots/steel" : "c:steel_ingots");

	public static final AddonArmorType GILDED_MAXIMILIAN_HELMET = new AddonArmorType(new ResourceLocation("magistuarmoryaddon", "gilded_maximilian_helmet"), new ResourceLocation("magistuarmory:maximilian_helmet"), 1.8f, 0.5f, new int[] { 345, 500, 440, 385 }, new int[] { 3, 6, 9, 4 }, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.enableGildedMaximilianHelmet, Platform.isForge() ? "forge:ingots/steel" : "c:steel_ingots");

	public static final AddonArmorType GILDED_MAXIMILIAN = new AddonArmorType(new ResourceLocation("magistuarmoryaddon", "gilded_maximilian"), new ResourceLocation("default"), 1.8f, 0.5f, new int[] { 345, 500, 440, 385 }, new int[] { 3, 6, 9, 4 }, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.enableGildedMaximilian, Platform.isForge() ? "forge:ingots/steel" : "c:steel_ingots");

	public static final AddonArmorType COAT_OF_PLATES = new AddonArmorType(new ResourceLocation("magistuarmoryaddon", "coat_of_plates"), new ResourceLocation("default"), 0.5f, 0.0f, new int[] { 200, 260, 290, 240 }, new int[] { 2, 4, 6, 2 }, 9, SoundEvents.ARMOR_EQUIP_CHAIN, ARMOR_CONFIG.enableCoatOfPlates, Platform.isForge() ? "forge:ingots/steel" : "c:steel_ingots");

	public static final AddonArmorType SILVERED_DARK_HALF_ARMOR = new AddonArmorType(new ResourceLocation("magistuarmoryaddon", "silvered_dark_half_armor"), new ResourceLocation("default"), 0.5f, 0.0f, new int[] { 180, 290, 315, 170 }, new int[] { 2, 5, 6, 2 }, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.enableSilveredDarkHalfArmor, Platform.isForge() ? "forge:ingots/steel" : "c:steel_ingots");

	public static final AddonArmorType GILDED_DARK_SALLET = new AddonArmorType(new ResourceLocation("magistuarmoryaddon", "gilded_dark_sallet"), new ResourceLocation("magistuarmoryaddon:sallet"), 1.25f, 0.5f, new int[] { 230, 315, 335, 275 }, new int[] { 2, 5, 8, 3 }, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.enableGildedDarkSallet, Platform.isForge() ? "forge:ingots/steel" : "c:steel_ingots");

	public static final AddonArmorType GILDED_DARK_GOTHIC = new AddonArmorType(new ResourceLocation("magistuarmoryaddon", "gilded_dark_gothic"), new ResourceLocation("default"), 1.25f, 0.5f, new int[] { 230, 315, 335, 275 }, new int[] { 2, 5, 8, 3 }, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.enableGildedDarkGothic, Platform.isForge() ? "forge:ingots/steel" : "c:steel_ingots");

	public static final AddonArmorType GILDED_SALLET = new AddonArmorType(new ResourceLocation("magistuarmoryaddon", "gilded_sallet"), new ResourceLocation("magistuarmoryaddon:sallet"), 1.25f, 0.5f, new int[] { 230, 315, 335, 275 }, new int[] { 2, 5, 8, 3 }, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.enableGildedSallet, Platform.isForge() ? "forge:ingots/steel" : "c:steel_ingots");

	public static final AddonArmorType GILDED_GOTHIC = new AddonArmorType(new ResourceLocation("magistuarmoryaddon", "gilded_gothic"), new ResourceLocation("default"), 1.25f, 0.5f, new int[] { 230, 315, 335, 275 }, new int[] { 2, 5, 8, 3 }, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.enableGildedGothic, Platform.isForge() ? "forge:ingots/steel" : "c:steel_ingots");

	public static final AddonArmorType GILDED_GREENWICH_ARMET = new AddonArmorType(new ResourceLocation("magistuarmoryaddon", "gilded_greenwich_armet"), new ResourceLocation("magistuarmoryaddon:greenwich_armet"), 1.25f, 0.5f, new int[] { 230, 315, 335, 275 }, new int[] { 2, 5, 8, 3 }, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.enableGildedGreenwichArmet, Platform.isForge() ? "forge:ingots/steel" : "c:steel_ingots");

	public static final AddonArmorType GILDED_GREENWICH = new AddonArmorType(new ResourceLocation("magistuarmoryaddon", "gilded_greenwich"), new ResourceLocation("default"), 1.25f, 0.5f, new int[] { 230, 315, 335, 275 }, new int[] { 2, 5, 8, 3 }, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.enableGildedGreenwich, Platform.isForge() ? "forge:ingots/steel" : "c:steel_ingots");

	public static final AddonArmorType GREENWICH_ARMET = new AddonArmorType(new ResourceLocation("magistuarmoryaddon", "greenwich_armet"), new ResourceLocation("magistuarmoryaddon:greenwich_armet"), 1.25f, 0.5f, new int[] { 230, 315, 335, 275 }, new int[] { 2, 5, 8, 3 }, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.enableGreenwichArmet, Platform.isForge() ? "forge:ingots/steel" : "c:steel_ingots");

	public static final AddonArmorType GREENWICH = new AddonArmorType(new ResourceLocation("magistuarmoryaddon", "greenwich"), new ResourceLocation("default"), 1.25f, 0.5f, new int[] { 230, 315, 335, 275 }, new int[] { 2, 5, 8, 3 }, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.enableGreenwich, Platform.isForge() ? "forge:ingots/steel" : "c:steel_ingots");

	public static final AddonArmorType LANDSKNECHT_ORANGE_HAT = new AddonArmorType(new ResourceLocation("magistuarmoryaddon", "landsknecht_orange_hat"), new ResourceLocation("magistuarmoryaddon:landsknecht_hat"), 0.0f, 0.0f, new int[] { 120, 100, 140, 120 }, new int[] { 1, 1, 2, 1 }, 9, SoundEvents.ARMOR_EQUIP_LEATHER, ARMOR_CONFIG.enableLandsknechtOrangeHat, () -> Ingredient.of(TagKey.create(Registry.ITEM_REGISTRY, new ResourceLocation("magistuarmory:woolen_fabric"))));

	public static final AddonArmorType LANDSKNECHT_MAGENTA_HAT = new AddonArmorType(new ResourceLocation("magistuarmoryaddon", "landsknecht_magenta_hat"), new ResourceLocation("magistuarmoryaddon:landsknecht_hat"), 0.0f, 0.0f, new int[] { 120, 100, 140, 120 }, new int[] { 1, 1, 2, 1 }, 9, SoundEvents.ARMOR_EQUIP_LEATHER, ARMOR_CONFIG.enableLandsknechtMagentaHat, () -> Ingredient.of(TagKey.create(Registry.ITEM_REGISTRY, new ResourceLocation("magistuarmory:woolen_fabric"))));

	public static final AddonArmorType LANDSKNECHT_LIGHT_BLUE_HAT = new AddonArmorType(new ResourceLocation("magistuarmoryaddon", "landsknecht_light_blue_hat"), new ResourceLocation("magistuarmoryaddon:landsknecht_hat"), 0.0f, 0.0f, new int[] { 120, 100, 140, 120 }, new int[] { 1, 1, 2, 1 }, 9, SoundEvents.ARMOR_EQUIP_LEATHER, ARMOR_CONFIG.enableLandsknechtLightBlueHat, () -> Ingredient.of(TagKey.create(Registry.ITEM_REGISTRY, new ResourceLocation("magistuarmory:woolen_fabric"))));

	public static final AddonArmorType LANDSKNECHT_YELLOW_HAT = new AddonArmorType(new ResourceLocation("magistuarmoryaddon", "landsknecht_yellow_hat"), new ResourceLocation("magistuarmoryaddon:landsknecht_hat"), 0.0f, 0.0f, new int[] { 120, 100, 140, 120 }, new int[] { 1, 1, 2, 1 }, 9, SoundEvents.ARMOR_EQUIP_LEATHER, ARMOR_CONFIG.enableLandsknechtYellowHat, () -> Ingredient.of(TagKey.create(Registry.ITEM_REGISTRY, new ResourceLocation("magistuarmory:woolen_fabric"))));

	public static final AddonArmorType LANDSKNECHT_LIME_HAT = new AddonArmorType(new ResourceLocation("magistuarmoryaddon", "landsknecht_lime_hat"), new ResourceLocation("magistuarmoryaddon:landsknecht_hat"), 0.0f, 0.0f, new int[] { 120, 100, 140, 120 }, new int[] { 1, 1, 2, 1 }, 9, SoundEvents.ARMOR_EQUIP_LEATHER, ARMOR_CONFIG.enableLandsknechtLimeHat, () -> Ingredient.of(TagKey.create(Registry.ITEM_REGISTRY, new ResourceLocation("magistuarmory:woolen_fabric"))));

	public static final AddonArmorType LANDSKNECHT_PINK_HAT = new AddonArmorType(new ResourceLocation("magistuarmoryaddon", "landsknecht_pink_hat"), new ResourceLocation("magistuarmoryaddon:landsknecht_hat"), 0.0f, 0.0f, new int[] { 120, 100, 140, 120 }, new int[] { 1, 1, 2, 1 }, 9, SoundEvents.ARMOR_EQUIP_LEATHER, ARMOR_CONFIG.enableLandsknechtPinkHat, () -> Ingredient.of(TagKey.create(Registry.ITEM_REGISTRY, new ResourceLocation("magistuarmory:woolen_fabric"))));

	public static final AddonArmorType LANDSKNECHT_GRAY_HAT = new AddonArmorType(new ResourceLocation("magistuarmoryaddon", "landsknecht_gray_hat"), new ResourceLocation("magistuarmoryaddon:landsknecht_hat"), 0.0f, 0.0f, new int[] { 120, 100, 140, 120 }, new int[] { 1, 1, 2, 1 }, 9, SoundEvents.ARMOR_EQUIP_LEATHER, ARMOR_CONFIG.enableLandsknechtGrayHat, () -> Ingredient.of(TagKey.create(Registry.ITEM_REGISTRY, new ResourceLocation("magistuarmory:woolen_fabric"))));

	public static final AddonArmorType LANDSKNECHT_LIGHT_GRAY_HAT = new AddonArmorType(new ResourceLocation("magistuarmoryaddon", "landsknecht_light_gray_hat"), new ResourceLocation("magistuarmoryaddon:landsknecht_hat"), 0.0f, 0.0f, new int[] { 120, 100, 140, 120 }, new int[] { 1, 1, 2, 1 }, 9, SoundEvents.ARMOR_EQUIP_LEATHER, ARMOR_CONFIG.enableLandsknechtLightGrayHat, () -> Ingredient.of(TagKey.create(Registry.ITEM_REGISTRY, new ResourceLocation("magistuarmory:woolen_fabric"))));

	public static final AddonArmorType LANDSKNECHT_CYAN_HAT = new AddonArmorType(new ResourceLocation("magistuarmoryaddon", "landsknecht_cyan_hat"), new ResourceLocation("magistuarmoryaddon:landsknecht_hat"), 0.0f, 0.0f, new int[] { 120, 100, 140, 120 }, new int[] { 1, 1, 2, 1 }, 9, SoundEvents.ARMOR_EQUIP_LEATHER, ARMOR_CONFIG.enableLandsknechtCyanHat, () -> Ingredient.of(TagKey.create(Registry.ITEM_REGISTRY, new ResourceLocation("magistuarmory:woolen_fabric"))));

	public static final AddonArmorType LANDSKNECHT_PURPLE_HAT = new AddonArmorType(new ResourceLocation("magistuarmoryaddon", "landsknecht_purple_hat"), new ResourceLocation("magistuarmoryaddon:landsknecht_hat"), 0.0f, 0.0f, new int[] { 120, 100, 140, 120 }, new int[] { 1, 1, 2, 1 }, 9, SoundEvents.ARMOR_EQUIP_LEATHER, ARMOR_CONFIG.enableLandsknechtPurpleHat, () -> Ingredient.of(TagKey.create(Registry.ITEM_REGISTRY, new ResourceLocation("magistuarmory:woolen_fabric"))));

	public static final AddonArmorType LANDSKNECHT_BLUE_HAT = new AddonArmorType(new ResourceLocation("magistuarmoryaddon", "landsknecht_blue_hat"), new ResourceLocation("magistuarmoryaddon:landsknecht_hat"), 0.0f, 0.0f, new int[] { 120, 100, 140, 120 }, new int[] { 1, 1, 2, 1 }, 9, SoundEvents.ARMOR_EQUIP_LEATHER, ARMOR_CONFIG.enableLandsknechtBlueHat, () -> Ingredient.of(TagKey.create(Registry.ITEM_REGISTRY, new ResourceLocation("magistuarmory:woolen_fabric"))));

	public static final AddonArmorType LANDSKNECHT_BROWN_HAT = new AddonArmorType(new ResourceLocation("magistuarmoryaddon", "landsknecht_brown_hat"), new ResourceLocation("magistuarmoryaddon:landsknecht_hat"), 0.0f, 0.0f, new int[] { 120, 100, 140, 120 }, new int[] { 1, 1, 2, 1 }, 9, SoundEvents.ARMOR_EQUIP_LEATHER, ARMOR_CONFIG.enableLandsknechtBrownHat, () -> Ingredient.of(TagKey.create(Registry.ITEM_REGISTRY, new ResourceLocation("magistuarmory:woolen_fabric"))));

	public static final AddonArmorType LANDSKNECHT_GREEN_HAT = new AddonArmorType(new ResourceLocation("magistuarmoryaddon", "landsknecht_green_hat"), new ResourceLocation("magistuarmoryaddon:landsknecht_hat"), 0.0f, 0.0f, new int[] { 120, 100, 140, 120 }, new int[] { 1, 1, 2, 1 }, 9, SoundEvents.ARMOR_EQUIP_LEATHER, ARMOR_CONFIG.enableLandsknechtGreenHat, () -> Ingredient.of(TagKey.create(Registry.ITEM_REGISTRY, new ResourceLocation("magistuarmory:woolen_fabric"))));

	public static final AddonArmorType LANDSKNECHT_RED_HAT = new AddonArmorType(new ResourceLocation("magistuarmoryaddon", "landsknecht_red_hat"), new ResourceLocation("magistuarmoryaddon:landsknecht_hat"), 0.0f, 0.0f, new int[] { 120, 100, 140, 120 }, new int[] { 1, 1, 2, 1 }, 9, SoundEvents.ARMOR_EQUIP_LEATHER, ARMOR_CONFIG.enableLandsknechtRedHat, () -> Ingredient.of(TagKey.create(Registry.ITEM_REGISTRY, new ResourceLocation("magistuarmory:woolen_fabric"))));

	public static final AddonArmorType LANDSKNECHT_BLACK_HAT = new AddonArmorType(new ResourceLocation("magistuarmoryaddon", "landsknecht_black_hat"), new ResourceLocation("magistuarmoryaddon:landsknecht_hat"), 0.0f, 0.0f, new int[] { 120, 100, 140, 120 }, new int[] { 1, 1, 2, 1 }, 9, SoundEvents.ARMOR_EQUIP_LEATHER, ARMOR_CONFIG.enableLandsknechtBlackHat, () -> Ingredient.of(TagKey.create(Registry.ITEM_REGISTRY, new ResourceLocation("magistuarmory:woolen_fabric"))));

	public static final AddonArmorType LANDSKNECHT_WHITE_HAT = new AddonArmorType(new ResourceLocation("magistuarmoryaddon", "landsknecht_white_hat"), new ResourceLocation("magistuarmoryaddon:landsknecht_hat"), 0.0f, 0.0f, new int[] { 120, 100, 140, 120 }, new int[] { 1, 1, 2, 1 }, 9, SoundEvents.ARMOR_EQUIP_LEATHER, ARMOR_CONFIG.enableLandsknechtWhiteHat, () -> Ingredient.of(TagKey.create(Registry.ITEM_REGISTRY, new ResourceLocation("magistuarmory:woolen_fabric"))));

	public static final AddonArmorType ORANGE_PUFF_AND_SLASH = new AddonArmorType(new ResourceLocation("magistuarmoryaddon", "orange_puff_and_slash"), new ResourceLocation("magistuarmoryaddon:puff_and_slash"), 0.0f, 0.0f, new int[] { 120, 100, 140, 120 }, new int[] { 1, 1, 2, 1 }, 9, SoundEvents.ARMOR_EQUIP_LEATHER, ARMOR_CONFIG.enableOrangePuffAndSlash, () -> Ingredient.of(TagKey.create(Registry.ITEM_REGISTRY, new ResourceLocation("magistuarmory:woolen_fabric"))));

	public static final AddonArmorType MAGENTA_PUFF_AND_SLASH = new AddonArmorType(new ResourceLocation("magistuarmoryaddon", "magenta_puff_and_slash"), new ResourceLocation("magistuarmoryaddon:puff_and_slash"), 0.0f, 0.0f, new int[] { 120, 100, 140, 120 }, new int[] { 1, 1, 2, 1 }, 9, SoundEvents.ARMOR_EQUIP_LEATHER, ARMOR_CONFIG.enableMagentaPuffAndSlash, () -> Ingredient.of(TagKey.create(Registry.ITEM_REGISTRY, new ResourceLocation("magistuarmory:woolen_fabric"))));

	public static final AddonArmorType LIGHT_BLUE_PUFF_AND_SLASH = new AddonArmorType(new ResourceLocation("magistuarmoryaddon", "light_blue_puff_and_slash"), new ResourceLocation("magistuarmoryaddon:puff_and_slash"), 0.0f, 0.0f, new int[] { 120, 100, 140, 120 }, new int[] { 1, 1, 2, 1 }, 9, SoundEvents.ARMOR_EQUIP_LEATHER, ARMOR_CONFIG.enableLightBluePuffAndSlash, () -> Ingredient.of(TagKey.create(Registry.ITEM_REGISTRY, new ResourceLocation("magistuarmory:woolen_fabric"))));

	public static final AddonArmorType YELLOW_PUFF_AND_SLASH = new AddonArmorType(new ResourceLocation("magistuarmoryaddon", "yellow_puff_and_slash"), new ResourceLocation("magistuarmoryaddon:puff_and_slash"), 0.0f, 0.0f, new int[] { 120, 100, 140, 120 }, new int[] { 1, 1, 2, 1 }, 9, SoundEvents.ARMOR_EQUIP_LEATHER, ARMOR_CONFIG.enableYellowPuffAndSlash, () -> Ingredient.of(TagKey.create(Registry.ITEM_REGISTRY, new ResourceLocation("magistuarmory:woolen_fabric"))));

	public static final AddonArmorType LIME_PUFF_AND_SLASH = new AddonArmorType(new ResourceLocation("magistuarmoryaddon", "lime_puff_and_slash"), new ResourceLocation("magistuarmoryaddon:puff_and_slash"), 0.0f, 0.0f, new int[] { 120, 100, 140, 120 }, new int[] { 1, 1, 2, 1 }, 9, SoundEvents.ARMOR_EQUIP_LEATHER, ARMOR_CONFIG.enableLimePuffAndSlash, () -> Ingredient.of(TagKey.create(Registry.ITEM_REGISTRY, new ResourceLocation("magistuarmory:woolen_fabric"))));

	public static final AddonArmorType PINK_PUFF_AND_SLASH = new AddonArmorType(new ResourceLocation("magistuarmoryaddon", "pink_puff_and_slash"), new ResourceLocation("magistuarmoryaddon:puff_and_slash"), 0.0f, 0.0f, new int[] { 120, 100, 140, 120 }, new int[] { 1, 1, 2, 1 }, 9, SoundEvents.ARMOR_EQUIP_LEATHER, ARMOR_CONFIG.enablePinkPuffAndSlash, () -> Ingredient.of(TagKey.create(Registry.ITEM_REGISTRY, new ResourceLocation("magistuarmory:woolen_fabric"))));

	public static final AddonArmorType GRAY_PUFF_AND_SLASH = new AddonArmorType(new ResourceLocation("magistuarmoryaddon", "gray_puff_and_slash"), new ResourceLocation("magistuarmoryaddon:puff_and_slash"), 0.0f, 0.0f, new int[] { 120, 100, 140, 120 }, new int[] { 1, 1, 2, 1 }, 9, SoundEvents.ARMOR_EQUIP_LEATHER, ARMOR_CONFIG.enableGrayPuffAndSlash, () -> Ingredient.of(TagKey.create(Registry.ITEM_REGISTRY, new ResourceLocation("magistuarmory:woolen_fabric"))));

	public static final AddonArmorType LIGHT_GRAY_PUFF_AND_SLASH = new AddonArmorType(new ResourceLocation("magistuarmoryaddon", "light_gray_puff_and_slash"), new ResourceLocation("magistuarmoryaddon:puff_and_slash"), 0.0f, 0.0f, new int[] { 120, 100, 140, 120 }, new int[] { 1, 1, 2, 1 }, 9, SoundEvents.ARMOR_EQUIP_LEATHER, ARMOR_CONFIG.enableLightGrayPuffAndSlash, () -> Ingredient.of(TagKey.create(Registry.ITEM_REGISTRY, new ResourceLocation("magistuarmory:woolen_fabric"))));

	public static final AddonArmorType CYAN_PUFF_AND_SLASH = new AddonArmorType(new ResourceLocation("magistuarmoryaddon", "cyan_puff_and_slash"), new ResourceLocation("magistuarmoryaddon:puff_and_slash"), 0.0f, 0.0f, new int[] { 120, 100, 140, 120 }, new int[] { 1, 1, 2, 1 }, 9, SoundEvents.ARMOR_EQUIP_LEATHER, ARMOR_CONFIG.enableCyanPuffAndSlash, () -> Ingredient.of(TagKey.create(Registry.ITEM_REGISTRY, new ResourceLocation("magistuarmory:woolen_fabric"))));

	public static final AddonArmorType PURPLE_PUFF_AND_SLASH = new AddonArmorType(new ResourceLocation("magistuarmoryaddon", "purple_puff_and_slash"), new ResourceLocation("magistuarmoryaddon:puff_and_slash"), 0.0f, 0.0f, new int[] { 120, 100, 140, 120 }, new int[] { 1, 1, 2, 1 }, 9, SoundEvents.ARMOR_EQUIP_LEATHER, ARMOR_CONFIG.enablePurplePuffAndSlash, () -> Ingredient.of(TagKey.create(Registry.ITEM_REGISTRY, new ResourceLocation("magistuarmory:woolen_fabric"))));

	public static final AddonArmorType BLUE_PUFF_AND_SLASH = new AddonArmorType(new ResourceLocation("magistuarmoryaddon", "blue_puff_and_slash"), new ResourceLocation("magistuarmoryaddon:puff_and_slash"), 0.0f, 0.0f, new int[] { 120, 100, 140, 120 }, new int[] { 1, 1, 2, 1 }, 9, SoundEvents.ARMOR_EQUIP_LEATHER, ARMOR_CONFIG.enableBluePuffAndSlash, () -> Ingredient.of(TagKey.create(Registry.ITEM_REGISTRY, new ResourceLocation("magistuarmory:woolen_fabric"))));

	public static final AddonArmorType BROWN_PUFF_AND_SLASH = new AddonArmorType(new ResourceLocation("magistuarmoryaddon", "brown_puff_and_slash"), new ResourceLocation("magistuarmoryaddon:puff_and_slash"), 0.0f, 0.0f, new int[] { 120, 100, 140, 120 }, new int[] { 1, 1, 2, 1 }, 9, SoundEvents.ARMOR_EQUIP_LEATHER, ARMOR_CONFIG.enableBrownPuffAndSlash, () -> Ingredient.of(TagKey.create(Registry.ITEM_REGISTRY, new ResourceLocation("magistuarmory:woolen_fabric"))));

	public static final AddonArmorType GREEN_PUFF_AND_SLASH = new AddonArmorType(new ResourceLocation("magistuarmoryaddon", "green_puff_and_slash"), new ResourceLocation("magistuarmoryaddon:puff_and_slash"), 0.0f, 0.0f, new int[] { 120, 100, 140, 120 }, new int[] { 1, 1, 2, 1 }, 9, SoundEvents.ARMOR_EQUIP_LEATHER, ARMOR_CONFIG.enableGreenPuffAndSlash, () -> Ingredient.of(TagKey.create(Registry.ITEM_REGISTRY, new ResourceLocation("magistuarmory:woolen_fabric"))));

	public static final AddonArmorType RED_PUFF_AND_SLASH = new AddonArmorType(new ResourceLocation("magistuarmoryaddon", "red_puff_and_slash"), new ResourceLocation("magistuarmoryaddon:puff_and_slash"), 0.0f, 0.0f, new int[] { 120, 100, 140, 120 }, new int[] { 1, 1, 2, 1 }, 9, SoundEvents.ARMOR_EQUIP_LEATHER, ARMOR_CONFIG.enableRedPuffAndSlash, () -> Ingredient.of(TagKey.create(Registry.ITEM_REGISTRY, new ResourceLocation("magistuarmory:woolen_fabric"))));

	public static final AddonArmorType BLACK_PUFF_AND_SLASH = new AddonArmorType(new ResourceLocation("magistuarmoryaddon", "black_puff_and_slash"), new ResourceLocation("magistuarmoryaddon:puff_and_slash"), 0.0f, 0.0f, new int[] { 120, 100, 140, 120 }, new int[] { 1, 1, 2, 1 }, 9, SoundEvents.ARMOR_EQUIP_LEATHER, ARMOR_CONFIG.enableBlackPuffAndSlash, () -> Ingredient.of(TagKey.create(Registry.ITEM_REGISTRY, new ResourceLocation("magistuarmory:woolen_fabric"))));

	public static final AddonArmorType WHITE_PUFF_AND_SLASH = new AddonArmorType(new ResourceLocation("magistuarmoryaddon", "white_puff_and_slash"), new ResourceLocation("magistuarmoryaddon:puff_and_slash"), 0.0f, 0.0f, new int[] { 120, 100, 140, 120 }, new int[] { 1, 1, 2, 1 }, 9, SoundEvents.ARMOR_EQUIP_LEATHER, ARMOR_CONFIG.enableWhitePuffAndSlash, () -> Ingredient.of(TagKey.create(Registry.ITEM_REGISTRY, new ResourceLocation("magistuarmory:woolen_fabric"))));

	public static final AddonArmorType PUFF_AND_SLASH = new AddonArmorType(new ResourceLocation("magistuarmoryaddon", "puff_and_slash"), new ResourceLocation("magistuarmoryaddon:puff_and_slash"), 0.0f, 0.0f, new int[] { 120, 100, 140, 120 }, new int[] { 1, 1, 2, 1 }, 9, SoundEvents.ARMOR_EQUIP_LEATHER, ARMOR_CONFIG.enablePuffAndSlash, () -> Ingredient.of(Items.LEATHER));

	public static final AddonArmorType SCALE_HELMET = new AddonArmorType(new ResourceLocation("magistuarmoryaddon", "scale_helmet"), new ResourceLocation("default"), 0.2f, 0.0f, new int[] { 170, 290, 300, 160 }, new int[] { 2, 5, 6, 2 }, 9, SoundEvents.ARMOR_EQUIP_CHAIN, ARMOR_CONFIG.enableScaleHelmet, Platform.isForge() ? "forge:ingots/steel" : "c:steel_ingots");

	public static final AddonArmorType CONDOTTIERO_CAP = new AddonArmorType(new ResourceLocation("magistuarmoryaddon", "condottiero_cap"), new ResourceLocation("magistuarmoryaddon:condottiero_cap"), 0.0f, 0.0f, new int[] { 120, 100, 140, 120 }, new int[] { 1, 1, 2, 1 }, 9, SoundEvents.ARMOR_EQUIP_LEATHER, ARMOR_CONFIG.enableCondottieroCap, () -> Ingredient.of(TagKey.create(Registry.ITEM_REGISTRY, new ResourceLocation("magistuarmory:woolen_fabric"))));

	public static final AddonArmorType SUGARLOAF_HELMET = new AddonArmorType(new ResourceLocation("magistuarmoryaddon", "sugarloaf_helmet"), new ResourceLocation("magistuarmoryaddon:greathelm"), 0.6f, 0.0f, new int[] { 150, 280, 295, 220 }, new int[] { 1, 5, 6, 3 }, 9, SoundEvents.ARMOR_EQUIP_CHAIN, ARMOR_CONFIG.enableSugarloafHelmet, Platform.isForge() ? "forge:ingots/steel" : "c:steel_ingots");

	public static final AddonArmorType GILDED_SUGARLOAF_HELMET = new AddonArmorType(new ResourceLocation("magistuarmoryaddon", "gilded_sugarloaf_helmet"), new ResourceLocation("magistuarmoryaddon:greathelm"), 0.6f, 0.0f, new int[] { 150, 280, 295, 220 }, new int[] { 1, 5, 6, 3 }, 9, SoundEvents.ARMOR_EQUIP_CHAIN, ARMOR_CONFIG.enableGildedSugarloafHelmet, Platform.isForge() ? "forge:ingots/steel" : "c:steel_ingots");

	public static final AddonArmorType PATRICIAN_TUHER_HELMET = new AddonArmorType(new ResourceLocation("magistuarmoryaddon", "patrician_tuher_helmet"), new ResourceLocation("magistuarmoryaddon:patrician_tuher_helmet"), 1.8f, 0.5f, new int[] { 345, 500, 440, 385 }, new int[] { 3, 6, 9, 4 }, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.enablePatricianTuherHelmet, Platform.isForge() ? "forge:ingots/steel" : "c:steel_ingots");

	public static final AddonArmorType LATE_KETTLEHAT = new AddonArmorType(new ResourceLocation("magistuarmoryaddon", "late_kettlehat"), new ResourceLocation("magistuarmoryaddon:late_kettlehat"), 0.3f, 0.0f, new int[] { 0, 0, 0, 220 }, new int[] { 0, 0, 0, 2 }, 9, SoundEvents.ARMOR_EQUIP_CHAIN, ARMOR_CONFIG.enableLateKettlehat, Platform.isForge() ? "forge:ingots/steel" : "c:steel_ingots");

	public static final AddonArmorType CLOSE_HELMET = new AddonArmorType(new ResourceLocation("magistuarmoryaddon", "close_helmet"), new ResourceLocation("magistuarmoryaddon:close_helmet"), 1.25f, 0.5f, new int[] { 230, 315, 335, 275 }, new int[] { 2, 5, 8, 3 }, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.enableCloseHelmet, Platform.isForge() ? "forge:ingots/steel" : "c:steel_ingots");

	public static final AddonArmorType EXQUISITE_MAXIMILIAN_HELMET = new AddonArmorType(new ResourceLocation("magistuarmoryaddon", "exquisite_maximilian_helmet"), new ResourceLocation("magistuarmoryaddon:exquisite_maximilian_helmet"), 1.8f, 0.5f, new int[] { 345, 500, 440, 385 }, new int[] { 3, 6, 9, 4 }, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.enableExquisiteMaximilianHelmet, Platform.isForge() ? "forge:ingots/steel" : "c:steel_ingots");

	public static final AddonArmorType PROTO_MAXIMILIAN = new AddonArmorType(new ResourceLocation("magistuarmoryaddon", "proto_maximilian"), new ResourceLocation("default"), 1.5f, 0.5f, new int[] { 276, 400, 352, 308 }, new int[] { 2, 5, 8, 3 }, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.enableProtoMaximilian, Platform.isForge() ? "forge:ingots/steel" : "c:steel_ingots");

	public static final AddonArmorType DARK_PROTO_MAXIMILIAN = new AddonArmorType(new ResourceLocation("magistuarmoryaddon", "dark_proto_maximilian"), new ResourceLocation("default"), 1.5f, 0.5f, new int[] { 276, 400, 352, 308 }, new int[] { 2, 5, 8, 3 }, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.enableDarkProtoMaximilian, Platform.isForge() ? "forge:ingots/steel" : "c:steel_ingots");

	public static final AddonArmorType HEAVY_BRIGANDINE = new AddonArmorType(new ResourceLocation("magistuarmoryaddon", "heavy_brigandine"), new ResourceLocation("default"), 1.25f, 0.5f, new int[] { 230, 315, 335, 275 }, new int[] { 2, 5, 8, 3 }, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.enableHeavyBrigandine, Platform.isForge() ? "forge:ingots/steel" : "c:steel_ingots");

	public static final AddonArmorType GILDED_HEAVY_BRIGANDINE = new AddonArmorType(new ResourceLocation("magistuarmoryaddon", "gilded_heavy_brigandine"), new ResourceLocation("default"), 1.25f, 0.5f, new int[] { 230, 315, 335, 275 }, new int[] { 2, 5, 8, 3 }, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.enableGildedHeavyBrigandine, Platform.isForge() ? "forge:ingots/steel" : "c:steel_ingots");

	public static final AddonArmorType DARK_HEAVY_BRIGANDINE = new AddonArmorType(new ResourceLocation("magistuarmoryaddon", "dark_heavy_brigandine"), new ResourceLocation("default"), 1.25f, 0.5f, new int[] { 230, 315, 335, 275 }, new int[] { 2, 5, 8, 3 }, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.enableDarkHeavyBrigandine, Platform.isForge() ? "forge:ingots/steel" : "c:steel_ingots");

	public static final AddonArmorType CABASSET = new AddonArmorType(new ResourceLocation("magistuarmoryaddon", "cabasset"), new ResourceLocation("magistuarmoryaddon:cabasset"), 0.6f, 0.0f, new int[] { 150, 0, 315, 200 }, new int[] { 2, 0, 7, 2 }, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.enableCabasset, Platform.isForge() ? "forge:ingots/steel" : "c:steel_ingots");

	public static final AddonArmorType GILDED_CABASSET = new AddonArmorType(new ResourceLocation("magistuarmoryaddon", "gilded_cabasset"), new ResourceLocation("magistuarmoryaddon:cabasset"), 0.6f, 0.0f, new int[] { 150, 0, 315, 200 }, new int[] { 2, 0, 7, 2 }, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.enableGildedCabasset, Platform.isForge() ? "forge:ingots/steel" : "c:steel_ingots");

	public static final AddonArmorType EARLY_CABASSET = new AddonArmorType(new ResourceLocation("magistuarmoryaddon", "early_cabasset"), new ResourceLocation("magistuarmoryaddon:early_cabasset"), 0.6f, 0.0f, new int[] { 150, 0, 315, 200 }, new int[] { 2, 0, 7, 2 }, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.enableEarlyCabasset, Platform.isForge() ? "forge:ingots/steel" : "c:steel_ingots");

	public static final AddonArmorType DARK_EARLY_CABASSET = new AddonArmorType(new ResourceLocation("magistuarmoryaddon", "dark_early_cabasset"), new ResourceLocation("magistuarmoryaddon:early_cabasset"), 0.6f, 0.0f, new int[] { 150, 0, 315, 200 }, new int[] { 2, 0, 7, 2 }, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.enableDarkEarlyCabasset, Platform.isForge() ? "forge:ingots/steel" : "c:steel_ingots");

	public static final AddonArmorType GILDED_EARLY_CABASSET = new AddonArmorType(new ResourceLocation("magistuarmoryaddon", "gilded_early_cabasset"), new ResourceLocation("magistuarmoryaddon:early_cabasset"), 0.6f, 0.0f, new int[] { 150, 0, 315, 200 }, new int[] { 2, 0, 7, 2 }, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.enableGildedEarlyCabasset, Platform.isForge() ? "forge:ingots/steel" : "c:steel_ingots");

	public static final AddonArmorType STRAW_HAT = new AddonArmorType(new ResourceLocation("magistuarmoryaddon", "straw_hat"), new ResourceLocation("magistuarmoryaddon:straw_hat"), 0.0f, 0.0f, new int[] { 90, 90, 120, 90 }, new int[] { 1, 1, 1, 1 }, 9, SoundEvents.ARMOR_EQUIP_LEATHER, ARMOR_CONFIG.enableStrawHat, () -> Ingredient.of(TagKey.create(Registry.ITEM_REGISTRY, new ResourceLocation("magistuarmory:woolen_fabric"))));

	public static final AddonArmorType FANCY_HAT = new AddonArmorType(new ResourceLocation("magistuarmoryaddon", "fancy_hat"), new ResourceLocation("magistuarmoryaddon:fancy_hat"), 0.0f, 0.0f, new int[] { 90, 90, 120, 100 }, new int[] { 1, 1, 1, 1 }, 9, SoundEvents.ARMOR_EQUIP_LEATHER, ARMOR_CONFIG.enableFancyHat, () -> Ingredient.of(TagKey.create(Registry.ITEM_REGISTRY, new ResourceLocation("magistuarmory:woolen_fabric"))));

	public static final AddonArmorType TUNIC = new AddonArmorType(new ResourceLocation("magistuarmoryaddon", "tunic"), new ResourceLocation("magistuarmoryaddon:tunic"), 0.0f, 0.0f, new int[] { 90, 90, 120, 100 }, new int[] { 1, 1, 1, 1 }, 9, SoundEvents.ARMOR_EQUIP_LEATHER, ARMOR_CONFIG.enableTunic, () -> Ingredient.of(TagKey.create(Registry.ITEM_REGISTRY, new ResourceLocation("magistuarmory:woolen_fabric"))));

	public static final AddonArmorType EMBOSED_PARADE_BURGONET = new AddonArmorType(new ResourceLocation("magistuarmoryaddon", "embosed_parade_burgonet"), new ResourceLocation("magistuarmoryaddon:parade_burgonet"), 1.25f, 0.5f, new int[] { 230, 315, 335, 260 }, new int[] { 2, 5, 8, 2 }, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.enableEmbosedParadeBurgonet, Platform.isForge() ? "forge:ingots/steel" : "c:steel_ingots");

	public static final AddonArmorType EMBOSED_PARADE = new AddonArmorType(new ResourceLocation("magistuarmoryaddon", "embosed_parade"), new ResourceLocation("default"), 1.25f, 0.5f, new int[] { 230, 315, 335, 260 }, new int[] { 2, 5, 8, 2 }, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.enableEmbosedParade, Platform.isForge() ? "forge:ingots/steel" : "c:steel_ingots");

	public static final AddonArmorType DARK_GILDED_PARADE_BURGONET = new AddonArmorType(new ResourceLocation("magistuarmoryaddon", "dark_gilded_parade_burgonet"), new ResourceLocation("magistuarmoryaddon:parade_burgonet"), 1.25f, 0.5f, new int[] { 230, 315, 335, 260 }, new int[] { 2, 5, 8, 2 }, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.enableDarkGildedParadeBurgonet, Platform.isForge() ? "forge:ingots/steel" : "c:steel_ingots");

	public static final AddonArmorType DARK_GILDED_PARADE = new AddonArmorType(new ResourceLocation("magistuarmoryaddon", "dark_gilded_parade"), new ResourceLocation("default"), 1.25f, 0.5f, new int[] { 230, 315, 335, 260 }, new int[] { 2, 5, 8, 2 }, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.enableDarkGildedParade, Platform.isForge() ? "forge:ingots/steel" : "c:steel_ingots");
	
	public static final AddonArmorType DOUBLET = new AddonArmorType(new ResourceLocation("magistuarmoryaddon", "doublet"), new ResourceLocation("default"), 0.0f, 0.0f, new int[] { 90, 90, 120, 100 }, new int[] { 1, 1, 1, 1 }, 9, SoundEvents.ARMOR_EQUIP_LEATHER, ARMOR_CONFIG.enableDoublet, () -> Ingredient.of(TagKey.create(Registry.ITEM_REGISTRY, new ResourceLocation("magistuarmory:woolen_fabric"))));

	public static final AddonArmorType GOLDEN_NECKLACE = new AddonArmorType(new ResourceLocation("magistuarmoryaddon", "golden_necklace"), new ResourceLocation("magistuarmoryaddon:necklace"), 0.0f, 0.0f, new int[] { 100, 100, 100, 100 }, new int[] { 0, 0, 0, 0 }, 9, SoundEvents.ARMOR_EQUIP_IRON, true, Platform.isForge() ? "forge:ingots/gold" : "c:gold_ingots");

	public static final AddonArmorType SILVER_NECKLACE = new AddonArmorType(new ResourceLocation("magistuarmoryaddon", "silver_necklace"), new ResourceLocation("magistuarmoryaddon:necklace"), 0.0f, 0.0f, new int[] { 100, 100, 100, 100 }, new int[] { 0, 0, 0, 0 }, 9, SoundEvents.ARMOR_EQUIP_IRON, true, Platform.isForge() ? "forge:ingots/gold" : "c:gold_ingots");

	public static final AddonArmorType SILVER_CROSS_NECKLACE = new AddonArmorType(new ResourceLocation("magistuarmoryaddon", "silver_cross_necklace"), new ResourceLocation("magistuarmoryaddon:necklace"), 0.0f, 0.0f, new int[] { 100, 100, 100, 100 }, new int[] { 0, 0, 0, 0 }, 9, SoundEvents.ARMOR_EQUIP_IRON, true, Platform.isForge() ? "forge:ingots/silver" : "c:silver_ingots");

	public static final AddonArmorType GOLDEN_CROSS_NECKLACE = new AddonArmorType(new ResourceLocation("magistuarmoryaddon", "golden_cross_necklace"), new ResourceLocation("magistuarmoryaddon:necklace"), 0.0f, 0.0f, new int[] { 100, 100, 100, 100 }, new int[] { 0, 0, 0, 0 }, 9, SoundEvents.ARMOR_EQUIP_IRON, true, Platform.isForge() ? "forge:ingots/silver" : "c:silver_ingots");

}

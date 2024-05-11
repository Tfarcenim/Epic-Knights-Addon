package com.magistuarmory.addon.client.render.model;

import com.magistuarmory.addon.EpicKnightsAddon;
import com.magistuarmory.addon.client.render.model.armor.*;
import com.magistuarmory.addon.client.render.model.decoration.*;
import com.magistuarmory.client.render.model.decoration.RondelModel;
import com.magistuarmory.client.render.model.decoration.TopDecorationModel;
import dev.architectury.registry.client.level.entity.EntityModelLayerRegistry;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.resources.ResourceLocation;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class AddonModels {
	public static AddonModels INSTANCE = new AddonModels(EpicKnightsAddon.ID);

	public static final Map<ModelLayerLocation, Supplier<LayerDefinition>> layers = new HashMap<>();


	public static final LayerDefinition SKIRT_MODEL = SkirtModel.createLayer();
	public static final LayerDefinition HELMET_RONDEL_MODEL = HelmetRondelModel.createLayer();
	public static final LayerDefinition HEAVY_SHOULDER_PAD_MODEL = HeavyShoulderPadModel.createLayer();
	public static final LayerDefinition SHOULDER_PADS_MODEL = ShoulderPadsModel.createLayer();
	public static final LayerDefinition RONDEL_MODEL = RondelModel.createLayer();
	public static final LayerDefinition NECKLACE_MODEL = NecklaceModel.createLayer();
	public static final LayerDefinition GORGET_MODEL = GorgetModel.createLayer();
	public static final LayerDefinition LANDSKNECHT_HAT_MODEL = LandsknechtHatModel.createLayer();
	public static final LayerDefinition PLACKART_MODEL = PlackartModel.createLayer();
	public static final LayerDefinition PUFF_AND_SLASH_SLEEVES_MODEL = PuffAndSlashSleevesModel.createLayer();

    // Armor
    public static final ModelLayerLocation SALLET_LOCATION = addArmorModel("sallet", SalletModel::createLayer);
    public static final ModelLayerLocation SAVOYARD_HELMET_LOCATION = addArmorModel("savoyard_helmet", SavoyardHelmetModel::createLayer);
    public static final ModelLayerLocation MORION_LOCATION = addArmorModel("morion", MorionModel::createLayer);
    public static final ModelLayerLocation MILANESE_ARMET_LOCATION = addArmorModel("milanese_armet", MilaneseArmetModel::createLayer);
    public static final ModelLayerLocation BRITISH_ARMET_LOCATION = addArmorModel("british_armet", BritishArmetModel::createLayer);
    public static final ModelLayerLocation VISORED_KETTLEHAT_LOCATION = addArmorModel("visored_kettlehat", VisoredKettlehatModel::createLayer);
    public static final ModelLayerLocation BICOQUE_LOCATION = addArmorModel("bicoque", BicoqueModel::createLayer);
    public static final ModelLayerLocation UNDERARMOR_LOCATION = addArmorModel("underarmor", UnderarmorModel::createLayer);
    public static final ModelLayerLocation SALLET_WITHOUT_NECK_PROTECTION_LOCATION = addArmorModel("sallet_without_neck_protection", SalletWithoutNeckProtectionModel::createLayer);
    public static final ModelLayerLocation BELLOWS_MAXIMILIAN_HELMET_LOCATION = addArmorModel("bellows_maximilian_helmet", BellowsMaximilianHelmetModel::createLayer);
    public static final ModelLayerLocation KULAH_KHUD_LOCATION = addArmorModel("kulah_khud", KulahKhudModel::createLayer);
    public static final ModelLayerLocation EARLY_GREATHELM_LOCATION = addArmorModel("early_greathelm", EarlyGreathelmModel::createLayer);
    public static final ModelLayerLocation KLAPPVISOR_BASCINET_LOCATION = addArmorModel("klappvisor_bascinet", KlappvisorBascinetModel::createLayer);
    public static final ModelLayerLocation LATE_BASCINET_LOCATION = addArmorModel("late_bascinet", LateBascinetModel::createLayer);
    public static final ModelLayerLocation LOBSTER_TAILED_HELMET_LOCATION = addArmorModel("lobster_tailed_helmet", LobsterTailedHelmetModel::createLayer);
    public static final ModelLayerLocation CHAPEL_LOCATION = addArmorModel("chapel", ChapelModel::createLayer);
    public static final ModelLayerLocation LATE_GREATHELM_LOCATION = addArmorModel("late_greathelm", LateGreathelmModel::createLayer);
    public static final ModelLayerLocation BURGUNDIAN_KETTLEHAT_LOCATION = addArmorModel("burgundian_kettlehat", BurgundianKettlehatModel::createLayer);
    public static final ModelLayerLocation CLOSED_BURGONET_LOCATION = addArmorModel("closed_burgonet", ClosedBurgonetModel::createLayer);
    public static final ModelLayerLocation LATE_BURGONET_LOCATION = addArmorModel("late_burgonet", LateBurgonetModel::createLayer);
    public static final ModelLayerLocation DEVILISH_GROTESQUE_MAXIMILIAN_HELMET_LOCATION = addArmorModel("devilish_grotesque_maximilian_helmet", DevilishGrotesqueMaximilianHelmetModel::createLayer);
    public static final ModelLayerLocation FACIAL_GROTESQUE_MAXIMILIAN_HELMET_LOCATION = addArmorModel("facial_grotesque_maximilian_helmet", FacialGrotesqueMaximilianHelmetModel::createLayer);
    public static final ModelLayerLocation GREENWICH_ARMET_LOCATION = addArmorModel("greenwich_armet", GreenwichArmetModel::createLayer);
    public static final ModelLayerLocation LATE_SALLET_LOCATION = addArmorModel("late_sallet", LateSalletModel::createLayer);
    public static final ModelLayerLocation STEEL_PUFF_AND_SLASH_LOCATION = addArmorModel("steel_puff_and_slash", SteelPuffAndSlashModel::createLayer);
    public static final ModelLayerLocation STURMHAUBE_LOCATION = addArmorModel("sturmhaube", SturmhaubeModel::createLayer);
    public static final ModelLayerLocation EXQUISITE_ARMET_LOCATION = addArmorModel("exquisite_armet", ExquisiteArmetModel::createLayer);
    public static final ModelLayerLocation LANDSKNECHT_HAT_LOCATION = addArmorModel("landsknecht_hat", LandsknechtHatModel::createLayer);
    public static final ModelLayerLocation PUFF_AND_SLASH_LOCATION = addArmorModel("puff_and_slash", PuffAndSlashModel::createLayer);
	public static final ModelLayerLocation CONDOTTIERO_CAP_LOCATION = addArmorModel("condottiero_cap", CondottieroCapModel::createLayer);
	public static final ModelLayerLocation GREATHELM_LOCATION = addArmorModel("greathelm", GreathelmModel::createLayer);
	public static final ModelLayerLocation PATRICIAN_TUHER_HELMET_LOCATION = addArmorModel("patrician_tuher_helmet", PatricianTuherHelmetModel::createLayer);
	public static final ModelLayerLocation LATE_KETTLEHAT_LOCATION = addArmorModel("late_kettlehat", LateKettlehatModel::createLayer);
	public static final ModelLayerLocation CLOSE_HELMET_LOCATION = addArmorModel("close_helmet", CloseHelmetModel::createLayer);
	public static final ModelLayerLocation EXQUISITE_MAXIMILIAN_HELMET_LOCATION = addArmorModel("exquisite_maximilian_helmet", ExquisiteArmetModel::createLayer);
	public static final ModelLayerLocation CABASSET_LOCATION = addArmorModel("cabasset", CabassetModel::createLayer);
	public static final ModelLayerLocation EARLY_CABASSET_LOCATION = addArmorModel("early_cabasset", EarlyCabassetModel::createLayer);
	public static final ModelLayerLocation STRAW_HAT_LOCATION = addArmorModel("straw_hat", StrawHatModel::createLayer);
	public static final ModelLayerLocation FANCY_HAT_LOCATION = addArmorModel("fancy_hat", FancyHatModel::createLayer);
	public static final ModelLayerLocation TUNIC_LOCATION = addArmorModel("tunic", TunicModel::createLayer);
	public static final ModelLayerLocation PARADE_BURGONET_LOCATION = addArmorModel("parade_burgonet", ParadeBurgonetModel::createLayer);
	public static final ModelLayerLocation NECKLACE_LOCATION = addArmorModel("necklace", NecklaceArmorModel::createLayer);

	// Decorations
	public static final ModelLayerLocation GOLDEN_PINCE_NEZ_LOCATION = addDecorationModel("golden_pince_nez", PinceNezModel::createLayer);
	public static final ModelLayerLocation STEEL_MUSTACHE_LOCATION = addDecorationModel("steel_mustache", MustacheModel::createLayer);
	public static final ModelLayerLocation STEEL_SKIRT_LOCATION = addDecorationModel("steel_skirt", () -> SKIRT_MODEL);
	public static final ModelLayerLocation GILDED_STEEL_SKIRT_LOCATION = addDecorationModel("gilded_steel_skirt", () -> SKIRT_MODEL);
	public static final ModelLayerLocation DARK_STEEL_SKIRT_LOCATION = addDecorationModel("dark_steel_skirt", () -> SKIRT_MODEL);
	public static final ModelLayerLocation GILDED_DARK_STEEL_SKIRT_LOCATION = addDecorationModel("gilded_dark_steel_skirt", () -> SKIRT_MODEL);
	public static final ModelLayerLocation HELMET_RONDEL_LOCATION = addDecorationModel("helmet_rondel", () -> HELMET_RONDEL_MODEL);
	public static final ModelLayerLocation GILDED_HELMET_RONDEL_LOCATION = addDecorationModel("gilded_helmet_rondel", () -> HELMET_RONDEL_MODEL);
	public static final ModelLayerLocation DARK_HELMET_RONDEL_LOCATION = addDecorationModel("dark_helmet_rondel", () -> HELMET_RONDEL_MODEL);
	public static final ModelLayerLocation GILDED_DARK_HELMET_RONDEL_LOCATION = addDecorationModel("gilded_dark_helmet_rondel", () -> HELMET_RONDEL_MODEL);
	public static final ModelLayerLocation DARK_HEAVY_SHOULDER_PAD_LOCATION = addDecorationModel("dark_heavy_shoulder_pad", () -> HEAVY_SHOULDER_PAD_MODEL);
	public static final ModelLayerLocation DARK_SHOULDER_PADS_LOCATION = addDecorationModel("dark_shoulder_pads", () -> SHOULDER_PADS_MODEL);
	public static final ModelLayerLocation GILDED_SHOULDER_PADS_LOCATION = addDecorationModel("gilded_shoulder_pads", () -> SHOULDER_PADS_MODEL);
	public static final ModelLayerLocation DARK_RONDEL_LOCATION = addDecorationModel("dark_rondel", () -> RONDEL_MODEL);
	public static final ModelLayerLocation GILDED_RONDEL_LOCATION = addDecorationModel("gilded_rondel", () -> RONDEL_MODEL);
	public static final ModelLayerLocation GILDED_DARK_RONDEL_LOCATION = addDecorationModel("gilded_dark_rondel", () -> RONDEL_MODEL);
	public static final ModelLayerLocation GOLDEN_NECKLACE_LOCATION = addDecorationModel("golden_necklace", () -> NECKLACE_MODEL);
	public static final ModelLayerLocation CHAINMAIL_HOOD_LOCATION = addDecorationModel("chainmail_hood", HoodModel::createLayer);
	public static final ModelLayerLocation SHOULDER_PADS_LOCATION = addDecorationModel("shoulder_pads", () -> SHOULDER_PADS_MODEL);
	public static final ModelLayerLocation HEAVY_SHOULDER_PAD_LOCATION = addDecorationModel("heavy_shoulder_pad", () -> HEAVY_SHOULDER_PAD_MODEL);
	public static final ModelLayerLocation GOLDEN_BALL_LOCATION = addDecorationModel("golden_ball", TopDecorationModel::createLayer);
	public static final ModelLayerLocation GORGET_LOCATION = addDecorationModel("gorget", () -> GORGET_MODEL);
	public static final ModelLayerLocation ROYAL_PLUME_LOCATION = addDecorationModel("royal_plume", RoyalPlumeModel::createLayer);
	public static final ModelLayerLocation HORSE_TAIL_LOCATION = addDecorationModel("horse_tail", HorseTailDecorationModel::createLayer);
	public static final ModelLayerLocation LANDSKNECHT_FEATHERS_LOCATION = addDecorationModel("landsknecht_feathers", LandsknechtFeathersModel::createLayer);
	public static final ModelLayerLocation HANGING_CLOTH_LOCATION = addDecorationModel("hanging_cloth", HangingClothModel::createLayer);
	public static final ModelLayerLocation UNDERARMOR_TUNIC_LOCATION = addDecorationModel("underarmor_tunic", UnderarmorTunicModel::createLayer);
	public static final ModelLayerLocation LANDSKNECHT_ORANGE_HAT_LOCATION = addDecorationModel("landsknecht_orange_hat", () -> LANDSKNECHT_HAT_MODEL);
	public static final ModelLayerLocation LANDSKNECHT_MAGENTA_HAT_LOCATION = addDecorationModel("landsknecht_magenta_hat", () -> LANDSKNECHT_HAT_MODEL);
	public static final ModelLayerLocation LANDSKNECHT_LIGHT_BLUE_HAT_LOCATION = addDecorationModel("landsknecht_light_blue_hat", () -> LANDSKNECHT_HAT_MODEL);
	public static final ModelLayerLocation LANDSKNECHT_YELLOW_HAT_LOCATION = addDecorationModel("landsknecht_yellow_hat", () -> LANDSKNECHT_HAT_MODEL);
	public static final ModelLayerLocation LANDSKNECHT_LIME_HAT_LOCATION = addDecorationModel("landsknecht_lime_hat", () -> LANDSKNECHT_HAT_MODEL);
	public static final ModelLayerLocation LANDSKNECHT_PINK_HAT_LOCATION = addDecorationModel("landsknecht_pink_hat", () -> LANDSKNECHT_HAT_MODEL);
	public static final ModelLayerLocation LANDSKNECHT_GRAY_HAT_LOCATION = addDecorationModel("landsknecht_gray_hat", () -> LANDSKNECHT_HAT_MODEL);
	public static final ModelLayerLocation LANDSKNECHT_LIGHT_GRAY_HAT_LOCATION = addDecorationModel("landsknecht_light_gray_hat", () -> LANDSKNECHT_HAT_MODEL);
	public static final ModelLayerLocation LANDSKNECHT_CYAN_HAT_LOCATION = addDecorationModel("landsknecht_cyan_hat", () -> LANDSKNECHT_HAT_MODEL);
	public static final ModelLayerLocation LANDSKNECHT_PURPLE_HAT_LOCATION = addDecorationModel("landsknecht_purple_hat", () -> LANDSKNECHT_HAT_MODEL);
	public static final ModelLayerLocation LANDSKNECHT_BLUE_HAT_LOCATION = addDecorationModel("landsknecht_blue_hat", () -> LANDSKNECHT_HAT_MODEL);
	public static final ModelLayerLocation LANDSKNECHT_BROWN_HAT_LOCATION = addDecorationModel("landsknecht_brown_hat", () -> LANDSKNECHT_HAT_MODEL);
	public static final ModelLayerLocation LANDSKNECHT_GREEN_HAT_LOCATION = addDecorationModel("landsknecht_green_hat", () -> LANDSKNECHT_HAT_MODEL);
	public static final ModelLayerLocation LANDSKNECHT_RED_HAT_LOCATION = addDecorationModel("landsknecht_red_hat", () -> LANDSKNECHT_HAT_MODEL);
	public static final ModelLayerLocation LANDSKNECHT_BLACK_HAT_LOCATION = addDecorationModel("landsknecht_black_hat", () -> LANDSKNECHT_HAT_MODEL);
	public static final ModelLayerLocation LANDSKNECHT_WHITE_HAT_LOCATION = addDecorationModel("landsknecht_white_hat", () -> LANDSKNECHT_HAT_MODEL);
	public static final ModelLayerLocation PLACKART_LOCATION = addDecorationModel("plackart", () -> PLACKART_MODEL);
	public static final ModelLayerLocation GILDED_PLACKART_LOCATION = addDecorationModel("gilded_plackart", () -> PLACKART_MODEL);
	public static final ModelLayerLocation DARK_PLACKART_LOCATION = addDecorationModel("dark_plackart", () -> PLACKART_MODEL);
	public static final ModelLayerLocation ARTICULATED_SHOULDER_DEFENSES_LOCATION = addDecorationModel("articulated_shoulder_defenses", () -> SHOULDER_PADS_MODEL);
	public static final ModelLayerLocation DRAGON_SHOULDER_PADS_LOCATION = addDecorationModel("dragon_shoulder_pads", () -> SHOULDER_PADS_MODEL);
	public static final ModelLayerLocation GIORNEA_LOCATION = addDecorationModel("giornea", GiorneaModel::createLayer);
	public static final ModelLayerLocation RAM_HORNS_LOCATION = addDecorationModel("ram_horns", RamHornsModel::createLayer);
	public static final ModelLayerLocation GOOSE_LOCATION = addDecorationModel("goose", GooseModel::createLayer);
	public static final ModelLayerLocation ORANGE_PUFF_AND_SLASH_SLEEVES_LOCATION = addDecorationModel("orange_puff_and_slash_sleeves", () -> PUFF_AND_SLASH_SLEEVES_MODEL);
	public static final ModelLayerLocation MAGENTA_PUFF_AND_SLASH_SLEEVES_LOCATION = addDecorationModel("magenta_puff_and_slash_sleeves", () -> PUFF_AND_SLASH_SLEEVES_MODEL);
	public static final ModelLayerLocation LIGHT_BLUE_PUFF_AND_SLASH_SLEEVES_LOCATION = addDecorationModel("light_blue_puff_and_slash_sleeves", () -> PUFF_AND_SLASH_SLEEVES_MODEL);
	public static final ModelLayerLocation YELLOW_PUFF_AND_SLASH_SLEEVES_LOCATION = addDecorationModel("yellow_puff_and_slash_sleeves", () -> PUFF_AND_SLASH_SLEEVES_MODEL);
	public static final ModelLayerLocation LIME_PUFF_AND_SLASH_SLEEVES_LOCATION = addDecorationModel("lime_puff_and_slash_sleeves", () -> PUFF_AND_SLASH_SLEEVES_MODEL);
	public static final ModelLayerLocation PINK_PUFF_AND_SLASH_SLEEVES_LOCATION = addDecorationModel("pink_puff_and_slash_sleeves", () -> PUFF_AND_SLASH_SLEEVES_MODEL);
	public static final ModelLayerLocation GRAY_PUFF_AND_SLASH_SLEEVES_LOCATION = addDecorationModel("gray_puff_and_slash_sleeves", () -> PUFF_AND_SLASH_SLEEVES_MODEL);
	public static final ModelLayerLocation LIGHT_GRAY_PUFF_AND_SLASH_SLEEVES_LOCATION = addDecorationModel("light_gray_puff_and_slash_sleeves", () -> PUFF_AND_SLASH_SLEEVES_MODEL);
	public static final ModelLayerLocation CYAN_PUFF_AND_SLASH_SLEEVES_LOCATION = addDecorationModel("cyan_puff_and_slash_sleeves", () -> PUFF_AND_SLASH_SLEEVES_MODEL);
	public static final ModelLayerLocation PURPLE_PUFF_AND_SLASH_SLEEVES_LOCATION = addDecorationModel("purple_puff_and_slash_sleeves", () -> PUFF_AND_SLASH_SLEEVES_MODEL);
	public static final ModelLayerLocation BLUE_PUFF_AND_SLASH_SLEEVES_LOCATION = addDecorationModel("blue_puff_and_slash_sleeves", () -> PUFF_AND_SLASH_SLEEVES_MODEL);
	public static final ModelLayerLocation BROWN_PUFF_AND_SLASH_SLEEVES_LOCATION = addDecorationModel("brown_puff_and_slash_sleeves", () -> PUFF_AND_SLASH_SLEEVES_MODEL);
	public static final ModelLayerLocation GREEN_PUFF_AND_SLASH_SLEEVES_LOCATION = addDecorationModel("green_puff_and_slash_sleeves", () -> PUFF_AND_SLASH_SLEEVES_MODEL);
	public static final ModelLayerLocation RED_PUFF_AND_SLASH_SLEEVES_LOCATION = addDecorationModel("red_puff_and_slash_sleeves", () -> PUFF_AND_SLASH_SLEEVES_MODEL);
	public static final ModelLayerLocation BLACK_PUFF_AND_SLASH_SLEEVES_LOCATION = addDecorationModel("black_puff_and_slash_sleeves", () -> PUFF_AND_SLASH_SLEEVES_MODEL);
	public static final ModelLayerLocation WHITE_PUFF_AND_SLASH_SLEEVES_LOCATION = addDecorationModel("white_puff_and_slash_sleeves", () -> PUFF_AND_SLASH_SLEEVES_MODEL);
	public static final ModelLayerLocation DARK_GORGET_LOCATION = addDecorationModel("dark_gorget", () -> GORGET_MODEL);
	public static final ModelLayerLocation GILDED_GORGET_LOCATION = addDecorationModel("gilded_gorget", () -> GORGET_MODEL);
	public static final ModelLayerLocation SQUARE_BESAGEWS_LOCATION = addDecorationModel("square_besagews", () -> RONDEL_MODEL);
	public static final ModelLayerLocation CODPIECE_LOCATION = addDecorationModel("codpiece", CodpieceModel::createLayer);
	public static final ModelLayerLocation SILVER_NECKLACE_LOCATION = addDecorationModel("silver_necklace", () -> NECKLACE_MODEL);
	public static final ModelLayerLocation SILVER_CROSS_NECKLACE_LOCATION = addDecorationModel("silver_cross_necklace", () -> NECKLACE_MODEL);
	public static final ModelLayerLocation GOLDEN_CROSS_NECKLACE_LOCATION = addDecorationModel("golden_cross_necklace", () -> NECKLACE_MODEL);

	public static ModelLayerLocation addDecorationModel(String name, Supplier<LayerDefinition> definition)
	{
		ModelLayerLocation location = createDecorationLocation(name);
		layers.put(location, definition);
		return location;
	}

	public static ModelLayerLocation addArmorModel(String name, Supplier<LayerDefinition> definition)
	{
		ModelLayerLocation location = createArmorLocation(name);
		layers.put(location, definition);
		return location;
	}

	public static ModelLayerLocation createDecorationLocation(String name)
	{
		return createDecorationLocation(new ResourceLocation(EpicKnightsAddon.ID, name));
	}

	public static ModelLayerLocation createArmorLocation(String name)
	{
		return createArmorLocation(new ResourceLocation(EpicKnightsAddon.ID, name));
	}

	public static void init() {
		layers.forEach(EntityModelLayerRegistry::register);
	}

	public ModelLayerLocation createLocation(String name)
	{
		return createLocation(new ResourceLocation(EpicKnightsAddon.ID, name));
	}

	public ModelLayerLocation createLocation(String name, String layer)
	{
		return createLocation(new ResourceLocation(EpicKnightsAddon.ID, name), layer);
	}

	public static ModelLayerLocation createDecorationLocation(ResourceLocation location)
	{
		return createLocation(location, "decorations");
	}

	public static ModelLayerLocation createArmorLocation(ResourceLocation location)
	{
		return createLocation(location, "armor");
	}

	public static ModelLayerLocation createLocation(ResourceLocation location)
	{
		return createLocation(location, "main");
	}

	public static ModelLayerLocation createLocation(ResourceLocation location, String layer)
	{
		return new ModelLayerLocation(location, layer);
	}

}

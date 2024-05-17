package com.magistuarmory.addon.client.render.model;

import com.magistuarmory.addon.misc.AddonModelMaps;
import net.minecraft.client.model.HumanoidModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.world.entity.LivingEntity;

import java.util.HashMap;
import java.util.Map;

public class AddonModels {
    public static final Map<AddonModelMaps.ArmorModels, HumanoidModel<? extends LivingEntity>> ARMOR = new HashMap<>();
    public static final HumanoidModel<LivingEntity> LATE_KETTLEHAT = new HumanoidModel<>(AddonModelLayers.layers.get(AddonModelLayers.LATE_KETTLEHAT_LOCATION).get().bakeRoot());
    public static final HumanoidModel<LivingEntity> BELLOWS_MAXIMILIAN_HELMET = new HumanoidModel<>(AddonModelLayers.layers.get(AddonModelLayers.LATE_KETTLEHAT_LOCATION).get().bakeRoot());
    public static void init() {
        AddonModels.ARMOR.put(AddonModelMaps.ArmorModels.LATE_KETTLEHAT, LATE_KETTLEHAT);
        AddonModels.ARMOR.put(AddonModelMaps.ArmorModels.BELLOWS_MAXIMILIAN_HELMET,BELLOWS_MAXIMILIAN_HELMET);
    }
}

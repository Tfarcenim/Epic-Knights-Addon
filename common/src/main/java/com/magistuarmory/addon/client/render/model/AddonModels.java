package com.magistuarmory.addon.client.render.model;

import net.minecraft.client.model.HumanoidModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.world.entity.LivingEntity;

import java.util.HashMap;
import java.util.Map;

public class AddonModels {
    public static final Map<String, HumanoidModel<? extends LivingEntity>> ARMOR = new HashMap<>();
    public static void init() {
        for (ModelLayerLocation layerLocation :AddonModelLayers.armor) {
            ARMOR.put(layerLocation.getModel().getPath(),new HumanoidModel<>(AddonModelLayers.layers.get(layerLocation).get().bakeRoot()));
        }
     }
}

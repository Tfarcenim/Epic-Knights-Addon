package com.magistuarmory.addon.client.render.model;

import com.magistuarmory.EpicKnights;
import com.magistuarmory.addon.item.AddonItems;
import com.magistuarmory.addon.item.armor.AddonArmorType;
import com.magistuarmory.client.render.model.Models;
import com.magistuarmory.item.armor.MedievalArmorItem;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.client.model.HumanoidModel;
import net.minecraft.client.model.Model;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.LivingEntity;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.function.Supplier;

public class AddonModels {
    public static final Map<String, HumanoidModel<? extends LivingEntity>> ARMOR = new HashMap<>();
    public static void init() {
     //   for (ModelLayerLocation layerLocation :AddonModelLayers.armor) {
      //      ARMOR.put(layerLocation.getModel().getPath(),new HumanoidModel<>(AddonModelLayers.layers.get(layerLocation).get().bakeRoot()));
      //  }

        for (RegistrySupplier<MedievalArmorItem> registrySupplier : AddonItems.ARMOR_ITEMS) {
            MedievalArmorItem armorItem = registrySupplier.get();
            if (armorItem.getMaterial() instanceof AddonArmorType addonArmorType) {

                ResourceLocation modelLocation = addonArmorType.getModellocation();

                if (!modelLocation.getPath().equals("default")) {

                    if (modelLocation.getNamespace().equals(EpicKnights.ID)) {

                        Models.ArmorEnum armorEnum = Models.ArmorEnum.valueOf(modelLocation.getPath().toUpperCase(Locale.ROOT));

                        ARMOR.put(addonArmorType.getName(), Models.ARMOR_MAP.get(armorEnum));
                    } else {
                        Supplier<LayerDefinition> layerDefinitionSupplier = AddonModelLayers.layerMap.get(modelLocation);

                        if (layerDefinitionSupplier != null) {
                            ARMOR.put(addonArmorType.getName(), new HumanoidModel<>(layerDefinitionSupplier.get().bakeRoot()));
                        } else {
                            //   ARMOR.put(addonArmorType.getName(), new HumanoidModel<>(layerDefinitionSupplier.get().bakeRoot()));
                        }
                    }
                }
            }
        }
     }
}

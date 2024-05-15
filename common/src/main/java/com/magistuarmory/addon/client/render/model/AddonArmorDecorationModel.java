package com.magistuarmory.addon.client.render.model;

import com.magistuarmory.client.render.model.decoration.ArmorDecorationModel;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.world.entity.LivingEntity;

public class AddonArmorDecorationModel<T extends LivingEntity> extends ArmorDecorationModel<T> {
    private final ModelPart[] parts;

    public AddonArmorDecorationModel(ModelPart modelpart) {
        super(modelpart);
        this.parts = new ModelPart[] { this.head, this.body, this.rightArm, this.leftArm };
    }

    @Override
    public ModelPart[] getParts() {
        return parts;
    }
}

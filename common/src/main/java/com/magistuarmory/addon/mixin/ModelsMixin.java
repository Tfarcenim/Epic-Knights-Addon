package com.magistuarmory.addon.mixin;

import com.magistuarmory.addon.client.render.model.AddonModels;
import com.magistuarmory.client.render.model.Models;
import com.magistuarmory.client.render.model.decoration.ArmorDecorationModel;
import net.minecraft.world.entity.LivingEntity;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Mutable;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import java.util.HashMap;
import java.util.Map;

@Mixin(Models.ArmorDecorations.class)
public class ModelsMixin<T extends LivingEntity> {
    @Shadow @Final @Mutable Map<String, ArmorDecorationModel<T>> map;

    @Inject(method = "<init>",at = @At("RETURN"))
    private void addAddonModels(CallbackInfo ci) {
        this.map = new HashMap<>(map);
        AddonModels.addModels(map);
    }
}

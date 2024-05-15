package com.magistuarmory.addon.mixin;

import com.magistuarmory.EpicKnights;
import com.magistuarmory.client.render.entity.layer.ArmorDecorationLayer;
import net.minecraft.resources.ResourceLocation;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

@Mixin(ArmorDecorationLayer.class)
public class ArmorDecorationLayerMixin {

    /**
     * @author
     * @reason
     */
    @Overwrite(remap = false)
    public ResourceLocation getTexture(String name, boolean overlay) {

        if (name.contains(":")) {
            ResourceLocation nameRL = new ResourceLocation(name);
            return new ResourceLocation(nameRL.getNamespace(),"textures/models/armor/" + nameRL.getPath() + (overlay ? "_overlay.png" : ".png"));
        }

        return new ResourceLocation(EpicKnights.ID, "textures/models/armor/" + name + (overlay ? "_overlay.png" : ".png"));
    }

}

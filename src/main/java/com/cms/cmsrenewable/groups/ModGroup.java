package com.cms.cmsrenewable.groups;

import com.cms.cmsrenewable.CMSRenewable;
import com.cms.cmsrenewable.index.CMSRItems;
import com.simibubi.create.repack.registrate.util.entry.FluidEntry;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.PowderSnowBlock;
import net.minecraft.world.level.material.Fluids;
import net.minecraftforge.common.Tags;

public class ModGroup extends CreativeModeTab {
    public static ModGroup MAIN;

    public ModGroup(String name) {
        super(CMSRenewable.MODID + ":" + name);
        MAIN = this;
        PowderSnowBlock;
        Fluids
    }

    @Override
    public ItemStack makeIcon() {
        return new ItemStack(CMSRItems.IRON_ELYTRA_FRAME.get());
    }
}
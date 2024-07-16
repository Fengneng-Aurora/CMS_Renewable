package com.cms.cmsrenewable.groups;

import com.cms.cmsrenewable.CMSRenewable;
import com.cms.cmsrenewable.index.CMSRItems;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModGroup extends CreativeModeTab {
    public static ModGroup MAIN;

    public ModGroup(String name) {
        super(CMSRenewable.MODID + ":" + name);
        MAIN = this;
    }

    @Override
    public ItemStack makeIcon() {
        return new ItemStack(CMSRItems.INACTIVE_ELYTRA.get());
    }
}
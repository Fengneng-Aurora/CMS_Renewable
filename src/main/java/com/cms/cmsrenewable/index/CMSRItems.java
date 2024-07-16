package com.cms.cmsrenewable.index;

import com.cms.cmsrenewable.CMSRenewable;
import com.cms.cmsrenewable.groups.ModGroup;
import com.simibubi.create.content.contraptions.itemAssembly.SequencedAssemblyItem;
import com.simibubi.create.foundation.data.CreateRegistrate;
import com.simibubi.create.repack.registrate.util.entry.ItemEntry;
import net.minecraft.world.item.Item;

public class CMSRItems {
    private static final CreateRegistrate REGISTRATE = CMSRenewable.registrate()
            .creativeModeTab(() -> ModGroup.MAIN);

    public static final ItemEntry <SequencedAssemblyItem> INCOMPLETE_ELYTRA =
            REGISTRATE.item("incomplete_elytra", SequencedAssemblyItem::new)
                    .properties(p -> p.stacksTo(1))
                    .register();

    public static final ItemEntry <SequencedAssemblyItem> INCOMPLETE_NETHERITE_SCRAP =
            REGISTRATE.item("incomplete_netherite_scrap", SequencedAssemblyItem::new)
                    .register();

    public static final ItemEntry <SequencedAssemblyItem> INCOMPLETE_INACTIVE_ELYTRA =
            REGISTRATE.item("incomplete_inactive_elytra", SequencedAssemblyItem::new)
                    .properties(p -> p.stacksTo(1))
                    .register();

    public static final ItemEntry <Item> INACTIVE_ELYTRA =
            REGISTRATE.item("inactive_elytra", Item::new)
                    .register();

    public static final ItemEntry <Item> ROUGH_DEBRIS =
            REGISTRATE.item("rough_debris", Item::new)
                    .register();

    public static final ItemEntry <Item> SHULKER_FIBRE =
            REGISTRATE.item("shulker_fibre", Item::new)
                    .register();

    public static final ItemEntry <Item> ELYTRA_EMBRYO =
            REGISTRATE.item("elytra_embryo", Item::new)
                    .register();

    public static final ItemEntry <Item> SUPERPLASTIC_DEBRIS =
            REGISTRATE.item("superplastic_debris", Item::new)
                    .register();

    public static final ItemEntry <Item> ANCIENT_RESIDUE =
            REGISTRATE.item("ancient_residue", Item::new)
                    .register();
    public static void register() {}
}
